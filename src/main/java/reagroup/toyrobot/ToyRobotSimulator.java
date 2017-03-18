package reagroup.toyrobot;

import reagroup.toyrobot.controller.RobotController;
import reagroup.toyrobot.exception.UnsupportedCommandException;
import reagroup.toyrobot.model.Robot;
import reagroup.toyrobot.model.Table;
import reagroup.toyrobot.command.CommandFactory;
import reagroup.toyrobot.util.Consts;
import reagroup.toyrobot.util.ToyRobotUtil;

/**
 * Created by Praitheesh on 18/3/17.
 */
public class ToyRobotSimulator {
    private CommandFactory commandFactory;
    private Table gameTable;
    private boolean isRobotPlaced = false;
    private RobotController controller;

    ToyRobotSimulator() {
    }

    ToyRobotSimulator(Table gameTable) {
        this.gameTable = gameTable;
    }


    /**
     * Core method to handle inputs
     * @param input
     */
    public void executeInput(String input) {
        try {

            if (input.matches(Consts.PLACE_COMMAND_PATTERN)) {
                //Place the robot on game table
                isRobotPlaced = true;
                gameTable.setRobot(new Robot());
                commandFactory = new CommandFactory();
                controller = new RobotController();
                controller.operateRobot(gameTable, commandFactory.getCommand(input));
            } else if (input.matches(Consts.VALID_NON_PLACE_COMMAND_PATTERN) && !isRobotPlaced) {
                //Robot not placed into game table yet , place it first
                ToyRobotUtil.print(Consts.PLACE_COMMAND_FIRST);
            } else if (input.matches(Consts.VALID_NON_PLACE_COMMAND_PATTERN)) {
                // execute commands
                controller.operateRobot(gameTable, commandFactory.getCommand(input));
            } else {
                // Invalid
                ToyRobotUtil.print(Consts.INVALID_INPUT);
                ToyRobotUtil.print(Consts.VALID_INPUT_MESSAGE);
            }
        } catch (UnsupportedCommandException e) {
            ToyRobotUtil.print(Consts.INVALID_INPUT);
            ToyRobotUtil.print(Consts.VALID_INPUT_MESSAGE);
        }
    }
}