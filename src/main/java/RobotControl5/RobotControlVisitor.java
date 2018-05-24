package RobotControl5;

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
        if (ctx.ifStment() != null) return visitIfStment(ctx.ifStment());
        if (ctx.whileStment() != null) return visitWhileStment(ctx.whileStment());
        if (ctx.robotStmentDouble() != null) return visitRobotStmentDouble(ctx.robotStmentDouble());
        if (ctx.robotStmentInt() != null) return visitRobotStmentInt(ctx.robotStmentInt());
        if (ctx.assignement() != null) return visitAssignement(ctx.assignement());
        if (ctx.initiailizeRobot() != null) return visitInitiailizeRobot(ctx.initiailizeRobot());
        return null;
    }

    @Override
    public Var visitScript(robotControlParser.ScriptContext ctx) {
        System.out.println("visited ctx: " + ctx);
        for (int i = 0; i < ctx.stment().size(); i++)
            visitStment(ctx.stment(i));
        return null;

    }

    @Override
    public Var visitIfStment(robotControlParser.IfStmentContext ctx) {

        return super.visitIfStment(ctx);
    }

    @Override
    public Var visitWhileStment(robotControlParser.WhileStmentContext ctx) {
        return super.visitWhileStment(ctx);
    }

    @Override
    public Var visitRobotStmentDouble(robotControlParser.RobotStmentDoubleContext ctx) {
        return super.visitRobotStmentDouble(ctx);
    }

    @Override
    public Var visitRobotStmentInt(robotControlParser.RobotStmentIntContext ctx) {
        return super.visitRobotStmentInt(ctx);
    }

    @Override
    public Var visitMathExpr(robotControlParser.MathExprContext ctx) {
        return super.visitMathExpr(ctx);
    }

    @Override
    public Var visitMathExprInt(robotControlParser.MathExprIntContext ctx) {
        return super.visitMathExprInt(ctx);
    }

    @Override
    public Var visitMathExprDouble(robotControlParser.MathExprDoubleContext ctx) {
        return super.visitMathExprDouble(ctx);
    }

    @Override
    public Var visitExpr(robotControlParser.ExprContext ctx) {
        return super.visitExpr(ctx);
    }

    @Override
    public Var visitAssignement(robotControlParser.AssignementContext ctx) {
        if (ctx.assignementDouble()!= null) return visitAssignementDouble(ctx.assignementDouble());
        if (ctx.assignementInt() != null) return visitAssignementInt(ctx.assignementInt());

        return null;
    }

    @Override
    public Var visitAssignementInt(robotControlParser.AssignementIntContext ctx) {
        if(ctx.VARNAME(0).getText().equals(ctx.VARNAME(1).getText()))
            throw new RobotControlException("Variable: " + ctx.VARNAME(0) + " self-assigned");

        if(varsHashMap.containsKey(ctx.VARNAME(0).getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARNAME(0).getText() +
                    " is already declared.");

        if(ctx.mathExprInt() != null) return visitMathExprInt(ctx.mathExprInt());

        varsHashMap.put(ctx.VARNAME(0).getText(), new Var(Type.INT, ctx.VARNAME(0).getText(), false));

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
    public Var visitStment(robotControlParser.StmentContext ctx) {
        System.out.println("visited visitStment");
        if (ctx.ifStment() != null) return visitIfStment(ctx.ifStment());
        if (ctx.whileStment() != null) return visitWhileStment(ctx.whileStment());
        if (ctx.robotStmentDouble() != null) return visitRobotStmentDouble(ctx.robotStmentDouble());
        if (ctx.robotStmentInt() != null) return visitRobotStmentInt(ctx.robotStmentInt());
        if (ctx.assignement() != null) return visitAssignement(ctx.assignement());
        if (ctx.initiailizeRobot() != null) return visitInitiailizeRobot(ctx.initiailizeRobot());
        return null;
    }

    @Override
    public Var visitScript(robotControlParser.ScriptContext ctx) {
        System.out.println("visited ctx: " + ctx);
        for (int i = 0; i < ctx.stment().size(); i++)
            visitStment(ctx.stment(i));
        return null;

    }

    @Override
    public Var visitIfStment(robotControlParser.IfStmentContext ctx) {

        return super.visitIfStment(ctx);
    }

    @Override
    public Var visitWhileStment(robotControlParser.WhileStmentContext ctx) {
        return super.visitWhileStment(ctx);
    }

    @Override
    public Var visitRobotStmentDouble(robotControlParser.RobotStmentDoubleContext ctx) {
        return super.visitRobotStmentDouble(ctx);
    }

    @Override
    public Var visitRobotStmentInt(robotControlParser.RobotStmentIntContext ctx) {
        return super.visitRobotStmentInt(ctx);
    }

    @Override
    public Var visitMathExpr(robotControlParser.MathExprContext ctx) {
        return super.visitMathExpr(ctx);
    }

    @Override
    public Var visitMathExprInt(robotControlParser.MathExprIntContext ctx) {
        return super.visitMathExprInt(ctx);
    }

    @Override
    public Var visitMathExprDouble(robotControlParser.MathExprDoubleContext ctx) {
        return super.visitMathExprDouble(ctx);
    }

    @Override
    public Var visitExpr(robotControlParser.ExprContext ctx) {
        return super.visitExpr(ctx);
    }

    @Override
    public Var visitAssignement(robotControlParser.AssignementContext ctx) {
        if (ctx.assignementDouble()!= null) return visitAssignementDouble(ctx.assignementDouble());
        if (ctx.assignementInt() != null) return visitAssignementInt(ctx.assignementInt());

        return null;
    }

    @Override
    public Var visitAssignementInt(robotControlParser.AssignementIntContext ctx) {
        if(ctx.VARNAME(0).getText().equals(ctx.VARNAME(1).getText()))
            throw new RobotControlException("Variable: " + ctx.VARNAME(0) + " self-assigned");

        if(varsHashMap.containsKey(ctx.VARNAME(0).getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARNAME(0).getText() +
                    " is already declared.");

        if(ctx.mathExprInt() != null) return visitMathExprInt(ctx.mathExprInt());

        varsHashMap.put(ctx.VARNAME(0).getText(), new Var(Type.INT, ctx.VARNAME(0).getText(), false));

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