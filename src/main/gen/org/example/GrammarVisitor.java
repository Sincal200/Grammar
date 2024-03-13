// Generated from D:/Desktop/Gramática/Grammar/src/main/java/org/example/Grammar.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(GrammarParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(GrammarParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(GrammarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(GrammarParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(GrammarParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(GrammarParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#otra_instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtra_instruccion(GrammarParser.Otra_instruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(GrammarParser.OperadorContext ctx);
}