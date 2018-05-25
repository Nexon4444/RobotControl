package RobotControl5;

import static org.junit.jupiter.api.Assertions.assertThrows;

import exceptions.VariableUndeclaredException;
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
}
