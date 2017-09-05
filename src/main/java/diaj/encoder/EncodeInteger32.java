package diaj.encoder;


public class EncodeInteger32 implements EncodeOperation{
    @Override
    public byte[] encode(Object value) {
        return Encoder.intToBytes((Integer)value);
    }
}
