// Generated from /Users/ruipedro/Desktop/Universidade/Ano 4/Perfis/PLC/GCS/Trabalho/QASys/src/qasys/QAGrammar.g4 by ANTLR 4.2.2
package qasys;

    import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QAGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QAGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QAGrammarParser#qas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQas(@NotNull QAGrammarParser.QasContext ctx);

	/**
	 * Visit a parse tree produced by {@link QAGrammarParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(@NotNull QAGrammarParser.TipoContext ctx);

	/**
	 * Visit a parse tree produced by {@link QAGrammarParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada(@NotNull QAGrammarParser.EntradaContext ctx);

	/**
	 * Visit a parse tree produced by {@link QAGrammarParser#resposta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResposta(@NotNull QAGrammarParser.RespostaContext ctx);

	/**
	 * Visit a parse tree produced by {@link QAGrammarParser#nomes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomes(@NotNull QAGrammarParser.NomesContext ctx);

	/**
	 * Visit a parse tree produced by {@link QAGrammarParser#questoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestoes(@NotNull QAGrammarParser.QuestoesContext ctx);

	/**
	 * Visit a parse tree produced by {@link QAGrammarParser#nomesQuestao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomesQuestao(@NotNull QAGrammarParser.NomesQuestaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link QAGrammarParser#listaNomes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaNomes(@NotNull QAGrammarParser.ListaNomesContext ctx);

	/**
	 * Visit a parse tree produced by {@link QAGrammarParser#questao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestao(@NotNull QAGrammarParser.QuestaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link QAGrammarParser#db}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb(@NotNull QAGrammarParser.DbContext ctx);

	/**
	 * Visit a parse tree produced by {@link QAGrammarParser#verbo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbo(@NotNull QAGrammarParser.VerboContext ctx);
}