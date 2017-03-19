package reagroup.toyrobot.command;

import org.junit.Assert;
import org.junit.Test;
import reagroup.toyrobot.model.Position;
import reagroup.toyrobot.util.Facing;
import reagroup.toyrobot.util.TurnEnum;

import java.util.Optional;

/**
 * Created by Praitheesh on 19/3/17.
 */
public class TurnCommandTest {
    
    @Test
    public void testTurnRight(){
        TurnCommand turn = new TurnCommand(TurnEnum.RIGHT);
        Position currentPosition = new Position(3,4, Facing.NORTH);
        Optional<Position> newPosition = turn.execute(currentPosition);
        Assert.assertEquals(3, newPosition.get().getX());
        Assert.assertEquals(4, newPosition.get().getY());
        Assert.assertEquals(Facing.EAST, newPosition.get().getFacing());
    }

    @Test
    public void testTurnLeft(){
        TurnCommand turn = new TurnCommand(TurnEnum.LEFT);
        Position currentPosition = new Position(0,0, Facing.NORTH);
        Optional<Position> newPosition = turn.execute(currentPosition);
        Assert.assertEquals(0, newPosition.get().getX());
        Assert.assertEquals(0, newPosition.get().getY());
        Assert.assertEquals(Facing.WEST, newPosition.get().getFacing());
    }
}
