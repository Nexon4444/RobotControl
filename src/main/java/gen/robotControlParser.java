// Generated from E:/Users/Maciej/Studia/TKOM/RobotControl5/gen/gen\robotControl.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class robotControlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, IF=2, ELSE=3, WHILE=4, LEFT=5, RIGHT=6, FRONT=7, BACK=8, LCBRACKET=9, 
		RCBRACKET=10, LNBRACKET=11, RNBRACKET=12, LSBRACKET=13, RSBRACKET=14, 
		OPPLUS=15, OPMINUS=16, OPMUL=17, OPDIV=18, OPGREATER=19, OPSMALLER=20, 
		OPEQUAL=21, OPASSIGN=22, SEMICOLON=23, VARINT=24, VARROBOT=25, VARSTRING=26, 
		VARDOUBLE=27, SETSPEED=28, INT=29, VARNAME=30, STRING=31, DOUBLE=32, WHITESPACE=33, 
		COMMENT=34;
	public static final int
		RULE_script = 0, RULE_ifStment = 1, RULE_whileStment = 2, RULE_stment = 3, 
		RULE_robotStmentDouble = 4, RULE_robotStmentInt = 5, RULE_mathExpr = 6, 
		RULE_mathExprInt = 7, RULE_mathExprDouble = 8, RULE_expr = 9, RULE_declaration = 10, 
		RULE_declarationInt = 11, RULE_declarationString = 12, RULE_declarationDouble = 13, 
		RULE_assignement = 14, RULE_assignementInt = 15, RULE_assignementString = 16, 
		RULE_initiailizeRobot = 17, RULE_assignementDouble = 18, RULE_relOp = 19, 
		RULE_varType = 20, RULE_varInt = 21, RULE_varDouble = 22, RULE_varRobot = 23, 
		RULE_varName = 24;
	public static final String[] ruleNames = {
		"script", "ifStment", "whileStment", "stment", "robotStmentDouble", "robotStmentInt", 
		"mathExpr", "mathExprInt", "mathExprDouble", "expr", "declaration", "declarationInt", 
		"declarationString", "declarationDouble", "assignement", "assignementInt", 
		"assignementString", "initiailizeRobot", "assignementDouble", "relOp", 
		"varType", "varInt", "varDouble", "varRobot", "varName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'if'", "'else'", "'while'", "'left'", "'right'", "'front'", 
		"'back'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'+'", "'-'", "'*'", 
		"'/'", "'>'", "'<'", "'=='", "'='", "';'", "'int'", "'robot'", "'string'", 
		"'double'", "'setSpeed'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOT", "IF", "ELSE", "WHILE", "LEFT", "RIGHT", "FRONT", "BACK", 
		"LCBRACKET", "RCBRACKET", "LNBRACKET", "RNBRACKET", "LSBRACKET", "RSBRACKET", 
		"OPPLUS", "OPMINUS", "OPMUL", "OPDIV", "OPGREATER", "OPSMALLER", "OPEQUAL", 
		"OPASSIGN", "SEMICOLON", "VARINT", "VARROBOT", "VARSTRING", "VARDOUBLE", 
		"SETSPEED", "INT", "VARNAME", "STRING", "DOUBLE", "WHITESPACE", "COMMENT"
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
	public String getGrammarFileName() { return "robotControl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public robotControlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public List<StmentContext> stment() {
			return getRuleContexts(StmentContext.class);
		}
		public StmentContext stment(int i) {
			return getRuleContext(StmentContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << VARINT) | (1L << VARROBOT) | (1L << VARSTRING) | (1L << VARDOUBLE) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(50);
				stment();
				}
				}
				setState(55);
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

	public static class IfStmentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(robotControlParser.IF, 0); }
		public TerminalNode LNBRACKET() { return getToken(robotControlParser.LNBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(robotControlParser.RNBRACKET, 0); }
		public List<TerminalNode> LCBRACKET() { return getTokens(robotControlParser.LCBRACKET); }
		public TerminalNode LCBRACKET(int i) {
			return getToken(robotControlParser.LCBRACKET, i);
		}
		public List<ScriptContext> script() {
			return getRuleContexts(ScriptContext.class);
		}
		public ScriptContext script(int i) {
			return getRuleContext(ScriptContext.class,i);
		}
		public List<TerminalNode> RCBRACKET() { return getTokens(robotControlParser.RCBRACKET); }
		public TerminalNode RCBRACKET(int i) {
			return getToken(robotControlParser.RCBRACKET, i);
		}
		public TerminalNode ELSE() { return getToken(robotControlParser.ELSE, 0); }
		public IfStmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterIfStment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitIfStment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitIfStment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmentContext ifStment() throws RecognitionException {
		IfStmentContext _localctx = new IfStmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ifStment);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(56);
				match(IF);
				setState(57);
				match(LNBRACKET);
				setState(58);
				expr();
				setState(59);
				match(RNBRACKET);
				setState(60);
				match(LCBRACKET);
				setState(61);
				script();
				setState(62);
				match(RCBRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(64);
				match(IF);
				setState(65);
				match(LNBRACKET);
				setState(66);
				expr();
				setState(67);
				match(RNBRACKET);
				setState(68);
				match(LCBRACKET);
				setState(69);
				script();
				setState(70);
				match(RCBRACKET);
				setState(71);
				match(ELSE);
				setState(72);
				match(LCBRACKET);
				setState(73);
				script();
				setState(74);
				match(RCBRACKET);
				}
				}
				break;
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

	public static class WhileStmentContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(robotControlParser.WHILE, 0); }
		public TerminalNode LNBRACKET() { return getToken(robotControlParser.LNBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(robotControlParser.RNBRACKET, 0); }
		public TerminalNode LCBRACKET() { return getToken(robotControlParser.LCBRACKET, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public TerminalNode RCBRACKET() { return getToken(robotControlParser.RCBRACKET, 0); }
		public WhileStmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterWhileStment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitWhileStment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitWhileStment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmentContext whileStment() throws RecognitionException {
		WhileStmentContext _localctx = new WhileStmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whileStment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(WHILE);
			setState(79);
			match(LNBRACKET);
			setState(80);
			expr();
			setState(81);
			match(RNBRACKET);
			setState(82);
			match(LCBRACKET);
			setState(83);
			script();
			setState(84);
			match(RCBRACKET);
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

	public static class StmentContext extends ParserRuleContext {
		public IfStmentContext ifStment() {
			return getRuleContext(IfStmentContext.class,0);
		}
		public WhileStmentContext whileStment() {
			return getRuleContext(WhileStmentContext.class,0);
		}
		public RobotStmentDoubleContext robotStmentDouble() {
			return getRuleContext(RobotStmentDoubleContext.class,0);
		}
		public RobotStmentIntContext robotStmentInt() {
			return getRuleContext(RobotStmentIntContext.class,0);
		}
		public AssignementContext assignement() {
			return getRuleContext(AssignementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public InitiailizeRobotContext initiailizeRobot() {
			return getRuleContext(InitiailizeRobotContext.class,0);
		}
		public StmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterStment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitStment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitStment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmentContext stment() throws RecognitionException {
		StmentContext _localctx = new StmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stment);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				ifStment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				whileStment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				robotStmentDouble();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				robotStmentInt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				assignement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				initiailizeRobot();
				}
				break;
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

	public static class RobotStmentDoubleContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(robotControlParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(robotControlParser.VARNAME, i);
		}
		public TerminalNode DOT() { return getToken(robotControlParser.DOT, 0); }
		public TerminalNode LNBRACKET() { return getToken(robotControlParser.LNBRACKET, 0); }
		public TerminalNode RNBRACKET() { return getToken(robotControlParser.RNBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(robotControlParser.SEMICOLON, 0); }
		public TerminalNode LEFT() { return getToken(robotControlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(robotControlParser.RIGHT, 0); }
		public TerminalNode FRONT() { return getToken(robotControlParser.FRONT, 0); }
		public TerminalNode BACK() { return getToken(robotControlParser.BACK, 0); }
		public MathExprDoubleContext mathExprDouble() {
			return getRuleContext(MathExprDoubleContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(robotControlParser.DOUBLE, 0); }
		public RobotStmentDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_robotStmentDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterRobotStmentDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitRobotStmentDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitRobotStmentDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RobotStmentDoubleContext robotStmentDouble() throws RecognitionException {
		RobotStmentDoubleContext _localctx = new RobotStmentDoubleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_robotStmentDouble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(VARNAME);
			setState(96);
			match(DOT);
			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FRONT) | (1L << BACK))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(98);
			match(LNBRACKET);
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(99);
				match(VARNAME);
				}
				break;
			case 2:
				{
				setState(100);
				mathExprDouble();
				}
				break;
			case 3:
				{
				setState(101);
				match(DOUBLE);
				}
				break;
			}
			setState(104);
			match(RNBRACKET);
			setState(105);
			match(SEMICOLON);
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

	public static class RobotStmentIntContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(robotControlParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(robotControlParser.VARNAME, i);
		}
		public TerminalNode DOT() { return getToken(robotControlParser.DOT, 0); }
		public TerminalNode SETSPEED() { return getToken(robotControlParser.SETSPEED, 0); }
		public TerminalNode LNBRACKET() { return getToken(robotControlParser.LNBRACKET, 0); }
		public TerminalNode RNBRACKET() { return getToken(robotControlParser.RNBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(robotControlParser.SEMICOLON, 0); }
		public MathExprIntContext mathExprInt() {
			return getRuleContext(MathExprIntContext.class,0);
		}
		public RobotStmentIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_robotStmentInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterRobotStmentInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitRobotStmentInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitRobotStmentInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RobotStmentIntContext robotStmentInt() throws RecognitionException {
		RobotStmentIntContext _localctx = new RobotStmentIntContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_robotStmentInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(VARNAME);
			setState(108);
			match(DOT);
			setState(109);
			match(SETSPEED);
			setState(110);
			match(LNBRACKET);
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(111);
				mathExprInt();
				}
				break;
			case 2:
				{
				setState(112);
				match(VARNAME);
				}
				break;
			}
			setState(115);
			match(RNBRACKET);
			setState(116);
			match(SEMICOLON);
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

	public static class MathExprContext extends ParserRuleContext {
		public MathExprDoubleContext mathExprDouble() {
			return getRuleContext(MathExprDoubleContext.class,0);
		}
		public MathExprIntContext mathExprInt() {
			return getRuleContext(MathExprIntContext.class,0);
		}
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitMathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mathExpr);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				mathExprDouble();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				mathExprInt();
				}
				break;
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

	public static class MathExprIntContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(robotControlParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(robotControlParser.VARNAME, i);
		}
		public List<TerminalNode> INT() { return getTokens(robotControlParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(robotControlParser.INT, i);
		}
		public List<TerminalNode> OPPLUS() { return getTokens(robotControlParser.OPPLUS); }
		public TerminalNode OPPLUS(int i) {
			return getToken(robotControlParser.OPPLUS, i);
		}
		public List<TerminalNode> OPMINUS() { return getTokens(robotControlParser.OPMINUS); }
		public TerminalNode OPMINUS(int i) {
			return getToken(robotControlParser.OPMINUS, i);
		}
		public List<TerminalNode> OPMUL() { return getTokens(robotControlParser.OPMUL); }
		public TerminalNode OPMUL(int i) {
			return getToken(robotControlParser.OPMUL, i);
		}
		public List<TerminalNode> OPDIV() { return getTokens(robotControlParser.OPDIV); }
		public TerminalNode OPDIV(int i) {
			return getToken(robotControlParser.OPDIV, i);
		}
		public MathExprIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExprInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterMathExprInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitMathExprInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitMathExprInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprIntContext mathExprInt() throws RecognitionException {
		MathExprIntContext _localctx = new MathExprIntContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mathExprInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VARNAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPLUS) | (1L << OPMINUS) | (1L << OPMUL) | (1L << OPDIV))) != 0)) {
				{
				{
				setState(123);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPLUS) | (1L << OPMINUS) | (1L << OPMUL) | (1L << OPDIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==VARNAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(129);
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

	public static class MathExprDoubleContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(robotControlParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(robotControlParser.VARNAME, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(robotControlParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(robotControlParser.DOUBLE, i);
		}
		public List<TerminalNode> OPPLUS() { return getTokens(robotControlParser.OPPLUS); }
		public TerminalNode OPPLUS(int i) {
			return getToken(robotControlParser.OPPLUS, i);
		}
		public List<TerminalNode> OPMINUS() { return getTokens(robotControlParser.OPMINUS); }
		public TerminalNode OPMINUS(int i) {
			return getToken(robotControlParser.OPMINUS, i);
		}
		public List<TerminalNode> OPMUL() { return getTokens(robotControlParser.OPMUL); }
		public TerminalNode OPMUL(int i) {
			return getToken(robotControlParser.OPMUL, i);
		}
		public List<TerminalNode> OPDIV() { return getTokens(robotControlParser.OPDIV); }
		public TerminalNode OPDIV(int i) {
			return getToken(robotControlParser.OPDIV, i);
		}
		public MathExprDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExprDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterMathExprDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitMathExprDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitMathExprDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprDoubleContext mathExprDouble() throws RecognitionException {
		MathExprDoubleContext _localctx = new MathExprDoubleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mathExprDouble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==VARNAME || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPLUS) | (1L << OPMINUS) | (1L << OPMUL) | (1L << OPDIV))) != 0)) {
				{
				{
				setState(131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPLUS) | (1L << OPMINUS) | (1L << OPMUL) | (1L << OPDIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==VARNAME || _la==DOUBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(137);
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

	public static class ExprContext extends ParserRuleContext {
		public List<MathExprIntContext> mathExprInt() {
			return getRuleContexts(MathExprIntContext.class);
		}
		public MathExprIntContext mathExprInt(int i) {
			return getRuleContext(MathExprIntContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			mathExprInt();
			setState(139);
			relOp();
			setState(140);
			mathExprInt();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationIntContext declarationInt() {
			return getRuleContext(DeclarationIntContext.class,0);
		}
		public DeclarationStringContext declarationString() {
			return getRuleContext(DeclarationStringContext.class,0);
		}
		public DeclarationDoubleContext declarationDouble() {
			return getRuleContext(DeclarationDoubleContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				declarationInt();
				}
				break;
			case VARSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				declarationString();
				}
				break;
			case VARDOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				declarationDouble();
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

	public static class DeclarationIntContext extends ParserRuleContext {
		public TerminalNode VARINT() { return getToken(robotControlParser.VARINT, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(robotControlParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(robotControlParser.VARNAME, i);
		}
		public TerminalNode OPASSIGN() { return getToken(robotControlParser.OPASSIGN, 0); }
		public MathExprIntContext mathExprInt() {
			return getRuleContext(MathExprIntContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(robotControlParser.SEMICOLON, 0); }
		public DeclarationIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterDeclarationInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitDeclarationInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitDeclarationInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationIntContext declarationInt() throws RecognitionException {
		DeclarationIntContext _localctx = new DeclarationIntContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarationInt);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(VARINT);
				setState(148);
				match(VARNAME);
				setState(149);
				match(OPASSIGN);
				setState(150);
				mathExprInt();
				setState(151);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(VARINT);
				setState(154);
				match(VARNAME);
				setState(155);
				match(OPASSIGN);
				setState(156);
				match(VARNAME);
				setState(157);
				match(SEMICOLON);
				}
				break;
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

	public static class DeclarationStringContext extends ParserRuleContext {
		public TerminalNode VARSTRING() { return getToken(robotControlParser.VARSTRING, 0); }
		public TerminalNode VARNAME() { return getToken(robotControlParser.VARNAME, 0); }
		public TerminalNode OPASSIGN() { return getToken(robotControlParser.OPASSIGN, 0); }
		public TerminalNode STRING() { return getToken(robotControlParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(robotControlParser.SEMICOLON, 0); }
		public DeclarationStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterDeclarationString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitDeclarationString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitDeclarationString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStringContext declarationString() throws RecognitionException {
		DeclarationStringContext _localctx = new DeclarationStringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declarationString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(VARSTRING);
			setState(161);
			match(VARNAME);
			setState(162);
			match(OPASSIGN);
			setState(163);
			match(STRING);
			setState(164);
			match(SEMICOLON);
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

	public static class DeclarationDoubleContext extends ParserRuleContext {
		public TerminalNode VARDOUBLE() { return getToken(robotControlParser.VARDOUBLE, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(robotControlParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(robotControlParser.VARNAME, i);
		}
		public TerminalNode OPASSIGN() { return getToken(robotControlParser.OPASSIGN, 0); }
		public MathExprDoubleContext mathExprDouble() {
			return getRuleContext(MathExprDoubleContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(robotControlParser.SEMICOLON, 0); }
		public DeclarationDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterDeclarationDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitDeclarationDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitDeclarationDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationDoubleContext declarationDouble() throws RecognitionException {
		DeclarationDoubleContext _localctx = new DeclarationDoubleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declarationDouble);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(VARDOUBLE);
				setState(167);
				match(VARNAME);
				setState(168);
				match(OPASSIGN);
				setState(169);
				mathExprDouble();
				setState(170);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(VARDOUBLE);
				setState(173);
				match(VARNAME);
				setState(174);
				match(OPASSIGN);
				setState(175);
				match(VARNAME);
				setState(176);
				match(SEMICOLON);
				}
				break;
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

	public static class AssignementContext extends ParserRuleContext {
		public AssignementDoubleContext assignementDouble() {
			return getRuleContext(AssignementDoubleContext.class,0);
		}
		public AssignementStringContext assignementString() {
			return getRuleContext(AssignementStringContext.class,0);
		}
		public AssignementIntContext assignementInt() {
			return getRuleContext(AssignementIntContext.class,0);
		}
		public AssignementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterAssignement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitAssignement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitAssignement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignementContext assignement() throws RecognitionException {
		AssignementContext _localctx = new AssignementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignement);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				assignementDouble();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				assignementString();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				assignementInt();
				}
				break;
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

	public static class AssignementIntContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(robotControlParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(robotControlParser.VARNAME, i);
		}
		public TerminalNode OPASSIGN() { return getToken(robotControlParser.OPASSIGN, 0); }
		public MathExprIntContext mathExprInt() {
			return getRuleContext(MathExprIntContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(robotControlParser.SEMICOLON, 0); }
		public AssignementIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignementInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterAssignementInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitAssignementInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitAssignementInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignementIntContext assignementInt() throws RecognitionException {
		AssignementIntContext _localctx = new AssignementIntContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignementInt);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(VARNAME);
				setState(185);
				match(OPASSIGN);
				setState(186);
				mathExprInt();
				setState(187);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(VARNAME);
				setState(190);
				match(OPASSIGN);
				setState(191);
				match(VARNAME);
				setState(192);
				match(SEMICOLON);
				}
				break;
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

	public static class AssignementStringContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(robotControlParser.VARNAME, 0); }
		public TerminalNode OPASSIGN() { return getToken(robotControlParser.OPASSIGN, 0); }
		public TerminalNode STRING() { return getToken(robotControlParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(robotControlParser.SEMICOLON, 0); }
		public AssignementStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignementString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterAssignementString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitAssignementString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitAssignementString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignementStringContext assignementString() throws RecognitionException {
		AssignementStringContext _localctx = new AssignementStringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignementString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(VARNAME);
			setState(196);
			match(OPASSIGN);
			setState(197);
			match(STRING);
			setState(198);
			match(SEMICOLON);
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

	public static class InitiailizeRobotContext extends ParserRuleContext {
		public TerminalNode VARROBOT() { return getToken(robotControlParser.VARROBOT, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(robotControlParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(robotControlParser.VARNAME, i);
		}
		public TerminalNode LNBRACKET() { return getToken(robotControlParser.LNBRACKET, 0); }
		public TerminalNode RNBRACKET() { return getToken(robotControlParser.RNBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(robotControlParser.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(robotControlParser.STRING, 0); }
		public InitiailizeRobotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initiailizeRobot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterInitiailizeRobot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitInitiailizeRobot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitInitiailizeRobot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitiailizeRobotContext initiailizeRobot() throws RecognitionException {
		InitiailizeRobotContext _localctx = new InitiailizeRobotContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_initiailizeRobot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(VARROBOT);
			setState(201);
			match(VARNAME);
			setState(202);
			match(LNBRACKET);
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==VARNAME || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(204);
			match(RNBRACKET);
			setState(205);
			match(SEMICOLON);
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

	public static class AssignementDoubleContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(robotControlParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(robotControlParser.VARNAME, i);
		}
		public TerminalNode OPASSIGN() { return getToken(robotControlParser.OPASSIGN, 0); }
		public MathExprDoubleContext mathExprDouble() {
			return getRuleContext(MathExprDoubleContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(robotControlParser.SEMICOLON, 0); }
		public AssignementDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignementDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterAssignementDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitAssignementDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitAssignementDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignementDoubleContext assignementDouble() throws RecognitionException {
		AssignementDoubleContext _localctx = new AssignementDoubleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignementDouble);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(VARNAME);
				setState(208);
				match(OPASSIGN);
				setState(209);
				mathExprDouble();
				setState(210);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(VARNAME);
				setState(213);
				match(OPASSIGN);
				setState(214);
				match(VARNAME);
				setState(215);
				match(SEMICOLON);
				}
				break;
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

	public static class RelOpContext extends ParserRuleContext {
		public TerminalNode OPGREATER() { return getToken(robotControlParser.OPGREATER, 0); }
		public TerminalNode OPSMALLER() { return getToken(robotControlParser.OPSMALLER, 0); }
		public TerminalNode OPEQUAL() { return getToken(robotControlParser.OPEQUAL, 0); }
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPGREATER) | (1L << OPSMALLER) | (1L << OPEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode VARSTRING() { return getToken(robotControlParser.VARSTRING, 0); }
		public TerminalNode VARINT() { return getToken(robotControlParser.VARINT, 0); }
		public TerminalNode VARDOUBLE() { return getToken(robotControlParser.VARDOUBLE, 0); }
		public TerminalNode VARROBOT() { return getToken(robotControlParser.VARROBOT, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARINT) | (1L << VARROBOT) | (1L << VARSTRING) | (1L << VARDOUBLE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class VarIntContext extends ParserRuleContext {
		public TerminalNode VARINT() { return getToken(robotControlParser.VARINT, 0); }
		public VarIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterVarInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitVarInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitVarInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIntContext varInt() throws RecognitionException {
		VarIntContext _localctx = new VarIntContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(VARINT);
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

	public static class VarDoubleContext extends ParserRuleContext {
		public TerminalNode VARDOUBLE() { return getToken(robotControlParser.VARDOUBLE, 0); }
		public VarDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterVarDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitVarDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitVarDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDoubleContext varDouble() throws RecognitionException {
		VarDoubleContext _localctx = new VarDoubleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(VARDOUBLE);
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

	public static class VarRobotContext extends ParserRuleContext {
		public TerminalNode VARROBOT() { return getToken(robotControlParser.VARROBOT, 0); }
		public VarRobotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varRobot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterVarRobot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitVarRobot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitVarRobot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarRobotContext varRobot() throws RecognitionException {
		VarRobotContext _localctx = new VarRobotContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varRobot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(VARROBOT);
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

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(robotControlParser.VARNAME, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener ) ((robotControlListener)listener).exitVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor ) return ((robotControlVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(VARNAME);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00e9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7t\n"+
		"\7\3\7\3\7\3\7\3\b\3\b\5\b{\n\b\3\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083"+
		"\13\t\3\n\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00a1\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b4\n\17\3\20\3\20\3\20\5\20\u00b9"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c4\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00db\n\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\2\t\3\2\7\n\3\2\37 \3\2\21\24\4\2  \"\""+
		"\3\2 !\3\2\25\27\3\2\32\35\2\u00e5\2\67\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2"+
		"\b_\3\2\2\2\na\3\2\2\2\fm\3\2\2\2\16z\3\2\2\2\20|\3\2\2\2\22\u0084\3\2"+
		"\2\2\24\u008c\3\2\2\2\26\u0093\3\2\2\2\30\u00a0\3\2\2\2\32\u00a2\3\2\2"+
		"\2\34\u00b3\3\2\2\2\36\u00b8\3\2\2\2 \u00c3\3\2\2\2\"\u00c5\3\2\2\2$\u00ca"+
		"\3\2\2\2&\u00da\3\2\2\2(\u00dc\3\2\2\2*\u00de\3\2\2\2,\u00e0\3\2\2\2."+
		"\u00e2\3\2\2\2\60\u00e4\3\2\2\2\62\u00e6\3\2\2\2\64\66\5\b\5\2\65\64\3"+
		"\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3\2\2\29\67\3\2\2\2:;"+
		"\7\4\2\2;<\7\r\2\2<=\5\24\13\2=>\7\16\2\2>?\7\13\2\2?@\5\2\2\2@A\7\f\2"+
		"\2AO\3\2\2\2BC\7\4\2\2CD\7\r\2\2DE\5\24\13\2EF\7\16\2\2FG\7\13\2\2GH\5"+
		"\2\2\2HI\7\f\2\2IJ\7\5\2\2JK\7\13\2\2KL\5\2\2\2LM\7\f\2\2MO\3\2\2\2N:"+
		"\3\2\2\2NB\3\2\2\2O\5\3\2\2\2PQ\7\6\2\2QR\7\r\2\2RS\5\24\13\2ST\7\16\2"+
		"\2TU\7\13\2\2UV\5\2\2\2VW\7\f\2\2W\7\3\2\2\2X`\5\4\3\2Y`\5\6\4\2Z`\5\n"+
		"\6\2[`\5\f\7\2\\`\5\36\20\2]`\5\26\f\2^`\5$\23\2_X\3\2\2\2_Y\3\2\2\2_"+
		"Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\t\3\2\2\2ab\7 \2\2"+
		"bc\7\3\2\2cd\t\2\2\2dh\7\r\2\2ei\7 \2\2fi\5\22\n\2gi\7\"\2\2he\3\2\2\2"+
		"hf\3\2\2\2hg\3\2\2\2ij\3\2\2\2jk\7\16\2\2kl\7\31\2\2l\13\3\2\2\2mn\7 "+
		"\2\2no\7\3\2\2op\7\36\2\2ps\7\r\2\2qt\5\20\t\2rt\7 \2\2sq\3\2\2\2sr\3"+
		"\2\2\2tu\3\2\2\2uv\7\16\2\2vw\7\31\2\2w\r\3\2\2\2x{\5\22\n\2y{\5\20\t"+
		"\2zx\3\2\2\2zy\3\2\2\2{\17\3\2\2\2|\u0081\t\3\2\2}~\t\4\2\2~\u0080\t\3"+
		"\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\21\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0089\t\5\2\2\u0085"+
		"\u0086\t\4\2\2\u0086\u0088\t\5\2\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\23\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008d\5\20\t\2\u008d\u008e\5(\25\2\u008e\u008f\5\20\t\2"+
		"\u008f\25\3\2\2\2\u0090\u0094\5\30\r\2\u0091\u0094\5\32\16\2\u0092\u0094"+
		"\5\34\17\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2"+
		"\u0094\27\3\2\2\2\u0095\u0096\7\32\2\2\u0096\u0097\7 \2\2\u0097\u0098"+
		"\7\30\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7\31\2\2\u009a\u00a1\3\2\2"+
		"\2\u009b\u009c\7\32\2\2\u009c\u009d\7 \2\2\u009d\u009e\7\30\2\2\u009e"+
		"\u009f\7 \2\2\u009f\u00a1\7\31\2\2\u00a0\u0095\3\2\2\2\u00a0\u009b\3\2"+
		"\2\2\u00a1\31\3\2\2\2\u00a2\u00a3\7\34\2\2\u00a3\u00a4\7 \2\2\u00a4\u00a5"+
		"\7\30\2\2\u00a5\u00a6\7!\2\2\u00a6\u00a7\7\31\2\2\u00a7\33\3\2\2\2\u00a8"+
		"\u00a9\7\35\2\2\u00a9\u00aa\7 \2\2\u00aa\u00ab\7\30\2\2\u00ab\u00ac\5"+
		"\22\n\2\u00ac\u00ad\7\31\2\2\u00ad\u00b4\3\2\2\2\u00ae\u00af\7\35\2\2"+
		"\u00af\u00b0\7 \2\2\u00b0\u00b1\7\30\2\2\u00b1\u00b2\7 \2\2\u00b2\u00b4"+
		"\7\31\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\35\3\2\2\2\u00b5"+
		"\u00b9\5&\24\2\u00b6\u00b9\5\"\22\2\u00b7\u00b9\5 \21\2\u00b8\u00b5\3"+
		"\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\37\3\2\2\2\u00ba"+
		"\u00bb\7 \2\2\u00bb\u00bc\7\30\2\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\7"+
		"\31\2\2\u00be\u00c4\3\2\2\2\u00bf\u00c0\7 \2\2\u00c0\u00c1\7\30\2\2\u00c1"+
		"\u00c2\7 \2\2\u00c2\u00c4\7\31\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bf\3\2"+
		"\2\2\u00c4!\3\2\2\2\u00c5\u00c6\7 \2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c8"+
		"\7!\2\2\u00c8\u00c9\7\31\2\2\u00c9#\3\2\2\2\u00ca\u00cb\7\33\2\2\u00cb"+
		"\u00cc\7 \2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\t\6\2\2\u00ce\u00cf\7\16"+
		"\2\2\u00cf\u00d0\7\31\2\2\u00d0%\3\2\2\2\u00d1\u00d2\7 \2\2\u00d2\u00d3"+
		"\7\30\2\2\u00d3\u00d4\5\22\n\2\u00d4\u00d5\7\31\2\2\u00d5\u00db\3\2\2"+
		"\2\u00d6\u00d7\7 \2\2\u00d7\u00d8\7\30\2\2\u00d8\u00d9\7 \2\2\u00d9\u00db"+
		"\7\31\2\2\u00da\u00d1\3\2\2\2\u00da\u00d6\3\2\2\2\u00db\'\3\2\2\2\u00dc"+
		"\u00dd\t\7\2\2\u00dd)\3\2\2\2\u00de\u00df\t\b\2\2\u00df+\3\2\2\2\u00e0"+
		"\u00e1\7\32\2\2\u00e1-\3\2\2\2\u00e2\u00e3\7\35\2\2\u00e3/\3\2\2\2\u00e4"+
		"\u00e5\7\33\2\2\u00e5\61\3\2\2\2\u00e6\u00e7\7 \2\2\u00e7\63\3\2\2\2\20"+
		"\67N_hsz\u0081\u0089\u0093\u00a0\u00b3\u00b8\u00c3\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}