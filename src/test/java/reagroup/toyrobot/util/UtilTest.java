package reagroup.toyrobot.util;

import org.junit.Assert;
import org.junit.Test;
import reagroup.toyrobot.model.Position;
import reagroup.toyrobot.model.Robot;
import reagroup.toyrobot.model.Table;

/**
 * Created by Praitheesh on 19/3/17.
 */
public class UtilTest {

    @Test
    public void testValidatePosition() {
        Table table = new Table(10, 10);
        table.setRobot(new Robot());
        Assert.assertTrue(ToyRobotUtil.validateRobotPosition(table, new Position(3, 4, Facing.NORTH)));
    }

    @Test
    public void testValidateBorderXPosition() {
        Table table = new Table(10, 10);
        table.setRobot(new Robot());
        Assert.assertTrue(ToyRobotUtil.validateRobotPosition(table, new Position(10, 4, Facing.EAST)));
    }

    @Test
    public void testValidateBorderYPosition() {
        Table table = new Table(10, 10);
        table.setRobot(new Robot());
        Assert.assertTrue(ToyRobotUtil.validateRobotPosition(table, new Position(10, 10, Facing.EAST)));
    }

    @Test
    public void testValidateBorderMinPosition() {
        Table table = new Table(10, 10);
        table.setRobot(new Robot());
        Assert.assertTrue(ToyRobotUtil.validateRobotPosition(table, new Position(0, 0, Facing.EAST)));
    }

    @Test
    public void testValidateOutOfBorderXPosition() {
        Table table = new Table(10, 10);
        table.setRobot(new Robot());
        Assert.assertFalse(ToyRobotUtil.validateRobotPosition(table, new Position(11, 3, Facing.SOUTH)));
    }

    @Test
    public void testValidateOutOfBorderMinPosition() {
        Table table = new Table(10, 10);
        table.setRobot(new Robot());
        Assert.assertFalse(ToyRobotUtil.validateRobotPosition(table, new Position(-8, -3, Facing.EAST)));
    }
}
