import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.stringtemplate.v4.Interpreter;

import java.util.*;

public class Task_1_Checker extends AbstractParseTreeVisitor<Task_1_Types> implements Task_1_InterpVisitor<Task_1_Types> {

    class Tuple <ID, Type>{
        String a;
        Task_1_Types b;
        public Tuple(String a, Task_1_Types b) {
            this.a = a;
            this.b = b;
        }

    }

    Map<String, Task_1_Types> Name_Func = new HashMap<>();
    Map<String, Task_1_Types> Param_In_Fun = new HashMap<>();
    Map<String, Task_1_Types[]> Function_Args = new HashMap<>();
    Map<String, Tuple[]> Vars_In_Fun = new HashMap<>();
    String Fun_ID = "";
    @Override

    public Task_1_Types visitProgram(Task_1_InterpParser.ProgramContext ctx) {

        for (int i = 0; i < ctx.declar().size(); ++i) {
            Fun_ID = ctx.declar(i).ID().getText();
            visit(ctx.declar(i));
        }

        if (Name_Func.containsKey("main")) {
        for (int i = 0; i < ctx.declar().size(); ++i) {


            Param_In_Fun.clear();
            Fun_ID = ctx.declar(i).ID().getText();


            Tuple[] list = Vars_In_Fun.get(Fun_ID);
            for (int j = 0; j < list.length; j++) {

                Param_In_Fun.put(list[j].a,list[j].b);

            }

            Task_1_Types Return_From_Body = visit(ctx.declar(i).body());

            if (Return_From_Body != visit(ctx.declar(i).type())) {

                if (ctx.declar(i).ID().getText().equals("main")) {

                    throw new Task_1_Exceptions().mainReturnTypeError();
                }
                throw new Task_1_Exceptions().functionBodyError();
            }
        }

            return null;
        }

        throw new Task_1_Exceptions().noMainFuncError();
    }

    @Override
    public Task_1_Types visitType(Task_1_InterpParser.TypeContext ctx) {

        return Enum.valueOf(Task_1_Types.class,ctx.TYPE().getText().toUpperCase());
    }

    @Override
    public Task_1_Types visitDeclar(Task_1_InterpParser.DeclarContext ctx) {


        Param_In_Fun.clear();
        if (Name_Func.containsKey(ctx.ID().getText())) {

            throw new Task_1_Exceptions().duplicatedFuncError();

        }

        visit(ctx.paramDecla());

        Task_1_Types[] Args_Types = new Task_1_Types[ctx.paramDecla().ID().size()];

        Tuple[] Tuple_List_Fun = new Tuple[ctx.paramDecla().ID().size()];

        for (int i = 0; i < ctx.paramDecla().ID().size(); i++) {
            Task_1_Types Param_Type = visit(ctx.paramDecla().type(i));
            String ID_THIS = ctx.paramDecla().ID(i).getText();
            Args_Types[i] = Param_Type;
            Tuple Tup = new Tuple(ID_THIS,Param_Type);
            Tuple_List_Fun[i] = Tup;
        }

        Function_Args.put(ctx.ID().getText(),Args_Types);

        Name_Func.put(ctx.ID().getText(),Enum.valueOf(Task_1_Types.class, ctx.type().getText().toUpperCase()));

        Vars_In_Fun.put(ctx.ID().getText(),Tuple_List_Fun);

        return null;

    }

    @Override
    public Task_1_Types visitParamDecla(Task_1_InterpParser.ParamDeclaContext ctx) {
        Task_1_Types Type = null;
        Task_1_Types Param_Types = null;
        for (int i = 0; i < ctx.ID().size(); i++) {
            Type = visit(ctx.type(i));
            if(Type == Task_1_Types.UNIT){
                throw new Task_1_Exceptions().unitVarError();
            }
            if (Param_In_Fun.containsKey(ctx.ID(i).getText())) {
                throw new Task_1_Exceptions().duplicatedVarError();
            }
            if (Name_Func.containsKey(ctx.ID(i).getText())) {
                throw new Task_1_Exceptions().clashedVarError();
            }

            Param_In_Fun.put(ctx.ID(i).getText(), Enum.valueOf(Task_1_Types.class, ctx.type(i).getText().toUpperCase()));
            Param_Types = visit(ctx.type(i));
        }

        return Param_Types;
    }

