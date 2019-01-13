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
		"'?'", "'RESPOSTA:'", "'TIPO:'", "'DB:'", "'INFINITIVOS:'", "'PERGUNTAS:'", 
		"'{'", "';'", "'}'", "'-'", "'NOMES:'", "'VERBO:'", "STR", "TEXT", "SEPARADOR"
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
	        if (resposta == null) 
	            return "Pergunta não consta na base de conhecimento.";
	        else return resposta;
	    }
	              
	    void imprimirResposta(String tipo, String verbo, List<String> nomes, String resposta){
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16h\n\16\f\16"+
		"\16\16k\13\16\3\16\3\16\3\17\6\17p\n\17\r\17\16\17q\3\20\5\20u\n\20\3"+
		"\20\3\20\6\20y\n\20\r\20\16\20z\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\5\4\2$$))\f"+
		"\2\62;C\\c|\u00e2\u00e3\u00e5\u00e5\u00e9\u00eb\u00ee\u00ef\u00f4\u00f5"+
		"\u00f7\u00f7\u00fb\u00fc\4\2\13\13\"\"\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7-\3\2\2\2\t\63\3\2\2"+
		"\2\13\67\3\2\2\2\rD\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3"+
		"\2\2\2\27W\3\2\2\2\31^\3\2\2\2\33e\3\2\2\2\35o\3\2\2\2\37x\3\2\2\2!\""+
		"\7A\2\2\"\4\3\2\2\2#$\7T\2\2$%\7G\2\2%&\7U\2\2&\'\7R\2\2\'(\7Q\2\2()\7"+
		"U\2\2)*\7V\2\2*+\7C\2\2+,\7<\2\2,\6\3\2\2\2-.\7V\2\2./\7K\2\2/\60\7R\2"+
		"\2\60\61\7Q\2\2\61\62\7<\2\2\62\b\3\2\2\2\63\64\7F\2\2\64\65\7D\2\2\65"+
		"\66\7<\2\2\66\n\3\2\2\2\678\7K\2\289\7P\2\29:\7H\2\2:;\7K\2\2;<\7P\2\2"+
		"<=\7K\2\2=>\7V\2\2>?\7K\2\2?@\7X\2\2@A\7Q\2\2AB\7U\2\2BC\7<\2\2C\f\3\2"+
		"\2\2DE\7R\2\2EF\7G\2\2FG\7T\2\2GH\7I\2\2HI\7W\2\2IJ\7P\2\2JK\7V\2\2KL"+
		"\7C\2\2LM\7U\2\2MN\7<\2\2N\16\3\2\2\2OP\7}\2\2P\20\3\2\2\2QR\7=\2\2R\22"+
		"\3\2\2\2ST\7\177\2\2T\24\3\2\2\2UV\7/\2\2V\26\3\2\2\2WX\7P\2\2XY\7Q\2"+
		"\2YZ\7O\2\2Z[\7G\2\2[\\\7U\2\2\\]\7<\2\2]\30\3\2\2\2^_\7X\2\2_`\7G\2\2"+
		"`a\7T\2\2ab\7D\2\2bc\7Q\2\2cd\7<\2\2d\32\3\2\2\2ei\t\2\2\2fh\n\2\2\2g"+
		"f\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\t\2\2\2"+
		"m\34\3\2\2\2np\t\3\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\36\3\2"+
		"\2\2su\7\17\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vy\7\f\2\2wy\t\4\2\2xt\3"+
		"\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\20\2\2} "+
		"\3\2\2\2\b\2iqtxz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}