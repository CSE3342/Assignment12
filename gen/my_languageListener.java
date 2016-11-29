// Generated from C:/Users/PrestonSSD2/PhpstormProjects/Assignment12\my_language.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link my_languageParser}.
 */
public interface my_languageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link my_languageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(my_languageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_languageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(my_languageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link my_languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(my_languageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link my_languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(my_languageParser.ExprContext ctx);
}