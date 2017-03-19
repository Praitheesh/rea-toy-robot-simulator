package reagroup.toyrobot.command;

import reagroup.toyrobot.model.Position;
import reagroup.toyrobot.util.Facing;

import java.util.Optional;

/**
 * Created by Praitheesh on 16/3/17.
 */
public class MoveCommand extends Command {
    @Override
    public Optional<Position> execute(final Position position) {
        return Optional.of(new Position(getNextX(position), getNextY(position), position.getFacing()));
    }

    private int getNextX(Position currentPosition) {
        if (currentPosition.getFacing().equals(Facing.EAST)) {
            return currentPosition.getX() + 1;
        } else if (currentPosition.getFacing().equals(Facing.WEST)) {
            return currentPosition.getX() - 1;
        } else {
            return currentPosition.getX();
        }
    }

    private int getNextY(Position currentPosition) {
        if (currentPosition.getFacing().equals(Facing.NORTH)) {
            return currentPosition.getY() + 1;
        } else if (currentPosition.getFacing().equals(Facing.SOUTH)) {
            return currentPosition.getY() - 1;
        } else {
            return currentPosition.getY();
        }
    }
}
