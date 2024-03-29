package reagroup.toyrobot.model;

import reagroup.toyrobot.util.Consts;

/**
 * Table model class , it contains Robot and boundary details
 *
 * Created by Praitheesh on 16/3/17.
 */
public class Table {
    private Robot robot;
    private int TABLE_MAX_SIZE_Y = Consts.TABLE_MAX_Y_SIZE;
    private int TABLE_MAX_SIZE_X = Consts.TABLE_MAX_X_SIZE;
    private int TABLE_MIN_SIZE_Y = Consts.TABLE_MIN_Y_SIZE;
    private int TABLE_MIN_SIZE_X = Consts.TABLE_MIN_X_SIZE;

    public Table() {}

    public Table(int maxX, int maxY) {
        this.TABLE_MAX_SIZE_X = maxX;
        this.TABLE_MAX_SIZE_Y = maxY;
    }

    public int getMaxX() {
        return TABLE_MAX_SIZE_X;
    }

    public int getMaxY() {
        return TABLE_MAX_SIZE_Y;
    }

    public int getMinX(){
        return TABLE_MIN_SIZE_X;
    }

    public int getMinY(){
        return TABLE_MIN_SIZE_Y;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
}
