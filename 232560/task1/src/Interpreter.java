import org.antlr.v4.runtime.misc.ObjectEqualityComparator;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Interpreter extends AbstractParseTreeVisitor<Object> implements Task_1_InterpVisitor<Object> {
    public final Stack<HashMap<String, Object>> Hashmap_Stack = new Stack<>();
    public final Map<String, Task_1_InterpParser.DeclarContext> Functions = new HashMap<>();

    String Function_ID = "";

    public Object visitProgram2(Task_1_InterpParser.ProgramContext ctx, Object[] args) {
        Object Return_Value = null;

        for (int i = 0; i < ctx.declar().size(); ++i) {
            Functions.put(ctx.declar(i).ID().getText(),ctx.declar(i));
         }

        for (int i = 0; i < ctx.declar().size(); i++) {
            Function_ID = ctx.declar(i).ID().getText();
            if(Function_ID.equals("main")){
                Return_Value = visitDeclaWithArgs(ctx.declar(i),args);
            }
        }
        return Return_Value;
    }


    public Object visitDeclaWithArgs(Task_1_InterpParser.DeclarContext ctx, Object[] args) {

        Hashmap_Stack.push(new HashMap<>());

        Object Decla_Return;

        for (int i = 0; i < ctx.paramDecla().ID().size(); i++) {


            Hashmap_Stack.peek().put(ctx.paramDecla().ID(i).getText(),args[i]);

        }

        Decla_Return = visit(ctx.body());

        return Decla_Return;
    }

    @Override
    public Object visitDeclar(Task_1_InterpParser.DeclarContext ctx) {

        visit(ctx.body());

        return null;
    }

    @Override
    public Object visitParamDecla(Task_1_InterpParser.ParamDeclaContext ctx) {
        return null;
    }

    @Override
    public Object visitBody(Task_1_InterpParser.BodyContext ctx) {

        Object Return_Body;
        for (int i = 0; i < ctx.localDecla().size(); i++) {
            visit(ctx.localDecla(i));
        }
        Return_Body = visit(ctx.ene());

        return Return_Body;
    }

    @Override
    public Object visitLocalDecla(Task_1_InterpParser.LocalDeclaContext ctx) {

        String Var_ID = ctx.ID().getText();

        Object Var_Value = visit(ctx.expr());

        Hashmap_Stack.peek().put(Var_ID,Var_Value);

        return null;
    }

    @Override
    public Object visitBlock(Task_1_InterpParser.BlockContext ctx) {

        Object Return_Block = null;

        for (int i = 0; i < ctx.ene().expr().size(); i++) {

            Return_Block = visit(ctx.ene().expr(i));
        }


        return Return_Block;
    }

    @Override
    public Object visitEne(Task_1_InterpParser.EneContext ctx) {

        Object Return_Ene = null;

        for (int i = 0; i < ctx.expr().size(); i++) {
            Return_Ene = visit(ctx.expr(i));

        }

        return Return_Ene;
    }

    @Override
    public Object visitIdentifier(Task_1_InterpParser.IdentifierContext ctx) {

        Object Identifier_return;

        Identifier_return = Hashmap_Stack.peek().get(ctx.ID().getText());

        return Identifier_return;
    }

    @Override
    public Object visitInt(Task_1_InterpParser.IntContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Object visitBoolean(Task_1_InterpParser.BooleanContext ctx) {
        return Boolean.parseBoolean(ctx.getText());

    }

    @Override
    public Object visitAssignment(Task_1_InterpParser.AssignmentContext ctx) {


        Object return_assignment = null;

        String Var_ID = ctx.ID().getText();

        return_assignment = visit(ctx.expr());

        Hashmap_Stack.peek().put(Var_ID,return_assignment);

        return return_assignment;

    }

    @Override
    public Object visitParens(Task_1_InterpParser.ParensContext ctx) {

        if(ctx.binop().getText().equals("+")){
            return (int)visit(ctx.expr(0)) + (int)visit(ctx.expr(1));
        }
        if(ctx.binop().getText().equals("-")){
            return (int)visit(ctx.expr(0)) - (int)visit(ctx.expr(1));
        }
        if(ctx.binop().getText().equals("*")){
            return (int)visit(ctx.expr(0)) * (int)visit(ctx.expr(1));
        }
        if(ctx.binop().getText().equals("/")){
            return (int)visit(ctx.expr(0)) / (int)visit(ctx.expr(1));
        }
        if(ctx.binop().getText().equals("==")){
            return visit(ctx.expr(0)).equals(visit(ctx.expr(1)));
        }
        if(ctx.binop().getText().equals(">=")){
            return (int)visit(ctx.expr(0)) >= (int)visit(ctx.expr(1));
        }
        if(ctx.binop().getText().equals("<=")){
            return (int)visit(ctx.expr(0)) <= (int)visit(ctx.expr(1));
        }
        if(ctx.binop().getText().equals(">")){
            return (int)visit(ctx.expr(0)) > (int)visit(ctx.expr(1));
        }
        if(ctx.binop().getText().equals("<")){
            return (int)visit(ctx.expr(0)) < (int)visit(ctx.expr(1));
        }
        if(ctx.binop().getText().equals("&")){
            return (boolean)visit(ctx.expr(0)) && (boolean) visit(ctx.expr(1));
        }
        if(ctx.binop().getText().equals("|")){
            return (boolean)visit(ctx.expr(0)) || (boolean)visit(ctx.expr(1));
        }
        if(ctx.binop().getText().equals("^")){
            return (boolean)visit(ctx.expr(0)) ^ (boolean)visit(ctx.expr(1));
        }

        return null;
    }

    @Override
    public Object visitFunctionCall(Task_1_InterpParser.FunctionCallContext ctx) {

        Object[] Args_array = new Object[ctx.args().expr().size()];

        for (int i = 0; i < ctx.args().expr().size(); i++) {
            Args_array[i] = visit(ctx.args().expr(i));
        }

        Object Return_Function = visitDeclaWithArgs(Functions.get(ctx.ID().getText()),Args_array);

        Hashmap_Stack.pop();

        return Return_Function;
    }

    @Override
    public Object visitMulti_Block(Task_1_InterpParser.Multi_BlockContext ctx) {

        Object Return_Multi_Block;
        Return_Multi_Block = visit(ctx.block());
        return Return_Multi_Block;
    }

    @Override
    public Object visitIfStatement(Task_1_InterpParser.IfStatementContext ctx) {

        Object Return_If = null;

        Object If_Condition = visit(ctx.expr());

        if((boolean)If_Condition == true) {

            Return_If = visit(ctx.block(0));
        }
        else{

            Return_If = visit(ctx.block(1)) ;
        }

        return Return_If;
    }

    @Override
    public Object visitWhileLoop(Task_1_InterpParser.WhileLoopContext ctx) {

        Object Return_While = null;
        while(visit(ctx.expr()) == Boolean.TRUE){
            Return_While = visit(ctx.block());
            }

        return Return_While;
    }

    @Override
    public Object visitRepeatLoop(Task_1_InterpParser.RepeatLoopContext ctx) {

        Object Return_Repeat = visit(ctx.block());

        while(visit(ctx.expr()) == Boolean.TRUE){
            Return_Repeat = visit(ctx.block());
        }

        return Return_Repeat;
    }

    @Override
    public Object visitPrint(Task_1_InterpParser.PrintContext ctx) {

        String Print_Check;
        Object Print_Return;
        Print_Check = ctx.expr().getText();

        if (Print_Check.equals("space")){
            System.out.print(" ");
        }

        else if (Print_Check.equals("newline")) {
            System.out.println();
        }

        else {
            Print_Return = visit(ctx.expr());
            System.out.print(Print_Return);
        }
        return null;
    }

    @Override
    public Object visitSpace(Task_1_InterpParser.SpaceContext ctx) {
        return null;
    }

    @Override
    public Object visitNewline(Task_1_InterpParser.NewlineContext ctx) {
        return null;
    }

    @Override
    public Object visitSkip(Task_1_InterpParser.SkipContext ctx) {
        return null;
    }

    @Override
    public Object visitArgs(Task_1_InterpParser.ArgsContext ctx) {
        return null;
    }

    @Override
    public Object visitBinop(Task_1_InterpParser.BinopContext ctx) {
        return null;
    }

    @Override
    public Object visitType(Task_1_InterpParser.TypeContext ctx) {
        return null;
    }

    @Override
    public Object visitProgram(Task_1_InterpParser.ProgramContext ctx) {
        return null;
    }
}
