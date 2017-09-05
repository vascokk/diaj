package diaj.encoder;

import diaj.utils.Utils;

import java.nio.charset.Charset;

public class EncodeOctetString implements EncodeOperation{
    @Override
    public byte[] encode(Object value) {
        return Utils.hexStringToByteArray((String)value);
    }
}
