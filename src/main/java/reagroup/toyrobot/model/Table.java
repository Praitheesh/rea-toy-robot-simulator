package reagroup.toyrobot.model;

import reagroup.toyrobot.util.Consts;

/**
 * Created by Praitheesh on 16/3/17.
 */
public class Table {
    private Robot robot;
    private final int TABLE_SIZE_Y = Consts.TABLE_Y_SIZE;
    private final int TABLE_SIZE_X = Consts.TABLE_X_SIZE;

    public int getMaxX() {
        return TABLE_SIZE_X;
    }

    public int getMaxY() {
        return TABLE_SIZE_Y;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
}
