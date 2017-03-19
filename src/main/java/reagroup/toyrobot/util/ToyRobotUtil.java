package reagroup.toyrobot.util;

import reagroup.toyrobot.model.Position;
import reagroup.toyrobot.model.Table;

import java.text.MessageFormat;

/**
 * Class contains Util methods
 * <p>
 * Created by Praitheesh on 18/3/17.
 */
public class ToyRobotUtil {

    /**
     * Print messages in console
     *
     * @param message
     * @param s
     */
    public static void print(String message, String... s) {
        System.out.println(MessageFormat.format(message, s));
    }

    /**
     * Validate Robot new position based on Table border
     * @param table
     * @param newPosition
     * @return
     */
    public static boolean validateRobotPosition(Table table, Position newPosition) {
        if (table.getMaxX() >= newPosition.getX() && table.getMaxY() >= newPosition.getY()
                && table.getMinX() <= newPosition.getX() && table.getMinY() <= newPosition.getY()) {
            return true;
        } else {
            return false;
        }
    }
}

