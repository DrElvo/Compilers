// Generated from H:/Uni Year 2 - part 1/234567/task1/src\Task_1_Interp.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task_1_InterpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, SEMICOLON=5, COMMA=6, Equals=7, 
		LessThan=8, MoreThan=9, LessThanEq=10, MoreThanEq=11, AND=12, OR=13, XOR=14, 
		Plus=15, Minus=16, Div=17, Mult=18, Assign=19, IF=20, THEN=21, ELSE=22, 
		WHILE=23, DO=24, REPEAT=25, UNTIL=26, PRINT=27, SKIPP=28, SPACE=29, NEWLINE=30, 
		TYPE=31, BOOL_PIECE=32, INT_PIECE=33, ID=34, WS=35;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_declar = 2, RULE_paramDecla = 3, 
		RULE_body = 4, RULE_localDecla = 5, RULE_block = 6, RULE_ene = 7, RULE_expr = 8, 
		RULE_args = 9, RULE_binop = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "declar", "paramDecla", "body", "localDecla", "block", 
			"ene", "expr", "args", "binop"
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
			"BOOL_PIECE", "INT_PIECE", "ID", "WS"
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
	public String getGrammarFileName() { return "Task_1_Interp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Task_1_InterpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Task_1_InterpParser.EOF, 0); }
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
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitProgram(this);
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
		public TerminalNode TYPE() { return getToken(Task_1_InterpParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitType(this);
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
		public TerminalNode ID() { return getToken(Task_1_InterpParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(Task_1_InterpParser.LPAREN, 0); }
		public ParamDeclaContext paramDecla() {
			return getRuleContext(ParamDeclaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Task_1_InterpParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public DeclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitDeclar(this);
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
		public List<TerminalNode> ID() { return getTokens(Task_1_InterpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Task_1_InterpParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Task_1_InterpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Task_1_InterpParser.COMMA, i);
		}
		public ParamDeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterParamDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitParamDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitParamDecla(this);
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
		public TerminalNode LBRACE() { return getToken(Task_1_InterpParser.LBRACE, 0); }
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Task_1_InterpParser.RBRACE, 0); }
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
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitBody(this);
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
		public TerminalNode ID() { return getToken(Task_1_InterpParser.ID, 0); }
		public TerminalNode Assign() { return getToken(Task_1_InterpParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Task_1_InterpParser.SEMICOLON, 0); }
		public LocalDeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterLocalDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitLocalDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitLocalDecla(this);
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
		public TerminalNode LBRACE() { return getToken(Task_1_InterpParser.LBRACE, 0); }
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Task_1_InterpParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitBlock(this);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(Task_1_InterpParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Task_1_InterpParser.SEMICOLON, i);
		}
		public EneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterEne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitEne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitEne(this);
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
		public TerminalNode SPACE() { return getToken(Task_1_InterpParser.SPACE, 0); }
		public SpaceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitSpace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(Task_1_InterpParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Task_1_InterpParser.RPAREN, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitParens(this);
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
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterMulti_Block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitMulti_Block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitMulti_Block(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewlineContext extends ExprContext {
		public TerminalNode NEWLINE() { return getToken(Task_1_InterpParser.NEWLINE, 0); }
		public NewlineContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT_PIECE() { return getToken(Task_1_InterpParser.INT_PIECE, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends ExprContext {
		public TerminalNode ID() { return getToken(Task_1_InterpParser.ID, 0); }
		public TerminalNode Assign() { return getToken(Task_1_InterpParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends ExprContext {
		public TerminalNode IF() { return getToken(Task_1_InterpParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Task_1_InterpParser.THEN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Task_1_InterpParser.ELSE, 0); }
		public IfStatementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends ExprContext {
		public TerminalNode PRINT() { return getToken(Task_1_InterpParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends ExprContext {
		public TerminalNode ID() { return getToken(Task_1_InterpParser.ID, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatLoopContext extends ExprContext {
		public TerminalNode REPEAT() { return getToken(Task_1_InterpParser.REPEAT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(Task_1_InterpParser.UNTIL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RepeatLoopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterRepeatLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitRepeatLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitRepeatLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends ExprContext {
		public TerminalNode SKIPP() { return getToken(Task_1_InterpParser.SKIPP, 0); }
		public SkipContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(Task_1_InterpParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(Task_1_InterpParser.LPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Task_1_InterpParser.RPAREN, 0); }
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends ExprContext {
		public TerminalNode BOOL_PIECE() { return getToken(Task_1_InterpParser.BOOL_PIECE, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(Task_1_InterpParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(Task_1_InterpParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(INT_PIECE);
				}
				break;
			case 3:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(BOOL_PIECE);
				}
				break;
			case 4:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(ID);
				setState(83);
				match(Assign);
				setState(84);
				expr();
				}
				break;
			case 5:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(LPAREN);
				setState(86);
				expr();
				setState(87);
				binop();
				setState(88);
				expr();
				setState(89);
				match(RPAREN);
				}
				break;
			case 6:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				match(ID);
				setState(92);
				match(LPAREN);
				setState(93);
				args();
				setState(94);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new Multi_BlockContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				block();
				}
				break;
			case 8:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				match(IF);
				setState(98);
				expr();
				setState(99);
				match(THEN);
				setState(100);
				block();
				setState(101);
				match(ELSE);
				setState(102);
				block();
				}
				break;
			case 9:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(104);
				match(WHILE);
				setState(105);
				expr();
				setState(106);
				match(DO);
				setState(107);
				block();
				}
				break;
			case 10:
				_localctx = new RepeatLoopContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(109);
				match(REPEAT);
				setState(110);
				block();
				setState(111);
				match(UNTIL);
				setState(112);
				expr();
				}
				break;
			case 11:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(114);
				match(PRINT);
				setState(115);
				expr();
				}
				break;
			case 12:
				_localctx = new SpaceContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(116);
				match(SPACE);
				}
				break;
			case 13:
				_localctx = new NewlineContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(117);
				match(NEWLINE);
				}
				break;
			case 14:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(118);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Task_1_InterpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Task_1_InterpParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << PRINT) | (1L << SKIPP) | (1L << SPACE) | (1L << NEWLINE) | (1L << BOOL_PIECE) | (1L << INT_PIECE) | (1L << ID))) != 0)) {
				{
				setState(121);
				expr();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(122);
					match(COMMA);
					setState(123);
					expr();
					}
					}
					setState(128);
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

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(Task_1_InterpParser.Equals, 0); }
		public TerminalNode LessThan() { return getToken(Task_1_InterpParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(Task_1_InterpParser.MoreThan, 0); }
		public TerminalNode LessThanEq() { return getToken(Task_1_InterpParser.LessThanEq, 0); }
		public TerminalNode MoreThanEq() { return getToken(Task_1_InterpParser.MoreThanEq, 0); }
		public TerminalNode AND() { return getToken(Task_1_InterpParser.AND, 0); }
		public TerminalNode OR() { return getToken(Task_1_InterpParser.OR, 0); }
		public TerminalNode XOR() { return getToken(Task_1_InterpParser.XOR, 0); }
		public TerminalNode Plus() { return getToken(Task_1_InterpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(Task_1_InterpParser.Minus, 0); }
		public TerminalNode Mult() { return getToken(Task_1_InterpParser.Mult, 0); }
		public TerminalNode Div() { return getToken(Task_1_InterpParser.Div, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task_1_InterpListener ) ((Task_1_InterpListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task_1_InterpVisitor ) return ((Task_1_InterpVisitor<? extends T>)visitor).visitBinop(this);
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
		"\u0007K\b\u0007\n\u0007\f\u0007N\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bx\b\b\u0001\t\u0001\t\u0001\t\u0005\t}\b\t\n\t\f\t\u0080\t\t"+
		"\u0003\t\u0082\b\t\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0001\u0001\u0000\u0007"+
		"\u0012\u008e\u0000\u0017\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000"+
		"\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000"+
		"\u0000\b3\u0001\u0000\u0000\u0000\n=\u0001\u0000\u0000\u0000\fC\u0001"+
		"\u0000\u0000\u0000\u000eG\u0001\u0000\u0000\u0000\u0010w\u0001\u0000\u0000"+
		"\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000"+
		"\u0000\u0016\u0018\u0003\u0004\u0002\u0000\u0017\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005\u001f\u0000\u0000\u001e\u0003\u0001\u0000\u0000"+
		"\u0000\u001f \u0003\u0002\u0001\u0000 !\u0005\"\u0000\u0000!\"\u0005\u0001"+
		"\u0000\u0000\"#\u0003\u0006\u0003\u0000#$\u0005\u0002\u0000\u0000$%\u0003"+
		"\b\u0004\u0000%\u0005\u0001\u0000\u0000\u0000&\'\u0003\u0002\u0001\u0000"+
		"\'.\u0005\"\u0000\u0000()\u0005\u0006\u0000\u0000)*\u0003\u0002\u0001"+
		"\u0000*+\u0005\"\u0000\u0000+-\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000"+
		"\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u00001&\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0007\u0001\u0000\u0000"+
		"\u000037\u0005\u0003\u0000\u000046\u0003\n\u0005\u000054\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0003"+
		"\u000e\u0007\u0000;<\u0005\u0004\u0000\u0000<\t\u0001\u0000\u0000\u0000"+
		"=>\u0003\u0002\u0001\u0000>?\u0005\"\u0000\u0000?@\u0005\u0013\u0000\u0000"+
		"@A\u0003\u0010\b\u0000AB\u0005\u0005\u0000\u0000B\u000b\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0003\u0000\u0000DE\u0003\u000e\u0007\u0000EF\u0005\u0004"+
		"\u0000\u0000F\r\u0001\u0000\u0000\u0000GL\u0003\u0010\b\u0000HI\u0005"+
		"\u0005\u0000\u0000IK\u0003\u0010\b\u0000JH\u0001\u0000\u0000\u0000KN\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"M\u000f\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000Ox\u0005\"\u0000"+
		"\u0000Px\u0005!\u0000\u0000Qx\u0005 \u0000\u0000RS\u0005\"\u0000\u0000"+
		"ST\u0005\u0013\u0000\u0000Tx\u0003\u0010\b\u0000UV\u0005\u0001\u0000\u0000"+
		"VW\u0003\u0010\b\u0000WX\u0003\u0014\n\u0000XY\u0003\u0010\b\u0000YZ\u0005"+
		"\u0002\u0000\u0000Zx\u0001\u0000\u0000\u0000[\\\u0005\"\u0000\u0000\\"+
		"]\u0005\u0001\u0000\u0000]^\u0003\u0012\t\u0000^_\u0005\u0002\u0000\u0000"+
		"_x\u0001\u0000\u0000\u0000`x\u0003\f\u0006\u0000ab\u0005\u0014\u0000\u0000"+
		"bc\u0003\u0010\b\u0000cd\u0005\u0015\u0000\u0000de\u0003\f\u0006\u0000"+
		"ef\u0005\u0016\u0000\u0000fg\u0003\f\u0006\u0000gx\u0001\u0000\u0000\u0000"+
		"hi\u0005\u0017\u0000\u0000ij\u0003\u0010\b\u0000jk\u0005\u0018\u0000\u0000"+
		"kl\u0003\f\u0006\u0000lx\u0001\u0000\u0000\u0000mn\u0005\u0019\u0000\u0000"+
		"no\u0003\f\u0006\u0000op\u0005\u001a\u0000\u0000pq\u0003\u0010\b\u0000"+
		"qx\u0001\u0000\u0000\u0000rs\u0005\u001b\u0000\u0000sx\u0003\u0010\b\u0000"+
		"tx\u0005\u001d\u0000\u0000ux\u0005\u001e\u0000\u0000vx\u0005\u001c\u0000"+
		"\u0000wO\u0001\u0000\u0000\u0000wP\u0001\u0000\u0000\u0000wQ\u0001\u0000"+
		"\u0000\u0000wR\u0001\u0000\u0000\u0000wU\u0001\u0000\u0000\u0000w[\u0001"+
		"\u0000\u0000\u0000w`\u0001\u0000\u0000\u0000wa\u0001\u0000\u0000\u0000"+
		"wh\u0001\u0000\u0000\u0000wm\u0001\u0000\u0000\u0000wr\u0001\u0000\u0000"+
		"\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000x\u0011\u0001\u0000\u0000\u0000y~\u0003\u0010\b\u0000z{\u0005"+
		"\u0006\u0000\u0000{}\u0003\u0010\b\u0000|z\u0001\u0000\u0000\u0000}\u0080"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081y\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0084\u0007\u0000\u0000\u0000"+
		"\u0084\u0015\u0001\u0000\u0000\u0000\b\u0019.17Lw~\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}