package reagroup.toyrobot.util;

/**
 * Enum class to manage input commands
 *
 * Created by Praitheesh on 18/3/17.
 */
public enum CommandEnum {
    PLACE("PLACE") , MOVE("MOVE") , LEFT("LEFT") , RIGHT("RIGHT") , REPORT("REPORT");

    String description;

    CommandEnum(String description){
        this.description = description;
    }

    public String toString(){
        return this.description;
    }
}
