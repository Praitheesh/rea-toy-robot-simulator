package reagroup.toyrobot.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Praitheesh on 19/3/17.
 */
public class EnumTest {

    @Test
    public void testTurnLeftEnum(){
        Assert.assertEquals(Facing.EAST,Facing.NORTH.turnRight());
        Assert.assertEquals(Facing.EAST,Facing.SOUTH.turnLeft());
        Assert.assertEquals(Facing.NORTH,Facing.EAST.turnLeft());
        Assert.assertEquals(Facing.NORTH,Facing.WEST.turnRight());
        Assert.assertEquals(Facing.SOUTH,Facing.WEST.turnLeft());
        Assert.assertEquals(Facing.SOUTH,Facing.EAST.turnRight());
        Assert.assertEquals(Facing.WEST,Facing.NORTH.turnLeft());
        Assert.assertEquals(Facing.WEST,Facing.SOUTH.turnRight());
    }

}
