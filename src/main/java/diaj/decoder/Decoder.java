package diaj.decoder;

import com.google.common.collect.LinkedListMultimap;
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

import java.util.*;


public class Decoder {

    private Logger logger = LoggerFactory.getLogger(Decoder.class);

    public static int HEADER = 1;
    public static int AVPS = 2;

    private DictionaryParser dictionaryParser;
    private Map<Integer, Map<Integer, Object>> types;

    public Decoder(String dict){
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

    public static short bytesToShort(final byte byte1, final byte byte2) {
        return Shorts.fromBytes(byte1, byte2);
    }

    public static byte[] intToBytes(final int value) {
        return Ints.toByteArray(value);
    }

    public static byte[] floatToBytes(final float value) {
        return Ints.toByteArray(Float.floatToIntBits(value));
    }

    public static float bytesToFloat(final byte byte1, final byte byte2, final byte byte3, final byte byte4) {
        return Float.intBitsToFloat(Ints.fromBytes(byte1, byte2, byte3, byte4));
    }


    public static long bytesToLong(final byte byte1, final byte byte2, final byte byte3, final byte byte4, final byte byte5, final byte byte6, final byte byte7, final byte byte8) {
        return Longs.fromBytes(byte1, byte2, byte3, byte4, byte5, byte6, byte7, byte8);
    }

    public static int bytesToInt(final byte byte1, final byte byte2, final byte byte3, final byte byte4) {
        return Ints.fromBytes(byte1, byte2, byte3, byte4);
    }


    public static int bytesToInt(final byte byte1, final byte byte2, final byte byte3) {
        return Ints.fromBytes((byte)0, byte1, byte2, byte3);
    }

    public DiameterCommand decode(byte[] data){
        LinkedListMultimap<Integer, Object> res = decodeHeader(data, LinkedListMultimap.create());
        res = decodeAvp(data, 20, res);
        DiameterCommand cmd = new DiameterCommand();
        List<Object> avpsList =  res.get(Decoder.AVPS);
        DiameterHeader h = (DiameterHeader)res.get(Decoder.HEADER).get(0);
        cmd.setCommandId(h.getCommandId());
        cmd.setHeader(h);
        cmd.setAvps((LinkedListMultimap<Integer, Avp>) avpsList.get(0));
        return cmd;
    }

    public LinkedListMultimap<Integer, Object> decodeHeader(byte[] data, LinkedListMultimap<Integer, Object> res){
        DiameterHeader h = DiameterHeader.decode(data);
        res.put(HEADER, h);
        res.put(AVPS, LinkedListMultimap.create());
        return res;
    }

    public LinkedListMultimap<Integer, Object> decodeAvp(byte[] data, int offset, LinkedListMultimap<Integer, Object> res){
        Avp avp = Avp.decode(data, offset);
        try{
            if("Grouped".equals(types.get(avp.getAvpCode()).get(DictionaryParser.AVP_TYPE))){
                LinkedListMultimap<Integer, Object> grp_res = LinkedListMultimap.create();
                grp_res.put(AVPS, LinkedListMultimap.create());
                LinkedListMultimap<Integer, Object> grpAvp = decodeAvp(avp.getData(), 0, grp_res);
                avp.setValue(grpAvp);
                res = addAvp(res, avp);
            }else{
                DecodeOperation op = (DecodeOperation) types.get(avp.getAvpCode()).get(DictionaryParser.AVP_DECODER);
                Object value = op.decode(avp.getData(), avp.getLength());
                avp.setValue(value);
                res = addAvp(res, avp);
            }

            int padding = (4 - avp.getLength()%4)%4;

            offset += avp.getLength() + padding;

            if(data.length-offset > 8){
                return decodeAvp(data, offset, res);
            }else{
                return res;
            }
        }catch(Exception ex){
            logger.error("Exception during decode AVP ({}) : {}",avp.getAvpCode(), ex);
            return null;
        }
    }

    private LinkedListMultimap<Integer, Object> addAvp(LinkedListMultimap<Integer, Object> res, Avp avp) {
        List<Object> avpsList =  res.get(AVPS);
        LinkedListMultimap<Integer,Object> avpsMap = (LinkedListMultimap<Integer, Object>)avpsList.get(0);
        avpsMap.put(avp.getAvpCode(), avp);
        res.removeAll(AVPS);
        res.put(AVPS, avpsMap);
        return res;
    }

}
