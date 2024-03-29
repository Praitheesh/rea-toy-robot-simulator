package reagroup.toyrobot.command;

import reagroup.toyrobot.exception.UnsupportedCommandException;
import reagroup.toyrobot.util.CommandEnum;
import reagroup.toyrobot.util.Consts;
import reagroup.toyrobot.util.TurnEnum;

/**
 * Factory class to generate Command object based on user input
 * Created by Praitheesh on 16/3/17.
 */
public class CommandFactory {

    public Command getCommand(String input) throws UnsupportedCommandException {
        if (input.startsWith(CommandEnum.PLACE.toString())) {
            return new PlaceCommand(input);
        } else if (input.equals(CommandEnum.LEFT.toString())) {
            return new TurnCommand(TurnEnum.LEFT);
        } else if (input.equals(CommandEnum.RIGHT.toString())) {
            return new TurnCommand(TurnEnum.RIGHT);
        } else if (input.equals(CommandEnum.MOVE.toString())) {
            return new MoveCommand();
        } else if (input.equals(CommandEnum.REPORT.toString())) {
            return new ReportCommand();
        } else {
            throw new UnsupportedCommandException(Consts.INVALID_INPUT);
        }
    }
}
