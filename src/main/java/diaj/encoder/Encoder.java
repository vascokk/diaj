package diaj.encoder;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.primitives.Bytes;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;
import diaj.avp.Avp;
import diaj.command.DiameterCommand;
import diaj.command.DiameterHeader;
import diaj.dict.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;


public class Encoder {

    private Logger logger = LoggerFactory.getLogger(Encoder.class);

    public static int HEADER = 1;
    public static int AVPS = 2;

    private DictionaryParser dictionaryParser;
    private Map<Integer, Map<Integer, Object>> types;

    public Encoder(String dict){
        ANTLRInputStream input = new ANTLRInputStream(dict);
        DiameterLexer lexer = new DiameterLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        DiameterParser parser = new DiameterParser(tokens);

        dictionaryParser = new DictionaryParser();
        types = dictionaryParser.getTypes();

        parser.addParseListener(dictionaryParser);
        parser.rules();
    }

    public DictionaryParser getDictionaryParser(){
        return dictionaryParser;
    }

    public Map<Integer, Map<Integer, Object>> getTypes(){
        return dictionaryParser.getTypes();
    }



    public static byte[] shortToBytes(final short value) {
        return Shorts.toByteArray(value);
    }

    public static byte[] intToBytes(final int value) {
        return Ints.toByteArray(value);
    }

    public static byte[] floatToBytes(final float value) {
        return Ints.toByteArray(Float.floatToIntBits(value));
    }

    public static byte[] longToBytes(Long value) {
        return Longs.toByteArray(value);
    }


    public byte[] encode(DiameterCommand command){
        DiameterHeader h = command.getHeader();
        return Bytes.concat(h.encode(), encodeAvps(command.getAvps()));
    }
    public byte[] encodeHeader(DiameterHeader h){
        return  h.encode();
    }

    public byte[] encodeAvps(LinkedListMultimap<Integer, Avp> avps){
        byte[] res = new byte[0];
        List<Map.Entry<Integer, Avp>> avpList = avps.entries();

        for(Map.Entry<Integer, Avp> entry : avpList) {
            try {
                if ("Grouped".equals(types.get(entry.getKey()).get(DictionaryParser.AVP_TYPE))) {
                    Avp avp = new Avp();
                    avp.setAvpCode(entry.getKey());
                    avp.setFlags(entry.getValue().getFlags());
                    avp.setVendorFlag(entry.getValue().getVendorFlag());
                    avp.setVendorId(entry.getValue().getVendorId());
                    LinkedListMultimap<Integer, Object> grpAvpMap = (LinkedListMultimap<Integer, Object>)(entry.getValue()).getValue();
                    List< Object> grpAvpList = grpAvpMap.get(AVPS);
                    byte[] encodedAvp = avp.encodeGrouped(encodeAvps((LinkedListMultimap<Integer, Avp>)grpAvpList.get(0)));
                    res = Bytes.concat(res, encodedAvp);
                } else {
                    EncodeOperation op = (EncodeOperation) types.get(entry.getKey()).get(DictionaryParser.AVP_ENCODER);
                    Avp avp = new Avp();
                    avp.setAvpCode(entry.getKey());
                    avp.setValue(entry.getValue().getValue());
                    avp.setFlags(entry.getValue().getFlags());
                    avp.setVendorFlag(entry.getValue().getVendorFlag());
                    avp.setVendorId(entry.getValue().getVendorId());
                    byte[] encodedAvp = avp.encode(op);
                    res = Bytes.concat(res, encodedAvp);
                }
            } catch (Exception ex) {
                logger.error("Exception during encode AVP ({}) : {}", entry.getKey(), ex);
                return null;
            }
        }
        return res;
    }

}
