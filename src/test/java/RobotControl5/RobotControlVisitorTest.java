package RobotControl5;

import static org.junit.jupiter.api.Assertions.assertThrows;

import exceptions.InvalidArgumentTypeException;
import exceptions.MultipleVariableDeclarationException;
import exceptions.VariableUndeclaredException;
import gen.robotControlLexer;
import gen.robotControlParser;
import org.antlr.v4.runtime.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class RobotControlVisitorTest {
    @Test
    public void shouldThrowVariableUndeclaredException() throws IOException {

        CharStream charStream = CharStreams.fromFileName("test1.txt");
        robotControlLexer RClexer = new robotControlLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(RClexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        robotControlParser RCparser = new robotControlParser(tokenStream);

        assertThrows(VariableUndeclaredException.class,
                ()->{
                    RobotControlVisitor visitor = new RobotControlVisitor();
                    visitor.visit(RCparser.script());
                });
    }

    @Test
    void visitAssignement() {
    }

    @Test
    void visitAssignementIntshouldThrowVariableUndeclaredException() throws IOException {
        CharStream charStream = CharStreams.fromFileName("test1.txt");
        robotControlLexer RClexer = new robotControlLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(RClexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        robotControlParser RCparser = new robotControlParser(tokenStream);

        assertThrows(VariableUndeclaredException.class,
                ()->{
                    RobotControlVisitor visitor = new RobotControlVisitor();
                    visitor.visit(RCparser.script());
                });
    }

    @Test
    void visitAssignementStringshouldThrowVariableUndeclaredException() throws IOException {
        CharStream charStream = CharStreams.fromFileName("test2.txt");
        robotControlLexer RClexer = new robotControlLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(RClexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        robotControlParser RCparser = new robotControlParser(tokenStream);

        assertThrows(VariableUndeclaredException.class,
                ()->{
                    RobotControlVisitor visitor = new RobotControlVisitor();
                    visitor.visit(RCparser.script());
                });
    }

    @Test
    void visitAssignementDoubleshouldThrowVariableUndeclaredException() throws IOException {
        CharStream charStream = CharStreams.fromFileName("test3.txt");
        robotControlLexer RClexer = new robotControlLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(RClexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        robotControlParser RCparser = new robotControlParser(tokenStream);

        assertThrows(VariableUndeclaredException.class,
                ()->{
                    RobotControlVisitor visitor = new RobotControlVisitor();
                    visitor.visit(RCparser.script());
                });
    }

    @Test
    void visitDeclarationIntShouldThrowMultipleVariableDeclarationException() throws IOException {
        CharStream charStream = CharStreams.fromFileName("test4.txt");
        robotControlLexer RClexer = new robotControlLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(RClexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        robotControlParser RCparser = new robotControlParser(tokenStream);

        assertThrows(MultipleVariableDeclarationException.class,
                ()->{
                    RobotControlVisitor visitor = new RobotControlVisitor();
                    visitor.visit(RCparser.script());
                });

    }

    @Test
    void visitDeclarationStringShouldThrowMultipleVariableDeclarationException() throws IOException {
        CharStream charStream = CharStreams.fromFileName("test5.txt");
        robotControlLexer RClexer = new robotControlLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(RClexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        robotControlParser RCparser = new robotControlParser(tokenStream);

        assertThrows(MultipleVariableDeclarationException.class,
                ()->{
                    RobotControlVisitor visitor = new RobotControlVisitor();
                    visitor.visit(RCparser.script());
                });
    }

    @Test
    void visitDeclarationDoubleShouldThrowMultipleVariableDeclarationException() throws IOException {
        CharStream charStream = CharStreams.fromFileName("test6.txt");
        robotControlLexer RClexer = new robotControlLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(RClexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        robotControlParser RCparser = new robotControlParser(tokenStream);

        assertThrows(MultipleVariableDeclarationException.class,
                ()->{
                    RobotControlVisitor visitor = new RobotControlVisitor();
                    visitor.visit(RCparser.script());
                });
    }

    @Test
    void visitRobotStmentDoubleShouldThrowInvalidArgumentTypeException() throws IOException {
        CharStream charStream = CharStreams.fromFileName("test7.txt");
        robotControlLexer RClexer = new robotControlLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(RClexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        robotControlParser RCparser = new robotControlParser(tokenStream);

        assertThrows(InvalidArgumentTypeException.class,
                ()->{
                    RobotControlVisitor visitor = new RobotControlVisitor();
                    visitor.visit(RCparser.script());
                });
    }

    @Test
    void visitRobotStmentIntShouldThrowInvalidArgumentTypeException() throws IOException {
        CharStream charStream = CharStreams.fromFileName("test8.txt");
        robotControlLexer RClexer = new robotControlLexer(charStream);
        TokenSource tokenSource = new ListTokenSource(RClexer.getAllTokens());
        TokenStream tokenStream = new CommonTokenStream(tokenSource);
        robotControlParser RCparser = new robotControlParser(tokenStream);

        assertThrows(InvalidArgumentTypeException.class,
                ()->{
                    RobotControlVisitor visitor = new RobotControlVisitor();
                    visitor.visit(RCparser.script());
                });
    }
}
