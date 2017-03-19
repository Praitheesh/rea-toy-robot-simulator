package reagroup.toyrobot.command;

import reagroup.toyrobot.exception.UnsupportedCommandException;
import reagroup.toyrobot.model.Position;
import reagroup.toyrobot.util.Consts;
import reagroup.toyrobot.util.Facing;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class to handle Place input
 *
 * Created by Praitheesh on 16/3/17.
 */
public class PlaceCommand implements Command {

    private String inputString;

    public PlaceCommand(String input) {
        this.inputString = input;
    }

    @Override
    public Optional<Position> execute(final Position position) throws UnsupportedCommandException {
        return Optional.of(constructPosition(inputString));
    }

    private Position constructPosition(String input) throws UnsupportedCommandException {
        Pattern pattern = Pattern.compile(Consts.PLACE_COMMAND_PATTERN);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find() && matcher.groupCount() == 3) {
            try {
                return new Position(Integer.valueOf(matcher.group(1)),
                        Integer.valueOf(matcher.group(2)),
                        Facing.valueOf(matcher.group(3).trim()));
            } catch (Exception e) {
                throw new UnsupportedCommandException(Consts.INVALID_PLACE_INPUT);
            }
        } else {
            throw new UnsupportedCommandException(Consts.INVALID_PLACE_INPUT);
        }
    }
}
