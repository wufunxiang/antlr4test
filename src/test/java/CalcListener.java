// Generated from Calc.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetExpr(@NotNull CalcParser.SetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetExpr(@NotNull CalcParser.SetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#agmts}.
	 * @param ctx the parse tree
	 */
	void enterAgmts(@NotNull CalcParser.AgmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#agmts}.
	 * @param ctx the parse tree
	 */
	void exitAgmts(@NotNull CalcParser.AgmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void enterCalcExpr(@NotNull CalcParser.CalcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#calcExpr}.
	 * @param ctx the parse tree
	 */
	void exitCalcExpr(@NotNull CalcParser.CalcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#agmt}.
	 * @param ctx the parse tree
	 */
	void enterAgmt(@NotNull CalcParser.AgmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#agmt}.
	 * @param ctx the parse tree
	 */
	void exitAgmt(@NotNull CalcParser.AgmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull CalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull CalcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull CalcParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull CalcParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull CalcParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull CalcParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(@NotNull CalcParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(@NotNull CalcParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(@NotNull CalcParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(@NotNull CalcParser.FunCallContext ctx);
}