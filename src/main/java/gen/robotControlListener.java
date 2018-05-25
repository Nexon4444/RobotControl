package gen;// Generated from E:/Users/Maciej/Studia/TKOM/RobotControl5\robotControl.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;



public interface robotControlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link robotControlParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(robotControlParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(robotControlParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#ifStment}.
	 * @param ctx the parse tree
	 */
	void enterIfStment(robotControlParser.IfStmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#ifStment}.
	 * @param ctx the parse tree
	 */
	void exitIfStment(robotControlParser.IfStmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#whileStment}.
	 * @param ctx the parse tree
	 */
	void enterWhileStment(robotControlParser.WhileStmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#whileStment}.
	 * @param ctx the parse tree
	 */
	void exitWhileStment(robotControlParser.WhileStmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#stment}.
	 * @param ctx the parse tree
	 */
	void enterStment(robotControlParser.StmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#stment}.
	 * @param ctx the parse tree
	 */
	void exitStment(robotControlParser.StmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#robotStmentDouble}.
	 * @param ctx the parse tree
	 */
	void enterRobotStmentDouble(robotControlParser.RobotStmentDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#robotStmentDouble}.
	 * @param ctx the parse tree
	 */
	void exitRobotStmentDouble(robotControlParser.RobotStmentDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#robotStmentInt}.
	 * @param ctx the parse tree
	 */
	void enterRobotStmentInt(robotControlParser.RobotStmentIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#robotStmentInt}.
	 * @param ctx the parse tree
	 */
	void exitRobotStmentInt(robotControlParser.RobotStmentIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(robotControlParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(robotControlParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#mathExprInt}.
	 * @param ctx the parse tree
	 */
	void enterMathExprInt(robotControlParser.MathExprIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#mathExprInt}.
	 * @param ctx the parse tree
	 */
	void exitMathExprInt(robotControlParser.MathExprIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#mathExprDouble}.
	 * @param ctx the parse tree
	 */
	void enterMathExprDouble(robotControlParser.MathExprDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#mathExprDouble}.
	 * @param ctx the parse tree
	 */
	void exitMathExprDouble(robotControlParser.MathExprDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(robotControlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(robotControlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(robotControlParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(robotControlParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#declarationInt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationInt(robotControlParser.DeclarationIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#declarationInt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationInt(robotControlParser.DeclarationIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#declarationString}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationString(robotControlParser.DeclarationStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#declarationString}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationString(robotControlParser.DeclarationStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#declarationDouble}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationDouble(robotControlParser.DeclarationDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#declarationDouble}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationDouble(robotControlParser.DeclarationDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#assignement}.
	 * @param ctx the parse tree
	 */
	void enterAssignement(robotControlParser.AssignementContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#assignement}.
	 * @param ctx the parse tree
	 */
	void exitAssignement(robotControlParser.AssignementContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#assignementInt}.
	 * @param ctx the parse tree
	 */
	void enterAssignementInt(robotControlParser.AssignementIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#assignementInt}.
	 * @param ctx the parse tree
	 */
	void exitAssignementInt(robotControlParser.AssignementIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#assignementString}.
	 * @param ctx the parse tree
	 */
	void enterAssignementString(robotControlParser.AssignementStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#assignementString}.
	 * @param ctx the parse tree
	 */
	void exitAssignementString(robotControlParser.AssignementStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#initiailizeRobot}.
	 * @param ctx the parse tree
	 */
	void enterInitiailizeRobot(robotControlParser.InitiailizeRobotContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#initiailizeRobot}.
	 * @param ctx the parse tree
	 */
	void exitInitiailizeRobot(robotControlParser.InitiailizeRobotContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#assignementDouble}.
	 * @param ctx the parse tree
	 */
	void enterAssignementDouble(robotControlParser.AssignementDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#assignementDouble}.
	 * @param ctx the parse tree
	 */
	void exitAssignementDouble(robotControlParser.AssignementDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(robotControlParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(robotControlParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotControlParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(robotControlParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotControlParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(robotControlParser.VarTypeContext ctx);
}