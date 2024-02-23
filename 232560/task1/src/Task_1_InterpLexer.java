// Generated from H:/Uni Year 2 - part 1/234567/task1/src\Task_1_Interp.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task_1_InterpLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", "COMMA", "Equals", 
			"LessThan", "MoreThan", "LessThanEq", "MoreThanEq", "AND", "OR", "XOR", 
			"Plus", "Minus", "Div", "Mult", "Assign", "IF", "THEN", "ELSE", "WHILE", 
			"DO", "REPEAT", "UNTIL", "PRINT", "SKIPP", "SPACE", "NEWLINE", "TYPE", 
			"BOOL_PIECE", "INT_PIECE", "ID", "WS"
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


	public Task_1_InterpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Task_1_Interp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000#\u00dd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u00b9\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u00c4\b\u001f\u0001 \u0001 \u0001 \u0005"+
		" \u00c9\b \n \f \u00cc\t \u0003 \u00ce\b \u0001!\u0001!\u0005!\u00d2\b"+
		"!\n!\f!\u00d5\t!\u0001\"\u0004\"\u00d8\b\"\u000b\"\f\"\u00d9\u0001\"\u0001"+
		"\"\u0000\u0000#\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#\u0001\u0000\u0006\u0001\u000000\u0001\u000019\u0001\u000009"+
		"\u0002\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u00e3\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0001G\u0001\u0000\u0000\u0000\u0003I\u0001\u0000\u0000\u0000\u0005K"+
		"\u0001\u0000\u0000\u0000\u0007M\u0001\u0000\u0000\u0000\tO\u0001\u0000"+
		"\u0000\u0000\u000bQ\u0001\u0000\u0000\u0000\rS\u0001\u0000\u0000\u0000"+
		"\u000fV\u0001\u0000\u0000\u0000\u0011X\u0001\u0000\u0000\u0000\u0013Z"+
		"\u0001\u0000\u0000\u0000\u0015]\u0001\u0000\u0000\u0000\u0017`\u0001\u0000"+
		"\u0000\u0000\u0019b\u0001\u0000\u0000\u0000\u001bd\u0001\u0000\u0000\u0000"+
		"\u001df\u0001\u0000\u0000\u0000\u001fh\u0001\u0000\u0000\u0000!j\u0001"+
		"\u0000\u0000\u0000#l\u0001\u0000\u0000\u0000%n\u0001\u0000\u0000\u0000"+
		"\'q\u0001\u0000\u0000\u0000)t\u0001\u0000\u0000\u0000+y\u0001\u0000\u0000"+
		"\u0000-~\u0001\u0000\u0000\u0000/\u0084\u0001\u0000\u0000\u00001\u0087"+
		"\u0001\u0000\u0000\u00003\u008e\u0001\u0000\u0000\u00005\u0094\u0001\u0000"+
		"\u0000\u00007\u009a\u0001\u0000\u0000\u00009\u009f\u0001\u0000\u0000\u0000"+
		";\u00a5\u0001\u0000\u0000\u0000=\u00b8\u0001\u0000\u0000\u0000?\u00c3"+
		"\u0001\u0000\u0000\u0000A\u00cd\u0001\u0000\u0000\u0000C\u00cf\u0001\u0000"+
		"\u0000\u0000E\u00d7\u0001\u0000\u0000\u0000GH\u0005(\u0000\u0000H\u0002"+
		"\u0001\u0000\u0000\u0000IJ\u0005)\u0000\u0000J\u0004\u0001\u0000\u0000"+
		"\u0000KL\u0005{\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005}\u0000"+
		"\u0000N\b\u0001\u0000\u0000\u0000OP\u0005;\u0000\u0000P\n\u0001\u0000"+
		"\u0000\u0000QR\u0005,\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005="+
		"\u0000\u0000TU\u0005=\u0000\u0000U\u000e\u0001\u0000\u0000\u0000VW\u0005"+
		"<\u0000\u0000W\u0010\u0001\u0000\u0000\u0000XY\u0005>\u0000\u0000Y\u0012"+
		"\u0001\u0000\u0000\u0000Z[\u0005<\u0000\u0000[\\\u0005=\u0000\u0000\\"+
		"\u0014\u0001\u0000\u0000\u0000]^\u0005>\u0000\u0000^_\u0005=\u0000\u0000"+
		"_\u0016\u0001\u0000\u0000\u0000`a\u0005&\u0000\u0000a\u0018\u0001\u0000"+
		"\u0000\u0000bc\u0005|\u0000\u0000c\u001a\u0001\u0000\u0000\u0000de\u0005"+
		"^\u0000\u0000e\u001c\u0001\u0000\u0000\u0000fg\u0005+\u0000\u0000g\u001e"+
		"\u0001\u0000\u0000\u0000hi\u0005-\u0000\u0000i \u0001\u0000\u0000\u0000"+
		"jk\u0005/\u0000\u0000k\"\u0001\u0000\u0000\u0000lm\u0005*\u0000\u0000"+
		"m$\u0001\u0000\u0000\u0000no\u0005:\u0000\u0000op\u0005=\u0000\u0000p"+
		"&\u0001\u0000\u0000\u0000qr\u0005i\u0000\u0000rs\u0005f\u0000\u0000s("+
		"\u0001\u0000\u0000\u0000tu\u0005t\u0000\u0000uv\u0005h\u0000\u0000vw\u0005"+
		"e\u0000\u0000wx\u0005n\u0000\u0000x*\u0001\u0000\u0000\u0000yz\u0005e"+
		"\u0000\u0000z{\u0005l\u0000\u0000{|\u0005s\u0000\u0000|}\u0005e\u0000"+
		"\u0000},\u0001\u0000\u0000\u0000~\u007f\u0005w\u0000\u0000\u007f\u0080"+
		"\u0005h\u0000\u0000\u0080\u0081\u0005i\u0000\u0000\u0081\u0082\u0005l"+
		"\u0000\u0000\u0082\u0083\u0005e\u0000\u0000\u0083.\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005d\u0000\u0000\u0085\u0086\u0005o\u0000\u0000\u00860"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005r\u0000\u0000\u0088\u0089\u0005"+
		"e\u0000\u0000\u0089\u008a\u0005p\u0000\u0000\u008a\u008b\u0005e\u0000"+
		"\u0000\u008b\u008c\u0005a\u0000\u0000\u008c\u008d\u0005t\u0000\u0000\u008d"+
		"2\u0001\u0000\u0000\u0000\u008e\u008f\u0005u\u0000\u0000\u008f\u0090\u0005"+
		"n\u0000\u0000\u0090\u0091\u0005t\u0000\u0000\u0091\u0092\u0005i\u0000"+
		"\u0000\u0092\u0093\u0005l\u0000\u0000\u00934\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005p\u0000\u0000\u0095\u0096\u0005r\u0000\u0000\u0096\u0097\u0005"+
		"i\u0000\u0000\u0097\u0098\u0005n\u0000\u0000\u0098\u0099\u0005t\u0000"+
		"\u0000\u00996\u0001\u0000\u0000\u0000\u009a\u009b\u0005s\u0000\u0000\u009b"+
		"\u009c\u0005k\u0000\u0000\u009c\u009d\u0005i\u0000\u0000\u009d\u009e\u0005"+
		"p\u0000\u0000\u009e8\u0001\u0000\u0000\u0000\u009f\u00a0\u0005s\u0000"+
		"\u0000\u00a0\u00a1\u0005p\u0000\u0000\u00a1\u00a2\u0005a\u0000\u0000\u00a2"+
		"\u00a3\u0005c\u0000\u0000\u00a3\u00a4\u0005e\u0000\u0000\u00a4:\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005n\u0000\u0000\u00a6\u00a7\u0005e\u0000"+
		"\u0000\u00a7\u00a8\u0005w\u0000\u0000\u00a8\u00a9\u0005l\u0000\u0000\u00a9"+
		"\u00aa\u0005i\u0000\u0000\u00aa\u00ab\u0005n\u0000\u0000\u00ab\u00ac\u0005"+
		"e\u0000\u0000\u00ac<\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005i\u0000"+
		"\u0000\u00ae\u00af\u0005n\u0000\u0000\u00af\u00b9\u0005t\u0000\u0000\u00b0"+
		"\u00b1\u0005b\u0000\u0000\u00b1\u00b2\u0005o\u0000\u0000\u00b2\u00b3\u0005"+
		"o\u0000\u0000\u00b3\u00b9\u0005l\u0000\u0000\u00b4\u00b5\u0005u\u0000"+
		"\u0000\u00b5\u00b6\u0005n\u0000\u0000\u00b6\u00b7\u0005i\u0000\u0000\u00b7"+
		"\u00b9\u0005t\u0000\u0000\u00b8\u00ad\u0001\u0000\u0000\u0000\u00b8\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b9>\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005t\u0000\u0000\u00bb\u00bc\u0005r\u0000"+
		"\u0000\u00bc\u00bd\u0005u\u0000\u0000\u00bd\u00c4\u0005e\u0000\u0000\u00be"+
		"\u00bf\u0005f\u0000\u0000\u00bf\u00c0\u0005a\u0000\u0000\u00c0\u00c1\u0005"+
		"l\u0000\u0000\u00c1\u00c2\u0005s\u0000\u0000\u00c2\u00c4\u0005e\u0000"+
		"\u0000\u00c3\u00ba\u0001\u0000\u0000\u0000\u00c3\u00be\u0001\u0000\u0000"+
		"\u0000\u00c4@\u0001\u0000\u0000\u0000\u00c5\u00ce\u0007\u0000\u0000\u0000"+
		"\u00c6\u00ca\u0007\u0001\u0000\u0000\u00c7\u00c9\u0007\u0002\u0000\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c5\u0001\u0000\u0000\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000"+
		"\u00ceB\u0001\u0000\u0000\u0000\u00cf\u00d3\u0007\u0003\u0000\u0000\u00d0"+
		"\u00d2\u0007\u0004\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d4D\u0001\u0000\u0000\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d8\u0007\u0005\u0000\u0000\u00d7\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0006\"\u0000\u0000\u00dcF\u0001"+
		"\u0000\u0000\u0000\u0007\u0000\u00b8\u00c3\u00ca\u00cd\u00d3\u00d9\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}