package reagroup.toyrobot.util;

/**
 * Collected constants of general utility
 * <p>
 * Created by Praitheesh on 18/3/17.
 */
public final class Consts {

    public static final int TABLE_X_SIZE = 5;
    public static final int TABLE_Y_SIZE = 5;
    public static final String PLACE_COMMAND_PATTERN = "^" + CommandEnum.PLACE + " [ 0-" + TABLE_X_SIZE + " ]+,[ 0-" + TABLE_Y_SIZE + " ]+,\\s*(NORTH|SOUTH|EAST|WEST)";
    public static final String VALID_NON_PLACE_COMMAND_PATTERN = "(" + CommandEnum.MOVE + "|" + CommandEnum.LEFT + "|" + CommandEnum.RIGHT + "|" + CommandEnum.REPORT + ")";

    public static final String PLACE_COMMAND_FIRST = "Please place your ToyRobot on the table by type PLACE X,Y,F";
    public static final String INVALID_INPUT = "Invalid input.";
    public static final String WELCOME_MESSAGE = "Hi Mate !, Lets play." ;
    public static final String VALID_INPUT_MESSAGE = " Type : \n" +
            "PLACE X,Y,F\n" +
            "MOVE\n" +
            "LEFT\n" +
            "RIGHT\n" +
            "REPORT\n";
}
