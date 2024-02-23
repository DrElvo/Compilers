
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Task_2_CodeGen extends AbstractParseTreeVisitor<String> implements Task_2_LanguageVisitor<String>
{
    public final HashMap<String, Integer> Hashmap_Stack = new HashMap<>();
    public final Map<String, Task_2_LanguageParser.DeclarContext> Functions = new HashMap<>();
    public int Counter = 0;
    public int DeclaCounter = 17;

    @Override
    public String visitProgram(Task_2_LanguageParser.ProgramContext ctx) {

        StringBuilder St_Bu = new StringBuilder();

        for(int i = 0; i < ctx.declar().size(); i++) {
            Functions.put(ctx.declar(i).ID().getText(),ctx.declar(i));
        }

        for (int i = 0; i < ctx.declar().size(); i++) {


            St_Bu.append(visit(ctx.declar(i)));

        }

        return St_Bu.toString();
    }

    @Override
    public String visitType(Task_2_LanguageParser.TypeContext ctx) {
        StringBuilder St_Bu = new StringBuilder();
        return St_Bu.toString();
    }

    @Override
    public String visitDeclar(Task_2_LanguageParser.DeclarContext ctx) {
        StringBuilder St_Bu = new StringBuilder();
        if(ctx.ID().getText().equals("main")){
            St_Bu.append("""
              main:
                  lw          ra, 4(sp)
                  addi        sp, sp, 4
                """);}
        else{
            St_Bu.append(String.format("""
                %s:
                """, ctx.ID().getText()
                    )
            );
        }

        St_Bu.append(visit(ctx.paramDecla()));

        St_Bu.append("""
                    addi        sp, sp, 4
                """
        );

        St_Bu.append(visit(ctx.body()));

        St_Bu.append("""
                        ret
                    """);
        return St_Bu.toString();
    }

    @Override
    public String visitParamDecla(Task_2_LanguageParser.ParamDeclaContext ctx) {

        StringBuilder St_Bu = new StringBuilder();
        for (int i = 0; i < ctx.ID().size(); i++) {

            Hashmap_Stack.put(ctx.ID(i).getText(),DeclaCounter + i);

            St_Bu.append(
                    String.format("""
                    lw          x%2d, 4(sp)
                    addi        sp, sp, 4
                """,
                       i + DeclaCounter
                    )
            );

            DeclaCounter++;
        }
        return St_Bu.toString();
    }

    @Override
    public String visitBody(Task_2_LanguageParser.BodyContext ctx) {

        StringBuilder St_Bu = new StringBuilder();

        for (int i = 0; i < ctx.localDecla().size(); i++) {
            St_Bu.append(visit(ctx.localDecla(i)));
        }

        St_Bu.append(visit(ctx.ene()));

        return St_Bu.toString();
    }

    @Override
    public String visitLocalDecla(Task_2_LanguageParser.LocalDeclaContext ctx) {

        StringBuilder St_Bu = new StringBuilder();

        St_Bu.append(visit(ctx.expr()));

        St_Bu.append(
                String.format("""
                    lw          x%2d, 4(sp)
                    addi        sp, sp, 4
                """,
                        DeclaCounter
                )
        );
        Hashmap_Stack.put(ctx.ID().getText(), DeclaCounter);
        DeclaCounter = DeclaCounter + 1;

        return St_Bu.toString();
    }

    @Override
    public String visitBlock(Task_2_LanguageParser.BlockContext ctx) {

        StringBuilder St_Bu = new StringBuilder();
        St_Bu.append(visit(ctx.ene()));
        return St_Bu.toString();
    }

    @Override
    public String visitEne(Task_2_LanguageParser.EneContext ctx) {
        StringBuilder St_Bu = new StringBuilder();
        for (int i = 0; i < ctx.expr().size(); i++) {

            St_Bu.append(visit(ctx.expr(i)));

        }
        return St_Bu.toString();
    }

    @Override
    public String visitIdentifier(Task_2_LanguageParser.IdentifierContext ctx) {
        StringBuilder St_Bu = new StringBuilder();

        Integer Return_Identifier = Hashmap_Stack.get(ctx.ID().getText());

        St_Bu.append(
                String.format("""
                    PushReg     x%2d
                """,
                Return_Identifier
                )
        );


        return St_Bu.toString();
    }

    @Override
    public String visitInt(Task_2_LanguageParser.IntContext ctx) {
        StringBuilder St_Bu = new StringBuilder();
        St_Bu.append(
                String.format("""
                    PushImm     %d
                """,
                        Integer.parseInt(ctx.getText())
                )
        );
        return St_Bu.toString();
    }

    @Override
    public String visitBoolean(Task_2_LanguageParser.BooleanContext ctx) {
        StringBuilder St_Bu = new StringBuilder();
        St_Bu.append(
                String.format("""
                    PushImm     %d
                """,
                        Integer.parseInt(ctx.getText())
                )
        );
        return St_Bu.toString();
    }

    @Override
    public String visitAssignment(Task_2_LanguageParser.AssignmentContext ctx) {
        StringBuilder St_Bu = new StringBuilder();
        St_Bu.append(visit(ctx.expr()));
        St_Bu.append(
                String.format("""
                    PopReg      x%2d
                """,
                        Hashmap_Stack.get(ctx.ID().getText())
                )
        );
        return St_Bu.toString();
    }

    @Override
    public String visitParens(Task_2_LanguageParser.ParensContext ctx) {

        StringBuilder St_Bu = new StringBuilder();

        St_Bu.append(visit(ctx.expr(1)));

        St_Bu.append(visit(ctx.expr(0)));

        switch (((TerminalNode) (ctx.binop().getChild(0))).getSymbol().getType()) {
            case Task_2_LanguageParser.Equals -> {

                St_Bu.append("""
                    Equ
                """
                );

            }
            case Task_2_LanguageParser.LessThanEq -> {

                St_Bu.append("""
                    CompLE
                """
                );

            }
            case Task_2_LanguageParser.MoreThanEq -> {

                St_Bu.append("""
                    CompME
                """
                );

            }
            case Task_2_LanguageParser.LessThan -> {

                St_Bu.append("""
                    CompL
                """
                );

            }
            case Task_2_LanguageParser.MoreThan -> {

                St_Bu.append("""
                    CompM
                """
                );

            }
            case Task_2_LanguageParser.Plus -> {

                St_Bu.append("""
                    Plus
                """
                );

            }
            case Task_2_LanguageParser.Minus -> {

                St_Bu.append("""
                    Minus
                """
                );

            }
            case Task_2_LanguageParser.Mult -> {

                St_Bu.append("""
                    Multiply
                """
                );

            }
            case Task_2_LanguageParser.Div -> {

                St_Bu.append("""
                    Divide
                """
                );

            }
            case Task_2_LanguageParser.XOR -> {

                St_Bu.append("""
                    LogicalOr
                """
                );

            }
            case Task_2_LanguageParser.OR -> {

                St_Bu.append("""
                    LogicalXor
                """
                );

            }
            case Task_2_LanguageParser.AND -> {

                St_Bu.append("""
                    LogicalAnd
                """
                );

            }

            default -> {
                throw new RuntimeException("Shouldn't be here - wrong binary operator.");
            }

        }
        return St_Bu.toString();
    }

    @Override
    public String visitFunctionCall(Task_2_LanguageParser.FunctionCallContext ctx) {

        StringBuilder St_Bu = new StringBuilder();

        String[] Args_array = new String[ctx.args().expr().size()];

        for (int i = 0; i < ctx.args().expr().size(); i++) {
            Args_array[i] = visit(ctx.args().expr(i));
        }
        St_Bu.append(String.format("""
                call """, ctx.ID().getText()
                )
        );
        St_Bu.append(visit(ctx.args()));

        String  Return_Function = visitDeclar(Functions.get(ctx.ID().getText()));

        St_Bu.append(Return_Function);

        St_Bu.append(String.format("""
                ret """
                )
        );
        return St_Bu.toString();
    }

    @Override
    public String visitMulti_Block(Task_2_LanguageParser.Multi_BlockContext ctx) {
        String ReturnBlocks;
        ReturnBlocks = visit(ctx.block());
        return ReturnBlocks;
    }

    @Override
    public String visitIfStatement(Task_2_LanguageParser.IfStatementContext ctx) {
        String If_Label = String.format("if_%d", Counter = Counter + 1);
        String Block_Label = String.format("else_%d", Counter = Counter + 1);
        String EndIf_Label = String.format("endif_%d", Counter = Counter + 1);

        StringBuilder St_Bu = new StringBuilder();
        St_Bu.append(
                String.format("""
                        %s:
                        """, If_Label)
        );
        St_Bu.append(visit(ctx.expr()));
        St_Bu.append(
                String.format("""
                        %s:
                        """, Block_Label)
        );
        St_Bu.append(visit(ctx.block(0)));
        St_Bu.append(
                String.format("""
                        %s:
                        """, Block_Label)
        );
        St_Bu.append(
                String.format("""
                        %s:
                        """, EndIf_Label)
        );
        St_Bu.append(visit(ctx.block(1)));
        St_Bu.append(
                String.format("""
                        %s:
                        """, EndIf_Label)
        );
        return St_Bu.toString();
    }

    @Override
    public String visitWhileLoop(Task_2_LanguageParser.WhileLoopContext ctx) {

        StringBuilder sb = new StringBuilder();

        String loopLabel = String.format("label_%d", Counter++);
        String exitLabel = String.format("label_%d", Counter++);

        sb.append(
                String.format("""
                %s:
                """,
                        loopLabel)
        );

        sb.append(visit(ctx.expr()));

        sb.append(
                String.format("""
                    PushImm     1
                    LogicalXor
                    JumpTrue    %s
                """,
                        exitLabel)
        );

        sb.append(visit(ctx.block()));

        sb.append(
                String.format("""
                    Jump        %s
                """,
                        loopLabel)
        );

        sb.append(
                String.format("""
                    %s:
                    """,
                        exitLabel)
        );

        return sb.toString();
    }

    @Override
    public String visitRepeatLoop(Task_2_LanguageParser.RepeatLoopContext ctx) {

        StringBuilder sb = new StringBuilder();
        String loopLabel = String.format("label_%d", Counter++);
        String exitLabel = String.format("label_%d", Counter++);

        sb.append(visit(ctx.block()));

        sb.append(
                String.format("""
                %s:
                """,
                        loopLabel)
        );

        sb.append(visit(ctx.expr()));

        sb.append(
                String.format("""
                    PushImm     1
                    LogicalXor
                    JumpTrue    %s
                """,
                        exitLabel)
        );

        sb.append(visit(ctx.block()));

        sb.append(
                String.format("""
                    Jump        %s
                """,
                        loopLabel)
        );

        sb.append(
                String.format("""
                    %s:
                    """,
                        exitLabel)
        );

        return sb.toString();
    }

    @Override
    public String visitPrint(Task_2_LanguageParser.PrintContext ctx) {

        StringBuilder St_Bu = new StringBuilder();
        if (ctx.expr().getText().equals("newline")) {
            St_Bu.append("""
                    la          a0, newline
                    li          a7, 4
                    ecall
                    """);
        }

        else if(ctx.expr().getText().equals("space")){
            St_Bu.append("""
                    la          a0, space
                    li          a7, 4
                    ecall
                    """);
        }

        else{
            St_Bu.append(visit(ctx.expr()));
            St_Bu.append("""
                    
                    la          a0, 4(sp)
                    li          a7, 4
                    ecall
                    """);
        }

        return St_Bu.toString();
    }

    @Override
    public String visitSpace(Task_2_LanguageParser.SpaceContext ctx) {

        return null;
    }

    @Override
    public String visitNewline(Task_2_LanguageParser.NewlineContext ctx) {

        return null;
    }

    @Override
    public String visitSkip(Task_2_LanguageParser.SkipContext ctx) {

        return null;
    }

    @Override
    public String visitArgs(Task_2_LanguageParser.ArgsContext ctx) {
        String Args_Return;
        StringBuilder St_Bu = new StringBuilder();

        for (int i = 0; i < ctx.expr().size(); i++) {
            Args_Return = visit(ctx.expr(i));
            St_Bu.append(Args_Return);
        }

        return St_Bu.toString();
    }

    @Override
    public String visitBinop(Task_2_LanguageParser.BinopContext ctx) {

        return null;
    }
}