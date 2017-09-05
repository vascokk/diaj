package diaj.utils;

import java.nio.charset.Charset;
import java.util.Formatter;


public class Utils {
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }

    public static String byteArrayToHexString(byte[] data){
        Formatter formatter = new Formatter();
        for (byte b : data) {
            formatter.format("%02x", b);
        }
        if(data[data.length-1] ==0 ) {
            return formatter.toString()+'\0';
        }else{
            return formatter.toString();
        }
    }
}
