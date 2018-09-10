package pr0304Barracks.core.commands;

import jdk.jshell.spi.ExecutionControl;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.UnitFactory;


public class RetireCommand extends Command {
    private static final String RETIRE_MESSAGE = "%s retired!";

    protected RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {

        try {
                super.getRepository().removeUnit(super.getData()[1]);
        }catch (IllegalStateException ise) {
           return ise.getMessage();
        }
        return String.format(RETIRE_MESSAGE, super.getData()[1]);
    }
}
