package app;

import app.contracts.CarManager;
import app.core.CarManagerImpl;
import app.engines.Engine;
import app.io.ConsoleInputReader;
import app.io.ConsoleOutPutWriter;
import app.utilities.InputParser;

public class Main {
    public static void main(String[] args) {
        ConsoleInputReader inputReader = new ConsoleInputReader();
        ConsoleOutPutWriter outPutWriter = new ConsoleOutPutWriter();
        InputParser inputParser = new InputParser();
        CarManager carManager = new CarManagerImpl();
        Engine engine = new Engine(inputReader, outPutWriter, inputParser, carManager);

        engine.run();
    }
}
