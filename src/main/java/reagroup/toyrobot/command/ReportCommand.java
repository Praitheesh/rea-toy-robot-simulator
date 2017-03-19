package reagroup.toyrobot.command;

import reagroup.toyrobot.model.Position;
import reagroup.toyrobot.util.Consts;
import reagroup.toyrobot.util.ToyRobotUtil;

import java.util.Optional;

/**
 * Created by Praitheesh on 16/3/17.
 */
public class ReportCommand extends Command {
    @Override
    public Optional<Position> execute(final Position position) {
        ToyRobotUtil.print(Consts.REPORT_OUTPUT,
                String.valueOf(position.getX()),
                String.valueOf(position.getY()),
                position.getFacing().toString());
        return Optional.empty();
    }
}
