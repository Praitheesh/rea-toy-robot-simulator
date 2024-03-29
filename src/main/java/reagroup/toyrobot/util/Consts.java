package reagroup.toyrobot.util;

/**
 * Collected constants of general utility
 * <p>
 * Created by Praitheesh on 18/3/17.
 */
public final class Consts {

    //Table border
    public static final int TABLE_MAX_X_SIZE = 5;
    public static final int TABLE_MAX_Y_SIZE = 5;
    public static final int TABLE_MIN_X_SIZE = 0;
    public static final int TABLE_MIN_Y_SIZE = 0;


    //Valid Place Regex
    public static final String PLACE_COMMAND_PATTERN = "^PLACE \\s*(\\d{1,2})\\s*,\\s*(\\d{1,2})\\s*,\\s*\\b(NORTH|EAST|SOUTH|WEST)\\b";

    //Valid commands Regex , expect PLACE
    public static final String VALID_NON_PLACE_COMMAND_PATTERN = "(" + CommandEnum.MOVE + "|" + CommandEnum.LEFT + "|" + CommandEnum.RIGHT + "|" + CommandEnum.REPORT + ")";

    //Messages
    public static final String PLACE_COMMAND_FIRST = "Please place your ToyRobot on the table by type PLACE X,Y,F";
    public static final String INVALID_POSITION_MESSAGE = "Unable to place or move the Robot, Border of the table is (" + TABLE_MAX_X_SIZE + "," + TABLE_MAX_Y_SIZE + ")";
    public static final String INVALID_INPUT = "Invalid input.";
    public static final String INVALID_PLACE_INPUT = "Invalid PLACE command";
    public static final String WELCOME_MESSAGE = "Welcome to ToyRobotSimulator, Lets play.";
    public static final String VALID_INPUT_MESSAGE = "Valid command to operate Robot are : \n" +
            "PLACE X,Y,F\n" +
            "MOVE\n" +
            "LEFT\n" +
            "RIGHT\n" +
            "REPORT\n";
    public static final String REPORT_OUTPUT = "Robot''s current position (x,y,Facing) is : {0},{1},{2}";
}
