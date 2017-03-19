package reagroup.toyrobot.command;

import reagroup.toyrobot.exception.UnsupportedCommandException;
import reagroup.toyrobot.model.Position;

import java.util.Optional;

/**
 * Created by Praitheesh on 16/3/17.
 */
public abstract class Command {
    public abstract Optional<Position> execute(final Position position) throws UnsupportedCommandException;
}
