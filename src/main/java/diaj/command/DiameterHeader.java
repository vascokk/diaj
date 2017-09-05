package diaj.command;

import java.util.Arrays;

import com.google.common.primitives.Bytes;
import com.google.common.primitives.Ints;
import diaj.decoder.Decoder;


public class DiameterHeader {
    private byte version;
    private int length;
    private byte flags;
    private int commandId;
    private int applicationId;
    private Integer hopeByHopeId;
    private Integer endToEndId;

    public DiameterHeader(byte version, int length, byte flags, int commandId, int applicationId, Integer hopeByHopeId, Integer endToEndId) {
        this.version = version;
        this.length = length;
        this.flags = flags;
        this.commandId = commandId;
        this.applicationId = applicationId;
        this.hopeByHopeId = hopeByHopeId;
        this.endToEndId = endToEndId;
    }

    public byte getVersion() {
        return version;
    }

    public void setVersion(byte version) {
        this.version = version;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public byte getFlags() {
        return flags;
    }

    public void setFlags(byte flags) {
        this.flags = flags;
    }

    public int getCommandId() {
        return commandId;
    }

    public void setCommandId(int commandId) {
        this.commandId = commandId;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getHopeByHopeId() {
        return hopeByHopeId;
    }

    public void setHopeByHopeId(int hopeByHopeId) {
        this.hopeByHopeId = hopeByHopeId;
    }

    public Integer getEndToEndId() {
        return endToEndId;
    }

    public void setEndToEndId(int endToEndId) {
        this.endToEndId = endToEndId;
    }


    public static DiameterHeader decode(byte[] data){
        return new DiameterHeader(
                data[0],
                Decoder.bytesToInt(data[1],data[2],data[3]),
                data[4],
                Decoder.bytesToInt(data[5],data[6],data[7]),
                Decoder.bytesToInt(data[8],data[9],data[10],data[11]),
                Decoder.bytesToInt(data[12],data[13],data[14],data[15]),
                Decoder.bytesToInt(data[16],data[17],data[18],data[19]));
    }

    public byte[] encode(){
        return Bytes.concat(
                new byte[]{this.version},
                Arrays.copyOfRange(Ints.toByteArray(this.length),1,4),//Decoder.bytesToInt(data[1],data[2],data[3]),
                new byte[]{this.flags},//data[4],
                Arrays.copyOfRange(Ints.toByteArray(this.commandId),1,4),//Decoder.bytesToInt(data[5],data[6],data[7]),
                Ints.toByteArray(this.applicationId),//Decoder.bytesToInt(data[8],data[9],data[10],data[11]),
                Ints.toByteArray(this.hopeByHopeId),//Decoder.bytesToInt(data[12],data[13],data[14],data[15]),
                Ints.toByteArray(this.endToEndId));//Decoder.bytesToInt(data[16],data[17],data[18],data[19]));
    }
}
