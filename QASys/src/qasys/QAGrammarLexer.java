// Generated from /Users/ruipedro/Desktop/Universidade/Ano 4/Perfis/PLC/GCS/Trabalho/QASys/src/qasys/QAGrammar.g4 by ANTLR 4.2.2
package qasys;

    import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QAGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, STR=9, 
		JSON=10, SEPARADOR=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'RESPOSTA: '", "'VERBO: '", "'{'", "','", "'NOMES: '", "'-'", "'TIPO: '", 
		"'}'", "STR", "JSON", "SEPARADOR"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "STR", 
		"JSON", "SEPARADOR"
	};

	   
	          HashMap<Pergunta, String> db = new HashMap<>();
	          
	          void adicionaEntrada (Pergunta pergunta, String resposta){
	              db.put(pergunta, resposta);
	          }
	          
	          String obtemResposta (Pergunta pergunta){
	              String resposta = db.get(pergunta);
	              if (resposta == null) return "Pergunta não consta na base de conhecimento.";
	              else return resposta;
	          }
	          
	          void imprimeDB () {
	            for(Pergunta key: db.keySet()){
	                System.out.println(key);
	                System.out.println("Resposta: " + db.get(key));
	            }
	           
	          }
	                                          


	public QAGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QAGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\6\nE\n\n\r\n\16\nF\3\13\6"+
		"\13J\n\13\r\13\16\13K\3\13\3\13\3\13\3\13\3\13\3\13\3\f\5\fU\n\f\3\f\3"+
		"\f\6\fY\n\f\r\f\16\fZ\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\3\2\5\5\2\62;C\\c|\4\2C\\c|\4\2\13\13\"\"b\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2"+
		"\2\5$\3\2\2\2\7,\3\2\2\2\t.\3\2\2\2\13\60\3\2\2\2\r8\3\2\2\2\17:\3\2\2"+
		"\2\21A\3\2\2\2\23D\3\2\2\2\25I\3\2\2\2\27X\3\2\2\2\31\32\7T\2\2\32\33"+
		"\7G\2\2\33\34\7U\2\2\34\35\7R\2\2\35\36\7Q\2\2\36\37\7U\2\2\37 \7V\2\2"+
		" !\7C\2\2!\"\7<\2\2\"#\7\"\2\2#\4\3\2\2\2$%\7X\2\2%&\7G\2\2&\'\7T\2\2"+
		"\'(\7D\2\2()\7Q\2\2)*\7<\2\2*+\7\"\2\2+\6\3\2\2\2,-\7}\2\2-\b\3\2\2\2"+
		"./\7.\2\2/\n\3\2\2\2\60\61\7P\2\2\61\62\7Q\2\2\62\63\7O\2\2\63\64\7G\2"+
		"\2\64\65\7U\2\2\65\66\7<\2\2\66\67\7\"\2\2\67\f\3\2\2\289\7/\2\29\16\3"+
		"\2\2\2:;\7V\2\2;<\7K\2\2<=\7R\2\2=>\7Q\2\2>?\7<\2\2?@\7\"\2\2@\20\3\2"+
		"\2\2AB\7\177\2\2B\22\3\2\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2F"+
		"G\3\2\2\2G\24\3\2\2\2HJ\t\3\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2"+
		"\2LM\3\2\2\2MN\7\60\2\2NO\7l\2\2OP\7u\2\2PQ\7q\2\2QR\7p\2\2R\26\3\2\2"+
		"\2SU\7\17\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VY\7\f\2\2WY\t\4\2\2XT\3\2"+
		"\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\f\2\2]\30"+
		"\3\2\2\2\b\2FKTXZ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}