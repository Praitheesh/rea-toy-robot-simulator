package reagroup.toyrobot.exception;

/**
 * Created by Praitheesh on 18/3/17.
 */
public class UnsupportedCommandException extends Exception {

    public UnsupportedCommandException(){
        super();
    }

    public UnsupportedCommandException(String message){
        super(message);
    }
}
