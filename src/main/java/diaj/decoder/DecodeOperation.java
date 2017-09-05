package diaj.decoder;


public interface DecodeOperation {
    Object decode(byte[] data, int len);
}