    @Override
    public Task_1_Types visitLocalDecla(Task_1_InterpParser.LocalDeclaContext ctx) {

        Tuple[] tup = Vars_In_Fun.get(Fun_ID);

        for (int i = 0; i < tup.length; i++) {
            String ID = tup[i].a;
            Task_1_Types Type = tup[i].b;

            if (Type == Task_1_Types.UNIT | visit(ctx.type()) == Task_1_Types.UNIT) {
                throw new Task_1_Exceptions().unitVarError();
            }

            if (Name_Func.containsKey(ctx.ID().getText())) {
                throw new Task_1_Exceptions().clashedVarError();
            }

            if (ID.equals(ctx.ID().getText()) | Param_In_Fun.containsKey(ctx.ID().getText())){
                throw new Task_1_Exceptions().duplicatedVarError();
            }

            if (tup[i].a.equals(ctx.expr().getText())){
                if (tup[i].b != visit(ctx.type())){
                    throw new Task_1_Exceptions().assignmentError();
                }
                Param_In_Fun.put(ctx.ID().getText(), tup[i].b);

                return null;
            }

            else {

                if(visit(ctx.type()) != visit(ctx.expr())){
                    if(visit(ctx.expr()) == null){
                        throw new Task_1_Exceptions().undefinedVarError();
                    }
                    throw new Task_1_Exceptions().assignmentError();
                }
                Param_In_Fun.put(ctx.ID().getText(), Enum.valueOf(Task_1_Types.class, ctx.type().getText().toUpperCase()));


                return null;
            }

        }
        Param_In_Fun.put(ctx.ID().getText(), Enum.valueOf(Task_1_Types.class, ctx.type().getText().toUpperCase()));
        return null;

    }

    @Override
    public Task_1_Types visitBody(Task_1_InterpParser.BodyContext ctx) {

        for (int i = 0; i < ctx.localDecla().size(); i++) {
            visit(ctx.localDecla(i));
        }

        for (int i = 0; i < ctx.ene().expr().size(); i++) {
            visit(ctx.ene().expr(i));
        }

        Task_1_Types return_body = visit(ctx.ene().expr(ctx.ene().expr().size() - 1));

        return return_body;
    }

    @Override
    public Task_1_Types visitBlock(Task_1_InterpParser.BlockContext ctx) {
        Task_1_Types Block_Return = visit(ctx.ene().expr(ctx.ene().expr().size() - 1));
        return Block_Return;
    }

    @Override
    public Task_1_Types visitEne(Task_1_InterpParser.EneContext ctx) {
        if (ctx.expr().size() == 0) {

            return null;
        }

        for (int i = 0; i < ctx.expr().size(); i++) {
            visit(ctx.expr(i));
        }

        Task_1_Types Ene_Return = visit(ctx.expr(ctx.expr().size() - 1));
        return Ene_Return;
    }

    @Override
    public Task_1_Types visitIdentifier(Task_1_InterpParser.IdentifierContext ctx) {
        return Param_In_Fun.get(ctx.ID().getText());
    }

    @Override
    public Task_1_Types visitAssignment(Task_1_InterpParser.AssignmentContext ctx) {
        Task_1_Types Return_Assignment = visit(ctx.expr());

        if(Param_In_Fun.containsKey(ctx.ID().getText())){
            if(Return_Assignment != Param_In_Fun.get(ctx.ID().getText())){
                throw new Task_1_Exceptions().assignmentError();
            }

        }

        return Return_Assignment;
    }

    @Override
    public Task_1_Types visitIfStatement(Task_1_InterpParser.IfStatementContext ctx) {

        if(visit(ctx.expr()) != Task_1_Types.BOOL)
        {
            throw new Task_1_Exceptions().conditionError();
        }

        Task_1_Types Return_If_State = visit(ctx.block(1));

        if(visit(ctx.block(0)) != Return_If_State)
        {
            throw new Task_1_Exceptions().branchMismatchError();
        }

        return Return_If_State;
    }

    @Override
    public Task_1_Types visitPrint(Task_1_InterpParser.PrintContext ctx) {
        Task_1_Types Return_Print;
        if (ctx.expr().getText().equals("space") | ctx.expr().getText().equals("newline")){
            Return_Print = Task_1_Types.UNIT;
            return Return_Print;
        }
        else if (visit(ctx.expr())==Task_1_Types.INT){
            Return_Print = Task_1_Types.UNIT;
            return Return_Print;
        }
        else{
            throw new Task_1_Exceptions().printError();
        }
    }


    @Override
    public Task_1_Types visitSpace(Task_1_InterpParser.SpaceContext ctx) {

        return Task_1_Types.UNIT;
    }

    @Override
    public Task_1_Types visitNewline(Task_1_InterpParser.NewlineContext ctx) {

        return Task_1_Types.UNIT;
    }

    @Override
    public Task_1_Types visitSkip(Task_1_InterpParser.SkipContext ctx) {

        return Task_1_Types.UNIT;
    }

    @Override
    public Task_1_Types visitMulti_Block(Task_1_InterpParser.Multi_BlockContext ctx) {

        Task_1_Types Return_Blocks;
        Return_Blocks = visit(ctx.block());
        return Return_Blocks;
    }

