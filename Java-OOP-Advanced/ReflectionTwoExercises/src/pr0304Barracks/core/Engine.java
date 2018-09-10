package pr0304Barracks.core;

import jdk.jshell.spi.ExecutionControl;
import pr0304Barracks.contracts.*;
import pr0304Barracks.contracts.Runnable;
import pr0304Barracks.interpreters.CommandInterpreterImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {

	private Repository repository;
	private UnitFactory unitFactory;
	private CommandInterpreterImpl commandInterpreter;

	public Engine(Repository repository, UnitFactory unitFactory, CommandInterpreterImpl commandInterpreter) {
		this.repository = repository;
		this.unitFactory = unitFactory;
		this.commandInterpreter = commandInterpreter;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				if (input.equals("fight")) {
					break;
				}
				String[] data = input.split("\\s+");
				String commandName = data[0];
				Executable command = this.commandInterpreter.interpretCommand(commandName);
				String result = command.execute();

				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException | ExecutionControl.NotImplementedException | InvocationTargetException | IllegalAccessException | InstantiationException | NoSuchMethodException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

}
