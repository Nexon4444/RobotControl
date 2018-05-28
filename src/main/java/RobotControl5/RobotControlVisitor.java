package RobotControl5;

import com.sun.org.apache.xpath.internal.operations.Variable;
import exceptions.*;
import gen.*;

import java.util.HashMap;

public class RobotControlVisitor extends robotControlBaseVisitor<Var> {
    private final HashMap<String, Var> varsHashMap;


    public RobotControlVisitor() {
        varsHashMap = new HashMap<>();
    }

    @Override
    public Var visitStment(robotControlParser.StmentContext ctx) {
        System.out.println("visited visitStment");
        if (ctx.ifStment() != null) visitIfStment(ctx.ifStment());
        if (ctx.whileStment() != null) visitWhileStment(ctx.whileStment());
        if (ctx.robotStmentDouble() != null) visitRobotStmentDouble(ctx.robotStmentDouble());
        if (ctx.robotStmentInt() != null) visitRobotStmentInt(ctx.robotStmentInt());
        if (ctx.assignement() != null) visitAssignement(ctx.assignement());
        if (ctx.declaration() != null) visitDeclaration(ctx.declaration());
        if (ctx.initiailizeRobot() != null) visitInitiailizeRobot(ctx.initiailizeRobot());
        return null;
    }

    @Override
    public Var visitScript(robotControlParser.ScriptContext ctx) {
        System.out.println("visited ctx: " + ctx);
        for (int i = 0; i < ctx.stment().size(); i++)
        {
            System.out.println("ScriptContext: " + ctx.stment(i).getText());
            visitStment(ctx.stment(i));
        }

        return null;

    }

    @Override
    public Var visitIfStment(robotControlParser.IfStmentContext ctx) {

        if (ctx.expr() != null) visitExpr(ctx.expr());
        for (int i = 0; i < ctx.stment().size(); i++)
            visitStment(ctx.stment(i));
        return null;
    }

    @Override
    public Var visitWhileStment(robotControlParser.WhileStmentContext ctx) {
        if(ctx.expr() != null) visitExpr(ctx.expr());
//        if(ctx.mathExpr() != null) visitMathExpr(ctx.mathExpr());
        for (int i = 0; i < ctx.stment().size(); i++)
            visitStment(ctx.stment(i));
        return null;
    }

    @Override
    public Var visitRobotStmentDouble(robotControlParser.RobotStmentDoubleContext ctx) {

        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i) + " undeclared");

        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (varsHashMap.get(ctx.VARNAME(i).getText()).getType() != Type.DOUBLE)
                throw new InvalidArgumentTypeException("Variable: " + ctx.VARNAME(i) + " is not of type " + Type.INT.toString());

        if (ctx.mathExprDouble() != null) visitMathExprDouble(ctx.mathExprDouble());
        return null;
    }

    @Override
    public Var visitRobotStmentInt(robotControlParser.RobotStmentIntContext ctx) {
        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i) + " undeclared");

        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (varsHashMap.get(ctx.VARNAME(i).getText()).getType() != Type.INT)
                throw new InvalidArgumentTypeException("Variable: " + ctx.VARNAME(i) + " is not of type " + Type.INT.toString());

        if (ctx.mathExpr() != null) visitMathExpr(ctx.mathExpr());
        return null;
    }

    @Override
    public Var visitMathExpr(robotControlParser.MathExprContext ctx) {
        //if (varsHashMap.containsKey(ctx.))
        if (ctx.mathExprInt() != null) visitMathExprInt(ctx.mathExprInt());
        if (ctx.mathExprDouble() != null) visitMathExprDouble(ctx.mathExprDouble());
        return null;
    }

    @Override
    public Var visitMathExprInt(robotControlParser.MathExprIntContext ctx) {
        System.out.println("MathExprIntContext: " + ctx.getText());
        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
            {
                System.out.println(ctx.VARNAME(i).getText());
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i) + " undeclared");
            }


        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (varsHashMap.get(ctx.VARNAME(i).getText()).getType() != Type.INT)
                throw new InvalidArgumentTypeException("Variable: " + ctx.VARNAME(i) + " is not of type " + Type.INT.toString());
        //if (!varsHashMap.containsKey(ctx.VARNAME(1))) throw new VariableUndeclaredException("Variable " + ctx.VARNAME(1) + " undeclared");
        return null;
    }

    @Override
    public Var visitMathExprDouble(robotControlParser.MathExprDoubleContext ctx) {
        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i) + " undeclared");

        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (varsHashMap.get(ctx.VARNAME(i).getText()).getType() != Type.DOUBLE)
                throw new InvalidArgumentTypeException("Variable: " + ctx.VARNAME(i) + " is not of type " + Type.DOUBLE.toString());

        //if (!varsHashMap.containsKey(ctx.VARNAME(1))) throw new VariableUndeclaredException("Variable " + ctx.VARNAME(1) + " undeclared");
        return null;
    }

    @Override
    public Var visitExpr(robotControlParser.ExprContext ctx) {
        if (ctx.mathExprInt(0) != null) visitMathExprInt(ctx.mathExprInt(0));
        if (ctx.relOp() != null) visitRelOp(ctx.relOp());
        if (ctx.mathExprInt(1) != null) visitMathExprInt(ctx.mathExprInt(1));
      /*  if(!varsHashMap.containsKey(ctx..getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME(i).getText() +
                    " is not declared.");

        if (variablesHashMap.get(ctx.VARIABLE_NAME(i).getText()).getType() != Type.INTEGER)
            throw new TTException("Variable: " + ctx.VARIABLE_NAME(i).getText() +
                    " is of wrong type (Should be Integer)");

        if(variablesHashMap.get(ctx.VARIABLE_NAME(i).getText()).getNull())
            throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME(i).getText());
   */
        return null;
    }

    @Override
    public Var visitAssignement(robotControlParser.AssignementContext ctx) {
        if (ctx.assignementDouble() != null) return visitAssignementDouble(ctx.assignementDouble());
        if (ctx.assignementInt() != null) return visitAssignementInt(ctx.assignementInt());
        if (ctx.assignementString() != null) return visitAssignementString(ctx.assignementString());
        return null;
    }

    @Override
    public Var visitAssignementInt(robotControlParser.AssignementIntContext ctx) {
        if (ctx.VARNAME(1) != null) System.out.println("VARNAME(0): " + ctx.VARNAME(0).getText().toString() +
                "VARNAME(1): " + ctx.VARNAME(1).getText());

        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i) + " undeclared");

        if (ctx.mathExprInt() != null) visitMathExprInt(ctx.mathExprInt());
        System.out.println("Varname 0: " + ctx.VARNAME(0).getText().toString());
