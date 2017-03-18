package reagroup.toyrobot.command;

import reagroup.toyrobot.model.Table;

/**
 * Created by Praitheesh on 16/3/17.
 */
public abstract class Command {
    public abstract void execute(Table gameTable);
}
