package reagroup.toyrobot.command;

import org.junit.Assert;
import org.junit.Test;
import reagroup.toyrobot.model.Position;
import reagroup.toyrobot.util.Facing;

import java.util.Optional;

/**
 * Created by Praitheesh on 19/3/17.
 */
public class MoveCommandTest {

    @Test
    public void testMoveNorth() {
        Position currentPosition = new Position(0, 0, Facing.NORTH);
        MoveCommand move = new MoveCommand();
        Optional<Position> newPosition = move.execute(currentPosition);
        Assert.assertEquals(0, newPosition.get().getX());
        Assert.assertEquals(1, newPosition.get().getY());
        Assert.assertEquals(Facing.NORTH, newPosition.get().getFacing());
    }

    @Test
    public void testMoveEast(){
        Position currentPosition = new Position(2, 5, Facing.EAST);
        MoveCommand move = new MoveCommand();
        Optional<Position> newPosition = move.execute(currentPosition);
        Assert.assertEquals(3, newPosition.get().getX());
        Assert.assertEquals(5, newPosition.get().getY());
        Assert.assertEquals(Facing.EAST, newPosition.get().getFacing());
    }

    @Test
    public void testMoveSouth(){
        Position currentPosition = new Position(0, 1, Facing.SOUTH);
        MoveCommand move = new MoveCommand();
        Optional<Position> newPosition = move.execute(currentPosition);
        Assert.assertEquals(0, newPosition.get().getX());
        Assert.assertEquals(0, newPosition.get().getY());
        Assert.assertEquals(Facing.SOUTH, newPosition.get().getFacing());
    }

    @Test
    public void testMoveWest(){
        Position currentPosition = new Position(2, 5, Facing.WEST);
        MoveCommand move = new MoveCommand();
        Optional<Position> newPosition = move.execute(currentPosition);
        Assert.assertEquals(1, newPosition.get().getX());
        Assert.assertEquals(5, newPosition.get().getY());
        Assert.assertEquals(Facing.WEST, newPosition.get().getFacing());
    }
}
