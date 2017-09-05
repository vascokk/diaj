package diaj.dict;

import diaj.avp.AvpTypeEnum;
import diaj.decoder.*;
import diaj.encoder.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import diaj.dict.*;


public class DictionaryParser extends DiameterBaseListener {

    public static Integer AVP_NAME_KEY = 1;
    public static Integer AVP_TYPE = 2;
    public static Integer AVP_DECODER = 3;
    public static Integer AVP_ENCODER = 4;

    private Logger logger = LoggerFactory.getLogger(DictionaryParser.class);

    private Stack<DecodeOperation> operations = new Stack<>();

    public Stack<DecodeOperation> getOperations(){
        return operations;
    }

    private int grouped = 0;


    private Map<Integer, Map<Integer, Object>> types = new HashMap<>();
    private Map<Integer, String> codes = new HashMap<>();



    public Map<Integer, Map<Integer, Object>> getTypes() {
        return types;
    }

    @Override
    public void exitCommand_def(DiameterParser.Command_defContext ctx) {
        logger.debug("Command: " + ctx.getText());
        //key: command code, value: command name
        codes.put(Integer.getInteger(ctx.diameter_message().header().command_id().getText()), ctx.command_name().diameter_name().getText());
    }

    @Override
    public void exitSimple_avp_def(DiameterParser.Simple_avp_defContext ctx){
        logger.debug("AVP name: " + ctx.diameter_name().getText());
        logger.debug("AVP code: " + ctx.avp_code().getText());
        logger.debug("AVP type: " + ctx.avp_type().getText());


        Map<Integer, Object> typeProps = new HashMap<>();
        typeProps.put(AVP_TYPE, ctx.avp_type().getText());

        switch (AvpTypeEnum.valueOf(ctx.avp_type().getText())){
            case Integer32:
                typeProps.put(AVP_DECODER, new DecodeInteger32());
                typeProps.put(AVP_ENCODER, new EncodeInteger32());
                break;
            case Unsigned32:
                typeProps.put(AVP_DECODER, new DecodeInteger32());
                typeProps.put(AVP_ENCODER, new EncodeInteger32());
                break;
            case Integer64:
                typeProps.put(AVP_DECODER, new DecodeInteger64());
                typeProps.put(AVP_ENCODER, new EncodeInteger64());
                break;
            case Unsigned64:
                typeProps.put(AVP_DECODER, new DecodeInteger64());
                typeProps.put(AVP_ENCODER, new EncodeInteger64());
                break;
            case UTF8String:
                typeProps.put(AVP_DECODER, new DecodeUTF8String());
                typeProps.put(AVP_ENCODER, new EncodeUTF8String());
                break;
            case OctetString:
                typeProps.put(AVP_DECODER, new DecodeOctetString());
                typeProps.put(AVP_ENCODER, new EncodeOctetString());
                break;
            case Grouped:
                typeProps.put(AVP_DECODER, new DecodeGrouped());
                typeProps.put(AVP_ENCODER, new EncodeGrouped());
                break;
            case Address:
                typeProps.put(AVP_DECODER, new DecodeOctetString());
                typeProps.put(AVP_ENCODER, new EncodeOctetString());
                break;
            case Time:
                typeProps.put(AVP_DECODER, new DecodeOctetString());
                typeProps.put(AVP_ENCODER, new EncodeOctetString());
                break;
            case DiameterIdentity:
                typeProps.put(AVP_DECODER, new DecodeOctetString());
                typeProps.put(AVP_ENCODER, new EncodeOctetString());
                break;
            case DiameterURI:
                typeProps.put(AVP_DECODER, new DecodeOctetString());
                typeProps.put(AVP_ENCODER, new EncodeOctetString());
                break;
            case Enumerated:
                typeProps.put(AVP_DECODER, new DecodeInteger32());
                typeProps.put(AVP_ENCODER, new EncodeInteger32());
                break;
            case IPFilterRule:
                typeProps.put(AVP_DECODER, new DecodeOctetString());
                typeProps.put(AVP_ENCODER, new EncodeOctetString());
                break;
            default:
                logger.error("Undefined AVP type {} for AVP {}",ctx.avp_type().getText(),ctx.diameter_name().getText());
        }

        types.put(Integer.valueOf(ctx.avp_code().getText()), typeProps);
        codes.put(Integer.valueOf(ctx.avp_code().getText()), ctx.avp_type().getText());
    }


    @Override
    public void exitEnum_def(DiameterParser.Enum_defContext ctx){
        logger.debug("Enum name: " + ctx.diameter_name().getText());
        logger.debug("Enum avp code: " + ctx.avp_header().avpcode().getText());
        logger.debug("Enum avp vendor: " + ctx.avp_header().vendor());
        List<DiameterParser.Enum_itemContext> items =  ctx.enum_item();
        for(DiameterParser.Enum_itemContext item : items){
            logger.debug("Enum avp item name: " + item.enum_item_name().getText() +"("+item.enum_id().getText()+")");
        }
        operations.push(new DecodeInteger32());
    }
}
