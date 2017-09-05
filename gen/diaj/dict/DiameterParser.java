// Generated from diaj/src/main/resources\Diameter.g4 by ANTLR 4.5.1
package diaj.dict;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiameterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, ALPHA=34, DIGIT=35, INT=36, COMMENT=37, WS=38, STRING=39;
	public static final int
		RULE_rules = 0, RULE_simple_avp_def = 1, RULE_avp_code = 2, RULE_enum_id = 3, 
		RULE_avp_type = 4, RULE_command_def = 5, RULE_command_name = 6, RULE_diameter_name = 7, 
		RULE_header = 8, RULE_diameter_message = 9, RULE_command_id = 10, RULE_application_id = 11, 
		RULE_r_bit = 12, RULE_p_bit = 13, RULE_e_bit = 14, RULE_fixed = 15, RULE_required = 16, 
		RULE_optional = 17, RULE_qual = 18, RULE_min = 19, RULE_max = 20, RULE_avp_name = 21, 
		RULE_avp = 22, RULE_enum_def = 23, RULE_enum_item = 24, RULE_enum_item_name = 25, 
		RULE_avp_header = 26, RULE_avpcode = 27, RULE_vendor = 28, RULE_grouped_avp_def = 29;
	public static final String[] ruleNames = {
		"rules", "simple_avp_def", "avp_code", "enum_id", "avp_type", "command_def", 
		"command_name", "diameter_name", "header", "diameter_message", "command_id", 
		"application_id", "r_bit", "p_bit", "e_bit", "fixed", "required", "optional", 
		"qual", "min", "max", "avp_name", "avp", "enum_def", "enum_item", "enum_item_name", 
		"avp_header", "avpcode", "vendor", "grouped_avp_def"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Integer32'", "'Integer64'", "'Unsigned32'", "'Unsigned64'", "'Float32'", 
		"'Float64'", "'Grouped'", "'Enumerated'", "'UTF8String'", "'OctetString'", 
		"'DiameterIdentity'", "'DiameterURI'", "'IPFilterRule'", "'Time'", "'Address'", 
		"'<'", "'>'", "'::='", "'-'", "'Diameter Header:'", "', REQ'", "', PXY'", 
		"', ERR'", "'{'", "'}'", "'['", "']'", "'*'", "'_'", "'AVP'", "'('", "')'", 
		"'<AVP Header:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "ALPHA", "DIGIT", 
		"INT", "COMMENT", "WS", "STRING"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Diameter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DiameterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RulesContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DiameterParser.EOF, 0); }
		public List<Command_defContext> command_def() {
			return getRuleContexts(Command_defContext.class);
		}
		public Command_defContext command_def(int i) {
			return getRuleContext(Command_defContext.class,i);
		}
		public List<Simple_avp_defContext> simple_avp_def() {
			return getRuleContexts(Simple_avp_defContext.class);
		}
		public Simple_avp_defContext simple_avp_def(int i) {
			return getRuleContext(Simple_avp_defContext.class,i);
		}
		public List<Grouped_avp_defContext> grouped_avp_def() {
			return getRuleContexts(Grouped_avp_defContext.class);
		}
		public Grouped_avp_defContext grouped_avp_def(int i) {
			return getRuleContext(Grouped_avp_defContext.class,i);
		}
		public List<Enum_defContext> enum_def() {
			return getRuleContexts(Enum_defContext.class);
		}
		public Enum_defContext enum_def(int i) {
			return getRuleContext(Enum_defContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitRules(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==ALPHA) {
				{
				setState(64);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(60);
					command_def();
					}
					break;
				case 2:
					{
					setState(61);
					simple_avp_def();
					}
					break;
				case 3:
					{
					setState(62);
					grouped_avp_def();
					}
					break;
				case 4:
					{
					setState(63);
					enum_def();
					}
					break;
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_avp_defContext extends ParserRuleContext {
		public Diameter_nameContext diameter_name() {
			return getRuleContext(Diameter_nameContext.class,0);
		}
		public Avp_codeContext avp_code() {
			return getRuleContext(Avp_codeContext.class,0);
		}
		public Avp_typeContext avp_type() {
			return getRuleContext(Avp_typeContext.class,0);
		}
		public Simple_avp_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_avp_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterSimple_avp_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitSimple_avp_def(this);
		}
	}

	public final Simple_avp_defContext simple_avp_def() throws RecognitionException {
		Simple_avp_defContext _localctx = new Simple_avp_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simple_avp_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			diameter_name();
			setState(72);
			avp_code();
			setState(73);
			avp_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Avp_codeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DiameterParser.INT, 0); }
		public TerminalNode DIGIT() { return getToken(DiameterParser.DIGIT, 0); }
		public Avp_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avp_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterAvp_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitAvp_code(this);
		}
	}

	public final Avp_codeContext avp_code() throws RecognitionException {
		Avp_codeContext _localctx = new Avp_codeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_avp_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==INT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_idContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(DiameterParser.DIGIT, 0); }
		public TerminalNode INT() { return getToken(DiameterParser.INT, 0); }
		public Enum_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterEnum_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitEnum_id(this);
		}
	}

	public final Enum_idContext enum_id() throws RecognitionException {
		Enum_idContext _localctx = new Enum_idContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_enum_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==INT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Avp_typeContext extends ParserRuleContext {
		public Avp_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avp_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterAvp_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitAvp_type(this);
		}
	}

	public final Avp_typeContext avp_type() throws RecognitionException {
		Avp_typeContext _localctx = new Avp_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_avp_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Command_defContext extends ParserRuleContext {
		public Command_nameContext command_name() {
			return getRuleContext(Command_nameContext.class,0);
		}
		public Diameter_messageContext diameter_message() {
			return getRuleContext(Diameter_messageContext.class,0);
		}
		public Command_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterCommand_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitCommand_def(this);
		}
	}

	public final Command_defContext command_def() throws RecognitionException {
		Command_defContext _localctx = new Command_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__15);
			setState(82);
			command_name();
			setState(83);
			match(T__16);
			setState(84);
			match(T__17);
			setState(85);
			diameter_message();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Command_nameContext extends ParserRuleContext {
		public Diameter_nameContext diameter_name() {
			return getRuleContext(Diameter_nameContext.class,0);
		}
		public Command_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterCommand_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitCommand_name(this);
		}
	}

	public final Command_nameContext command_name() throws RecognitionException {
		Command_nameContext _localctx = new Command_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			diameter_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Diameter_nameContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(DiameterParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(DiameterParser.ALPHA, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(DiameterParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DiameterParser.DIGIT, i);
		}
		public Diameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterDiameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitDiameter_name(this);
		}
	}

	public final Diameter_nameContext diameter_name() throws RecognitionException {
		Diameter_nameContext _localctx = new Diameter_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_diameter_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ALPHA);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << ALPHA) | (1L << DIGIT))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public Command_idContext command_id() {
			return getRuleContext(Command_idContext.class,0);
		}
		public List<R_bitContext> r_bit() {
			return getRuleContexts(R_bitContext.class);
		}
		public R_bitContext r_bit(int i) {
			return getRuleContext(R_bitContext.class,i);
		}
		public List<P_bitContext> p_bit() {
			return getRuleContexts(P_bitContext.class);
		}
		public P_bitContext p_bit(int i) {
			return getRuleContext(P_bitContext.class,i);
		}
		public List<E_bitContext> e_bit() {
			return getRuleContexts(E_bitContext.class);
		}
		public E_bitContext e_bit(int i) {
			return getRuleContext(E_bitContext.class,i);
		}
		public List<Application_idContext> application_id() {
			return getRuleContexts(Application_idContext.class);
		}
		public Application_idContext application_id(int i) {
			return getRuleContext(Application_idContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__15);
			setState(97);
			match(T__19);
			setState(98);
			command_id();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(99);
				r_bit();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(105);
				p_bit();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(111);
				e_bit();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(117);
				application_id();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Diameter_messageContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<FixedContext> fixed() {
			return getRuleContexts(FixedContext.class);
		}
		public FixedContext fixed(int i) {
			return getRuleContext(FixedContext.class,i);
		}
		public List<RequiredContext> required() {
			return getRuleContexts(RequiredContext.class);
		}
		public RequiredContext required(int i) {
			return getRuleContext(RequiredContext.class,i);
		}
		public List<OptionalContext> optional() {
			return getRuleContexts(OptionalContext.class);
		}
		public OptionalContext optional(int i) {
			return getRuleContext(OptionalContext.class,i);
		}
		public Diameter_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diameter_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterDiameter_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitDiameter_message(this);
		}
	}

	public final Diameter_messageContext diameter_message() throws RecognitionException {
		Diameter_messageContext _localctx = new Diameter_messageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_diameter_message);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			header();
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					fixed();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					required();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__27) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(138);
				optional();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Command_idContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DiameterParser.INT, 0); }
		public Command_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterCommand_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitCommand_id(this);
		}
	}

	public final Command_idContext command_id() throws RecognitionException {
		Command_idContext _localctx = new Command_idContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_command_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Application_idContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DiameterParser.INT, 0); }
		public Application_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterApplication_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitApplication_id(this);
		}
	}

	public final Application_idContext application_id() throws RecognitionException {
		Application_idContext _localctx = new Application_idContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_application_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_bitContext extends ParserRuleContext {
		public R_bitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_bit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterR_bit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitR_bit(this);
		}
	}

	public final R_bitContext r_bit() throws RecognitionException {
		R_bitContext _localctx = new R_bitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_r_bit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class P_bitContext extends ParserRuleContext {
		public P_bitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_bit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterP_bit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitP_bit(this);
		}
	}

	public final P_bitContext p_bit() throws RecognitionException {
		P_bitContext _localctx = new P_bitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_p_bit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class E_bitContext extends ParserRuleContext {
		public E_bitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e_bit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterE_bit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitE_bit(this);
		}
	}

	public final E_bitContext e_bit() throws RecognitionException {
		E_bitContext _localctx = new E_bitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_e_bit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixedContext extends ParserRuleContext {
		public Avp_nameContext avp_name() {
			return getRuleContext(Avp_nameContext.class,0);
		}
		public List<QualContext> qual() {
			return getRuleContexts(QualContext.class);
		}
		public QualContext qual(int i) {
			return getRuleContext(QualContext.class,i);
		}
		public FixedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterFixed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitFixed(this);
		}
	}

	public final FixedContext fixed() throws RecognitionException {
		FixedContext _localctx = new FixedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fixed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==DIGIT) {
				{
				{
				setState(154);
				qual();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__15);
			setState(161);
			avp_name();
			setState(162);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiredContext extends ParserRuleContext {
		public Avp_nameContext avp_name() {
			return getRuleContext(Avp_nameContext.class,0);
		}
		public List<QualContext> qual() {
			return getRuleContexts(QualContext.class);
		}
		public QualContext qual(int i) {
			return getRuleContext(QualContext.class,i);
		}
		public RequiredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_required; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterRequired(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitRequired(this);
		}
	}

	public final RequiredContext required() throws RecognitionException {
		RequiredContext _localctx = new RequiredContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_required);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==DIGIT) {
				{
				{
				setState(164);
				qual();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(T__23);
			setState(171);
			avp_name();
			setState(172);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalContext extends ParserRuleContext {
		public Avp_nameContext avp_name() {
			return getRuleContext(Avp_nameContext.class,0);
		}
		public List<QualContext> qual() {
			return getRuleContexts(QualContext.class);
		}
		public QualContext qual(int i) {
			return getRuleContext(QualContext.class,i);
		}
		public OptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitOptional(this);
		}
	}

	public final OptionalContext optional() throws RecognitionException {
		OptionalContext _localctx = new OptionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_optional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==DIGIT) {
				{
				{
				setState(174);
				qual();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(T__25);
			setState(181);
			avp_name();
			setState(182);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualContext extends ParserRuleContext {
		public List<MinContext> min() {
			return getRuleContexts(MinContext.class);
		}
		public MinContext min(int i) {
			return getRuleContext(MinContext.class,i);
		}
		public List<MaxContext> max() {
			return getRuleContexts(MaxContext.class);
		}
		public MaxContext max(int i) {
			return getRuleContext(MaxContext.class,i);
		}
		public QualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterQual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitQual(this);
		}
	}

	public final QualContext qual() throws RecognitionException {
		QualContext _localctx = new QualContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_qual);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT) {
				{
				{
				setState(184);
				min();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(T__27);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					max();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(DiameterParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DiameterParser.DIGIT, i);
		}
		public MinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitMin(this);
		}
	}

	public final MinContext min() throws RecognitionException {
		MinContext _localctx = new MinContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_min);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(197);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaxContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(DiameterParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DiameterParser.DIGIT, i);
		}
		public MaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitMax(this);
		}
	}

	public final MaxContext max() throws RecognitionException {
		MaxContext _localctx = new MaxContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_max);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(202);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(205); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Avp_nameContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(DiameterParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(DiameterParser.ALPHA, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(DiameterParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DiameterParser.DIGIT, i);
		}
		public Avp_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avp_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterAvp_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitAvp_name(this);
		}
	}

	public final Avp_nameContext avp_name() throws RecognitionException {
		Avp_nameContext _localctx = new Avp_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_avp_name);
		int _la;
		try {
			setState(213);
			switch (_input.LA(1)) {
			case T__18:
			case T__28:
			case ALPHA:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(207);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__28) | (1L << ALPHA) | (1L << DIGIT))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					setState(210); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__28) | (1L << ALPHA) | (1L << DIGIT))) != 0) );
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__29);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvpContext extends ParserRuleContext {
		public Avp_headerContext avp_header() {
			return getRuleContext(Avp_headerContext.class,0);
		}
		public List<FixedContext> fixed() {
			return getRuleContexts(FixedContext.class);
		}
		public FixedContext fixed(int i) {
			return getRuleContext(FixedContext.class,i);
		}
		public List<RequiredContext> required() {
			return getRuleContexts(RequiredContext.class);
		}
		public RequiredContext required(int i) {
			return getRuleContext(RequiredContext.class,i);
		}
		public List<OptionalContext> optional() {
			return getRuleContexts(OptionalContext.class);
		}
		public OptionalContext optional(int i) {
			return getRuleContext(OptionalContext.class,i);
		}
		public AvpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterAvp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitAvp(this);
		}
	}

	public final AvpContext avp() throws RecognitionException {
		AvpContext _localctx = new AvpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_avp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			avp_header();
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					fixed();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					required();
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__27) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(228);
				optional();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_defContext extends ParserRuleContext {
		public Diameter_nameContext diameter_name() {
			return getRuleContext(Diameter_nameContext.class,0);
		}
		public Avp_headerContext avp_header() {
			return getRuleContext(Avp_headerContext.class,0);
		}
		public List<Enum_itemContext> enum_item() {
			return getRuleContexts(Enum_itemContext.class);
		}
		public Enum_itemContext enum_item(int i) {
			return getRuleContext(Enum_itemContext.class,i);
		}
		public Enum_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterEnum_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitEnum_def(this);
		}
	}

	public final Enum_defContext enum_def() throws RecognitionException {
		Enum_defContext _localctx = new Enum_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enum_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			diameter_name();
			setState(235);
			match(T__17);
			setState(236);
			avp_header();
			setState(238); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(237);
					enum_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(240); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_itemContext extends ParserRuleContext {
		public Enum_item_nameContext enum_item_name() {
			return getRuleContext(Enum_item_nameContext.class,0);
		}
		public Enum_idContext enum_id() {
			return getRuleContext(Enum_idContext.class,0);
		}
		public Enum_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterEnum_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitEnum_item(this);
		}
	}

	public final Enum_itemContext enum_item() throws RecognitionException {
		Enum_itemContext _localctx = new Enum_itemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enum_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			enum_item_name();
			setState(243);
			match(T__30);
			setState(244);
			enum_id();
			setState(245);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_item_nameContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(DiameterParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(DiameterParser.ALPHA, i);
		}
		public Enum_item_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_item_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterEnum_item_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitEnum_item_name(this);
		}
	}

	public final Enum_item_nameContext enum_item_name() throws RecognitionException {
		Enum_item_nameContext _localctx = new Enum_item_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_enum_item_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==ALPHA) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__28 || _la==ALPHA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Avp_headerContext extends ParserRuleContext {
		public AvpcodeContext avpcode() {
			return getRuleContext(AvpcodeContext.class,0);
		}
		public VendorContext vendor() {
			return getRuleContext(VendorContext.class,0);
		}
		public Avp_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avp_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterAvp_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitAvp_header(this);
		}
	}

	public final Avp_headerContext avp_header() throws RecognitionException {
		Avp_headerContext _localctx = new Avp_headerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_avp_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__32);
			setState(253);
			avpcode();
			setState(255);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(254);
				vendor();
				}
			}

			setState(257);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvpcodeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DiameterParser.INT, 0); }
		public AvpcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avpcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterAvpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitAvpcode(this);
		}
	}

	public final AvpcodeContext avpcode() throws RecognitionException {
		AvpcodeContext _localctx = new AvpcodeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_avpcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VendorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DiameterParser.INT, 0); }
		public VendorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vendor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterVendor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitVendor(this);
		}
	}

	public final VendorContext vendor() throws RecognitionException {
		VendorContext _localctx = new VendorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_vendor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouped_avp_defContext extends ParserRuleContext {
		public Diameter_nameContext diameter_name() {
			return getRuleContext(Diameter_nameContext.class,0);
		}
		public AvpContext avp() {
			return getRuleContext(AvpContext.class,0);
		}
		public Grouped_avp_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouped_avp_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).enterGrouped_avp_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiameterListener ) ((DiameterListener)listener).exitGrouped_avp_def(this);
		}
	}

	public final Grouped_avp_defContext grouped_avp_def() throws RecognitionException {
		Grouped_avp_defContext _localctx = new Grouped_avp_defContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_grouped_avp_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__15);
			setState(264);
			diameter_name();
			setState(265);
			match(T__16);
			setState(266);
			match(T__17);
			setState(267);
			avp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0110\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\7\t^\n\t\f\t\16\ta\13"+
		"\t\3\n\3\n\3\n\3\n\7\ng\n\n\f\n\16\nj\13\n\3\n\7\nm\n\n\f\n\16\np\13\n"+
		"\3\n\7\ns\n\n\f\n\16\nv\13\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\13"+
		"\3\13\7\13\u0082\n\13\f\13\16\13\u0085\13\13\3\13\7\13\u0088\n\13\f\13"+
		"\16\13\u008b\13\13\3\13\7\13\u008e\n\13\f\13\16\13\u0091\13\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\7\21\u009e\n\21\f\21\16\21"+
		"\u00a1\13\21\3\21\3\21\3\21\3\21\3\22\7\22\u00a8\n\22\f\22\16\22\u00ab"+
		"\13\22\3\22\3\22\3\22\3\22\3\23\7\23\u00b2\n\23\f\23\16\23\u00b5\13\23"+
		"\3\23\3\23\3\23\3\23\3\24\7\24\u00bc\n\24\f\24\16\24\u00bf\13\24\3\24"+
		"\3\24\7\24\u00c3\n\24\f\24\16\24\u00c6\13\24\3\25\6\25\u00c9\n\25\r\25"+
		"\16\25\u00ca\3\26\6\26\u00ce\n\26\r\26\16\26\u00cf\3\27\6\27\u00d3\n\27"+
		"\r\27\16\27\u00d4\3\27\5\27\u00d8\n\27\3\30\3\30\7\30\u00dc\n\30\f\30"+
		"\16\30\u00df\13\30\3\30\7\30\u00e2\n\30\f\30\16\30\u00e5\13\30\3\30\7"+
		"\30\u00e8\n\30\f\30\16\30\u00eb\13\30\3\31\3\31\3\31\3\31\6\31\u00f1\n"+
		"\31\r\31\16\31\u00f2\3\32\3\32\3\32\3\32\3\32\3\33\6\33\u00fb\n\33\r\33"+
		"\16\33\u00fc\3\34\3\34\3\34\5\34\u0102\n\34\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\7\3\2%&\3\2\3\21\4\2\25\25$%\5"+
		"\2\25\25\37\37$%\4\2\37\37$$\u010c\2D\3\2\2\2\4I\3\2\2\2\6M\3\2\2\2\b"+
		"O\3\2\2\2\nQ\3\2\2\2\fS\3\2\2\2\16Y\3\2\2\2\20[\3\2\2\2\22b\3\2\2\2\24"+
		"\177\3\2\2\2\26\u0092\3\2\2\2\30\u0094\3\2\2\2\32\u0096\3\2\2\2\34\u0098"+
		"\3\2\2\2\36\u009a\3\2\2\2 \u009f\3\2\2\2\"\u00a9\3\2\2\2$\u00b3\3\2\2"+
		"\2&\u00bd\3\2\2\2(\u00c8\3\2\2\2*\u00cd\3\2\2\2,\u00d7\3\2\2\2.\u00d9"+
		"\3\2\2\2\60\u00ec\3\2\2\2\62\u00f4\3\2\2\2\64\u00fa\3\2\2\2\66\u00fe\3"+
		"\2\2\28\u0105\3\2\2\2:\u0107\3\2\2\2<\u0109\3\2\2\2>C\5\f\7\2?C\5\4\3"+
		"\2@C\5<\37\2AC\5\60\31\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2CF\3\2"+
		"\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\2\2\3H\3\3\2\2\2IJ\5"+
		"\20\t\2JK\5\6\4\2KL\5\n\6\2L\5\3\2\2\2MN\t\2\2\2N\7\3\2\2\2OP\t\2\2\2"+
		"P\t\3\2\2\2QR\t\3\2\2R\13\3\2\2\2ST\7\22\2\2TU\5\16\b\2UV\7\23\2\2VW\7"+
		"\24\2\2WX\5\24\13\2X\r\3\2\2\2YZ\5\20\t\2Z\17\3\2\2\2[_\7$\2\2\\^\t\4"+
		"\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\21\3\2\2\2a_\3\2\2\2bc"+
		"\7\22\2\2cd\7\26\2\2dh\5\26\f\2eg\5\32\16\2fe\3\2\2\2gj\3\2\2\2hf\3\2"+
		"\2\2hi\3\2\2\2in\3\2\2\2jh\3\2\2\2km\5\34\17\2lk\3\2\2\2mp\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2ot\3\2\2\2pn\3\2\2\2qs\5\36\20\2rq\3\2\2\2sv\3\2\2\2t"+
		"r\3\2\2\2tu\3\2\2\2uz\3\2\2\2vt\3\2\2\2wy\5\30\r\2xw\3\2\2\2y|\3\2\2\2"+
		"zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\23\2\2~\23\3\2\2\2\177\u0083"+
		"\5\22\n\2\u0080\u0082\5 \21\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0089\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0088\5\"\22\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008f\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008e\5$\23\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\25\3\2\2\2\u0091\u008f\3\2\2"+
		"\2\u0092\u0093\7&\2\2\u0093\27\3\2\2\2\u0094\u0095\7&\2\2\u0095\31\3\2"+
		"\2\2\u0096\u0097\7\27\2\2\u0097\33\3\2\2\2\u0098\u0099\7\30\2\2\u0099"+
		"\35\3\2\2\2\u009a\u009b\7\31\2\2\u009b\37\3\2\2\2\u009c\u009e\5&\24\2"+
		"\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\22\2\2"+
		"\u00a3\u00a4\5,\27\2\u00a4\u00a5\7\23\2\2\u00a5!\3\2\2\2\u00a6\u00a8\5"+
		"&\24\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\32"+
		"\2\2\u00ad\u00ae\5,\27\2\u00ae\u00af\7\33\2\2\u00af#\3\2\2\2\u00b0\u00b2"+
		"\5&\24\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\34"+
		"\2\2\u00b7\u00b8\5,\27\2\u00b8\u00b9\7\35\2\2\u00b9%\3\2\2\2\u00ba\u00bc"+
		"\5(\25\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c4\7\36"+
		"\2\2\u00c1\u00c3\5*\26\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\'\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c7\u00c9\7%\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb)\3\2\2\2\u00cc\u00ce\7%\2\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"+\3\2\2\2\u00d1\u00d3\t\5\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d8"+
		"\7 \2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8-\3\2\2\2\u00d9\u00dd"+
		"\5\66\34\2\u00da\u00dc\5 \21\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e3\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00e0\u00e2\5\"\22\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2"+
		"\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e9\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e8\5$\23\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea/\3\2\2\2\u00eb\u00e9\3\2\2\2"+
		"\u00ec\u00ed\5\20\t\2\u00ed\u00ee\7\24\2\2\u00ee\u00f0\5\66\34\2\u00ef"+
		"\u00f1\5\62\32\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3"+
		"\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\61\3\2\2\2\u00f4\u00f5\5\64\33\2\u00f5"+
		"\u00f6\7!\2\2\u00f6\u00f7\5\b\5\2\u00f7\u00f8\7\"\2\2\u00f8\63\3\2\2\2"+
		"\u00f9\u00fb\t\6\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\65\3\2\2\2\u00fe\u00ff\7#\2\2\u00ff"+
		"\u0101\58\35\2\u0100\u0102\5:\36\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7\23\2\2\u0104\67\3\2\2\2\u0105\u0106"+
		"\7&\2\2\u01069\3\2\2\2\u0107\u0108\7&\2\2\u0108;\3\2\2\2\u0109\u010a\7"+
		"\22\2\2\u010a\u010b\5\20\t\2\u010b\u010c\7\23\2\2\u010c\u010d\7\24\2\2"+
		"\u010d\u010e\5.\30\2\u010e=\3\2\2\2\33BD_hntz\u0083\u0089\u008f\u009f"+
		"\u00a9\u00b3\u00bd\u00c4\u00ca\u00cf\u00d4\u00d7\u00dd\u00e3\u00e9\u00f2"+
		"\u00fc\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}