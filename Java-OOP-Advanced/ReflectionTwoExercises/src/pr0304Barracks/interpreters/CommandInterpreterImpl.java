package pr0304Barracks.interpreters;

import pr0304Barracks.contracts.CommandInterpreter;
import pr0304Barracks.contracts.Executable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CommandInterpreterImpl implements CommandInterpreter {
    private static final String COMMANDS_PACKAGE_NAME = "pr0304Barracks.core.commands.";
    private static final String COMMANDS_SURFIX = "Command";

    @Override
    public Executable interpretCommand(String commandName) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        String currectCommand = String.valueOf(commandName.charAt(0)).toUpperCase() +
                commandName.substring(1);
        Class<?> commandClass = null;
        try {

            commandClass = Class.forName(COMMANDS_PACKAGE_NAME + currectCommand + COMMANDS_SURFIX);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Invalid command");
        }
        Constructor<?> constructor = commandClass.getDeclaredConstructor();
        Executable commandInstance = (Executable) constructor.newInstance();
        return null;


    }
}
