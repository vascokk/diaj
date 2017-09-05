package diaj.dict;

import diaj.avp.Avp;
import diaj.encoder.EncodeOctetString;
import diaj.encoder.EncodeUTF8String;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;


public class AvpTest {

    @Test
    public void testParse() throws Exception {
        byte[] data = TestUtils.hexStringToByteArray("000001014000000e0001c8ff43c60000");
        Avp avp = Avp.decode(data, 0);
        assertEquals((Integer)257, avp.getAvpCode());
        assertEquals((Integer)14, avp.getLength());
        assertEquals((byte)0x40, avp.getFlags());
    }

    @Test
    public void avpEncode() throws Exception {
        byte[] data= TestUtils.hexStringToByteArray("000001284000001672782e67656e62616e642e636f6d0000");
        Avp avp = new Avp();
        avp.setAvpCode(296);
        avp.setFlags((byte)0x00000040);
        avp.setValue("rx.genband.com");
        byte[] tmp = avp.encode(new EncodeUTF8String() );
        assertTrue(Arrays.equals(data, tmp));

    }

    @Test
    public void testCreateAvpGroup() throws Exception {
        Avp avp1 = new Avp();
        avp1.setAvpCode(1);
        avp1.setValue(123);

        Avp avp2 = new Avp();
        avp2.setAvpCode(2);
        avp2.setValue(555);

        Avp grp = new Avp();
        grp.setAvpCode(3);
        List<Avp> l = new LinkedList<>();
        l.add(avp1);
        l.add(avp2);

        grp.createAvpGroup(l);

        Avp res = (Avp)grp.getAvpByCode(2);

        assertEquals(avp2.getValue(), res.getValue());
    }

}