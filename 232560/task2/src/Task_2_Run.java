import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileWriter;

public class Task_2_Run {

    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromStream(System.in);
        //CharStream input = CharStreams.fromFileName("H:\\Uni Year 2 - part 1\\232560\\task2\\Demo1.dl");
        Task_2_LanguageLexer lexer = new Task_2_LanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Task_2_LanguageParser parser = new Task_2_LanguageParser(tokens);
        Task_2_LanguageParser.ProgramContext tree = parser.program();

        String stackMachineMacros = """
                    .globl main
                    .macro    PushImm        $number
                        li          t0, $number
                        sw          t0, (sp)
                        addi        sp, sp, -4
                    .end_macro
                    
                    .macro    PushReg        $reg
                        sw          $reg, (sp)
                        addi        sp, sp, -4
                    .end_macro
                    
                    .macro    PopReg        $reg
                        lw          $reg, 4(sp)
                        addi        sp, sp, 4
                    .end_macro
                    
                    .macro    Discard        $bytes
                        addi        sp, sp, $bytes
                    .end_macro
                    
                    .macro    Popt1t2
                        lw          t1, 4(sp)
                        addi        sp, sp, 4
                        lw          t2, 4(sp)
                        addi        sp, sp, 4
                    .end_macro
                    
                    .macro CompLE
                        Popt1t2
                        li          t0, 1
                        sw          t0, (sp)
                        ble         t1, t2, exit
                        sw          zero, (sp)
                    exit:
                        addi        sp, sp, -4
                    .end_macro
                    
                    .macro CompME
                        Popt1t2
                        li          t0, 1
                        sw          t0, (sp)
                        ble         t1, t2, exit
                        sw          zero, (sp)
                    exit:
                        addi        sp, sp, -4
                    .end_macro
                    
                    .macro CompM
                        Popt1t2
                        li          t0, 1
                        sw          t0, (sp)
                        ble         t1, t2, exit
                        sw          zero, (sp)
                    exit:
                        addi        sp, sp, -4
                    .end_macro
                    
                    .macro CompL
                        Popt1t2
                        li          t0, 1
                        sw          t0, (sp)
                        ble         t1, t2, exit
                        sw          zero, (sp)
                    exit:
                        addi        sp, sp, -4
                    .end_macro
                    
                    .macro Equ
                        Popt1t2
                        li          t0, 1
                        sw          t0, (sp)
                        ble         t1, t2, exit
                        sw          zero, (sp)
                    exit:
                        addi        sp, sp, -4
                    .end_macro
                    
                    .macro    Plus
                        Popt1t2
                        add         t1, t1, t2
                        sw          t1, (sp)
                        addi        sp, sp, -4
                    .end_macro
                                                      
                    .macro    Minus
                        Popt1t2
                        sub         t1, t1, t2
                        sw          t1, (sp)
                        addi        sp, sp, -4
                    .end_macro
                    
                    .macro    Multiply
                        Popt1t2
                        mul         t1, t1, t2
                        sw          t1, (sp)
                        addi        sp, sp, -4
                    .end_macro
                    
                    .macro    Divide
                        Popt1t2
                        div         t1, t1, t2
                        sw          t1, (sp)
                        addi        sp, sp, -4
                    .end_macro
                    
                    .macro    LogicalAnd
                        Popt1t2
                        and         t1, t1, t2
                        sw          t1, (sp)
                        addi        sp, sp, -4
                    .end_macro
                    
                    .macro    LogicalXor
                        Popt1t2
                        xor         t1, t1, t2
                        sw          t1, (sp)
                        addi        sp, sp, -4
                    .end_macro
                    
                     .macro    LogicalOr
                        Popt1t2
                        or         t1, t1, t2
                        sw          t1, (sp)
                        addi        sp, sp, -4
                    .end_macro   
                    
                
                        
                    .macro    Jump        $address
                        j           $address
                    .end_macro
                    
                    .macro    JumpTrue    $address
                        lw          t1, 4(sp)
                        addi        sp, sp, 4
                        beqz        t1, exit
                        j           $address
                    exit:
                    .end_macro
                    
                    """;

        Task_2_CodeGen codegen = new Task_2_CodeGen();

        System.out.println(stackMachineMacros + codegen.visit(tree));
    }
}