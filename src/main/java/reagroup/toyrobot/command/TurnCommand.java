package reagroup.toyrobot.command;

import reagroup.toyrobot.model.Table;
import reagroup.toyrobot.util.TurnEnum;

/**
 * Created by Praitheesh on 16/3/17.
 */
public class TurnCommand extends Command {
    private TurnEnum turn;

    TurnCommand(TurnEnum turn){
        this.turn = turn;
    }

    @Override
    public void execute(Table gameTable) {

    }
}
