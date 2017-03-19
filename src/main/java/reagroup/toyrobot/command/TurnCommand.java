package reagroup.toyrobot.command;

import reagroup.toyrobot.model.Position;
import reagroup.toyrobot.util.TurnEnum;

import java.util.Optional;

/**
 * Created by Praitheesh on 16/3/17.
 */
public class TurnCommand extends Command {
    private TurnEnum turn;

    TurnCommand(TurnEnum turn) {
        this.turn = turn;
    }

    @Override
    public Optional<Position> execute(Position position) {
        return Optional.of(new Position(position.getX(), position.getY(),
                turn == TurnEnum.LEFT ? position.getFacing().turnLeft()
                        : position.getFacing().turnRight()));
    }

}
