// Generated from H:/Uni Year 2 - part 1/234567/task2/src\Task_2_Language.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Task_2_LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Task_2_LanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Task_2_LanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Task_2_LanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_2_LanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Task_2_LanguageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_2_LanguageParser#declar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclar(Task_2_LanguageParser.DeclarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_2_LanguageParser#paramDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDecla(Task_2_LanguageParser.ParamDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_2_LanguageParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(Task_2_LanguageParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_2_LanguageParser#localDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDecla(Task_2_LanguageParser.LocalDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_2_LanguageParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Task_2_LanguageParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_2_LanguageParser#ene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEne(Task_2_LanguageParser.EneContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_2_LanguageParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(Task_2_LanguageParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Task_2_LanguageParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Task_2_LanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Task_2_LanguageParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(Task_2_LanguageParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multi_Block}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_Block(Task_2_LanguageParser.Multi_BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Task_2_LanguageParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(Task_2_LanguageParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatLoop}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatLoop(Task_2_LanguageParser.RepeatLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Task_2_LanguageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Task_2_LanguageParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(Task_2_LanguageParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Space}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(Task_2_LanguageParser.SpaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Newline}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(Task_2_LanguageParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link Task_2_LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(Task_2_LanguageParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_2_LanguageParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(Task_2_LanguageParser.BinopContext ctx);
}