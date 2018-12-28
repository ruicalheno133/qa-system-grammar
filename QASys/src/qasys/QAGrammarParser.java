// Generated from /Users/ruipedro/Desktop/Universidade/Ano 4/Perfis/PLC/GCS/Trabalho/QASys/src/qasys/QAGrammar.g4 by ANTLR 4.2.2
package qasys;

    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QAGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, STR=9, 
		JSON=10, SEPARADOR=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'RESPOSTA: '", "'VERBO: '", "'{'", "','", "'NOMES: '", "'-'", 
		"'TIPO: '", "'}'", "STR", "JSON", "SEPARADOR"
	};
	public static final int
		RULE_qas = 0, RULE_db = 1, RULE_entrada = 2, RULE_tipo = 3, RULE_verbo = 4, 
		RULE_nomes = 5, RULE_listaNomes = 6, RULE_resposta = 7, RULE_questoes = 8, 
		RULE_questao = 9, RULE_nomesQuestao = 10;
	public static final String[] ruleNames = {
		"qas", "db", "entrada", "tipo", "verbo", "nomes", "listaNomes", "resposta", 
		"questoes", "questao", "nomesQuestao"
	};

	@Override
	public String getGrammarFileName() { return "QAGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	   
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
	                                          

	public QAGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QasContext extends ParserRuleContext {
		public QuestoesContext questoes() {
			return getRuleContext(QuestoesContext.class,0);
		}
		public DbContext db() {
			return getRuleContext(DbContext.class,0);
		}
		public QasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterQas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitQas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitQas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QasContext qas() throws RecognitionException {
		QasContext _localctx = new QasContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_qas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); db();
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(23); questoes();
				}
				break;
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

	public static class DbContext extends ParserRuleContext {
		public List<EntradaContext> entrada() {
			return getRuleContexts(EntradaContext.class);
		}
		public EntradaContext entrada(int i) {
			return getRuleContext(EntradaContext.class,i);
		}
		public DbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterDb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitDb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitDb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbContext db() throws RecognitionException {
		DbContext _localctx = new DbContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_db);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); entrada();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(27); entrada();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        //imprimeDB(); 
			    
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

	public static class EntradaContext extends ParserRuleContext {
		public Pergunta p;
		public String r;
		public TipoContext tipo;
		public VerboContext verbo;
		public NomesContext nomes;
		public RespostaContext resposta;
		public VerboContext verbo() {
			return getRuleContext(VerboContext.class,0);
		}
		public NomesContext nomes() {
			return getRuleContext(NomesContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public RespostaContext resposta() {
			return getRuleContext(RespostaContext.class,0);
		}
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(3);
			setState(36); ((EntradaContext)_localctx).tipo = tipo();
			setState(37); ((EntradaContext)_localctx).verbo = verbo();
			setState(38); ((EntradaContext)_localctx).nomes = nomes();
			setState(39); ((EntradaContext)_localctx).resposta = resposta();
			setState(40); match(8);

			            Pergunta p = new Pergunta(((EntradaContext)_localctx).tipo.texto, ((EntradaContext)_localctx).verbo.texto, ((EntradaContext)_localctx).nomes.lista);
			            
			            adicionaEntrada(p, ((EntradaContext)_localctx).resposta.texto);
			         
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

	public static class TipoContext extends ParserRuleContext {
		public String texto;
		public Token STR;
		public TerminalNode STR() { return getToken(QAGrammarParser.STR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(7);
			setState(44); ((TipoContext)_localctx).STR = match(STR);
			_localctx.texto = (((TipoContext)_localctx).STR!=null?((TipoContext)_localctx).STR.getText():null);
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

	public static class VerboContext extends ParserRuleContext {
		public String texto;
		public Token STR;
		public TerminalNode STR() { return getToken(QAGrammarParser.STR, 0); }
		public VerboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterVerbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitVerbo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitVerbo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerboContext verbo() throws RecognitionException {
		VerboContext _localctx = new VerboContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_verbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(2);
			setState(48); ((VerboContext)_localctx).STR = match(STR);
			_localctx.texto = (((VerboContext)_localctx).STR!=null?((VerboContext)_localctx).STR.getText():null);
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

	public static class NomesContext extends ParserRuleContext {
		public List<String> lista;
		public ListaNomesContext listaNomes;
		public ListaNomesContext listaNomes() {
			return getRuleContext(ListaNomesContext.class,0);
		}
		public NomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterNomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitNomes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitNomes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomesContext nomes() throws RecognitionException {
		NomesContext _localctx = new NomesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nomes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(5);
			setState(52); ((NomesContext)_localctx).listaNomes = listaNomes();
			_localctx.lista = ((NomesContext)_localctx).listaNomes.lista; 
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

	public static class ListaNomesContext extends ParserRuleContext {
		public List<String> lista;
		public Token n1;
		public Token n2;
		public TerminalNode STR(int i) {
			return getToken(QAGrammarParser.STR, i);
		}
		public List<TerminalNode> STR() { return getTokens(QAGrammarParser.STR); }
		public ListaNomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaNomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterListaNomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitListaNomes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitListaNomes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaNomesContext listaNomes() throws RecognitionException {
		ListaNomesContext _localctx = new ListaNomesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaNomes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); ((ListaNomesContext)_localctx).n1 = match(STR);

			           _localctx.lista = new ArrayList<String>();
			           _localctx.lista.add((((ListaNomesContext)_localctx).n1!=null?((ListaNomesContext)_localctx).n1.getText():null));
			          
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(57); match(4);
				setState(58); ((ListaNomesContext)_localctx).n2 = match(STR);

				           _localctx.lista.add((((ListaNomesContext)_localctx).n2!=null?((ListaNomesContext)_localctx).n2.getText():null));
				          
				}
				}
				setState(64);
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

	public static class RespostaContext extends ParserRuleContext {
		public String texto;
		public Token STR;
		public TerminalNode STR() { return getToken(QAGrammarParser.STR, 0); }
		public RespostaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resposta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterResposta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitResposta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitResposta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RespostaContext resposta() throws RecognitionException {
		RespostaContext _localctx = new RespostaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_resposta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(1);
			setState(66); ((RespostaContext)_localctx).STR = match(STR);
			_localctx.texto = (((RespostaContext)_localctx).STR!=null?((RespostaContext)_localctx).STR.getText():null);
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

	public static class QuestoesContext extends ParserRuleContext {
		public QuestaoContext questao(int i) {
			return getRuleContext(QuestaoContext.class,i);
		}
		public List<QuestaoContext> questao() {
			return getRuleContexts(QuestaoContext.class);
		}
		public QuestoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterQuestoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitQuestoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitQuestoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestoesContext questoes() throws RecognitionException {
		QuestoesContext _localctx = new QuestoesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_questoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STR) {
				{
				{
				setState(69); questao();
				}
				}
				setState(74);
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

	public static class QuestaoContext extends ParserRuleContext {
		public Token t;
		public Token v;
		public ListaNomesContext listaNomes;
		public TerminalNode STR(int i) {
			return getToken(QAGrammarParser.STR, i);
		}
		public List<TerminalNode> STR() { return getTokens(QAGrammarParser.STR); }
		public ListaNomesContext listaNomes() {
			return getRuleContext(ListaNomesContext.class,0);
		}
		public QuestaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterQuestao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitQuestao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitQuestao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestaoContext questao() throws RecognitionException {
		QuestaoContext _localctx = new QuestaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_questao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); ((QuestaoContext)_localctx).t = match(STR);
			setState(76); match(6);
			setState(77); ((QuestaoContext)_localctx).v = match(STR);
			setState(78); match(6);
			setState(79); ((QuestaoContext)_localctx).listaNomes = listaNomes();

			          Pergunta pergunta = new Pergunta((((QuestaoContext)_localctx).t!=null?((QuestaoContext)_localctx).t.getText():null), (((QuestaoContext)_localctx).v!=null?((QuestaoContext)_localctx).v.getText():null), ((QuestaoContext)_localctx).listaNomes.lista);
			          String resposta = obtemResposta(pergunta);
			          System.out.println("Pergunta:\n" + pergunta + "\nResposta: " + resposta); 
			         
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

	public static class NomesQuestaoContext extends ParserRuleContext {
		public List<String> texto;
		public Token n1;
		public Token n2;
		public TerminalNode STR(int i) {
			return getToken(QAGrammarParser.STR, i);
		}
		public List<TerminalNode> STR() { return getTokens(QAGrammarParser.STR); }
		public NomesQuestaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomesQuestao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterNomesQuestao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitNomesQuestao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitNomesQuestao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomesQuestaoContext nomesQuestao() throws RecognitionException {
		NomesQuestaoContext _localctx = new NomesQuestaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nomesQuestao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); ((NomesQuestaoContext)_localctx).n1 = match(STR);
			_localctx.texto = new ArrayList<String>();_localctx.texto.add((((NomesQuestaoContext)_localctx).n1!=null?((NomesQuestaoContext)_localctx).n1.getText():null));
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(84); match(4);
				setState(85); ((NomesQuestaoContext)_localctx).n2 = match(STR);
				_localctx.texto.add((((NomesQuestaoContext)_localctx).n2!=null?((NomesQuestaoContext)_localctx).n2.getText():null));
				}
				}
				setState(91);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r_\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\5\2\33\n\2\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b?\n\b\f\b\16\bB\13\b\3\t\3\t\3\t\3\t\3"+
		"\n\7\nI\n\n\f\n\16\nL\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\7\fZ\n\f\f\f\16\f]\13\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24"+
		"\26\2\2X\2\30\3\2\2\2\4\34\3\2\2\2\6%\3\2\2\2\b-\3\2\2\2\n\61\3\2\2\2"+
		"\f\65\3\2\2\2\169\3\2\2\2\20C\3\2\2\2\22J\3\2\2\2\24M\3\2\2\2\26T\3\2"+
		"\2\2\30\32\5\4\3\2\31\33\5\22\n\2\32\31\3\2\2\2\32\33\3\2\2\2\33\3\3\2"+
		"\2\2\34 \5\6\4\2\35\37\5\6\4\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2"+
		" !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\b\3\1\2$\5\3\2\2\2%&\7\5\2\2&\'\5\b"+
		"\5\2\'(\5\n\6\2()\5\f\7\2)*\5\20\t\2*+\7\n\2\2+,\b\4\1\2,\7\3\2\2\2-."+
		"\7\t\2\2./\7\13\2\2/\60\b\5\1\2\60\t\3\2\2\2\61\62\7\4\2\2\62\63\7\13"+
		"\2\2\63\64\b\6\1\2\64\13\3\2\2\2\65\66\7\7\2\2\66\67\5\16\b\2\678\b\7"+
		"\1\28\r\3\2\2\29:\7\13\2\2:@\b\b\1\2;<\7\6\2\2<=\7\13\2\2=?\b\b\1\2>;"+
		"\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\17\3\2\2\2B@\3\2\2\2CD\7\3\2\2"+
		"DE\7\13\2\2EF\b\t\1\2F\21\3\2\2\2GI\5\24\13\2HG\3\2\2\2IL\3\2\2\2JH\3"+
		"\2\2\2JK\3\2\2\2K\23\3\2\2\2LJ\3\2\2\2MN\7\13\2\2NO\7\b\2\2OP\7\13\2\2"+
		"PQ\7\b\2\2QR\5\16\b\2RS\b\13\1\2S\25\3\2\2\2TU\7\13\2\2U[\b\f\1\2VW\7"+
		"\6\2\2WX\7\13\2\2XZ\b\f\1\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\"+
		"\27\3\2\2\2][\3\2\2\2\7\32 @J[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}