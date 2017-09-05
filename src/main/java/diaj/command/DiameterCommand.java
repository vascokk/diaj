package diaj.command;

import com.google.common.collect.LinkedListMultimap;
import diaj.avp.Avp;

import java.util.List;


public class DiameterCommand {
    Integer commandId;
    DiameterHeader header;
    LinkedListMultimap<Integer, Avp> avps;

    public DiameterCommand(){
        avps = LinkedListMultimap.create();
    }

    public DiameterCommand(Integer commandId){
        this.commandId = commandId;
        avps = LinkedListMultimap.create();
    }

    public DiameterHeader getHeader() {
        return header;
    }

    public void setHeader(DiameterHeader header) {
        this.header = header;
    }


    public LinkedListMultimap<Integer, Avp> getAvps() {
        return avps;
    }

    public void setAvps(LinkedListMultimap<Integer, Avp> avps) {
        this.avps = avps;
    }

    public void addAvp(Avp avp){
        avps.put(avp.getAvpCode(), avp);
    }

    public Avp getAvpByCode(Integer avpCode){
        List<Avp> obj= avps.get(avpCode);
        return obj.get(0);
    }

    public Avp getAvpByName(String name) {
        return null;//TODO
    }

    public void setCommandId(int commandId) {
        this.commandId = commandId;
    }

    public Integer getCommandId() {
        return commandId;
    }

    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
    }
}
