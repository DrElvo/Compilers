
import org.antlr.v4.runtime.*;

public class Task_1 {

        public static void main(String[] args) throws Exception{
            //CHANGE AND FIX TO BE DIFFERENT
            Object[] argsf = new Object[args.length];
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("true")) {
                    argsf[i] = Boolean.parseBoolean(args[i]);
                } else if (args[i].equals("false")) {
                    argsf[i] = Boolean.parseBoolean(args[i]);
                }
                else{
                    argsf[i] = Integer.parseInt(args[i]);
                }
            }


            CharStream input = CharStreams.fromStream(System.in);
            //CharStream input = CharStreams.fromFileName("/Volumes/USB 1 1/Uni Year 2 - part 1/232560/task1/Demo1.dl");
            //CharStream input = CharStreams.fromFileName("H:\\Uni Year 2 - part 1\\232560\\task1\\Demo1.dl");
            //System.out.println(input);
            Task_1_InterpLexer lexer = new Task_1_InterpLexer(input);
            //lexer.removeErrorListeners();
            //lexer.addErrorListener(new MyANTLRErrorListener());
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Task_1_InterpParser parser = new Task_1_InterpParser(tokens);
            //parser.removeErrorListeners();
            //parser.addErrorListener(new MyANTLRErrorListener());
            Task_1_InterpParser.ProgramContext In_Pr_Tree = parser.program();

            Task_1_Checker Obj_Chk = new Task_1_Checker();

            Interpreter Obj_Int = new Interpreter();


            try{
                Obj_Chk.visit(In_Pr_Tree);
            }

            catch(Task_1_Exceptions ex){
                System.out.println(ex.report());
                return;
            }

            Object Return_Value = Obj_Int.visitProgram2(In_Pr_Tree, argsf);
            System.out.println();
            System.out.println("NORMAL_TERMINATION");
            System.out.println(Return_Value);


        }
    }
