package reagroup.toyrobot.controller;

import reagroup.toyrobot.command.Command;
import reagroup.toyrobot.exception.PositionOutOfBoundException;
import reagroup.toyrobot.exception.UnsupportedCommandException;
import reagroup.toyrobot.model.Position;
import reagroup.toyrobot.model.Table;
import reagroup.toyrobot.util.Consts;
import reagroup.toyrobot.util.ToyRobotUtil;

import java.util.Optional;

/**
 * Created by Praitheesh on 16/3/17.
 */
public class RobotController {

    /**
     * Operate the @{@link reagroup.toyrobot.model.Robot} based on given @{@link Command}
     * @param table
     * @param command
     * @throws UnsupportedCommandException
     * @throws PositionOutOfBoundException
     */
    public void operateRobot(Table table, Command command) throws UnsupportedCommandException, PositionOutOfBoundException {
        Optional<Position> newPosition = command.execute(table.getRobot().getPosition());

        if (newPosition.isPresent()) {
            if (ToyRobotUtil.validateRobotPosition(table, newPosition.get())) {
                table.getRobot().setPosition(new Position(newPosition.get().getX(),
                        newPosition.get().getY(),
                        newPosition.get().getFacing()));
            } else {
                throw new PositionOutOfBoundException(Consts.INVALID_POSITION_MESSAGE);
            }
        }
    }

}
