// Generated from H:/Uni Year 2 - part 1/234567/task1/src\Task_1_Interp.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Task_1_InterpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Task_1_InterpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Task_1_InterpParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Task_1_InterpParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_1_InterpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Task_1_InterpParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_1_InterpParser#declar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclar(Task_1_InterpParser.DeclarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_1_InterpParser#paramDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDecla(Task_1_InterpParser.ParamDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_1_InterpParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(Task_1_InterpParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_1_InterpParser#localDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDecla(Task_1_InterpParser.LocalDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_1_InterpParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Task_1_InterpParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_1_InterpParser#ene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEne(Task_1_InterpParser.EneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Task_1_InterpParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Task_1_InterpParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(Task_1_InterpParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Task_1_InterpParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(Task_1_InterpParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Task_1_InterpParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multi_Block}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_Block(Task_1_InterpParser.Multi_BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Task_1_InterpParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(Task_1_InterpParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatLoop}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatLoop(Task_1_InterpParser.RepeatLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Task_1_InterpParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Space}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(Task_1_InterpParser.SpaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Newline}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(Task_1_InterpParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link Task_1_InterpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(Task_1_InterpParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_1_InterpParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(Task_1_InterpParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Task_1_InterpParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(Task_1_InterpParser.BinopContext ctx);
}