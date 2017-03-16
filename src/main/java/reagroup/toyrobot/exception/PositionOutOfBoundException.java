package reagroup.toyrobot.exception;

/**
 * Created by Praitheesh on 16/3/17.
 */
public class PositionOutOfBoundException extends Exception {

    public PositionOutOfBoundException(){
        super();
    }

    public PositionOutOfBoundException(String message){
        super(message);
    }
}
