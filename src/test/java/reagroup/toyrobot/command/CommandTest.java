package reagroup.toyrobot.command;

import org.junit.Test;
import reagroup.toyrobot.exception.UnsupportedCommandException;

/**
 * Created by Praitheesh on 18/3/17.
 */
public class CommandTest {

    @Test(expected = UnsupportedCommandException.class)
    public void testUnsupportCommand() throws UnsupportedCommandException {
        CommandFactory factory = new CommandFactory();
        factory.getCommand("INVALID INPUT");
    }
}
