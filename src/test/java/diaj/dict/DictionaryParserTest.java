package diaj.dict;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import diaj.avp.Avp;
import diaj.command.DiameterCommand;
import diaj.decoder.Decoder;
import diaj.encoder.Encoder;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.junit.Before;
import org.junit.Test;
import diaj.utils.Utils;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.IOUtils;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;


public class DictionaryParserTest {
    @Before
    public void startUp() throws Exception{

    }

    @Test
    public void testEnterCommand_name() throws Exception {
        String rx = getDict();
        ANTLRInputStream input = new ANTLRInputStream(rx);
        DiameterLexer lexer = new DiameterLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        DiameterParser parser = new DiameterParser(tokens);

        DictionaryParser dictionaryParser = new DictionaryParser();
        parser.addParseListener(dictionaryParser);
        parser.rules();

    }

    @Test
    public void testUtf8StringDecode() throws Exception {
        String dict = "            Session-Id                  263     UTF8String\n" +
                      "\n" +
                      "            <AA-Request> ::= < Diameter Header: 265, REQ, PXY >\n" +
                      "             < Session-Id >";
        byte[] data= TestUtils.hexStringToByteArray("01000374c000010901000014080161003c5b7f57000001074000002167656e62616e643b323031303233393738363b3133337c3100000000");

        Decoder decoder = new Decoder(dict);
        DiameterCommand cmd = decoder.decode(data);
        Avp avp = cmd.getAvpByCode(263);
        assertEquals("genband;2010239786;133|1\0",avp.getValue());
    }

    @Test
    public void testRx() throws Exception {
        String rx = getDict();
        byte[] data= TestUtils.hexStringToByteArray("0100042cc000010901000014080161021afde3fa000001074000002167656e62616e643b323031303233393738363b3133337c3100000000000000084000000cb5d5d5630000020fc0000010000028af00000000000001024000000c010000140000011b4000001572782e6f70656e65742e636f6d00000000000205c0000350000028af00000206c0000010000028af0000000100000207c00000ac000028af000001fdc0000010000028af00000001000001fbc0000045000028af7065726d697420696e2031372066726f6d203138312e3231332e3231332e39392020746f203230302e3235352e36372e313937203138313734000000000001fbc0000046000028af7065726d6974206f75742031372066726f6d203230302e3235352e36372e3139372020746f203138312e3231332e3231332e3939203631313730000000000207c00000bc000028af000001fdc0000010000028af00000002000001fbc0000045000028af7065726d697420696e2031372066726f6d203138312e3231332e3231332e39392020746f203230302e3235352e36372e313937203138313735000000000001fbc0000046000028af7065726d6974206f75742031372066726f6d203230302e3235352e36372e3139372020746f203138312e3231332e3231332e3939203631313731000000000200c0000010000028af0000000100000208c0000010000028af0000000000000204c0000010000028af0001388000000203c0000010000028af000138800000021780000010000028af000138800000021680000010000028af00013880000001ffc0000010000028af000000020000020cc0000080000028af646f776e6c696e6b0a616e737765720a6d3d617564696f203138313734205254502f4156502030203130310a613d7274706d61703a3130312074656c6570686f6e652d6576656e742f383030300a613d666d74703a31303120302d31350a613d7074696d653a32300a613d73656e64726563760a0000020cc00000ec000028af75706c696e6b0a6f666665720a6d3d617564696f203631313730205254502f41565020392038203132302030203834203130310a613d7274706d61703a313230206f7075732f34383030302f320a613d666d74703a31323020757365696e62616e646665633d313b207573656474783d313b206d617861766572616765626974726174653d36343030300a613d7274706d61703a38342073706565782f31363030300a613d7274706d61703a3130312074656c6570686f6e652d6576656e742f383030300a613d666d74703a31303120302d31350a613d73656e64726563760a000001bb4000003c000001c24000000c00000002000001bc400000267369703a2b35353231323130313135303540656d62726174656c2e636f6d0000000001084000000f67656e62616e6400000001284000001672782e67656e62616e642e636f6d0000");
        Decoder decoder = new Decoder(rx);
        DiameterCommand cmd = decoder.decode(data);
        Avp avp = cmd.getAvpByCode(263);
        assertEquals("genband;2010239786;133|1\0",avp.getValue());

        Encoder encoder = new Encoder(rx);
        byte[] newData = encoder.encode(cmd);
        assertEquals(Utils.byteArrayToHexString(data),Utils.byteArrayToHexString(newData));
    }

    public String getDict() throws IOException {
        URL dict_url = this.getClass().getClassLoader().getResource("Rx_full.dict");
        String rx = IOUtils.toString(dict_url, Charset.defaultCharset());
        return rx;
    }

}