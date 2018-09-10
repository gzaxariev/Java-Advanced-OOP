package cresla;

import cresla.interfaces.InputReader;
import cresla.interfaces.Manager;
import cresla.interfaces.OutputWriter;
import cresla.io.Reader;
import cresla.io.Writer;
import cresla.manager.ManagerImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manager manager = new ManagerImpl();
        OutputWriter writer = new Writer();
        InputReader reader = new Reader();

        whileloop:
        while (true){
            List<String> commands =Arrays.asList(reader.readLine().split(" "));

            switch (commands.get(0)){
                case"Reactor":
                    writer.writeLine(manager.reactorCommand(commands.subList(1, commands.size())));
                    break;
                case"Module":
                    writer.writeLine(manager.moduleCommand(commands.subList(1, commands.size())));
                    break;
                case"Report":
                    writer.writeLine(manager.reportCommand(commands.subList(1, commands.size())));
                    break;
              default:
                  writer.writeLine(manager.exitCommand(commands));
                  break whileloop;
            }
        }
    }
}
