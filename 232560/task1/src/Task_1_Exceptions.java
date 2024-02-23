/*
    This version is a prototype, and is provided as-is: it should be tailored to better fit the coursework.
    I disclaim any warranty (expressed or implied) that it is fit for purpose, or is in any other way well-written.
    --- JRNB (2021-09-14, ca 17.15 BST)

    Feel free to modify the interfaces, arguments, etc., but please keep the generated output identical.
    --- Hsi-Ming Ho
*/

public class Task_1_Exceptions extends RuntimeException
{

    private String msg;

    public Task_1_Exceptions()
    {
        super();
    }

    // Error information is to be determined separately on a case-by-case basis (see below).
    public Task_1_Exceptions(String errmsg)
    {
        msg = errmsg;
    }

    // A method to generate a report of the error as a string.
    public String report()
    {
        return msg;
    }

    // A method to produce an exception for the 'no main function' error.
    public Task_1_Exceptions noMainFuncError()
    {
        msg = "No main function defined";
        //D
        return this;
    }

    // A method to produce an exception for errors regarding main's return type
    public Task_1_Exceptions mainReturnTypeError()
    {
        msg = "Wrong return type declared for main function";
        return this;
    }

    // A method to produce an exception for duplicated function names
    public Task_1_Exceptions duplicatedFuncError()
    {
        msg = "Duplicated function names";
        //D
        return this;
    }

    // A method to produce an exception for duplicated parameter or local variable names
    public Task_1_Exceptions duplicatedVarError()
    {
        msg = "Duplicated variable names";
        //D
        return this;
    }

    // A method to produce an exception for parameter or local variable names that clashes with function names
    public Task_1_Exceptions clashedVarError()
    {
        msg = "A variable name clashed with a function name";
        //D
        return this;
    }

    // A method to produce an exception for parameters or local variables of 'unit' type.
    public Task_1_Exceptions unitVarError()
    {
        msg = "Variable of unit type";
        return this;
    }

    // A method to produce an exception for undefined function name
    public Task_1_Exceptions undefinedFuncError()
    {
        msg = "Unknown function name";
        return this;
    }

    // A method to produce an exception for undefined parameter or local variable name
    public Task_1_Exceptions undefinedVarError()
    {
        msg = "Unknown variable name";
        return this;
    }

    // A method to produce an exception related to mis-typed comparisons of integer values
    public Task_1_Exceptions comparisonError()
    {
        //D
        msg = "Invalid operand in integer comparison";
        return this;
    }

    // A method to produce an exception related to mis-typed arithmetic expressions
    public Task_1_Exceptions arithmeticError()
    {
        //D
        msg = "Invalid operand in arithmetic expression";
        return this;
    }

    // A method to produce an exception related to mis-typed Boolean expressions
    public Task_1_Exceptions logicalError()
    {
        //D
        msg = "Invalid operand in Boolean expression";
        return this;
    }

    // A method to produce an exception for 'if' statements, in which
    // the 'then' branch and the 'else' branch have different types.
    public Task_1_Exceptions branchMismatchError()
    {
        msg = "Mismatched expression types in if expression";
        return this;
    }

    // A method to produce an exception for if/loop conditions which are not of type bool.
    public Task_1_Exceptions conditionError()
    {
        //D
        msg = "Invalid condition in if expression or loop";
        return this;
    }

    // A method to produce an exception related to expressions in loop body.
    public Task_1_Exceptions loopBodyError()
    {
        msg = "Invalid last expression type in loop body";
        return this;
    }

    // A method to produce an exception for errors regarding function's return type.
    public Task_1_Exceptions functionBodyError()
    {
        msg = "Invalid return value type";
        return this;
    }

    // A method to produce an exception related to assignment.
    public Task_1_Exceptions assignmentError()
    {
        msg = "Incompatible types in assignment";
        return this;
    }

    // A method to produce an exception related to argument list mismatches.
    public Task_1_Exceptions argumentNumberError()
    {
        msg = "Invalid # of arguments in invocation";
        return this;
    }

    // A method to produce an exception related to argument type mismatches.
    public Task_1_Exceptions argumentError()
    {
        msg = "Invalid argument type in invocation";
        return this;
    }

    // A method to produce an exception related to print (expression not an int, space, or newline).
    public Task_1_Exceptions printError()
    {
        msg = "Invalid expression for print";
        return this;
    }

    public Task_1_Exceptions ParensEmptyError()
    {
        msg = "One or more items in Parenthesis are empty";
        return this;
    }


}