//        varsHashMap.put(ctx.VARNAME(0).getText(), new Var(Type.INT, ctx.VARNAME(0).getText(), false));

        return null; //varsHashMap.get(ctx.VARNAME(0).getText());
    }

    @Override
    public Var visitAssignementString(robotControlParser.AssignementStringContext ctx) {

        if (!varsHashMap.containsKey(ctx.VARNAME().getText()))
            throw new VariableUndeclaredException("Variable " + ctx.VARNAME() + " undeclared");

        return null;
    }

    @Override
    public Var visitInitiailizeRobot(robotControlParser.InitiailizeRobotContext ctx) {

        if (varsHashMap.containsKey(ctx.VARNAME().getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARNAME().getText() +
                    " is already declared.");
        System.out.println("InitiailizeRobotContext.VARNAME: " + ctx.VARNAME());
        if (ctx.VARNAME()!= null)
            if (varsHashMap.get(ctx.VARNAME().getText()).getType() != Type.STRING)
                throw new InvalidArgumentTypeException("Variable: " + ctx.VARNAME() + " is not of type " + Type.STRING.toString());
        return null;
    }

    @Override
    public Var visitAssignementDouble(robotControlParser.AssignementDoubleContext ctx) {
        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i).getText() + " undeclared");


        return null;
    }

    @Override
    public Var visitRelOp(robotControlParser.RelOpContext ctx) {

        return null;
    }

    @Override
    public Var visitVarType(robotControlParser.VarTypeContext ctx) {
        return null;
    }

    @Override
    public Var visitDeclaration(robotControlParser.DeclarationContext ctx) {
        if (ctx.declarationInt() != null) visitDeclarationInt(ctx.declarationInt());
        if (ctx.declarationDouble() != null) visitDeclarationDouble(ctx.declarationDouble());
        if (ctx.declarationString() != null) visitDeclarationString(ctx.declarationString());
        return null;
    }

    @Override
    public Var visitDeclarationInt(robotControlParser.DeclarationIntContext ctx) {
        if (varsHashMap.containsKey(ctx.VARNAME(0).getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARNAME(0).getText() +
                    " is already declared.");

        if (ctx.mathExprInt() != null) visitMathExprInt(ctx.mathExprInt());
        for (int i = 1; i < ctx.VARNAME().size(); i++) {
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i).getText() + " undeclared");
        }
        varsHashMap.put(ctx.VARNAME(0).getText(), new Var(Type.INT, ctx.VARNAME(0).getText(), false));

        return null; //varsHashMap.get(ctx.VARNAME(0).getText());
    }

    @Override
    public Var visitDeclarationString(robotControlParser.DeclarationStringContext ctx) {
        if (varsHashMap.containsKey(ctx.VARNAME().getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARNAME().getText() +
                    " is already declared.");

//        if(ctx.() != null) return visitMathExprInt(ctx.mathExprInt());

        varsHashMap.put(ctx.VARNAME().getText(), new Var(Type.STRING, ctx.VARNAME().getText(), false));

        return null; //varsHashMap.get(ctx.VARNAME(0).getText());
    }


    @Override
    public Var visitDeclarationDouble(robotControlParser.DeclarationDoubleContext ctx) {
        if (ctx.VARNAME(1) != null) System.out.println("VARNAME(0): " + ctx.VARNAME(0).getText().toString() +
                "VARNAME(1): " + ctx.VARNAME(1).getText().toString());
        if (ctx.VARNAME(1) != null) if (ctx.VARNAME(0).getText().equals(ctx.VARNAME(1).getText()))
            throw new RobotControlException("Variable: " + ctx.VARNAME(0) + " self-assigned");
        //System.out.println(varsHashMap.toString());
        if (varsHashMap.containsKey(ctx.VARNAME(0).getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARNAME(0).getText() +
                    " is already declared.");

        if (ctx.mathExprDouble() != null) visitMathExprDouble(ctx.mathExprDouble());
        System.out.println("Varname 0: " + ctx.VARNAME(0).getText());
        varsHashMap.put(ctx.VARNAME(0).getText(), new Var(Type.DOUBLE, ctx.VARNAME(0).getText(), false));

        return null; //varsHashMap.get(ctx.VARNAME(0).getText());
    }
}
/*package RobotControl5;

import exceptions.*;
import gen.*;

import java.util.HashMap;

public class RobotControlVisitor extends robotControlBaseVisitor<Var> {
    private final HashMap<String, Var> varsHashMap;


    public RobotControlVisitor() {
        varsHashMap = new HashMap<>();
    }

    @Override
    public Var visitInitiailizeRobot(robotControlParser.InitiailizeRobotContext ctx) {
        return super.visitInitiailizeRobot(ctx);
    }

    @Override
    public Var visitAssignementDouble(robotControlParser.AssignementDoubleContext ctx) {
        if (ctx.VARNAME(1) != null) System.out.println("VARNAME(0): " + ctx.VARNAME(0).getText().toString() +
                "VARNAME(1): " + ctx.VARNAME(1).getText().toString());
        if (ctx.VARNAME(1) != null) if (ctx.VARNAME(0).getText().equals(ctx.VARNAME(1).getText()))
            throw new RobotControlException("Variable: " + ctx.VARNAME(0) + " self-assigned");
        //System.out.println(varsHashMap.toString());
        if (varsHashMap.containsKey(ctx.VARNAME(0).getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARNAME(0).getText() +
                    " is already declared.");

        if (ctx.mathExprDouble() != null) visitMathExprDouble(ctx.mathExprDouble());
        System.out.println("Varname 0: " + ctx.VARNAME(0).getText().toString());
        varsHashMap.put(ctx.VARNAME(0).getText(), new Var(Type.DOUBLE, ctx.VARNAME(0).getText(), false));

        return null; //varsHashMap.get(ctx.VARNAME(0).getText());
    }

    @Override
    public Var visitAssignementString(robotControlParser.AssignementStringContext ctx) {
        return super.visitAssignementString(ctx);
    }

    @Override
    public Var visitInitiailizeRobot(robotControlParser.InitiailizeRobotContext ctx) {
        return super.visitInitiailizeRobot(ctx);
    }

    @Override
    public Var visitAssignementDouble(robotControlParser.AssignementDoubleContext ctx) {
        return super.visitAssignementDouble(ctx);
    }

    @Override
    public Var visitRelOp(robotControlParser.RelOpContext ctx) {
        return super.visitRelOp(ctx);
    }

    @Override
    public Var visitVarType(robotControlParser.VarTypeContext ctx) {
        return super.visitVarType(ctx);
    }

    @Override
    public Var visitVarName(robotControlParser.VarNameContext ctx) {
        if(varsHashMap.containsKey(ctx.VARNAME().getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARNAME().getText() +
                    " is already declared.");
        return null;
    }

}
*/