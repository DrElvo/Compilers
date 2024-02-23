// Generated from H:/Uni Year 2 - part 1/234567/task2/src\Task_2_Language.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task_2_LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, SEMICOLON=5, COMMA=6, Equals=7, 
		LessThan=8, MoreThan=9, LessThanEq=10, MoreThanEq=11, AND=12, OR=13, XOR=14, 
		Plus=15, Minus=16, Div=17, Mult=18, Assign=19, IF=20, THEN=21, ELSE=22, 
		WHILE=23, DO=24, REPEAT=25, UNTIL=26, PRINT=27, SKIPP=28, SPACE=29, NEWLINE=30, 
		TYPE=31, ID=32, WS=33, BOOL_D=34, INT_D=35;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_declar = 2, RULE_paramDecla = 3, 
		RULE_body = 4, RULE_localDecla = 5, RULE_block = 6, RULE_ene = 7, RULE_args = 8, 
		RULE_expr = 9, RULE_binop = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "declar", "paramDecla", "body", "localDecla", "block", 
			"ene", "args", "expr", "binop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'=='", "'<'", "'>'", 
			"'<='", "'>='", "'&'", "'|'", "'^'", "'+'", "'-'", "'/'", "'*'", "':='", 
			"'if'", "'then'", "'else'", "'while'", "'do'", "'repeat'", "'until'", 
			"'print'", "'skip'", "'space'", "'newline'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", "COMMA", "Equals", 
			"LessThan", "MoreThan", "LessThanEq", "MoreThanEq", "AND", "OR", "XOR", 
			"Plus", "Minus", "Div", "Mult", "Assign", "IF", "THEN", "ELSE", "WHILE", 
			"DO", "REPEAT", "UNTIL", "PRINT", "SKIPP", "SPACE", "NEWLINE", "TYPE", 
			"ID", "WS", "BOOL_D", "INT_D"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Task_2_Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Task_2_LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Task_2_LanguageParser.EOF, 0); }
		public List<DeclarContext> declar() {
			return getRuleContexts(DeclarContext.class);
		}
		public DeclarContext declar(int i) {
			return getRuleContext(DeclarContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				declar();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			setState(27);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(Task_2_LanguageParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(TYPE);
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

	public static class DeclarContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Task_2_LanguageParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(Task_2_LanguageParser.LPAREN, 0); }
		public ParamDeclaContext paramDecla() {
			return getRuleContext(ParamDeclaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Task_2_LanguageParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public DeclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarContext declar() throws RecognitionException {
		DeclarContext _localctx = new DeclarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			type();
			setState(32);
			match(ID);
			setState(33);
			match(LPAREN);
			setState(34);
			paramDecla();
			setState(35);
			match(RPAREN);
			setState(36);
			body();
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

	public static class ParamDeclaContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(Task_2_LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Task_2_LanguageParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Task_2_LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Task_2_LanguageParser.COMMA, i);
		}
		public ParamDeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterParamDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitParamDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitParamDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamDeclaContext paramDecla() throws RecognitionException {
		ParamDeclaContext _localctx = new ParamDeclaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramDecla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(38);
				type();
				setState(39);
				match(ID);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(40);
					match(COMMA);
					setState(41);
					type();
					setState(42);
					match(ID);
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Task_2_LanguageParser.LBRACE, 0); }
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Task_2_LanguageParser.RBRACE, 0); }
		public List<LocalDeclaContext> localDecla() {
			return getRuleContexts(LocalDeclaContext.class);
		}
		public LocalDeclaContext localDecla(int i) {
			return getRuleContext(LocalDeclaContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LBRACE);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(52);
				localDecla();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			ene();
			setState(59);
			match(RBRACE);
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

	public static class LocalDeclaContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Task_2_LanguageParser.ID, 0); }
		public TerminalNode Assign() { return getToken(Task_2_LanguageParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Task_2_LanguageParser.SEMICOLON, 0); }
		public LocalDeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterLocalDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitLocalDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitLocalDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclaContext localDecla() throws RecognitionException {
		LocalDeclaContext _localctx = new LocalDeclaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_localDecla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			type();
			setState(62);
			match(ID);
			setState(63);
			match(Assign);
			setState(64);
			expr();
			setState(65);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Task_2_LanguageParser.LBRACE, 0); }
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Task_2_LanguageParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LBRACE);
			setState(68);
			ene();
			setState(69);
			match(RBRACE);
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

	public static class EneContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Task_2_LanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Task_2_LanguageParser.SEMICOLON, i);
		}
		public EneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterEne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitEne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitEne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EneContext ene() throws RecognitionException {
		EneContext _localctx = new EneContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			expr();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(72);
				match(SEMICOLON);
				setState(73);
				expr();
				}
				}
				setState(78);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Task_2_LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Task_2_LanguageParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << PRINT) | (1L << SKIPP) | (1L << SPACE) | (1L << NEWLINE) | (1L << ID) | (1L << BOOL_D) | (1L << INT_D))) != 0)) {
				{
				setState(79);
				expr();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(80);
					match(COMMA);
					setState(81);
					expr();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SpaceContext extends ExprContext {
		public TerminalNode SPACE() { return getToken(Task_2_LanguageParser.SPACE, 0); }
		public SpaceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitSpace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(Task_2_LanguageParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Task_2_LanguageParser.RPAREN, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Multi_BlockContext extends ExprContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Multi_BlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterMulti_Block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitMulti_Block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitMulti_Block(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewlineContext extends ExprContext {
		public TerminalNode NEWLINE() { return getToken(Task_2_LanguageParser.NEWLINE, 0); }
		public NewlineContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT_D() { return getToken(Task_2_LanguageParser.INT_D, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends ExprContext {
		public TerminalNode ID() { return getToken(Task_2_LanguageParser.ID, 0); }
		public TerminalNode Assign() { return getToken(Task_2_LanguageParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends ExprContext {
		public TerminalNode IF() { return getToken(Task_2_LanguageParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Task_2_LanguageParser.THEN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Task_2_LanguageParser.ELSE, 0); }
		public IfStatementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends ExprContext {
		public TerminalNode PRINT() { return getToken(Task_2_LanguageParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends ExprContext {
		public TerminalNode ID() { return getToken(Task_2_LanguageParser.ID, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatLoopContext extends ExprContext {
		public TerminalNode REPEAT() { return getToken(Task_2_LanguageParser.REPEAT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(Task_2_LanguageParser.UNTIL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RepeatLoopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterRepeatLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitRepeatLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitRepeatLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends ExprContext {
		public TerminalNode SKIPP() { return getToken(Task_2_LanguageParser.SKIPP, 0); }
		public SkipContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(Task_2_LanguageParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(Task_2_LanguageParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Task_2_LanguageParser.RPAREN, 0); }
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(Task_2_LanguageParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(Task_2_LanguageParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends ExprContext {
		public TerminalNode BOOL_D() { return getToken(Task_2_LanguageParser.BOOL_D, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(ID);
				setState(91);
				match(Assign);
				setState(92);
				expr();
				}
				break;
			case 3:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(ID);
				setState(94);
				match(LPAREN);
				setState(95);
				args();
				setState(96);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(LPAREN);
				setState(99);
				expr();
				setState(100);
				binop();
				setState(101);
				expr();
				setState(102);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new Multi_BlockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				block();
				}
				break;
			case 6:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				match(IF);
				setState(106);
				expr();
				setState(107);
				match(THEN);
				setState(108);
				block();
				setState(109);
				match(ELSE);
				setState(110);
				block();
				}
				break;
			case 7:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				match(WHILE);
				setState(113);
				expr();
				setState(114);
				match(DO);
				setState(115);
				block();
				}
				break;
			case 8:
				_localctx = new RepeatLoopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				match(REPEAT);
				setState(118);
				block();
				setState(119);
				match(UNTIL);
				setState(120);
				expr();
				}
				break;
			case 9:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				match(PRINT);
				setState(123);
				expr();
				}
				break;
			case 10:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(124);
				match(INT_D);
				}
				break;
			case 11:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(125);
				match(BOOL_D);
				}
				break;
			case 12:
				_localctx = new SpaceContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(126);
				match(SPACE);
				}
				break;
			case 13:
				_localctx = new NewlineContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(127);
				match(NEWLINE);
				}
				break;
			case 14:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(128);
				match(SKIPP);
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

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(Task_2_LanguageParser.Equals, 0); }
		public TerminalNode LessThan() { return getToken(Task_2_LanguageParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(Task_2_LanguageParser.MoreThan, 0); }
		public TerminalNode LessThanEq() { return getToken(Task_2_LanguageParser.LessThanEq, 0); }
		public TerminalNode MoreThanEq() { return getToken(Task_2_LanguageParser.MoreThanEq, 0); }
		public TerminalNode AND() { return getToken(Task_2_LanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(Task_2_LanguageParser.OR, 0); }
		public TerminalNode XOR() { return getToken(Task_2_LanguageParser.XOR, 0); }
		public TerminalNode Plus() { return getToken(Task_2_LanguageParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(Task_2_LanguageParser.Minus, 0); }
		public TerminalNode Mult() { return getToken(Task_2_LanguageParser.Mult, 0); }
		public TerminalNode Div() { return getToken(Task_2_LanguageParser.Div, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_2_LanguageListener ) ((Task_2_LanguageListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_2_LanguageVisitor ) return ((Task_2_LanguageVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEq) | (1L << MoreThanEq) | (1L << AND) | (1L << OR) | (1L << XOR) | (1L << Plus) | (1L << Minus) | (1L << Div) | (1L << Mult))) != 0)) ) {
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
		"\u0004\u0001#\u0086\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003-\b\u0003\n\u0003\f\u00030\t\u0003"+
		"\u0003\u00032\b\u0003\u0001\u0004\u0001\u0004\u0005\u00046\b\u0004\n\u0004"+
		"\f\u00049\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007K\b\u0007\n\u0007\f\u0007N\t\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\bS\b\b\n\b\f\bV\t\b\u0003\bX\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0082\b\t\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0001\u0001\u0000\u0007\u0012"+
		"\u008e\u0000\u0017\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000"+
		"\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000"+
		"\b3\u0001\u0000\u0000\u0000\n=\u0001\u0000\u0000\u0000\fC\u0001\u0000"+
		"\u0000\u0000\u000eG\u0001\u0000\u0000\u0000\u0010W\u0001\u0000\u0000\u0000"+
		"\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000"+
		"\u0016\u0018\u0003\u0004\u0002\u0000\u0017\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005\u001f\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000"+
		"\u001f \u0003\u0002\u0001\u0000 !\u0005 \u0000\u0000!\"\u0005\u0001\u0000"+
		"\u0000\"#\u0003\u0006\u0003\u0000#$\u0005\u0002\u0000\u0000$%\u0003\b"+
		"\u0004\u0000%\u0005\u0001\u0000\u0000\u0000&\'\u0003\u0002\u0001\u0000"+
		"\'.\u0005 \u0000\u0000()\u0005\u0006\u0000\u0000)*\u0003\u0002\u0001\u0000"+
		"*+\u0005 \u0000\u0000+-\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000"+
		"-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u00001&\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u00002\u0007\u0001\u0000\u0000\u0000"+
		"37\u0005\u0003\u0000\u000046\u0003\n\u0005\u000054\u0001\u0000\u0000\u0000"+
		"69\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0003\u000e"+
		"\u0007\u0000;<\u0005\u0004\u0000\u0000<\t\u0001\u0000\u0000\u0000=>\u0003"+
		"\u0002\u0001\u0000>?\u0005 \u0000\u0000?@\u0005\u0013\u0000\u0000@A\u0003"+
		"\u0012\t\u0000AB\u0005\u0005\u0000\u0000B\u000b\u0001\u0000\u0000\u0000"+
		"CD\u0005\u0003\u0000\u0000DE\u0003\u000e\u0007\u0000EF\u0005\u0004\u0000"+
		"\u0000F\r\u0001\u0000\u0000\u0000GL\u0003\u0012\t\u0000HI\u0005\u0005"+
		"\u0000\u0000IK\u0003\u0012\t\u0000JH\u0001\u0000\u0000\u0000KN\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u000f"+
		"\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OT\u0003\u0012\t\u0000"+
		"PQ\u0005\u0006\u0000\u0000QS\u0003\u0012\t\u0000RP\u0001\u0000\u0000\u0000"+
		"SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WO\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0011\u0001\u0000\u0000\u0000"+
		"Y\u0082\u0005 \u0000\u0000Z[\u0005 \u0000\u0000[\\\u0005\u0013\u0000\u0000"+
		"\\\u0082\u0003\u0012\t\u0000]^\u0005 \u0000\u0000^_\u0005\u0001\u0000"+
		"\u0000_`\u0003\u0010\b\u0000`a\u0005\u0002\u0000\u0000a\u0082\u0001\u0000"+
		"\u0000\u0000bc\u0005\u0001\u0000\u0000cd\u0003\u0012\t\u0000de\u0003\u0014"+
		"\n\u0000ef\u0003\u0012\t\u0000fg\u0005\u0002\u0000\u0000g\u0082\u0001"+
		"\u0000\u0000\u0000h\u0082\u0003\f\u0006\u0000ij\u0005\u0014\u0000\u0000"+
		"jk\u0003\u0012\t\u0000kl\u0005\u0015\u0000\u0000lm\u0003\f\u0006\u0000"+
		"mn\u0005\u0016\u0000\u0000no\u0003\f\u0006\u0000o\u0082\u0001\u0000\u0000"+
		"\u0000pq\u0005\u0017\u0000\u0000qr\u0003\u0012\t\u0000rs\u0005\u0018\u0000"+
		"\u0000st\u0003\f\u0006\u0000t\u0082\u0001\u0000\u0000\u0000uv\u0005\u0019"+
		"\u0000\u0000vw\u0003\f\u0006\u0000wx\u0005\u001a\u0000\u0000xy\u0003\u0012"+
		"\t\u0000y\u0082\u0001\u0000\u0000\u0000z{\u0005\u001b\u0000\u0000{\u0082"+
		"\u0003\u0012\t\u0000|\u0082\u0005#\u0000\u0000}\u0082\u0005\"\u0000\u0000"+
		"~\u0082\u0005\u001d\u0000\u0000\u007f\u0082\u0005\u001e\u0000\u0000\u0080"+
		"\u0082\u0005\u001c\u0000\u0000\u0081Y\u0001\u0000\u0000\u0000\u0081Z\u0001"+
		"\u0000\u0000\u0000\u0081]\u0001\u0000\u0000\u0000\u0081b\u0001\u0000\u0000"+
		"\u0000\u0081h\u0001\u0000\u0000\u0000\u0081i\u0001\u0000\u0000\u0000\u0081"+
		"p\u0001\u0000\u0000\u0000\u0081u\u0001\u0000\u0000\u0000\u0081z\u0001"+
		"\u0000\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000"+
		"\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0013\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0007\u0000\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000"+
		"\b\u0019.17LTW\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}