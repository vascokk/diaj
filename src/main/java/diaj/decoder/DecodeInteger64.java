package diaj.decoder;


public class DecodeInteger64 implements DecodeOperation{
    @Override
    public Object decode(byte[] data, int len) {
        return Decoder.bytesToLong(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]);
    }
}
