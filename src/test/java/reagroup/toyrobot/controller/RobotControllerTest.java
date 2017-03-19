package reagroup.toyrobot.controller;

import org.junit.Assert;
import org.junit.Test;
import reagroup.toyrobot.command.MoveCommand;
import reagroup.toyrobot.command.PlaceCommand;
import reagroup.toyrobot.command.ReportCommand;
import reagroup.toyrobot.command.TurnCommand;
import reagroup.toyrobot.exception.PositionOutOfBoundException;
import reagroup.toyrobot.exception.UnsupportedCommandException;
import reagroup.toyrobot.model.Robot;
import reagroup.toyrobot.model.Table;
import reagroup.toyrobot.util.Facing;
import reagroup.toyrobot.util.TurnEnum;

/**
 * Created by Praitheesh on 19/3/17.
 */
public class RobotControllerTest {

    Table table = new Table(5,5);
    RobotController controller = new RobotController();

    @Test
    public void testPlaceRobotTest() throws PositionOutOfBoundException, UnsupportedCommandException {
        table.setRobot(new Robot());
        controller.operateRobot(table,new PlaceCommand("PLACE 3,4,NORTH"));
        Assert.assertEquals(3,table.getRobot().getPosition().getX());
        Assert.assertEquals(4,table.getRobot().getPosition().getY());
        Assert.assertEquals(Facing.NORTH,table.getRobot().getPosition().getFacing());
    }

    @Test(expected = UnsupportedCommandException.class)
    public void testWithOutPlaceFirstTest() throws PositionOutOfBoundException, UnsupportedCommandException {
        table.setRobot(new Robot());
        controller.operateRobot(table,new PlaceCommand("MOVE"));
        Assert.assertEquals(3,table.getRobot().getPosition().getX());
        Assert.assertEquals(4,table.getRobot().getPosition().getY());
        Assert.assertEquals(Facing.NORTH,table.getRobot().getPosition().getFacing());
    }

    @Test
    public void testMove() throws PositionOutOfBoundException, UnsupportedCommandException{
        table.setRobot(new Robot());
        controller.operateRobot(table,new PlaceCommand("PLACE 4,4,EAST"));
        controller.operateRobot(table,new MoveCommand());
        Assert.assertEquals(5,table.getRobot().getPosition().getX());
        Assert.assertEquals(4,table.getRobot().getPosition().getY());
        Assert.assertEquals(Facing.EAST,table.getRobot().getPosition().getFacing());
    }

    @Test(expected = PositionOutOfBoundException.class)
    public void testPlaceMoveTurn() throws PositionOutOfBoundException, UnsupportedCommandException{
        table.setRobot(new Robot());
        controller.operateRobot(table,new PlaceCommand("PLACE 4,4,EAST"));
        controller.operateRobot(table,new MoveCommand());
        Assert.assertEquals(5,table.getRobot().getPosition().getX());
        Assert.assertEquals(4,table.getRobot().getPosition().getY());
        Assert.assertEquals(Facing.EAST,table.getRobot().getPosition().getFacing());

        controller.operateRobot(table,new TurnCommand(TurnEnum.LEFT));
        controller.operateRobot(table,new MoveCommand());
        Assert.assertEquals(5,table.getRobot().getPosition().getX());
        Assert.assertEquals(5,table.getRobot().getPosition().getY());
        Assert.assertEquals(Facing.NORTH,table.getRobot().getPosition().getFacing());

        controller.operateRobot(table,new MoveCommand());
    }

    @Test
    public void testExampleA() throws PositionOutOfBoundException, UnsupportedCommandException {
        table.setRobot(new Robot());
        controller.operateRobot(table,new PlaceCommand("PLACE 0,0,NORTH"));
        controller.operateRobot(table,new MoveCommand());
        controller.operateRobot(table,new ReportCommand());
        Assert.assertEquals(0,table.getRobot().getPosition().getX());
        Assert.assertEquals(1,table.getRobot().getPosition().getY());
        Assert.assertEquals(Facing.NORTH,table.getRobot().getPosition().getFacing());
    }

    @Test
    public void testExampleB() throws PositionOutOfBoundException, UnsupportedCommandException {
        table.setRobot(new Robot());
        controller.operateRobot(table,new PlaceCommand("PLACE 0,0,NORTH"));
        controller.operateRobot(table,new TurnCommand(TurnEnum.LEFT));
        controller.operateRobot(table,new ReportCommand());
        Assert.assertEquals(0,table.getRobot().getPosition().getX());
        Assert.assertEquals(0,table.getRobot().getPosition().getY());
        Assert.assertEquals(Facing.WEST,table.getRobot().getPosition().getFacing());
    }

    @Test
    public void testExampleC() throws PositionOutOfBoundException, UnsupportedCommandException {
        table.setRobot(new Robot());
        controller.operateRobot(table,new PlaceCommand("PLACE 1,2,EAST"));
        controller.operateRobot(table,new MoveCommand());
        controller.operateRobot(table,new MoveCommand());
        controller.operateRobot(table,new TurnCommand(TurnEnum.LEFT));
        controller.operateRobot(table,new MoveCommand());
        controller.operateRobot(table,new ReportCommand());
        Assert.assertEquals(3,table.getRobot().getPosition().getX());
        Assert.assertEquals(3,table.getRobot().getPosition().getY());
        Assert.assertEquals(Facing.NORTH,table.getRobot().getPosition().getFacing());
    }
}
