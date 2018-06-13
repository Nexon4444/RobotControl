package RobotControl5;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import gen.*;
import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class App 
{
    public static void main( String[] args ) throws IOException {

        CharStream charStream = fromFileName("example2.txt");
        robotControlLexer rlexer = new robotControlLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(rlexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        System.out.println("tokenSteam: " + tokenStream.toString());
        robotControlParser robotControlParser = new robotControlParser(tokenStream);


//        JFrame frame = new JFrame("RobotControl Tree");
//        JPanel panel = new JPanel();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(robotControlParser.getRuleNames()), robotControlParser.script());
//        viewr.setScale(2.5);
//        panel.add(viewr);
//        frame.add(new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 200);
//        frame.setVisible(true);

        RobotControlVisitor visitor = new RobotControlVisitor();
        visitor.visit(robotControlParser.script());
    }

}
