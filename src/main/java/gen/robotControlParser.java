package gen;// Generated from E:/Users/Maciej/Studia/TKOM/RobotControl5\robotControl.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

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
		RULE_mathExprInt = 7, RULE_mathExprDouble = 8, RULE_expr = 9, RULE_assignement = 10, 
		RULE_assignementInt = 11, RULE_assignementString = 12, RULE_initiailizeRobot = 13, 
		RULE_assignementDouble = 14, RULE_relOp = 15, RULE_varType = 16, RULE_varName = 17;
	public static final String[] ruleNames = {
		"script", "ifStment", "whileStment", "stment", "robotStmentDouble", "robotStmentInt", 
		"mathExpr", "mathExprInt", "mathExprDouble", "expr", "assignement", "assignementInt", 
		"assignementString", "initiailizeRobot", "assignementDouble", "relOp", 
		"varType", "varName"
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitScript(this);
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << VARINT) | (1L << VARROBOT) | (1L << VARSTRING) | (1L << VARDOUBLE) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(36);
				stment();
				}
				}
				setState(41);
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterIfStment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitIfStment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitIfStment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmentContext ifStment() throws RecognitionException {
		IfStmentContext _localctx = new IfStmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ifStment);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(42);
				match(IF);
				setState(43);
				match(LNBRACKET);
				setState(44);
				expr();
				setState(45);
				match(RNBRACKET);
				setState(46);
				match(LCBRACKET);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << VARINT) | (1L << VARROBOT) | (1L << VARSTRING) | (1L << VARDOUBLE) | (1L << VARNAME))) != 0)) {
					{
					{
					setState(47);
					stment();
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(RCBRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(55);
				match(IF);
				setState(56);
				match(LNBRACKET);
				setState(57);
				expr();
				setState(58);
				match(RNBRACKET);
				setState(59);
				match(LCBRACKET);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << VARINT) | (1L << VARROBOT) | (1L << VARSTRING) | (1L << VARDOUBLE) | (1L << VARNAME))) != 0)) {
					{
					{
					setState(60);
					stment();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(RCBRACKET);
				setState(67);
				match(ELSE);
				setState(68);
				match(LCBRACKET);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << VARINT) | (1L << VARROBOT) | (1L << VARSTRING) | (1L << VARDOUBLE) | (1L << VARNAME))) != 0)) {
					{
					{
					setState(69);
					stment();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterWhileStment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitWhileStment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitWhileStment(this);
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
			setState(79);
			match(WHILE);
			setState(80);
			match(LNBRACKET);
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(81);
				expr();
				}
				break;
			case 2:
				{
				setState(82);
				mathExpr();
				}
				break;
			}
			setState(85);
			match(RNBRACKET);
			setState(86);
			match(LCBRACKET);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << VARINT) | (1L << VARROBOT) | (1L << VARSTRING) | (1L << VARDOUBLE) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(87);
				stment();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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
		public InitiailizeRobotContext initiailizeRobot() {
			return getRuleContext(InitiailizeRobotContext.class,0);
		}
		public StmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterStment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitStment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitStment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmentContext stment() throws RecognitionException {
		StmentContext _localctx = new StmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stment);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				ifStment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				whileStment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				robotStmentDouble();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				robotStmentInt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				assignement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterRobotStmentDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitRobotStmentDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitRobotStmentDouble(this);
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
			setState(103);
			match(VARNAME);
			setState(104);
			match(DOT);
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << FRONT) | (1L << BACK))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			match(LNBRACKET);
			setState(107);
			match(DOUBLE);
			setState(108);
			match(RNBRACKET);
			setState(109);
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
		public TerminalNode VARNAME() { return getToken(robotControlParser.VARNAME, 0); }
		public TerminalNode DOT() { return getToken(robotControlParser.DOT, 0); }
		public TerminalNode SETSPEED() { return getToken(robotControlParser.SETSPEED, 0); }
		public TerminalNode LNBRACKET() { return getToken(robotControlParser.LNBRACKET, 0); }
		public TerminalNode RNBRACKET() { return getToken(robotControlParser.RNBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(robotControlParser.SEMICOLON, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public RobotStmentIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_robotStmentInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterRobotStmentInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitRobotStmentInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitRobotStmentInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RobotStmentIntContext robotStmentInt() throws RecognitionException {
		RobotStmentIntContext _localctx = new RobotStmentIntContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_robotStmentInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(VARNAME);
			setState(112);
			match(DOT);
			setState(113);
			match(SETSPEED);
			setState(114);
			match(LNBRACKET);
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(115);
				mathExpr();
				}
				break;
			case 2:
				{
				setState(116);
				varName();
				}
				break;
			}
			setState(119);
			match(RNBRACKET);
			setState(120);
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitMathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mathExpr);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				mathExprDouble();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterMathExprInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitMathExprInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitMathExprInt(this);
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
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VARNAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPLUS) | (1L << OPMINUS) | (1L << OPMUL) | (1L << OPDIV))) != 0)) {
				{
				{
				setState(127);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPLUS) | (1L << OPMINUS) | (1L << OPMUL) | (1L << OPDIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
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
				setState(133);
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterMathExprDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitMathExprDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitMathExprDouble(this);
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
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==VARNAME || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPLUS) | (1L << OPMINUS) | (1L << OPMUL) | (1L << OPDIV))) != 0)) {
				{
				{
				setState(135);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPPLUS) | (1L << OPMINUS) | (1L << OPMUL) | (1L << OPDIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(136);
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
				setState(141);
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			mathExpr();
			setState(143);
			relOp();
			setState(144);
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterAssignement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitAssignement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitAssignement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignementContext assignement() throws RecognitionException {
		AssignementContext _localctx = new AssignementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignement);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARDOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				assignementDouble();
				}
				break;
			case VARSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				assignementString();
				}
				break;
			case VARINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				assignementInt();
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

	public static class AssignementIntContext extends ParserRuleContext {
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
		public AssignementIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignementInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterAssignementInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitAssignementInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitAssignementInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignementIntContext assignementInt() throws RecognitionException {
		AssignementIntContext _localctx = new AssignementIntContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignementInt);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(VARINT);
				setState(152);
				match(VARNAME);
				setState(153);
				match(OPASSIGN);
				setState(154);
				mathExprInt();
				setState(155);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(VARINT);
				setState(158);
				match(VARNAME);
				setState(159);
				match(OPASSIGN);
				setState(160);
				match(VARNAME);
				setState(161);
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
		public TerminalNode VARSTRING() { return getToken(robotControlParser.VARSTRING, 0); }
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterAssignementString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitAssignementString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitAssignementString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignementStringContext assignementString() throws RecognitionException {
		AssignementStringContext _localctx = new AssignementStringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignementString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(VARSTRING);
			setState(165);
			match(VARNAME);
			setState(166);
			match(OPASSIGN);
			setState(167);
			match(STRING);
			setState(168);
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterInitiailizeRobot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitInitiailizeRobot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitInitiailizeRobot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitiailizeRobotContext initiailizeRobot() throws RecognitionException {
		InitiailizeRobotContext _localctx = new InitiailizeRobotContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initiailizeRobot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(VARROBOT);
			setState(171);
			match(VARNAME);
			setState(172);
			match(LNBRACKET);
			setState(173);
			match(STRING);
			setState(174);
			match(RNBRACKET);
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

	public static class AssignementDoubleContext extends ParserRuleContext {
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
		public AssignementDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignementDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterAssignementDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitAssignementDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitAssignementDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignementDoubleContext assignementDouble() throws RecognitionException {
		AssignementDoubleContext _localctx = new AssignementDoubleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignementDouble);
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(robotControlParser.VARNAME, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotControlListener) ((robotControlListener)listener).exitVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof robotControlVisitor) return ((robotControlVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3\16"+
		"\3C\13\3\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\5\3P\n\3\3\4"+
		"\3\4\3\4\3\4\5\4V\n\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5h\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7x\n\7\3\7\3\7\3\7\3\b\3\b\5\b\177\n\b\3\t\3\t\3\t"+
		"\7\t\u0084\n\t\f\t\16\t\u0087\13\t\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n"+
		"\u008f\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u0098\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00bf\n\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\b\3\2\7\n\3"+
		"\2\37 \3\2\21\24\4\2  \"\"\3\2\25\27\3\2\32\35\2\u00c8\2)\3\2\2\2\4O\3"+
		"\2\2\2\6Q\3\2\2\2\bg\3\2\2\2\ni\3\2\2\2\fq\3\2\2\2\16~\3\2\2\2\20\u0080"+
		"\3\2\2\2\22\u0088\3\2\2\2\24\u0090\3\2\2\2\26\u0097\3\2\2\2\30\u00a4\3"+
		"\2\2\2\32\u00a6\3\2\2\2\34\u00ac\3\2\2\2\36\u00be\3\2\2\2 \u00c0\3\2\2"+
		"\2\"\u00c2\3\2\2\2$\u00c4\3\2\2\2&(\5\b\5\2\'&\3\2\2\2(+\3\2\2\2)\'\3"+
		"\2\2\2)*\3\2\2\2*\3\3\2\2\2+)\3\2\2\2,-\7\4\2\2-.\7\r\2\2./\5\24\13\2"+
		"/\60\7\16\2\2\60\64\7\13\2\2\61\63\5\b\5\2\62\61\3\2\2\2\63\66\3\2\2\2"+
		"\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\f\2\28"+
		"P\3\2\2\29:\7\4\2\2:;\7\r\2\2;<\5\24\13\2<=\7\16\2\2=A\7\13\2\2>@\5\b"+
		"\5\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\f"+
		"\2\2EF\7\5\2\2FJ\7\13\2\2GI\5\b\5\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3"+
		"\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\f\2\2NP\3\2\2\2O,\3\2\2\2O9\3\2\2\2P\5"+
		"\3\2\2\2QR\7\6\2\2RU\7\r\2\2SV\5\24\13\2TV\5\16\b\2US\3\2\2\2UT\3\2\2"+
		"\2VW\3\2\2\2WX\7\16\2\2X\\\7\13\2\2Y[\5\b\5\2ZY\3\2\2\2[^\3\2\2\2\\Z\3"+
		"\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\f\2\2`\7\3\2\2\2ah\5\4\3\2"+
		"bh\5\6\4\2ch\5\n\6\2dh\5\f\7\2eh\5\26\f\2fh\5\34\17\2ga\3\2\2\2gb\3\2"+
		"\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\t\3\2\2\2ij\7 \2\2jk\7\3"+
		"\2\2kl\t\2\2\2lm\7\r\2\2mn\7\"\2\2no\7\16\2\2op\7\31\2\2p\13\3\2\2\2q"+
		"r\7 \2\2rs\7\3\2\2st\7\36\2\2tw\7\r\2\2ux\5\16\b\2vx\5$\23\2wu\3\2\2\2"+
		"wv\3\2\2\2xy\3\2\2\2yz\7\16\2\2z{\7\31\2\2{\r\3\2\2\2|\177\5\22\n\2}\177"+
		"\5\20\t\2~|\3\2\2\2~}\3\2\2\2\177\17\3\2\2\2\u0080\u0085\t\3\2\2\u0081"+
		"\u0082\t\4\2\2\u0082\u0084\t\3\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\21\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008d\t\5\2\2\u0089\u008a\t\4\2\2\u008a\u008c\t\5\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\23\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\5\16\b\2\u0091\u0092"+
		"\5 \21\2\u0092\u0093\5\16\b\2\u0093\25\3\2\2\2\u0094\u0098\5\36\20\2\u0095"+
		"\u0098\5\32\16\2\u0096\u0098\5\30\r\2\u0097\u0094\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0096\3\2\2\2\u0098\27\3\2\2\2\u0099\u009a\7\32\2\2\u009a"+
		"\u009b\7 \2\2\u009b\u009c\7\30\2\2\u009c\u009d\5\20\t\2\u009d\u009e\7"+
		"\31\2\2\u009e\u00a5\3\2\2\2\u009f\u00a0\7\32\2\2\u00a0\u00a1\7 \2\2\u00a1"+
		"\u00a2\7\30\2\2\u00a2\u00a3\7 \2\2\u00a3\u00a5\7\31\2\2\u00a4\u0099\3"+
		"\2\2\2\u00a4\u009f\3\2\2\2\u00a5\31\3\2\2\2\u00a6\u00a7\7\34\2\2\u00a7"+
		"\u00a8\7 \2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\7!\2\2\u00aa\u00ab\7\31"+
		"\2\2\u00ab\33\3\2\2\2\u00ac\u00ad\7\33\2\2\u00ad\u00ae\7 \2\2\u00ae\u00af"+
		"\7\r\2\2\u00af\u00b0\7!\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\7\31\2\2"+
		"\u00b2\35\3\2\2\2\u00b3\u00b4\7\35\2\2\u00b4\u00b5\7 \2\2\u00b5\u00b6"+
		"\7\30\2\2\u00b6\u00b7\5\22\n\2\u00b7\u00b8\7\31\2\2\u00b8\u00bf\3\2\2"+
		"\2\u00b9\u00ba\7\35\2\2\u00ba\u00bb\7 \2\2\u00bb\u00bc\7\30\2\2\u00bc"+
		"\u00bd\7 \2\2\u00bd\u00bf\7\31\2\2\u00be\u00b3\3\2\2\2\u00be\u00b9\3\2"+
		"\2\2\u00bf\37\3\2\2\2\u00c0\u00c1\t\6\2\2\u00c1!\3\2\2\2\u00c2\u00c3\t"+
		"\7\2\2\u00c3#\3\2\2\2\u00c4\u00c5\7 \2\2\u00c5%\3\2\2\2\21)\64AJOU\\g"+
		"w~\u0085\u008d\u0097\u00a4\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}