package diaj.encoder;

import diaj.utils.Utils;

import java.nio.charset.Charset;

public class EncodeOctetString implements EncodeOperation{
    @Override
    public byte[] encode(Object value) {
        //return Bytes.concat(((String) value).getBytes(), new byte[]{0});
        //return ((String) value).getBytes(Charset.forName());
        return Utils.hexStringToByteArray((String)value);
        //return ((String)value).getBytes(Charset.defaultCharset());
    }
}
