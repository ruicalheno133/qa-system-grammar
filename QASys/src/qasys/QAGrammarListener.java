// Generated from /Users/ruipedro/Desktop/Universidade/Ano 4/Perfis/PLC/GCS/Trabalho/gcs1819/QASys/src/qasys/QAGrammar.g4 by ANTLR 4.2.2
package qasys;

    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QAGrammarParser}.
 */
public interface QAGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#qas}.
	 * @param ctx the parse tree
	 */
	void enterQas(@NotNull QAGrammarParser.QasContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#qas}.
	 * @param ctx the parse tree
	 */
	void exitQas(@NotNull QAGrammarParser.QasContext ctx);

	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull QAGrammarParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull QAGrammarParser.TipoContext ctx);

	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#listaAssociacoes}.
	 * @param ctx the parse tree
	 */
	void enterListaAssociacoes(@NotNull QAGrammarParser.ListaAssociacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#listaAssociacoes}.
	 * @param ctx the parse tree
	 */
	void exitListaAssociacoes(@NotNull QAGrammarParser.ListaAssociacoesContext ctx);

	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#infinitivos}.
	 * @param ctx the parse tree
	 */
	void enterInfinitivos(@NotNull QAGrammarParser.InfinitivosContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#infinitivos}.
	 * @param ctx the parse tree
	 */
	void exitInfinitivos(@NotNull QAGrammarParser.InfinitivosContext ctx);

	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#associacao}.
	 * @param ctx the parse tree
	 */
	void enterAssociacao(@NotNull QAGrammarParser.AssociacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#associacao}.
	 * @param ctx the parse tree
	 */
	void exitAssociacao(@NotNull QAGrammarParser.AssociacaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(@NotNull QAGrammarParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(@NotNull QAGrammarParser.EntradaContext ctx);

	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#resposta}.
	 * @param ctx the parse tree
	 */
	void enterResposta(@NotNull QAGrammarParser.RespostaContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#resposta}.
	 * @param ctx the parse tree
	 */
	void exitResposta(@NotNull QAGrammarParser.RespostaContext ctx);

	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#nomes}.
	 * @param ctx the parse tree
	 */
	void enterNomes(@NotNull QAGrammarParser.NomesContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#nomes}.
	 * @param ctx the parse tree
	 */
	void exitNomes(@NotNull QAGrammarParser.NomesContext ctx);

	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#questoes}.
	 * @param ctx the parse tree
	 */
	void enterQuestoes(@NotNull QAGrammarParser.QuestoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#questoes}.
	 * @param ctx the parse tree
	 */
	void exitQuestoes(@NotNull QAGrammarParser.QuestoesContext ctx);

	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#listaNomes}.
	 * @param ctx the parse tree
	 */
	void enterListaNomes(@NotNull QAGrammarParser.ListaNomesContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#listaNomes}.
	 * @param ctx the parse tree
	 */
	void exitListaNomes(@NotNull QAGrammarParser.ListaNomesContext ctx);

	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#questao}.
	 * @param ctx the parse tree
	 */
	void enterQuestao(@NotNull QAGrammarParser.QuestaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#questao}.
	 * @param ctx the parse tree
	 */
	void exitQuestao(@NotNull QAGrammarParser.QuestaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#db}.
	 * @param ctx the parse tree
	 */
	void enterDb(@NotNull QAGrammarParser.DbContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#db}.
	 * @param ctx the parse tree
	 */
	void exitDb(@NotNull QAGrammarParser.DbContext ctx);

	/**
	 * Enter a parse tree produced by {@link QAGrammarParser#verbo}.
	 * @param ctx the parse tree
	 */
	void enterVerbo(@NotNull QAGrammarParser.VerboContext ctx);
	/**
	 * Exit a parse tree produced by {@link QAGrammarParser#verbo}.
	 * @param ctx the parse tree
	 */
	void exitVerbo(@NotNull QAGrammarParser.VerboContext ctx);
}