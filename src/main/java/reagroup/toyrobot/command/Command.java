package reagroup.toyrobot.command;

import reagroup.toyrobot.exception.UnsupportedCommandException;
import reagroup.toyrobot.model.Position;

import java.util.Optional;

/**
 * Created by Praitheesh on 16/3/17.
 */
public interface Command {

    /**
     * Execute the command and return expected new @{@link Position}
     *
     * @param currentPosition
     * @return
     * @throws UnsupportedCommandException
     */
    Optional<Position> execute(final Position currentPosition) throws UnsupportedCommandException;
}
