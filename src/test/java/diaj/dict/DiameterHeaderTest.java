package diaj.dict;


import diaj.command.DiameterHeader;

import java.util.Arrays;

import static org.junit.Assert.*;


public class DiameterHeaderTest {

    @org.junit.Test
    public void testParse() throws Exception {
        byte[] data= TestUtils.hexStringToByteArray("010000b48000010100000000140effbd1b28f396");
        DiameterHeader h = DiameterHeader.decode(data);
        assertEquals(1, h.getVersion());
        assertEquals(180, h.getLength());
        assertEquals((byte)0x80, h.getFlags());
        assertEquals(257, h.getCommandId());
        assertEquals(0, h.getApplicationId());
        assertEquals(new Integer(0x140effbd), h.getHopeByHopeId());
        assertEquals(new Integer(0x1b28f396), h.getEndToEndId());
        byte[] tmp = h.encode();
        assertTrue(Arrays.equals(data, tmp));
    }
}