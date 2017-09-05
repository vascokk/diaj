package diaj.decoder;


public class DecodeUTF8String implements DecodeOperation{
    @Override
    public String decode(byte[] data, int len) {
        return  new String(data);
    }
}
