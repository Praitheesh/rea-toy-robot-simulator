package reagroup.toyrobot;

import reagroup.toyrobot.model.Table;
import reagroup.toyrobot.util.Consts;
import reagroup.toyrobot.util.ToyRobotUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Executable application class which reads the users input
 *
 * Created by Praitheesh on 15/3/17.
 */
public class ToyRobotApp {
    public static void main(String[] args) {
        ToyRobotSimulator toyRobotSimulator = new ToyRobotSimulator(new Table());
        ToyRobotUtil.print(Consts.WELCOME_MESSAGE);
        ToyRobotUtil.print(Consts.VALID_INPUT_MESSAGE);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> stream = in.lines();
        stream.map(String::toUpperCase).map(String::trim).forEach(input -> toyRobotSimulator.executeInput(input));

    }

}
