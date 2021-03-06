// Generated from langnt/Langnt.g4 by ANTLR 4.5

   package langnt;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangntLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Open=1, Close=2, Var=3, Return=4, If=5, Else=6, ElseIf=7, Print=8, PrintLine=9, 
		EachLoop=10, Loop=11, Func=12, Input=13, Assert=14, Size=15, In=16, Empty=17, 
		Or=18, And=19, Equals=20, NEquals=21, GTEquals=22, LTEquals=23, Pow=24, 
		Excl=25, GT=26, LT=27, Add=28, Subtract=29, Multiply=30, Divide=31, Modulus=32, 
		OBracket=33, CBracket=34, OParen=35, CParen=36, SColon=37, Assign=38, 
		Comma=39, QMark=40, Colon=41, Bool=42, Number=43, Identifier=44, String=45, 
		Comment=46, Space=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Open", "Close", "Var", "Return", "If", "Else", "ElseIf", "Print", "PrintLine", 
		"EachLoop", "Loop", "Func", "Input", "Assert", "Size", "In", "Empty", 
		"Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", 
		"GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBracket", 
		"CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", "QMark", 
		"Colon", "Bool", "Number", "Identifier", "String", "Comment", "Space", 
		"Int", "Digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'var'", "'return'", "'if'", "'wat'", "'ifnt'", "'print'", 
		"'println'", "'each'", "'loop'", "'fu'", "'input'", "'assert'", "'size'", 
		"'in'", "'empty'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'^'", 
		"'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'['", "']'", 
		"'('", "')'", "';'", "'='", "','", "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Open", "Close", "Var", "Return", "If", "Else", "ElseIf", "Print", 
		"PrintLine", "EachLoop", "Loop", "Func", "Input", "Assert", "Size", "In", 
		"Empty", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", 
		"Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", 
		"OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", 
		"QMark", "Colon", "Bool", "Number", "Identifier", "String", "Comment", 
		"Space"
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


	public LangntLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Langnt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0134\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u00f5\n+\3,\3,\3,\7,\u00fa\n"+
		",\f,\16,\u00fd\13,\5,\u00ff\n,\3-\3-\7-\u0103\n-\f-\16-\u0106\13-\3.\3"+
		".\3.\3.\3.\3.\7.\u010e\n.\f.\16.\u0111\13.\3.\3.\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\7/\u011e\n/\f/\16/\u0121\13/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\7\61\u012b\n\61\f\61\16\61\u012e\13\61\3\61\5\61\u0131\n\61\3\62\3\62"+
		"\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2\3\2\n\5\2C\\"+
		"aac|\6\2\62;C\\aac|\3\2))\5\2\f\f\17\17))\4\2\f\f\17\17\5\2\13\f\16\17"+
		"\"\"\3\2\63;\3\2\62;\u013b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tm\3\2\2\2\13t\3"+
		"\2\2\2\rw\3\2\2\2\17{\3\2\2\2\21\u0080\3\2\2\2\23\u0086\3\2\2\2\25\u008e"+
		"\3\2\2\2\27\u0093\3\2\2\2\31\u0098\3\2\2\2\33\u009b\3\2\2\2\35\u00a1\3"+
		"\2\2\2\37\u00a8\3\2\2\2!\u00ad\3\2\2\2#\u00b0\3\2\2\2%\u00b6\3\2\2\2\'"+
		"\u00b9\3\2\2\2)\u00bc\3\2\2\2+\u00bf\3\2\2\2-\u00c2\3\2\2\2/\u00c5\3\2"+
		"\2\2\61\u00c8\3\2\2\2\63\u00ca\3\2\2\2\65\u00cc\3\2\2\2\67\u00ce\3\2\2"+
		"\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00d4\3\2\2\2?\u00d6\3\2\2\2A\u00d8"+
		"\3\2\2\2C\u00da\3\2\2\2E\u00dc\3\2\2\2G\u00de\3\2\2\2I\u00e0\3\2\2\2K"+
		"\u00e2\3\2\2\2M\u00e4\3\2\2\2O\u00e6\3\2\2\2Q\u00e8\3\2\2\2S\u00ea\3\2"+
		"\2\2U\u00f4\3\2\2\2W\u00f6\3\2\2\2Y\u0100\3\2\2\2[\u0107\3\2\2\2]\u0114"+
		"\3\2\2\2_\u0124\3\2\2\2a\u0130\3\2\2\2c\u0132\3\2\2\2ef\7}\2\2f\4\3\2"+
		"\2\2gh\7\177\2\2h\6\3\2\2\2ij\7x\2\2jk\7c\2\2kl\7t\2\2l\b\3\2\2\2mn\7"+
		"t\2\2no\7g\2\2op\7v\2\2pq\7w\2\2qr\7t\2\2rs\7p\2\2s\n\3\2\2\2tu\7k\2\2"+
		"uv\7h\2\2v\f\3\2\2\2wx\7y\2\2xy\7c\2\2yz\7v\2\2z\16\3\2\2\2{|\7k\2\2|"+
		"}\7h\2\2}~\7p\2\2~\177\7v\2\2\177\20\3\2\2\2\u0080\u0081\7r\2\2\u0081"+
		"\u0082\7t\2\2\u0082\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084\u0085\7v\2\2"+
		"\u0085\22\3\2\2\2\u0086\u0087\7r\2\2\u0087\u0088\7t\2\2\u0088\u0089\7"+
		"k\2\2\u0089\u008a\7p\2\2\u008a\u008b\7v\2\2\u008b\u008c\7n\2\2\u008c\u008d"+
		"\7p\2\2\u008d\24\3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090\7c\2\2\u0090\u0091"+
		"\7e\2\2\u0091\u0092\7j\2\2\u0092\26\3\2\2\2\u0093\u0094\7n\2\2\u0094\u0095"+
		"\7q\2\2\u0095\u0096\7q\2\2\u0096\u0097\7r\2\2\u0097\30\3\2\2\2\u0098\u0099"+
		"\7h\2\2\u0099\u009a\7w\2\2\u009a\32\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7p\2\2\u009d\u009e\7r\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7v\2\2\u00a0"+
		"\34\3\2\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7u\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7v\2\2\u00a7\36\3\2\2\2\u00a8"+
		"\u00a9\7u\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7|\2\2\u00ab\u00ac\7g\2\2"+
		"\u00ac \3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\"\3\2\2\2"+
		"\u00b0\u00b1\7g\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4"+
		"\7v\2\2\u00b4\u00b5\7{\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7~\2\2\u00b7\u00b8"+
		"\7~\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7(\2\2\u00ba\u00bb\7(\2\2\u00bb(\3"+
		"\2\2\2\u00bc\u00bd\7?\2\2\u00bd\u00be\7?\2\2\u00be*\3\2\2\2\u00bf\u00c0"+
		"\7#\2\2\u00c0\u00c1\7?\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3\u00c4"+
		"\7?\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7>\2\2\u00c6\u00c7\7?\2\2\u00c7\60"+
		"\3\2\2\2\u00c8\u00c9\7`\2\2\u00c9\62\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb"+
		"\64\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf"+
		"8\3\2\2\2\u00d0\u00d1\7-\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7/\2\2\u00d3<"+
		"\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5>\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7"+
		"@\3\2\2\2\u00d8\u00d9\7\'\2\2\u00d9B\3\2\2\2\u00da\u00db\7]\2\2\u00db"+
		"D\3\2\2\2\u00dc\u00dd\7_\2\2\u00ddF\3\2\2\2\u00de\u00df\7*\2\2\u00dfH"+
		"\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1J\3\2\2\2\u00e2\u00e3\7=\2\2\u00e3L\3"+
		"\2\2\2\u00e4\u00e5\7?\2\2\u00e5N\3\2\2\2\u00e6\u00e7\7.\2\2\u00e7P\3\2"+
		"\2\2\u00e8\u00e9\7A\2\2\u00e9R\3\2\2\2\u00ea\u00eb\7<\2\2\u00ebT\3\2\2"+
		"\2\u00ec\u00ed\7{\2\2\u00ed\u00ee\7g\2\2\u00ee\u00f5\7u\2\2\u00ef\u00f0"+
		"\7{\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7p\2\2\u00f3"+
		"\u00f5\7v\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f5V\3\2\2\2\u00f6"+
		"\u00fe\5a\61\2\u00f7\u00fb\7\60\2\2\u00f8\u00fa\5c\62\2\u00f9\u00f8\3"+
		"\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ffX\3\2\2\2\u0100\u0104\t\2\2\2\u0101\u0103\t\3\2\2\u0102\u0101"+
		"\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"Z\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u010f\t\4\2\2\u0108\u010e\n\5\2\2"+
		"\u0109\u010a\7^\2\2\u010a\u010e\7^\2\2\u010b\u010c\7^\2\2\u010c\u010e"+
		"\7)\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0112\u0113\t\4\2\2\u0113\\\3\2\2\2\u0114\u0115"+
		"\7P\2\2\u0115\u0116\7Q\2\2\u0116\u0117\7V\2\2\u0117\u0118\7E\2\2\u0118"+
		"\u0119\7Q\2\2\u0119\u011a\7F\2\2\u011a\u011b\7G\2\2\u011b\u011f\3\2\2"+
		"\2\u011c\u011e\n\6\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0123\b/\2\2\u0123^\3\2\2\2\u0124\u0125\t\7\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\b\60\2\2\u0127`\3\2\2\2\u0128\u012c\t\b\2\2\u0129\u012b\5c\62\2"+
		"\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u0131\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\7\62\2\2"+
		"\u0130\u0128\3\2\2\2\u0130\u012f\3\2\2\2\u0131b\3\2\2\2\u0132\u0133\t"+
		"\t\2\2\u0133d\3\2\2\2\f\2\u00f4\u00fb\u00fe\u0104\u010d\u010f\u011f\u012c"+
		"\u0130\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}