package reagroup.toyrobot.exception;

/**
 * Exception class to handle when robot move beyond the table boundary
 * <p>
 * Created by Praitheesh on 16/3/17.
 */
public class PositionOutOfBoundException extends Exception {

    public PositionOutOfBoundException(String message) {
        super(message);
    }
}
