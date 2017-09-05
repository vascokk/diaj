package diaj.decoder;


public class DecodeInteger32 implements DecodeOperation{
    @Override
    public Object decode(byte[] data, int len) {
        return Decoder.bytesToInt(data[0], data[1], data[2], data[3]);
    }
}
