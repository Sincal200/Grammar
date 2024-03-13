// Generated from D:/Desktop/Gramática/Grammar/src/main/java/org/example/Grammar.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(GrammarParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(GrammarParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(GrammarParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(GrammarParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(GrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(GrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(GrammarParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(GrammarParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(GrammarParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(GrammarParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(GrammarParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(GrammarParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#otra_instruccion}.
	 * @param ctx the parse tree
	 */
	void enterOtra_instruccion(GrammarParser.Otra_instruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#otra_instruccion}.
	 * @param ctx the parse tree
	 */
	void exitOtra_instruccion(GrammarParser.Otra_instruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(GrammarParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(GrammarParser.OperadorContext ctx);
}