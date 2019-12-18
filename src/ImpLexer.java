// Generated from /home/mattiazorzan/IdeaProjects/imp_language/src/Imp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NAT=2, BOOL=3, PLUS=4, MINUS=5, MUL=6, DIV=7, MOD=8, POW=9, AND=10, 
		OR=11, EQQ=12, NEQ=13, LEQ=14, GEQ=15, LT=16, GT=17, NOT=18, IF=19, THEN=20, 
		ELSE=21, WHILE=22, SKIPP=23, ASSIGN=24, OUT=25, FOR=26, DO=27, ELSEIF=28, 
		ND=29, LPAR=30, RPAR=31, LBRACE=32, RBRACE=33, SEMICOLON=34, ID=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NAT", "BOOL", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "AND", 
			"OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", "THEN", "ELSE", 
			"WHILE", "SKIPP", "ASSIGN", "OUT", "FOR", "DO", "ELSEIF", "ND", "LPAR", 
			"RPAR", "LBRACE", "RBRACE", "SEMICOLON", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, "'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", 
			"'&'", "'|'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", "'if'", 
			"'then'", "'else'", "'while'", "'skip'", "'='", "'out'", "'for'", "'do'", 
			"'elseif'", "'nd'", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NAT", "BOOL", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", 
			"AND", "OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", "THEN", 
			"ELSE", "WHILE", "SKIPP", "ASSIGN", "OUT", "FOR", "DO", "ELSEIF", "ND", 
			"LPAR", "RPAR", "LBRACE", "RBRACE", "SEMICOLON", "ID", "WS"
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


	public ImpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Imp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00cb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\7\3Q\n\3\f\3\16\3T\13"+
		"\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\6$\u00c1\n$\r$\16$\u00c2\3%\6%\u00c6\n%\r%\16%\u00c7\3%\3%\2\2&\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&\3\2\6\3\2\63;\3\2\62;\3\2c|\5\2\13\f\17\17\"\"\2\u00cf"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\3K\3\2\2\2\5U\3\2\2\2\7`\3\2\2\2\tb\3\2\2\2\13d\3\2\2\2"+
		"\rf\3\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27r\3\2\2"+
		"\2\31t\3\2\2\2\33w\3\2\2\2\35z\3\2\2\2\37}\3\2\2\2!\u0080\3\2\2\2#\u0082"+
		"\3\2\2\2%\u0084\3\2\2\2\'\u0086\3\2\2\2)\u0089\3\2\2\2+\u008e\3\2\2\2"+
		"-\u0093\3\2\2\2/\u0099\3\2\2\2\61\u009e\3\2\2\2\63\u00a0\3\2\2\2\65\u00a4"+
		"\3\2\2\2\67\u00a8\3\2\2\29\u00ab\3\2\2\2;\u00b2\3\2\2\2=\u00b5\3\2\2\2"+
		"?\u00b7\3\2\2\2A\u00b9\3\2\2\2C\u00bb\3\2\2\2E\u00bd\3\2\2\2G\u00c0\3"+
		"\2\2\2I\u00c5\3\2\2\2KL\7.\2\2L\4\3\2\2\2MV\7\62\2\2NR\t\2\2\2OQ\t\3\2"+
		"\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UM\3\2\2"+
		"\2UN\3\2\2\2V\6\3\2\2\2WX\7v\2\2XY\7t\2\2YZ\7w\2\2Za\7g\2\2[\\\7h\2\2"+
		"\\]\7c\2\2]^\7n\2\2^_\7u\2\2_a\7g\2\2`W\3\2\2\2`[\3\2\2\2a\b\3\2\2\2b"+
		"c\7-\2\2c\n\3\2\2\2de\7/\2\2e\f\3\2\2\2fg\7,\2\2g\16\3\2\2\2hi\7\61\2"+
		"\2i\20\3\2\2\2jk\7o\2\2kl\7q\2\2lm\7f\2\2m\22\3\2\2\2no\7`\2\2o\24\3\2"+
		"\2\2pq\7(\2\2q\26\3\2\2\2rs\7~\2\2s\30\3\2\2\2tu\7?\2\2uv\7?\2\2v\32\3"+
		"\2\2\2wx\7#\2\2xy\7?\2\2y\34\3\2\2\2z{\7>\2\2{|\7?\2\2|\36\3\2\2\2}~\7"+
		"@\2\2~\177\7?\2\2\177 \3\2\2\2\u0080\u0081\7>\2\2\u0081\"\3\2\2\2\u0082"+
		"\u0083\7@\2\2\u0083$\3\2\2\2\u0084\u0085\7#\2\2\u0085&\3\2\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7h\2\2\u0088(\3\2\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7j\2\2\u008b\u008c\7g\2\2\u008c\u008d\7p\2\2\u008d*\3\2\2\2\u008e\u008f"+
		"\7g\2\2\u008f\u0090\7n\2\2\u0090\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092"+
		",\3\2\2\2\u0093\u0094\7y\2\2\u0094\u0095\7j\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098.\3\2\2\2\u0099\u009a\7u\2\2\u009a"+
		"\u009b\7m\2\2\u009b\u009c\7k\2\2\u009c\u009d\7r\2\2\u009d\60\3\2\2\2\u009e"+
		"\u009f\7?\2\2\u009f\62\3\2\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7w\2\2\u00a2"+
		"\u00a3\7v\2\2\u00a3\64\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7q\2\2\u00a6"+
		"\u00a7\7t\2\2\u00a7\66\3\2\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7q\2\2\u00aa"+
		"8\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7h\2\2\u00b1:\3\2\2\2\u00b2"+
		"\u00b3\7p\2\2\u00b3\u00b4\7f\2\2\u00b4<\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6"+
		">\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8@\3\2\2\2\u00b9\u00ba\7}\2\2\u00baB"+
		"\3\2\2\2\u00bb\u00bc\7\177\2\2\u00bcD\3\2\2\2\u00bd\u00be\7=\2\2\u00be"+
		"F\3\2\2\2\u00bf\u00c1\t\4\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3H\3\2\2\2\u00c4\u00c6\t"+
		"\5\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b%\2\2\u00caJ\3\2\2\2\b"+
		"\2RU`\u00c2\u00c7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}