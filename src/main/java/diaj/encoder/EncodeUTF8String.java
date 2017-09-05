package diaj.encoder;


public class EncodeUTF8String implements EncodeOperation{
    @Override
    public byte[] encode(Object value) {
        return ((String) value).getBytes();
    }
}
