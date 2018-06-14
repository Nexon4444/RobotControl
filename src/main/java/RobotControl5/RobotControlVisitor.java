package RobotControl5;

//import com.sun.org.apache.xpath.internal.operations.Variable;

import exceptions.*;
import gen.*;

import java.util.ArrayList;
import java.util.HashMap;

public class RobotControlVisitor extends robotControlBaseVisitor<Var> {
    public final HashMap<String, Var> varsHashMap;

    public RobotControlVisitor() {
        varsHashMap = new HashMap<>();
    }

    @Override
    public Var visitStment(robotControlParser.StmentContext ctx) {
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
        for (int i = 0; i < ctx.stment().size(); i++) {
            visitStment(ctx.stment(i));
        }
        return null;
    }

    @Override
    public Var visitIfStment(robotControlParser.IfStmentContext ctx) {
        if (ctx.expr() != null) visitExpr(ctx.expr());
        if (visitExpr(ctx.expr()).getValue().equals("true"))
            visitScript(ctx.script(0));
        else if (ctx.ELSE() != null)
            visitScript(ctx.script(1));
        return null;
    }

    @Override
    public Var visitWhileStment(robotControlParser.WhileStmentContext ctx) {
        int i = 0;
        while (visitExpr(ctx.expr()).getValue().equals("true")) {
            visitScript(ctx.script());
        }
        return null;
    }

