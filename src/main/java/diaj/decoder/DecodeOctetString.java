package diaj.decoder;

import diaj.utils.Utils;

public class DecodeOctetString implements DecodeOperation{
    @Override
    public String decode(byte[] data, int len) {
        return Utils.byteArrayToHexString(data);
    }
}
