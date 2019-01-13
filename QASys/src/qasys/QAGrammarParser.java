// Generated from /Users/ruipedro/Desktop/Universidade/Ano 4/Perfis/PLC/GCS/Trabalho/gcs1819/QASys/src/qasys/QAGrammar.g4 by ANTLR 4.2.2
package qasys;

    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;

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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, STR=13, TEXT=14, SEPARADOR=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'?'", "'RESPOSTA:'", "'TIPO:'", "'DB:'", "'INFINITIVOS:'", 
		"'PERGUNTAS:'", "'{'", "';'", "'}'", "'-'", "'NOMES:'", "'VERBO:'", "STR", 
		"TEXT", "SEPARADOR"
	};
	public static final int
		RULE_qas = 0, RULE_infinitivos = 1, RULE_listaAssociacoes = 2, RULE_associacao = 3, 
		RULE_db = 4, RULE_entrada = 5, RULE_tipo = 6, RULE_verbo = 7, RULE_nomes = 8, 
		RULE_listaNomes = 9, RULE_resposta = 10, RULE_perguntas = 11, RULE_pergunta = 12;
	public static final String[] ruleNames = {
		"qas", "infinitivos", "listaAssociacoes", "associacao", "db", "entrada", 
		"tipo", "verbo", "nomes", "listaNomes", "resposta", "perguntas", "pergunta"
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

	public QAGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QasContext extends ParserRuleContext {
		public PerguntasContext perguntas() {
			return getRuleContext(PerguntasContext.class,0);
		}
		public DbContext db() {
			return getRuleContext(DbContext.class,0);
		}
		public InfinitivosContext infinitivos() {
			return getRuleContext(InfinitivosContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); infinitivos();
			setState(27); db();
			setState(29);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(28); perguntas();
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

	public static class InfinitivosContext extends ParserRuleContext {
		public ListaAssociacoesContext listaAssociacoes() {
			return getRuleContext(ListaAssociacoesContext.class,0);
		}
		public InfinitivosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infinitivos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterInfinitivos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitInfinitivos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitInfinitivos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfinitivosContext infinitivos() throws RecognitionException {
		InfinitivosContext _localctx = new InfinitivosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_infinitivos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(5);
			setState(32); listaAssociacoes();
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

	public static class ListaAssociacoesContext extends ParserRuleContext {
		public AssociacaoContext associacao;
		public List<AssociacaoContext> associacao() {
			return getRuleContexts(AssociacaoContext.class);
		}
		public AssociacaoContext associacao(int i) {
			return getRuleContext(AssociacaoContext.class,i);
		}
		public ListaAssociacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaAssociacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterListaAssociacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitListaAssociacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitListaAssociacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaAssociacoesContext listaAssociacoes() throws RecognitionException {
		ListaAssociacoesContext _localctx = new ListaAssociacoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listaAssociacoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34); ((ListaAssociacoesContext)_localctx).associacao = associacao();
				setState(35); match(8);

				        infinitivos.addInfinitivo(((ListaAssociacoesContext)_localctx).associacao.infinit, ((ListaAssociacoesContext)_localctx).associacao.listaVerbos);
				    
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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

	public static class AssociacaoContext extends ParserRuleContext {
		public String infinit;
		public List<String> listaVerbos;
		public Token infinitivo;
		public Token verbos;
		public List<TerminalNode> TEXT() { return getTokens(QAGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(QAGrammarParser.TEXT, i);
		}
		public AssociacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterAssociacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitAssociacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitAssociacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociacaoContext associacao() throws RecognitionException {
		AssociacaoContext _localctx = new AssociacaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_associacao);

		        _localctx.listaVerbos = new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); ((AssociacaoContext)_localctx).infinitivo = match(TEXT);
			_localctx.infinit = (((AssociacaoContext)_localctx).infinitivo!=null?((AssociacaoContext)_localctx).infinitivo.getText():null);
			setState(44); match(10);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45); ((AssociacaoContext)_localctx).verbos = match(TEXT);

				            _localctx.listaVerbos.add((((AssociacaoContext)_localctx).verbos!=null?((AssociacaoContext)_localctx).verbos.getText():null));
				        
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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
		enterRule(_localctx, 8, RULE_db);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(4);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52); entrada();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==7 );
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
		enterRule(_localctx, 10, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(7);
			setState(58); ((EntradaContext)_localctx).tipo = tipo();
			setState(59); ((EntradaContext)_localctx).verbo = verbo();
			setState(60); ((EntradaContext)_localctx).nomes = nomes();
			setState(61); ((EntradaContext)_localctx).resposta = resposta();
			setState(62); match(9);

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
		public Token TEXT;
		public TerminalNode TEXT() { return getToken(QAGrammarParser.TEXT, 0); }
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
		enterRule(_localctx, 12, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(3);
			setState(66); ((TipoContext)_localctx).TEXT = match(TEXT);
			_localctx.texto = (((TipoContext)_localctx).TEXT!=null?((TipoContext)_localctx).TEXT.getText():null);
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
		public Token TEXT;
		public TerminalNode TEXT() { return getToken(QAGrammarParser.TEXT, 0); }
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
		enterRule(_localctx, 14, RULE_verbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(12);
			setState(70); ((VerboContext)_localctx).TEXT = match(TEXT);
			_localctx.texto = (((VerboContext)_localctx).TEXT!=null?((VerboContext)_localctx).TEXT.getText():null);
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
		enterRule(_localctx, 16, RULE_nomes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(11);
			setState(74); ((NomesContext)_localctx).listaNomes = listaNomes();
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
		public List<TerminalNode> TEXT() { return getTokens(QAGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(QAGrammarParser.TEXT, i);
		}
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
		enterRule(_localctx, 18, RULE_listaNomes);

		    _localctx.lista = new ArrayList<String>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); ((ListaNomesContext)_localctx).n1 = match(TEXT);

			            _localctx.lista.add((((ListaNomesContext)_localctx).n1!=null?((ListaNomesContext)_localctx).n1.getText():null));
			        
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(79); ((ListaNomesContext)_localctx).n2 = match(TEXT);

				            _localctx.lista.add((((ListaNomesContext)_localctx).n2!=null?((ListaNomesContext)_localctx).n2.getText():null));
				        
				}
				}
				setState(85);
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
		enterRule(_localctx, 20, RULE_resposta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(2);
			setState(87); ((RespostaContext)_localctx).STR = match(STR);
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

	public static class PerguntasContext extends ParserRuleContext {
		public PerguntaContext pergunta(int i) {
			return getRuleContext(PerguntaContext.class,i);
		}
		public List<PerguntaContext> pergunta() {
			return getRuleContexts(PerguntaContext.class);
		}
		public PerguntasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perguntas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterPerguntas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitPerguntas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitPerguntas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerguntasContext perguntas() throws RecognitionException {
		PerguntasContext _localctx = new PerguntasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_perguntas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(6);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(91); pergunta();
				setState(92); match(1);
				}
				}
				setState(98);
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

	public static class PerguntaContext extends ParserRuleContext {
		public Token tipoP;
		public Token verboP;
		public ListaNomesContext listaNomes;
		public List<TerminalNode> TEXT() { return getTokens(QAGrammarParser.TEXT); }
		public ListaNomesContext listaNomes() {
			return getRuleContext(ListaNomesContext.class,0);
		}
		public TerminalNode TEXT(int i) {
			return getToken(QAGrammarParser.TEXT, i);
		}
		public PerguntaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pergunta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).enterPergunta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QAGrammarListener ) ((QAGrammarListener)listener).exitPergunta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QAGrammarVisitor ) return ((QAGrammarVisitor<? extends T>)visitor).visitPergunta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerguntaContext pergunta() throws RecognitionException {
		PerguntaContext _localctx = new PerguntaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pergunta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); ((PerguntaContext)_localctx).tipoP = match(TEXT);
			setState(100); match(10);
			setState(101); ((PerguntaContext)_localctx).verboP = match(TEXT);
			setState(102); match(10);
			setState(103); ((PerguntaContext)_localctx).listaNomes = listaNomes();

			        String infinitivo = infinitivos.getInfinitivo((((PerguntaContext)_localctx).verboP!=null?((PerguntaContext)_localctx).verboP.getText():null));
			        Pergunta pergunta = new Pergunta((((PerguntaContext)_localctx).tipoP!=null?((PerguntaContext)_localctx).tipoP.getText():null), infinitivo, ((PerguntaContext)_localctx).listaNomes.lista);
			        String resposta = obtemResposta(pergunta);
			        imprimirResposta((((PerguntaContext)_localctx).tipoP!=null?((PerguntaContext)_localctx).tipoP.getText():null), (((PerguntaContext)_localctx).verboP!=null?((PerguntaContext)_localctx).verboP.getText():null), ((PerguntaContext)_localctx).listaNomes.lista, resposta);
			    
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\5\2 \n\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\6\4)\n\4\r\4\16\4*\3\5\3\5\3\5\3\5\3\5\6\5\62\n\5\r\5\16\5\63\3\6"+
		"\3\6\6\68\n\6\r\6\16\69\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13T\n\13\f\13"+
		"\16\13W\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\ra\n\r\f\r\16\rd\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\2e\2\34\3\2\2\2\4!\3\2\2\2\6(\3\2\2\2\b,\3\2\2\2\n\65\3\2"+
		"\2\2\f;\3\2\2\2\16C\3\2\2\2\20G\3\2\2\2\22K\3\2\2\2\24O\3\2\2\2\26X\3"+
		"\2\2\2\30\\\3\2\2\2\32e\3\2\2\2\34\35\5\4\3\2\35\37\5\n\6\2\36 \5\30\r"+
		"\2\37\36\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\"\7\7\2\2\"#\5\6\4\2#\5\3\2\2"+
		"\2$%\5\b\5\2%&\7\n\2\2&\'\b\4\1\2\')\3\2\2\2($\3\2\2\2)*\3\2\2\2*(\3\2"+
		"\2\2*+\3\2\2\2+\7\3\2\2\2,-\7\20\2\2-.\b\5\1\2.\61\7\f\2\2/\60\7\20\2"+
		"\2\60\62\b\5\1\2\61/\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2"+
		"\64\t\3\2\2\2\65\67\7\6\2\2\668\5\f\7\2\67\66\3\2\2\289\3\2\2\29\67\3"+
		"\2\2\29:\3\2\2\2:\13\3\2\2\2;<\7\t\2\2<=\5\16\b\2=>\5\20\t\2>?\5\22\n"+
		"\2?@\5\26\f\2@A\7\13\2\2AB\b\7\1\2B\r\3\2\2\2CD\7\5\2\2DE\7\20\2\2EF\b"+
		"\b\1\2F\17\3\2\2\2GH\7\16\2\2HI\7\20\2\2IJ\b\t\1\2J\21\3\2\2\2KL\7\r\2"+
		"\2LM\5\24\13\2MN\b\n\1\2N\23\3\2\2\2OP\7\20\2\2PU\b\13\1\2QR\7\20\2\2"+
		"RT\b\13\1\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\25\3\2\2\2WU\3\2"+
		"\2\2XY\7\4\2\2YZ\7\17\2\2Z[\b\f\1\2[\27\3\2\2\2\\b\7\b\2\2]^\5\32\16\2"+
		"^_\7\3\2\2_a\3\2\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\31\3\2\2"+
		"\2db\3\2\2\2ef\7\20\2\2fg\7\f\2\2gh\7\20\2\2hi\7\f\2\2ij\5\24\13\2jk\b"+
		"\16\1\2k\33\3\2\2\2\b\37*\639Ub";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}