    @Override
    public Var visitRobotStmentDouble(robotControlParser.RobotStmentDoubleContext ctx) {
        Var aux = null;
        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i) + " undeclared");

        if (varsHashMap.get(ctx.VARNAME(0).getText()).getType() != Type.ROBOT)
            throw new InvalidArgumentTypeException("Variable: " + ctx.VARNAME(0) + " is not of type " + Type.ROBOT.toString());

        for (int i = 1; i < ctx.VARNAME().size(); i++)
            if (varsHashMap.get(ctx.VARNAME(i).getText()).getType() != Type.DOUBLE)
                throw new InvalidArgumentTypeException("Variable: " + ctx.VARNAME(i) + " is not of type " + Type.DOUBLE.toString());

        if (ctx.mathExprDouble() != null) aux = visitMathExprDouble(ctx.mathExprDouble());
        if (ctx.FRONT() != null) RobotControlFunctions.front(aux);
        if (ctx.BACK() != null) RobotControlFunctions.back(aux);
        if (ctx.LEFT() != null) RobotControlFunctions.left(aux);
        if (ctx.RIGHT() != null) RobotControlFunctions.right(aux);

        return null;
    }

    @Override
    public Var visitRobotStmentInt(robotControlParser.RobotStmentIntContext ctx) {
        Var aux = null;
        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i) + " undeclared");

        if (varsHashMap.get(ctx.VARNAME(0).getText()).getType() != Type.ROBOT)
            throw new InvalidArgumentTypeException("Variable: " + ctx.VARNAME(0) + " is not of type " + Type.ROBOT.toString());

        for (int i = 1; i < ctx.VARNAME().size(); i++)
            if (varsHashMap.get(ctx.VARNAME(i).getText()).getType() != Type.INT)
                throw new InvalidArgumentTypeException("Variable: " + ctx.VARNAME(i) + " is not of type " + Type.INT.toString());

        if (ctx.mathExprInt() != null) aux = visitMathExprInt(ctx.mathExprInt());
        if (ctx.SETSPEED() != null) RobotControlFunctions.setSpeed(aux);
        return null;
    }

    @Override
    public Var visitMathExpr(robotControlParser.MathExprContext ctx) {
        if (ctx.mathExprInt() != null) return visitMathExprInt(ctx.mathExprInt());
        if (ctx.mathExprDouble() != null) return visitMathExprDouble(ctx.mathExprDouble());
        return null;
    }

    @Override
    public Var visitMathExprInt(robotControlParser.MathExprIntContext ctx) {
        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i) + " undeclared");


        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (varsHashMap.get(ctx.VARNAME(i).getText()).getType() != Type.INT)
                throw new InvalidArgumentTypeException("Variable: " + ctx.VARNAME(i) + " is not of type " + Type.INT.toString());

        Integer first = null, second = null;
        if (ctx.VARNAME(0) != null) {
            first = Integer.parseInt(varsHashMap.get(ctx.VARNAME(0).getText()).getValue());
        }
        if (ctx.INT(0) != null) {
            if (first == null)
                first = Integer.parseInt(ctx.INT(0).getText());
            else
                second = Integer.parseInt(ctx.INT(0).getText());
        }

        if (ctx.VARNAME(1) != null)
            second = Integer.parseInt(varsHashMap.get(ctx.VARNAME(1).getText()).getValue());
        else if (ctx.INT(1) != null)
            second = Integer.parseInt(ctx.INT(1).getText());

        Integer result = 0;
        if (second == null) return new Var(Type.INT, String.valueOf(first));

        else if (!ctx.OPPLUS().isEmpty())
            result = first + second;
        else if (!ctx.OPMINUS().isEmpty())
            result = first - second;
        else if (!ctx.OPMUL().isEmpty())
            result = first * second;
        else if (!ctx.OPDIV().isEmpty())
            result = first / second;

        return new Var(Type.INT, String.valueOf(result));
    }

    @Override
    public Var visitMathExprDouble(robotControlParser.MathExprDoubleContext ctx) {
        var accumulator = new ArrayList<Var>();

        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i) + " undeclared");

        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (varsHashMap.get(ctx.VARNAME(i).getText()).getType() != Type.DOUBLE)
                throw new InvalidArgumentTypeException("Variable: " + ctx.VARNAME(i) + " is not of type " + Type.DOUBLE.toString());

        Double first = null, second = null;
        if (ctx.VARNAME(0) != null)
            first = Double.parseDouble(varsHashMap.get(ctx.VARNAME(0).getText()).getValue());
        if (ctx.DOUBLE(0) != null) {
            if (first == null)
                first = Double.parseDouble(ctx.DOUBLE(0).getText());
            else
                second = Double.parseDouble(ctx.DOUBLE(0).getText());
        }

        if (ctx.VARNAME(1) != null)
            second = Double.parseDouble(varsHashMap.get(ctx.VARNAME(1).getText()).getValue());
        else if (ctx.DOUBLE(1) != null)
            second = Double.parseDouble(ctx.DOUBLE(1).getText());

        double result = 0.0;
        if (second == null) return new Var(Type.DOUBLE, String.valueOf(first));

        else if (!ctx.OPPLUS().isEmpty())
            result = first + second;
        else if (!ctx.OPMINUS().isEmpty())
            result = first - second;
        else if (!ctx.OPMUL().isEmpty())
            result = first * second;
        else if (!ctx.OPDIV().isEmpty())
            result = first / second;

        return new Var(Type.DOUBLE, String.valueOf(result));
    }

    @Override
    public Var visitExpr(robotControlParser.ExprContext ctx) {
        Var mathExpr1 = null, mathExpr2 = null;
        Var ret = null;
        if (ctx.mathExprInt(0) != null) mathExpr1 = visitMathExprInt(ctx.mathExprInt(0));
        if (ctx.mathExprInt(1) != null) mathExpr2 = visitMathExprInt(ctx.mathExprInt(1));
        if (ctx.relOp() != null) ret = visitRelOp(ctx.relOp(), mathExpr1, mathExpr2);

        return ret;
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
//        if (ctx.VARNAME(1) != null) System.out.println("VARNAME(0): " + ctx.VARNAME(0).getText() +
//                "VARNAME(1): " + ctx.VARNAME(1).getText());

        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i) + " undeclared");

        if (ctx.mathExprInt() != null) visitMathExprInt(ctx.mathExprInt());
        if (ctx.VARNAME(1) != null)
            varsHashMap.get(ctx.VARNAME(0).getText()).setValue(varsHashMap.get(ctx.VARNAME(1).getText()).getValue());
        else
            varsHashMap.get(ctx.VARNAME(0).getText()).setValue(visitMathExprInt(ctx.mathExprInt()).getValue());
        return null;
    }

    @Override
    public Var visitAssignementString(robotControlParser.AssignementStringContext ctx) {
        if (!varsHashMap.containsKey(ctx.VARNAME().getText()))
            throw new VariableUndeclaredException("Variable " + ctx.VARNAME() + " undeclared");
        return null;
    }

    @Override
    public Var visitInitiailizeRobot(robotControlParser.InitiailizeRobotContext ctx) {
        if (varsHashMap.containsKey(ctx.VARNAME(0).getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARNAME(0).getText() +
                    " is already declared.");
        if (ctx.VARNAME(1) != null)
            if (varsHashMap.get(ctx.VARNAME(1).getText()).getType() != Type.STRING)
                throw new InvalidArgumentTypeException("Variable: " + ctx.VARNAME() + " is not of type " + Type.STRING.toString());

        varsHashMap.put(ctx.VARNAME(0).getText(), new Var(Type.ROBOT, ctx.STRING().toString(), false));
        return null;
    }

    @Override
    public Var visitAssignementDouble(robotControlParser.AssignementDoubleContext ctx) {
        for (int i = 0; i < ctx.VARNAME().size(); i++)
            if (!varsHashMap.containsKey(ctx.VARNAME(i).getText()))
                throw new VariableUndeclaredException("Variable " + ctx.VARNAME(i).getText() + " undeclared");

        if (ctx.VARNAME(1) != null)
            varsHashMap.get(ctx.VARNAME(0).getText()).setValue(varsHashMap.get(ctx.VARNAME(1).getText()).getValue());
        else
            varsHashMap.get(ctx.VARNAME(0).getText()).setValue(visitMathExprDouble(ctx.mathExprDouble()).getValue());
        return null;
    }

    //    @Override
    public Var visitRelOp(robotControlParser.RelOpContext ctx, Var mathExpr1, Var mathExpr2) {
        if (ctx.OPEQUAL() != null) {
            if (mathExpr1.compareTo(mathExpr2) == 0)
                return new Var(Type.BOOLEAN, "true");
            else
                return new Var(Type.BOOLEAN, "false");
        } else if (ctx.OPGREATER() != null) {
            if (mathExpr1.compareTo(mathExpr2) > 0)
                return new Var(Type.BOOLEAN, "true");
            else
                return new Var(Type.BOOLEAN, "false");
        } else if (ctx.OPSMALLER() != null) {
            if (mathExpr1.compareTo(mathExpr2) < 0)
                return new Var(Type.BOOLEAN, "true");
            else
                return new Var(Type.BOOLEAN, "false");
        }
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
//        if (ctx.VARNAME(1) != null) System.out.println("VARNAME(0): " + ctx.VARNAME(0).getText().toString() +
//                "VARNAME(1): " + ctx.VARNAME(1).getText().toString());
        if (ctx.VARNAME(1) != null) if (ctx.VARNAME(0).getText().equals(ctx.VARNAME(1).getText()))
            throw new RobotControlException("Variable: " + ctx.VARNAME(0) + " self-assigned");
        if (varsHashMap.containsKey(ctx.VARNAME(0).getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARNAME(0).getText() +
                    " is already declared.");

        if (ctx.mathExprInt() != null) {
            varsHashMap.put(ctx.VARNAME(0).getText(), visitMathExprInt(ctx.mathExprInt()));
        } else varsHashMap.put(ctx.VARNAME(0).getText(), new Var(Type.INT, ctx.VARNAME(0).getText(), false));

        return null;
    }

    @Override
    public Var visitDeclarationString(robotControlParser.DeclarationStringContext ctx) {
        if (varsHashMap.containsKey(ctx.VARNAME().getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARNAME().getText() +
                    " is already declared.");

        varsHashMap.put(ctx.VARNAME().getText(), new Var(Type.STRING, ctx.VARNAME().getText(), false));
        return null;
    }

    @Override
    public Var visitDeclarationDouble(robotControlParser.DeclarationDoubleContext ctx) {
//        if (ctx.VARNAME(1) != null) System.out.println("VARNAME(0): " + ctx.VARNAME(0).getText().toString() +
//                "VARNAME(1): " + ctx.VARNAME(1).getText().toString());
        if (ctx.VARNAME(1) != null) if (ctx.VARNAME(0).getText().equals(ctx.VARNAME(1).getText()))
            throw new RobotControlException("Variable: " + ctx.VARNAME(0) + " self-assigned");
        if (varsHashMap.containsKey(ctx.VARNAME(0).getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARNAME(0).getText() +
                    " is already declared.");

        if (ctx.mathExprDouble() != null) {
            varsHashMap.put(ctx.VARNAME(0).getText(), visitMathExprDouble(ctx.mathExprDouble()));
        } else varsHashMap.put(ctx.VARNAME(0).getText(), new Var(Type.DOUBLE, ctx.VARNAME(0).getText(), false));

        return null;
    }
}