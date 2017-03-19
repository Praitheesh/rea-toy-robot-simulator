package reagroup.toyrobot.util;

/**
 * Created by Praitheesh on 19/3/17.
 */
public enum Facing {
    NORTH, EAST, SOUTH, WEST;

    public Facing turnLeft() {
        return values()[(ordinal()+4 - 1) % 4];
    }

    public Facing turnRight() {
        return values()[(ordinal() + 1) % 4];
    }
}
