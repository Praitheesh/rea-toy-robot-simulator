package reagroup.toyrobot.util;

import java.text.MessageFormat;

/**
 *
 * Class contains Util methods
 *
 * Created by Praitheesh on 18/3/17.
 */
public class ToyRobotUtil {

    /**
     * Print messages in console
     * @param message
     * @param s
     */
    public static void print(String message, String... s) {
        System.out.println(MessageFormat.format(message, s));
    }
}

