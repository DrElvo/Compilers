// Generated from H:/Uni Year 2 - part 1/234567/task2/src\Task_2_Language.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task_2_LanguageParser}.
 */
public interface Task_2_LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task_2_LanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Task_2_LanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_2_LanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Task_2_LanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_2_LanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Task_2_LanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_2_LanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Task_2_LanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_2_LanguageParser#declar}.
	 * @param ctx the parse tree
	 */
	void enterDeclar(Task_2_LanguageParser.DeclarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_2_LanguageParser#declar}.
	 * @param ctx the parse tree
	 */
	void exitDeclar(Task_2_LanguageParser.DeclarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_2_LanguageParser#paramDecla}.
	 * @param ctx the parse tree
	 */
	void enterParamDecla(Task_2_LanguageParser.ParamDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_2_LanguageParser#paramDecla}.
	 * @param ctx the parse tree
	 */
	void exitParamDecla(Task_2_LanguageParser.ParamDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_2_LanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(Task_2_LanguageParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_2_LanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(Task_2_LanguageParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_2_LanguageParser#localDecla}.
	 * @param ctx the parse tree
	 */
	void enterLocalDecla(Task_2_LanguageParser.LocalDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_2_LanguageParser#localDecla}.
	 * @param ctx the parse tree
	 */
	void exitLocalDecla(Task_2_LanguageParser.LocalDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_2_LanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Task_2_LanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_2_LanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Task_2_LanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_2_LanguageParser#ene}.
	 * @param ctx the parse tree
	 */
	void enterEne(Task_2_LanguageParser.EneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_2_LanguageParser#ene}.
	 * @param ctx the parse tree
	 */
	void exitEne(Task_2_LanguageParser.EneContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_2_LanguageParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(Task_2_LanguageParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_2_LanguageParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(Task_2_LanguageParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Task_2_LanguageParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Task_2_LanguageParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Task_2_LanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Task_2_LanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Task_2_LanguageParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Task_2_LanguageParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(Task_2_LanguageParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(Task_2_LanguageParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multi_Block}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulti_Block(Task_2_LanguageParser.Multi_BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multi_Block}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulti_Block(Task_2_LanguageParser.Multi_BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Task_2_LanguageParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Task_2_LanguageParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(Task_2_LanguageParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(Task_2_LanguageParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatLoop}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepeatLoop(Task_2_LanguageParser.RepeatLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatLoop}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepeatLoop(Task_2_LanguageParser.RepeatLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint(Task_2_LanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint(Task_2_LanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(Task_2_LanguageParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(Task_2_LanguageParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(Task_2_LanguageParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(Task_2_LanguageParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Space}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSpace(Task_2_LanguageParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Space}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSpace(Task_2_LanguageParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Newline}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewline(Task_2_LanguageParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Newline}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewline(Task_2_LanguageParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSkip(Task_2_LanguageParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSkip(Task_2_LanguageParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_2_LanguageParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(Task_2_LanguageParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_2_LanguageParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(Task_2_LanguageParser.BinopContext ctx);
}