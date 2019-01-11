// Generated from /Users/ruipedro/Desktop/Universidade/Ano 4/Perfis/PLC/GCS/Trabalho/gcs1819/QASys/src/qasys/QAGrammar.g4 by ANTLR 4.2.2
package qasys;

    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;

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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, STR=13, TEXT=14, SEPARADOR=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'?'", "'RESPOSTA: '", "'VERBO: '", "'QUESTOES:'", "'DB:'", "'INFINITIVOS:'", 
		"'{'", "';'", "'NOMES: '", "'TIPO: '", "'}'", "'-'", "STR", "TEXT", "SEPARADOR"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "STR", "TEXT", "SEPARADOR"
	};

	   
	          HashMap<Pergunta, String> db = new HashMap<>();
	          Infinitivos infinitivos = new Infinitivos();
	          
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
	          
	          void imprimirSolucao(String tipo, String verbo, List<String> nomes, String resposta){
	              System.out.print("Pergunta: ");
	              System.out.print(tipo + " " + verbo + " ");
	              for (String nome : nomes)
	                System.out.print(nome + " ");
	              System.out.println("?");
	              System.out.println("Resposta: " + resposta);                                                                             
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u0081\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\7\16k\n\16\f\16\16\16n\13\16\3\16\3\16\3\17\6\17s\n\17\r\17\16\17"+
		"t\3\20\5\20x\n\20\3\20\3\20\6\20|\n\20\r\20\16\20}\3\20\3\20\2\2\21\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21\3\2\5\4\2$$))\5\2\62;C\\c|\4\2\13\13\"\"\u0085\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7.\3\2\2\2\t\66\3"+
		"\2\2\2\13@\3\2\2\2\rD\3\2\2\2\17Q\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2\25]"+
		"\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35r\3\2\2\2\37{\3\2\2\2!"+
		"\"\7A\2\2\"\4\3\2\2\2#$\7T\2\2$%\7G\2\2%&\7U\2\2&\'\7R\2\2\'(\7Q\2\2("+
		")\7U\2\2)*\7V\2\2*+\7C\2\2+,\7<\2\2,-\7\"\2\2-\6\3\2\2\2./\7X\2\2/\60"+
		"\7G\2\2\60\61\7T\2\2\61\62\7D\2\2\62\63\7Q\2\2\63\64\7<\2\2\64\65\7\""+
		"\2\2\65\b\3\2\2\2\66\67\7S\2\2\678\7W\2\289\7G\2\29:\7U\2\2:;\7V\2\2;"+
		"<\7Q\2\2<=\7G\2\2=>\7U\2\2>?\7<\2\2?\n\3\2\2\2@A\7F\2\2AB\7D\2\2BC\7<"+
		"\2\2C\f\3\2\2\2DE\7K\2\2EF\7P\2\2FG\7H\2\2GH\7K\2\2HI\7P\2\2IJ\7K\2\2"+
		"JK\7V\2\2KL\7K\2\2LM\7X\2\2MN\7Q\2\2NO\7U\2\2OP\7<\2\2P\16\3\2\2\2QR\7"+
		"}\2\2R\20\3\2\2\2ST\7=\2\2T\22\3\2\2\2UV\7P\2\2VW\7Q\2\2WX\7O\2\2XY\7"+
		"G\2\2YZ\7U\2\2Z[\7<\2\2[\\\7\"\2\2\\\24\3\2\2\2]^\7V\2\2^_\7K\2\2_`\7"+
		"R\2\2`a\7Q\2\2ab\7<\2\2bc\7\"\2\2c\26\3\2\2\2de\7\177\2\2e\30\3\2\2\2"+
		"fg\7/\2\2g\32\3\2\2\2hl\t\2\2\2ik\n\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2"+
		"\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\t\2\2\2p\34\3\2\2\2qs\t\3\2\2rq\3\2"+
		"\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\36\3\2\2\2vx\7\17\2\2wv\3\2\2\2wx"+
		"\3\2\2\2xy\3\2\2\2y|\7\f\2\2z|\t\4\2\2{w\3\2\2\2{z\3\2\2\2|}\3\2\2\2}"+
		"{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\b\20\2\2\u0080 \3\2\2\2\b\2"+
		"ltw{}\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}