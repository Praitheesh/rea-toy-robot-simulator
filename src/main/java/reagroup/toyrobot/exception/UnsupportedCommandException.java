package reagroup.toyrobot.exception;

/**
 * Exception class to handle Invalid input commands
 * <p>
 * Created by Praitheesh on 18/3/17.
 */
public class UnsupportedCommandException extends Exception {
    public UnsupportedCommandException(String message) {
        super(message);
    }
}
