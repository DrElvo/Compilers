// Generated from H:/Uni Year 2 - part 1/234567/task1/src\Task_1_Interp.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task_1_InterpParser}.
 */
public interface Task_1_InterpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task_1_InterpParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Task_1_InterpParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_1_InterpParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Task_1_InterpParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_1_InterpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Task_1_InterpParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_1_InterpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Task_1_InterpParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_1_InterpParser#declar}.
	 * @param ctx the parse tree
	 */
	void enterDeclar(Task_1_InterpParser.DeclarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_1_InterpParser#declar}.
	 * @param ctx the parse tree
	 */
	void exitDeclar(Task_1_InterpParser.DeclarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_1_InterpParser#paramDecla}.
	 * @param ctx the parse tree
	 */
	void enterParamDecla(Task_1_InterpParser.ParamDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_1_InterpParser#paramDecla}.
	 * @param ctx the parse tree
	 */
	void exitParamDecla(Task_1_InterpParser.ParamDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_1_InterpParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(Task_1_InterpParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_1_InterpParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(Task_1_InterpParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_1_InterpParser#localDecla}.
	 * @param ctx the parse tree
	 */
	void enterLocalDecla(Task_1_InterpParser.LocalDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_1_InterpParser#localDecla}.
	 * @param ctx the parse tree
	 */
	void exitLocalDecla(Task_1_InterpParser.LocalDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_1_InterpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Task_1_InterpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_1_InterpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Task_1_InterpParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_1_InterpParser#ene}.
	 * @param ctx the parse tree
	 */
	void enterEne(Task_1_InterpParser.EneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_1_InterpParser#ene}.
	 * @param ctx the parse tree
	 */
	void exitEne(Task_1_InterpParser.EneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Task_1_InterpParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Task_1_InterpParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(Task_1_InterpParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(Task_1_InterpParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(Task_1_InterpParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(Task_1_InterpParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Task_1_InterpParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Task_1_InterpParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(Task_1_InterpParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(Task_1_InterpParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Task_1_InterpParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Task_1_InterpParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multi_Block}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulti_Block(Task_1_InterpParser.Multi_BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multi_Block}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulti_Block(Task_1_InterpParser.Multi_BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Task_1_InterpParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Task_1_InterpParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(Task_1_InterpParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(Task_1_InterpParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatLoop}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRepeatLoop(Task_1_InterpParser.RepeatLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatLoop}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRepeatLoop(Task_1_InterpParser.RepeatLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint(Task_1_InterpParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint(Task_1_InterpParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Space}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSpace(Task_1_InterpParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Space}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSpace(Task_1_InterpParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Newline}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewline(Task_1_InterpParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Newline}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewline(Task_1_InterpParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSkip(Task_1_InterpParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSkip(Task_1_InterpParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_1_InterpParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(Task_1_InterpParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_1_InterpParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(Task_1_InterpParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task_1_InterpParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(Task_1_InterpParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task_1_InterpParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(Task_1_InterpParser.BinopContext ctx);
}