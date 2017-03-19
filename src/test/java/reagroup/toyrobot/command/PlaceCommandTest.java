package reagroup.toyrobot.command;

import org.junit.Assert;
import org.junit.Test;
import reagroup.toyrobot.exception.UnsupportedCommandException;
import reagroup.toyrobot.model.Position;
import reagroup.toyrobot.util.Facing;

import java.util.Optional;

/**
 * Created by Praitheesh on 19/3/17.
 */
public class PlaceCommandTest {
    @Test
    public void testValidPlaceCommand1() throws UnsupportedCommandException {


        String VALID_PLACE_1 = "PLACE 2,3,EAST";
        String VALID_PLACE_2 = "PLACE 0, 0 ,NORTH";
        String VALID_PLACE_3 = "PLACE 5, 5 ,WEST";
        String VALID_PLACE_4 = "PLACE 0,5,  SOUTH";

        PlaceCommand placeCommand1 = new PlaceCommand(VALID_PLACE_1);
        Optional<Position> position1 = placeCommand1.execute(null);
        Assert.assertEquals(2, position1.get().getX());
        Assert.assertEquals(3, position1.get().getY());
        Assert.assertEquals(Facing.EAST, position1.get().getFacing());

        PlaceCommand placeCommand2 = new PlaceCommand(VALID_PLACE_2);
        Optional<Position> position2 = placeCommand2.execute(null);
        Assert.assertEquals(0, position2.get().getX());
        Assert.assertEquals(0, position2.get().getY());
        Assert.assertEquals(Facing.NORTH, position2.get().getFacing());

        PlaceCommand placeCommand3 = new PlaceCommand(VALID_PLACE_3);
        Optional<Position> position3 = placeCommand3.execute(null);
        Assert.assertEquals(5, position3.get().getX());
        Assert.assertEquals(5, position3.get().getY());
        Assert.assertEquals(Facing.WEST, position3.get().getFacing());

        PlaceCommand placeCommand4 = new PlaceCommand(VALID_PLACE_4);
        Optional<Position> position4 = placeCommand4.execute(null);
        Assert.assertEquals(0, position4.get().getX());
        Assert.assertEquals(5, position4.get().getY());
        Assert.assertEquals(Facing.SOUTH, position4.get().getFacing());

    }

    @Test(expected = UnsupportedCommandException.class)
    public void testInvalidPlaceCommand1() throws UnsupportedCommandException {
        String INVALID_PLACE = "PLACE2,3,EAST";

        PlaceCommand placeCommand = new PlaceCommand(INVALID_PLACE);
        Optional<Position> position = placeCommand.execute(null);
        Assert.assertEquals(2, position.get().getX());
        Assert.assertEquals(3, position.get().getY());
        Assert.assertEquals(Facing.EAST, position.get().getFacing());
    }

    @Test(expected = UnsupportedCommandException.class)
    public void testInvalidPlaceCommand2() throws UnsupportedCommandException {
        String INVALID_PLACE = "PLACE e2,3, NORTH";

        PlaceCommand placeCommand = new PlaceCommand(INVALID_PLACE);
        Optional<Position> position = placeCommand.execute(null);
        Assert.assertEquals(2, position.get().getX());
        Assert.assertEquals(3, position.get().getY());
        Assert.assertEquals(Facing.NORTH, position.get().getFacing());
    }

    @Test(expected = UnsupportedCommandException.class)
    public void testInvalidPlaceCommand3() throws UnsupportedCommandException {
        String INVALID_PLACE = "PLACE 12234,3, NORTH";

        PlaceCommand placeCommand = new PlaceCommand(INVALID_PLACE);
        Optional<Position> position = placeCommand.execute(null);
        Assert.assertEquals(12234, position.get().getX());
        Assert.assertEquals(3, position.get().getY());
        Assert.assertEquals(Facing.NORTH, position.get().getFacing());
    }

    @Test(expected = UnsupportedCommandException.class)
    public void testInvalidPlaceCommand4() throws UnsupportedCommandException {
        String INVALID_PLACE = "PLACE 3,-3, SOUTH";

        PlaceCommand placeCommand = new PlaceCommand(INVALID_PLACE);
        Optional<Position> position = placeCommand.execute(null);
        Assert.assertEquals(3, position.get().getX());
        Assert.assertEquals(-3, position.get().getY());
        Assert.assertEquals(Facing.SOUTH, position.get().getFacing());
    }

    @Test(expected = UnsupportedCommandException.class)
    public void testInvalidPlaceCommand5() throws UnsupportedCommandException {
        String INVALID_PLACE = "PLACE 3,3, SOUTHEAST";

        PlaceCommand placeCommand = new PlaceCommand(INVALID_PLACE);
        Optional<Position> position = placeCommand.execute(null);
        Assert.assertEquals(3, position.get().getX());
        Assert.assertEquals(3, position.get().getY());
        Assert.assertEquals(Facing.EAST, position.get().getFacing());
    }

}
