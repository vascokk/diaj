package diaj.avp;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.primitives.Bytes;
import com.google.common.primitives.Ints;
import diaj.decoder.Decoder;
import diaj.encoder.EncodeOperation;
import diaj.encoder.Encoder;

import java.util.Arrays;
import java.util.List;


public class Avp {

    private Integer avpCode;
    private byte flags;
    private Integer length;
    private Integer vendorId;
    private byte[] data;
    private LinkedListMultimap<Integer, Avp> avps;
    private Object value;


    private byte vendorFlag;

    public Avp(){
        length = 0;
        vendorId = null;
    }

    public Avp(Integer avpCode, byte flags, Integer length, Integer vendorId, byte[] data) {
        this.avpCode = avpCode;
        this.flags = flags;
        this.length = length;
        this.vendorId = vendorId;
        this.data = data;
        this.setVendorFlag((byte) 1);
    }


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void createAvpGroup(List<Avp> avps){
        LinkedListMultimap<Integer,Avp> avpMap = LinkedListMultimap.create();
        for(Avp avp : avps){
            avpMap.put(avp.getAvpCode(), avp);
        }
        this.value = avpMap;
    }

    public Object getAvpByCode(Integer avpCode){
        List<Avp> obj= ((LinkedListMultimap<Integer, Avp>)value).get(avpCode);
        return obj.get(0);
    }


    public byte getVendorFlag() {
        return vendorFlag;
    }

    public void setVendorFlag(byte vendorFlag) {
        this.vendorFlag = vendorFlag;
    }


    public Integer getAvpCode() {
        return avpCode;
    }

    public void setAvpCode(Integer avpCode) {
        this.avpCode = avpCode;
    }

    public byte getFlags() {
        return flags;
    }

    public void setFlags(byte flags) {
        this.flags = flags;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }


    public static Avp decode(byte[] data, int offset){
        int len = Decoder.bytesToInt(data[offset + 5], data[offset + 6], data[offset + 7]);
        data = Arrays.copyOfRange(data, offset, offset+len);
        int i =  data[4] >> 8 & 1;
        Integer vendorId = null;

        byte[] avpValue;

        if(i == 1) {
            avpValue = Arrays.copyOfRange(data, 12, len);
            vendorId = Decoder.bytesToInt(data[8], data[9], data[10], data[11]);
        }else{
            avpValue = Arrays.copyOfRange(data, 8, len);
        }

        return new Avp(
                Decoder.bytesToInt(data[0], data[1], data[2], data[3]),
                data[4],
                len,
                vendorId,
                avpValue
        );
    }

    public byte[] encode(EncodeOperation op){
        byte[] valBytes = op.encode(value);
        length = valBytes.length;

        if(vendorId != null){
            flags |= 128;
            length += 4;
        }

        length+=8;

        byte[] res = Bytes.concat(
                Encoder.intToBytes(avpCode),
                new byte[]{flags},
                Arrays.copyOfRange(Ints.toByteArray(length),1,4),
                vendorId==null?new byte[0]:Encoder.intToBytes(vendorId),
                valBytes
        );
        int padding = (4 - res.length%4)%4;
        return Arrays.copyOf(res, res.length+padding);
    }

    public byte[] encodeGrouped(byte[] data) {
        length = data.length;

        if(vendorId != null){
            flags |= 128;
            length += 4;
        }

        length+=8;//avp code + length + flags
        byte[] res = Bytes.concat(
                Encoder.intToBytes(avpCode),
                new byte[]{flags},
                Arrays.copyOfRange(Ints.toByteArray(length),1,4),
                vendorId==null?new byte[0]:Encoder.intToBytes(vendorId),
                data
        );
        int padding = (4 - res.length%4)%4;
        return Arrays.copyOf(res, res.length+padding);
    }
}
