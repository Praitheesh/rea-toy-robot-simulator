package reagroup.toyrobot.command;

import org.junit.Assert;
import org.junit.Test;
import reagroup.toyrobot.exception.UnsupportedCommandException;

/**
 * Created by Praitheesh on 18/3/17.
 */
public class CommandFactoryTest {

    @Test(expected = UnsupportedCommandException.class)
    public void testUnsupportCommand() throws UnsupportedCommandException {
        CommandFactory factory = new CommandFactory();
        factory.getCommand("INVALID INPUT");
    }

    @Test
    public void testMoveCommand() throws UnsupportedCommandException {
        CommandFactory factory = new CommandFactory();
        Assert.assertTrue(factory.getCommand("MOVE") instanceof MoveCommand);
        Assert.assertTrue(factory.getCommand("PLACE 4,5,NOTH") instanceof PlaceCommand);
        Assert.assertTrue(factory.getCommand("LEFT") instanceof TurnCommand);
        Assert.assertTrue(factory.getCommand("RIGHT") instanceof TurnCommand);
        Assert.assertTrue(factory.getCommand("REPORT") instanceof ReportCommand);
    }

}
