// Generated from diaj/src/main/resources\Diameter.g4 by ANTLR 4.5.1
package diaj.dict;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a decode tree produced by
 * {@link DiameterParser}.
 */
public interface DiameterListener extends ParseTreeListener {
	/**
	 * Enter a decode tree produced by {@link DiameterParser#rules}.
	 * @param ctx the decode tree
	 */
	void enterRules(DiameterParser.RulesContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#rules}.
	 * @param ctx the decode tree
	 */
	void exitRules(DiameterParser.RulesContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#simple_avp_def}.
	 * @param ctx the decode tree
	 */
	void enterSimple_avp_def(DiameterParser.Simple_avp_defContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#simple_avp_def}.
	 * @param ctx the decode tree
	 */
	void exitSimple_avp_def(DiameterParser.Simple_avp_defContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#avp_code}.
	 * @param ctx the decode tree
	 */
	void enterAvp_code(DiameterParser.Avp_codeContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#avp_code}.
	 * @param ctx the decode tree
	 */
	void exitAvp_code(DiameterParser.Avp_codeContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#enum_id}.
	 * @param ctx the decode tree
	 */
	void enterEnum_id(DiameterParser.Enum_idContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#enum_id}.
	 * @param ctx the decode tree
	 */
	void exitEnum_id(DiameterParser.Enum_idContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#avp_type}.
	 * @param ctx the decode tree
	 */
	void enterAvp_type(DiameterParser.Avp_typeContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#avp_type}.
	 * @param ctx the decode tree
	 */
	void exitAvp_type(DiameterParser.Avp_typeContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#command_def}.
	 * @param ctx the decode tree
	 */
	void enterCommand_def(DiameterParser.Command_defContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#command_def}.
	 * @param ctx the decode tree
	 */
	void exitCommand_def(DiameterParser.Command_defContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#command_name}.
	 * @param ctx the decode tree
	 */
	void enterCommand_name(DiameterParser.Command_nameContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#command_name}.
	 * @param ctx the decode tree
	 */
	void exitCommand_name(DiameterParser.Command_nameContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#diameter_name}.
	 * @param ctx the decode tree
	 */
	void enterDiameter_name(DiameterParser.Diameter_nameContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#diameter_name}.
	 * @param ctx the decode tree
	 */
	void exitDiameter_name(DiameterParser.Diameter_nameContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#header}.
	 * @param ctx the decode tree
	 */
	void enterHeader(DiameterParser.HeaderContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#header}.
	 * @param ctx the decode tree
	 */
	void exitHeader(DiameterParser.HeaderContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#diameter_message}.
	 * @param ctx the decode tree
	 */
	void enterDiameter_message(DiameterParser.Diameter_messageContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#diameter_message}.
	 * @param ctx the decode tree
	 */
	void exitDiameter_message(DiameterParser.Diameter_messageContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#command_id}.
	 * @param ctx the decode tree
	 */
	void enterCommand_id(DiameterParser.Command_idContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#command_id}.
	 * @param ctx the decode tree
	 */
	void exitCommand_id(DiameterParser.Command_idContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#application_id}.
	 * @param ctx the decode tree
	 */
	void enterApplication_id(DiameterParser.Application_idContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#application_id}.
	 * @param ctx the decode tree
	 */
	void exitApplication_id(DiameterParser.Application_idContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#r_bit}.
	 * @param ctx the decode tree
	 */
	void enterR_bit(DiameterParser.R_bitContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#r_bit}.
	 * @param ctx the decode tree
	 */
	void exitR_bit(DiameterParser.R_bitContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#p_bit}.
	 * @param ctx the decode tree
	 */
	void enterP_bit(DiameterParser.P_bitContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#p_bit}.
	 * @param ctx the decode tree
	 */
	void exitP_bit(DiameterParser.P_bitContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#e_bit}.
	 * @param ctx the decode tree
	 */
	void enterE_bit(DiameterParser.E_bitContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#e_bit}.
	 * @param ctx the decode tree
	 */
	void exitE_bit(DiameterParser.E_bitContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#fixed}.
	 * @param ctx the decode tree
	 */
	void enterFixed(DiameterParser.FixedContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#fixed}.
	 * @param ctx the decode tree
	 */
	void exitFixed(DiameterParser.FixedContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#required}.
	 * @param ctx the decode tree
	 */
	void enterRequired(DiameterParser.RequiredContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#required}.
	 * @param ctx the decode tree
	 */
	void exitRequired(DiameterParser.RequiredContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#optional}.
	 * @param ctx the decode tree
	 */
	void enterOptional(DiameterParser.OptionalContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#optional}.
	 * @param ctx the decode tree
	 */
	void exitOptional(DiameterParser.OptionalContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#qual}.
	 * @param ctx the decode tree
	 */
	void enterQual(DiameterParser.QualContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#qual}.
	 * @param ctx the decode tree
	 */
	void exitQual(DiameterParser.QualContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#min}.
	 * @param ctx the decode tree
	 */
	void enterMin(DiameterParser.MinContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#min}.
	 * @param ctx the decode tree
	 */
	void exitMin(DiameterParser.MinContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#max}.
	 * @param ctx the decode tree
	 */
	void enterMax(DiameterParser.MaxContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#max}.
	 * @param ctx the decode tree
	 */
	void exitMax(DiameterParser.MaxContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#avp_name}.
	 * @param ctx the decode tree
	 */
	void enterAvp_name(DiameterParser.Avp_nameContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#avp_name}.
	 * @param ctx the decode tree
	 */
	void exitAvp_name(DiameterParser.Avp_nameContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#avp}.
	 * @param ctx the decode tree
	 */
	void enterAvp(DiameterParser.AvpContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#avp}.
	 * @param ctx the decode tree
	 */
	void exitAvp(DiameterParser.AvpContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#enum_def}.
	 * @param ctx the decode tree
	 */
	void enterEnum_def(DiameterParser.Enum_defContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#enum_def}.
	 * @param ctx the decode tree
	 */
	void exitEnum_def(DiameterParser.Enum_defContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#enum_item}.
	 * @param ctx the decode tree
	 */
	void enterEnum_item(DiameterParser.Enum_itemContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#enum_item}.
	 * @param ctx the decode tree
	 */
	void exitEnum_item(DiameterParser.Enum_itemContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#enum_item_name}.
	 * @param ctx the decode tree
	 */
	void enterEnum_item_name(DiameterParser.Enum_item_nameContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#enum_item_name}.
	 * @param ctx the decode tree
	 */
	void exitEnum_item_name(DiameterParser.Enum_item_nameContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#avp_header}.
	 * @param ctx the decode tree
	 */
	void enterAvp_header(DiameterParser.Avp_headerContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#avp_header}.
	 * @param ctx the decode tree
	 */
	void exitAvp_header(DiameterParser.Avp_headerContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#avpcode}.
	 * @param ctx the decode tree
	 */
	void enterAvpcode(DiameterParser.AvpcodeContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#avpcode}.
	 * @param ctx the decode tree
	 */
	void exitAvpcode(DiameterParser.AvpcodeContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#vendor}.
	 * @param ctx the decode tree
	 */
	void enterVendor(DiameterParser.VendorContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#vendor}.
	 * @param ctx the decode tree
	 */
	void exitVendor(DiameterParser.VendorContext ctx);
	/**
	 * Enter a decode tree produced by {@link DiameterParser#grouped_avp_def}.
	 * @param ctx the decode tree
	 */
	void enterGrouped_avp_def(DiameterParser.Grouped_avp_defContext ctx);
	/**
	 * Exit a decode tree produced by {@link DiameterParser#grouped_avp_def}.
	 * @param ctx the decode tree
	 */
	void exitGrouped_avp_def(DiameterParser.Grouped_avp_defContext ctx);
}