    @Override
    public Task_1_Types visitRepeatLoop(Task_1_InterpParser.RepeatLoopContext ctx) {


        Task_1_Types Return_Repeat_Loop = visit(ctx.block().ene());


        if(Return_Repeat_Loop == Task_1_Types.INT | Return_Repeat_Loop == Task_1_Types.BOOL) {
            return Return_Repeat_Loop;
        }


        throw new Task_1_Exceptions().loopBodyError();
    }

    @Override
    public Task_1_Types visitParens(Task_1_InterpParser.ParensContext ctx) {
        if(ctx.expr(0).getText().equals("") | ctx.expr(1).getText().equals("")){
            throw new Task_1_Exceptions().ParensEmptyError();
        }

        Task_1_Types while_expr_1 = visit(ctx.expr(0));
        Task_1_Types while_expr_2 = visit(ctx.expr(1));

        if(while_expr_1 != while_expr_2 ){
            if(while_expr_1  == null | while_expr_2 == null){
                throw new Task_1_Exceptions().undefinedVarError();
            }
            if (ctx.binop().getText().equals("+") | ctx.binop().getText().equals("-") | ctx.binop().getText().equals("*") | ctx.binop().getText().equals("/")){
                throw new Task_1_Exceptions().arithmeticError();
            }
            if (ctx.binop().getText().equals("|") | ctx.binop().getText().equals("&") | ctx.binop().getText().equals("^")){
                throw new Task_1_Exceptions().logicalError();
            }
            //System.out.println("THERE SHOULD BE A THROW THAT IS COMPATABLE WITH THE MISMATCHED TYPES");
            throw new Task_1_Exceptions().comparisonError();
        }


        if(while_expr_1 == Task_1_Types.INT) {
            if (ctx.binop().getText().equals("==") | ctx.binop().getText().equals("<=") | ctx.binop().getText().equals(">=") | ctx.binop().getText().equals("<") | ctx.binop().getText().equals(">")) {

                return Task_1_Types.BOOL;
            }
            if (ctx.binop().getText().equals("+") | ctx.binop().getText().equals("-") | ctx.binop().getText().equals("*") | ctx.binop().getText().equals("/")){

                return Task_1_Types.INT;
            }
            else {

                throw new Task_1_Exceptions().comparisonError();
            }
        }
        if(while_expr_1 == Task_1_Types.BOOL) {
            if (ctx.binop().getText().equals("==") | ctx.binop().getText().equals("|") | ctx.binop().getText().equals("^") | ctx.binop().getText().equals("&"))  {
                return Task_1_Types.BOOL;
            }
            if (ctx.binop().getText().equals("+") | ctx.binop().getText().equals("-") | ctx.binop().getText().equals("*") | ctx.binop().getText().equals("/")){
                throw new Task_1_Exceptions().arithmeticError();
            }
            if (ctx.binop().getText().equals("<") | ctx.binop().getText().equals(">") | ctx.binop().getText().equals("<=") | ctx.binop().getText().equals(">=")){
                throw new Task_1_Exceptions().comparisonError();
            }
            else {
                throw new Task_1_Exceptions().logicalError();
            }

        }
        return null;
    }

    @Override
    public Task_1_Types visitFunctionCall(Task_1_InterpParser.FunctionCallContext ctx) {

        if(Name_Func.containsKey(ctx.ID().getText())){

            Task_1_Types[] Fun_Args = Function_Args.get(ctx.ID().getText());
            if(Fun_Args.length != ctx.args().expr().size()){
                throw new Task_1_Exceptions().argumentNumberError();
            }
            for (int i = 0; i < ctx.args().expr().size(); i++) {

                if(Fun_Args[i] != visit(ctx.args().expr(i))){
                    throw new Task_1_Exceptions().argumentError();
                }

            }

            Task_1_Types Function_Return = Name_Func.get(ctx.ID().getText());

            return Function_Return;
        }

        else{
            throw new Task_1_Exceptions().undefinedFuncError();
        }

    }

    @Override
    public Task_1_Types visitWhileLoop(Task_1_InterpParser.WhileLoopContext ctx) {

        Task_1_Types Return_While_Loop = visit(ctx.expr());

        if(Return_While_Loop != Task_1_Types.BOOL) {

            throw new Task_1_Exceptions().conditionError();
        }

        return Return_While_Loop;
    }

    @Override
    public Task_1_Types visitInt(Task_1_InterpParser.IntContext ctx) {

        return Task_1_Types.INT;
    }

    @Override
    public Task_1_Types visitBoolean(Task_1_InterpParser.BooleanContext ctx) {

        return Task_1_Types.BOOL;
    }

    @Override
    public Task_1_Types visitArgs(Task_1_InterpParser.ArgsContext ctx) {

        return null;
    }

    @Override
    public Task_1_Types visitBinop(Task_1_InterpParser.BinopContext ctx) {

        return null;
    }

}
