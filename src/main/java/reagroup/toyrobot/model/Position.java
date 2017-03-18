package reagroup.toyrobot.model;

/**
 * Created by Praitheesh on 16/3/17.
 */
public class Position {

    private int x;
    private int y;
    private FacingDirectioin facing;

    public Position(int x, int y , FacingDirectioin facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

}
