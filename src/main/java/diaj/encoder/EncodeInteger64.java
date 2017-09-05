package diaj.encoder;


public class EncodeInteger64 implements EncodeOperation{
    @Override
    public byte[] encode(Object value) {
        return Encoder.longToBytes((Long)value);
    }
}
