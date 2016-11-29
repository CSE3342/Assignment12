// Generated from MyLanguage.g4 by ANTLR 4.5.3

    import java.io.*;
    import java.net.URL;
    import java.nio.charset.Charset;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
public interface MyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#root_rule}.
	 * @param ctx the parse tree
	 */
	void enterRoot_rule(MyLanguageParser.Root_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#root_rule}.
	 * @param ctx the parse tree
	 */
	void exitRoot_rule(MyLanguageParser.Root_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#set_id_key_val}.
	 * @param ctx the parse tree
	 */
	void enterSet_id_key_val(MyLanguageParser.Set_id_key_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#set_id_key_val}.
	 * @param ctx the parse tree
	 */
	void exitSet_id_key_val(MyLanguageParser.Set_id_key_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#get_id_key}.
	 * @param ctx the parse tree
	 */
	void enterGet_id_key(MyLanguageParser.Get_id_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#get_id_key}.
	 * @param ctx the parse tree
	 */
	void exitGet_id_key(MyLanguageParser.Get_id_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#get_id}.
	 * @param ctx the parse tree
	 */
	void enterGet_id(MyLanguageParser.Get_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#get_id}.
	 * @param ctx the parse tree
	 */
	void exitGet_id(MyLanguageParser.Get_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#get_database}.
	 * @param ctx the parse tree
	 */
	void enterGet_database(MyLanguageParser.Get_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#get_database}.
	 * @param ctx the parse tree
	 */
	void exitGet_database(MyLanguageParser.Get_databaseContext ctx);
}