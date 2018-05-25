// Generated from E:/Users/Maciej/Studia/TKOM/RobotControl5\robotControl.g4 by ANTLR 4.7
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
		RULE_varType = 20;
	public static final String[] ruleNames = {
		"script", "ifStment", "whileStment", "stment", "robotStmentDouble", "robotStmentInt", 
		"mathExpr", "mathExprInt", "mathExprDouble", "expr", "declaration", "declarationInt", 
		"declarationString", "declarationDouble", "assignement", "assignementInt", 
		"assignementString", "initiailizeRobot", "assignementDouble", "relOp", 
		"varType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'if'", "'else'", "'while'", "'left'", "'right'", "'front'", 
		"'back'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'+'", "'-'", "'*'", 
		"'/'", "'>'", "'<'", "'=='", "'='", "';'", "'int'", "'robot'", "'string'", 
		"'double'", "'setSpeed'", null, null, null, null, "' '"
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << VARINT) | (1L << VARROBOT) | (1L << VARSTRING) | (1L << VARDOUBLE) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(42);
				stment();
				}
				}
				setState(47);
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
		public List<TerminalNode> RCBRACKET() { return getTokens(robotControlParser.RCBRACKET); }
		public TerminalNode RCBRACKET(int i) {
			return getToken(robotControlParser.RCBRACKET, i);
		}
		public List<StmentContext> stment() {
			return getRuleContexts(StmentContext.class);
		}
		public StmentContext stment(int i) {
			return getRuleContext(StmentContext.class,i);
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
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(48);
				match(IF);
				setState(49);
				match(LNBRACKET);
				setState(50);
				expr();
				setState(51);
				match(RNBRACKET);
				setState(52);
				match(LCBRACKET);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << VARINT) | (1L << VARROBOT) | (1L << VARSTRING) | (1L << VARDOUBLE) | (1L << VARNAME))) != 0)) {
					{
					{
					setState(53);
					stment();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(RCBRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(61);
				match(IF);
				setState(62);
				match(LNBRACKET);
				setState(63);
				expr();
				setState(64);
				match(RNBRACKET);
				setState(65);
				match(LCBRACKET);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << VARINT) | (1L << VARROBOT) | (1L << VARSTRING) | (1L << VARDOUBLE) | (1L << VARNAME))) != 0)) {
					{
					{
					setState(66);
					stment();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(RCBRACKET);
				setState(73);
				match(ELSE);
				setState(74);
				match(LCBRACKET);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << VARINT) | (1L << VARROBOT) | (1L << VARSTRING) | (1L << VARDOUBLE) | (1L << VARNAME))) != 0)) {
					{
					{
					setState(75);
					stment();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
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
		public TerminalNode RNBRACKET() { return getToken(robotControlParser.RNBRACKET, 0); }
		public TerminalNode LCBRACKET() { return getToken(robotControlParser.LCBRACKET, 0); }
		public TerminalNode RCBRACKET() { return getToken(robotControlParser.RCBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public List<StmentContext> stment() {
			return getRuleContexts(StmentContext.class);
		}
		public StmentContext stment(int i) {
			return getRuleContext(StmentContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(WHILE);
			setState(86);
			match(LNBRACKET);
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(87);
				expr();
				}
				break;
			case 2:
				{
				setState(88);
				mathExpr();
				}
				break;
			}
			setState(91);
			match(RNBRACKET);
			setState(92);
			match(LCBRACKET);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << VARINT) | (1L << VARROBOT) | (1L << VARSTRING) | (1L << VARDOUBLE) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(93);
				stment();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				ifStment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				whileStment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				robotStmentDouble();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				robotStmentInt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				assignement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
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
		public TerminalNode VARNAME() { return getToken(robotControlParser.VARNAME, 0); }
		public TerminalNode DOT() { return getToken(robotControlParser.DOT, 0); }
		public TerminalNode LNBRACKET() { return getToken(robotControlParser.LNBRACKET, 0); }
		public TerminalNode DOUBLE() { return getToken(robotControlParser.DOUBLE, 0); }
		public TerminalNode RNBRACKET() { return getToken(robotControlParser.RNBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(robotControlParser.SEMICOLON, 0); }
		public TerminalNode LEFT() { return getToken(robotControlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(robotControlParser.RIGHT, 0); }
		public TerminalNode FRONT() { return getToken(robotControlParser.FRONT, 0); }
		public TerminalNode BACK() { return getToken(robotControlParser.BACK, 0); }
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
			setState(110);
			match(VARNAME);
			setState(111);
			match(DOT);
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FRONT) | (1L << BACK))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(113);
			match(LNBRACKET);
			setState(114);
			match(DOUBLE);
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
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
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
			setState(118);
			match(VARNAME);
			setState(119);
			match(DOT);
			setState(120);
			match(SETSPEED);
			setState(121);
			match(LNBRACKET);
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(122);
				mathExpr();
				}
				break;
			case 2:
				{
				setState(123);
				match(VARNAME);
				}
				break;
			}
			setState(126);
			match(RNBRACKET);
			setState(127);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				mathExprDouble();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
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
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VARNAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPLUS) | (1L << OPMINUS) | (1L << OPMUL) | (1L << OPDIV))) != 0)) {
				{
				{
				setState(134);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPLUS) | (1L << OPMINUS) | (1L << OPMUL) | (1L << OPDIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
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
				setState(140);
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
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==VARNAME || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPLUS) | (1L << OPMINUS) | (1L << OPMUL) | (1L << OPDIV))) != 0)) {
				{
				{
				setState(142);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPLUS) | (1L << OPMINUS) | (1L << OPMUL) | (1L << OPDIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
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
				setState(148);
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
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
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
			setState(149);
			mathExpr();
			setState(150);
			relOp();
			setState(151);
			mathExpr();
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				declarationInt();
				}
				break;
			case VARSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				declarationString();
				}
				break;
			case VARDOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(VARINT);
				setState(159);
				match(VARNAME);
				setState(160);
				match(OPASSIGN);
				setState(161);
				mathExprInt();
				setState(162);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(VARINT);
				setState(165);
				match(VARNAME);
				setState(166);
				match(OPASSIGN);
				setState(167);
				match(VARNAME);
				setState(168);
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
			setState(171);
			match(VARSTRING);
			setState(172);
			match(VARNAME);
			setState(173);
			match(OPASSIGN);
			setState(174);
			match(STRING);
			setState(175);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(VARDOUBLE);
				setState(178);
				match(VARNAME);
				setState(179);
				match(OPASSIGN);
				setState(180);
				mathExprDouble();
				setState(181);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(VARDOUBLE);
				setState(184);
				match(VARNAME);
				setState(185);
				match(OPASSIGN);
				setState(186);
				match(VARNAME);
				setState(187);
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
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				assignementDouble();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				assignementString();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
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
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(VARNAME);
				setState(196);
				match(OPASSIGN);
				setState(197);
				mathExprInt();
				setState(198);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(VARNAME);
				setState(201);
				match(OPASSIGN);
				setState(202);
				match(VARNAME);
				setState(203);
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
			setState(206);
			match(VARNAME);
			setState(207);
			match(OPASSIGN);
			setState(208);
			match(STRING);
			setState(209);
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
		public TerminalNode VARNAME() { return getToken(robotControlParser.VARNAME, 0); }
		public TerminalNode LNBRACKET() { return getToken(robotControlParser.LNBRACKET, 0); }
		public TerminalNode STRING() { return getToken(robotControlParser.STRING, 0); }
		public TerminalNode RNBRACKET() { return getToken(robotControlParser.RNBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(robotControlParser.SEMICOLON, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(VARROBOT);
			setState(212);
			match(VARNAME);
			setState(213);
			match(LNBRACKET);
			setState(214);
			match(STRING);
			setState(215);
			match(RNBRACKET);
			setState(216);
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
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(VARNAME);
				setState(219);
				match(OPASSIGN);
				setState(220);
				mathExprDouble();
				setState(221);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(VARNAME);
				setState(224);
				match(OPASSIGN);
				setState(225);
				match(VARNAME);
				setState(226);
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
			setState(229);
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
			setState(231);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\3\3\3\7\3O\n\3\f\3\16\3R"+
		"\13\3\3\3\3\3\5\3V\n\3\3\4\3\4\3\4\3\4\5\4\\\n\4\3\4\3\4\3\4\7\4a\n\4"+
		"\f\4\16\4d\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\177\n\7\3\7\3\7\3\7"+
		"\3\b\3\b\5\b\u0086\n\b\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\3"+
		"\n\3\n\3\n\7\n\u0093\n\n\f\n\16\n\u0096\13\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\5\f\u009f\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ac"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00bf\n\17\3\20\3\20\3\20\5\20\u00c4\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cf\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00e6\n\24\3\25\3\25\3\26\3\26\3\26\2\2"+
		"\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\b\3\2\7\n\3\2\37 "+
		"\3\2\21\24\4\2  \"\"\3\2\25\27\3\2\32\35\2\u00ef\2/\3\2\2\2\4U\3\2\2\2"+
		"\6W\3\2\2\2\bn\3\2\2\2\np\3\2\2\2\fx\3\2\2\2\16\u0085\3\2\2\2\20\u0087"+
		"\3\2\2\2\22\u008f\3\2\2\2\24\u0097\3\2\2\2\26\u009e\3\2\2\2\30\u00ab\3"+
		"\2\2\2\32\u00ad\3\2\2\2\34\u00be\3\2\2\2\36\u00c3\3\2\2\2 \u00ce\3\2\2"+
		"\2\"\u00d0\3\2\2\2$\u00d5\3\2\2\2&\u00e5\3\2\2\2(\u00e7\3\2\2\2*\u00e9"+
		"\3\2\2\2,.\5\b\5\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3"+
		"\2\2\2\61/\3\2\2\2\62\63\7\4\2\2\63\64\7\r\2\2\64\65\5\24\13\2\65\66\7"+
		"\16\2\2\66:\7\13\2\2\679\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2"+
		"\2\2;=\3\2\2\2<:\3\2\2\2=>\7\f\2\2>V\3\2\2\2?@\7\4\2\2@A\7\r\2\2AB\5\24"+
		"\13\2BC\7\16\2\2CG\7\13\2\2DF\5\b\5\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH"+
		"\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\f\2\2KL\7\5\2\2LP\7\13\2\2MO\5\b\5\2"+
		"NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\f\2\2"+
		"TV\3\2\2\2U\62\3\2\2\2U?\3\2\2\2V\5\3\2\2\2WX\7\6\2\2X[\7\r\2\2Y\\\5\24"+
		"\13\2Z\\\5\16\b\2[Y\3\2\2\2[Z\3\2\2\2\\]\3\2\2\2]^\7\16\2\2^b\7\13\2\2"+
		"_a\5\b\5\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2"+
		"ef\7\f\2\2f\7\3\2\2\2go\5\4\3\2ho\5\6\4\2io\5\n\6\2jo\5\f\7\2ko\5\36\20"+
		"\2lo\5\26\f\2mo\5$\23\2ng\3\2\2\2nh\3\2\2\2ni\3\2\2\2nj\3\2\2\2nk\3\2"+
		"\2\2nl\3\2\2\2nm\3\2\2\2o\t\3\2\2\2pq\7 \2\2qr\7\3\2\2rs\t\2\2\2st\7\r"+
		"\2\2tu\7\"\2\2uv\7\16\2\2vw\7\31\2\2w\13\3\2\2\2xy\7 \2\2yz\7\3\2\2z{"+
		"\7\36\2\2{~\7\r\2\2|\177\5\16\b\2}\177\7 \2\2~|\3\2\2\2~}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\7\16\2\2\u0081\u0082\7\31\2\2\u0082\r\3\2\2"+
		"\2\u0083\u0086\5\22\n\2\u0084\u0086\5\20\t\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\17\3\2\2\2\u0087\u008c\t\3\2\2\u0088\u0089\t\4\2"+
		"\2\u0089\u008b\t\3\2\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\21\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0094\t\5\2\2\u0090\u0091\t\4\2\2\u0091\u0093\t\5\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\23\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\5\16\b\2\u0098\u0099\5(\25"+
		"\2\u0099\u009a\5\16\b\2\u009a\25\3\2\2\2\u009b\u009f\5\30\r\2\u009c\u009f"+
		"\5\32\16\2\u009d\u009f\5\34\17\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2"+
		"\2\u009e\u009d\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a1\7\32\2\2\u00a1\u00a2"+
		"\7 \2\2\u00a2\u00a3\7\30\2\2\u00a3\u00a4\5\20\t\2\u00a4\u00a5\7\31\2\2"+
		"\u00a5\u00ac\3\2\2\2\u00a6\u00a7\7\32\2\2\u00a7\u00a8\7 \2\2\u00a8\u00a9"+
		"\7\30\2\2\u00a9\u00aa\7 \2\2\u00aa\u00ac\7\31\2\2\u00ab\u00a0\3\2\2\2"+
		"\u00ab\u00a6\3\2\2\2\u00ac\31\3\2\2\2\u00ad\u00ae\7\34\2\2\u00ae\u00af"+
		"\7 \2\2\u00af\u00b0\7\30\2\2\u00b0\u00b1\7!\2\2\u00b1\u00b2\7\31\2\2\u00b2"+
		"\33\3\2\2\2\u00b3\u00b4\7\35\2\2\u00b4\u00b5\7 \2\2\u00b5\u00b6\7\30\2"+
		"\2\u00b6\u00b7\5\22\n\2\u00b7\u00b8\7\31\2\2\u00b8\u00bf\3\2\2\2\u00b9"+
		"\u00ba\7\35\2\2\u00ba\u00bb\7 \2\2\u00bb\u00bc\7\30\2\2\u00bc\u00bd\7"+
		" \2\2\u00bd\u00bf\7\31\2\2\u00be\u00b3\3\2\2\2\u00be\u00b9\3\2\2\2\u00bf"+
		"\35\3\2\2\2\u00c0\u00c4\5&\24\2\u00c1\u00c4\5\"\22\2\u00c2\u00c4\5 \21"+
		"\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\37"+
		"\3\2\2\2\u00c5\u00c6\7 \2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c8\5\20\t\2"+
		"\u00c8\u00c9\7\31\2\2\u00c9\u00cf\3\2\2\2\u00ca\u00cb\7 \2\2\u00cb\u00cc"+
		"\7\30\2\2\u00cc\u00cd\7 \2\2\u00cd\u00cf\7\31\2\2\u00ce\u00c5\3\2\2\2"+
		"\u00ce\u00ca\3\2\2\2\u00cf!\3\2\2\2\u00d0\u00d1\7 \2\2\u00d1\u00d2\7\30"+
		"\2\2\u00d2\u00d3\7!\2\2\u00d3\u00d4\7\31\2\2\u00d4#\3\2\2\2\u00d5\u00d6"+
		"\7\33\2\2\u00d6\u00d7\7 \2\2\u00d7\u00d8\7\r\2\2\u00d8\u00d9\7!\2\2\u00d9"+
		"\u00da\7\16\2\2\u00da\u00db\7\31\2\2\u00db%\3\2\2\2\u00dc\u00dd\7 \2\2"+
		"\u00dd\u00de\7\30\2\2\u00de\u00df\5\22\n\2\u00df\u00e0\7\31\2\2\u00e0"+
		"\u00e6\3\2\2\2\u00e1\u00e2\7 \2\2\u00e2\u00e3\7\30\2\2\u00e3\u00e4\7 "+
		"\2\2\u00e4\u00e6\7\31\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6"+
		"\'\3\2\2\2\u00e7\u00e8\t\6\2\2\u00e8)\3\2\2\2\u00e9\u00ea\t\7\2\2\u00ea"+
		"+\3\2\2\2\24/:GPU[bn~\u0085\u008c\u0094\u009e\u00ab\u00be\u00c3\u00ce"+
		"\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}