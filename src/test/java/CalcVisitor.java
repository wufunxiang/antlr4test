// Generated from Calc.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#setExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(@NotNull CalcParser.SetExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#agmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgmts(@NotNull CalcParser.AgmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#calcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcExpr(@NotNull CalcParser.CalcExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#agmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgmt(@NotNull CalcParser.AgmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull CalcParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull CalcParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull CalcParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(@NotNull CalcParser.ExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#funCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(@NotNull CalcParser.FunCallContext ctx);
}