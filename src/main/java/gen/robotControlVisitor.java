package gen;// Generated from E:/Users/Maciej/Studia/TKOM/RobotControl5\robotControl.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link robotControlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface robotControlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link robotControlParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(robotControlParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#ifStment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStment(robotControlParser.IfStmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#whileStment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStment(robotControlParser.WhileStmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#stment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStment(robotControlParser.StmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#robotStmentDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRobotStmentDouble(robotControlParser.RobotStmentDoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#robotStmentInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRobotStmentInt(robotControlParser.RobotStmentIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(robotControlParser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#mathExprInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExprInt(robotControlParser.MathExprIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#mathExprDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExprDouble(robotControlParser.MathExprDoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(robotControlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#assignement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignement(robotControlParser.AssignementContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#assignementInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignementInt(robotControlParser.AssignementIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#assignementString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignementString(robotControlParser.AssignementStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#initiailizeRobot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitiailizeRobot(robotControlParser.InitiailizeRobotContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#assignementDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignementDouble(robotControlParser.AssignementDoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(robotControlParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(robotControlParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link robotControlParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(robotControlParser.VarNameContext ctx);
}