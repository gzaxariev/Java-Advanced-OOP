package app.core;

import app.io.Writer;
import app.models.strategies.BurnableGarbageDisposalStrategy;
import app.models.strategies.RecyclableGarbageDisposalStrategy;
import app.models.strategies.StorableGarbageDisposalStrategy;
import app.models.wastes.BurnableGarbage;
import app.models.wastes.RecyclableGarbage;
import app.models.wastes.StorableGarbage;
import app.waste_disposal.annotations.Burnable;
import app.waste_disposal.annotations.Recyclable;
import app.waste_disposal.annotations.Storable;
import app.waste_disposal.contracts.GarbageProcessor;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;


public class Engine implements Runnable {

    private static final String INVALID_COMMAND = "Invalid command!";
    private static final String STATUS = "Energy: %.2f Capital: %.2f";
    private static final String SUCCESSFULLY_PROCESSED = "%.2f kg of %s successfully processed!";
    private app.io.Reader reader;
    private Writer writer;
    private GarbageProcessor garbageProcessor;
    private BalanceManager balanceManager;


    @Override
    public void run() {

        addStrategies();

        String line = reader.readLine();

        while (!"TimeToRecycle".equals(line)) {

            String[] tokens = line.split("\\s+");
            String commandType = tokens[0];
            switch (commandType) {
                case "ProcessGarbage":
                    processGarbage(tokens[1]);
                    break;
                case "Status":
                    this.writer.writeLine(String.format(STATUS,this.balanceManager.getEnergyBalance(),
                            this.balanceManager.getCapitalBalance()));
                    break;
                    default:
                        this.writer.writeLine(INVALID_COMMAND);
            }

            line = reader.readLine();
        }
    }
    private void processGarbage(String token) {

        String[] elements = token.split("\\|");
        String name = elements[0];
        double weigth = Double.parseDouble(elements[1]);
        double volumePerKg = Double.parseDouble(elements[2]);
        String typeByWaste = elements[3];

        Waste waste = null;
        switch (typeByWaste) {
            case "Recyclable":
                waste = new RecyclableGarbage(name, weigth, volumePerKg);
                break;
            case "Storable":
                waste = new StorableGarbage(name, weigth, volumePerKg);
                break;
            case "Burnable":
                waste = new BurnableGarbage(name, weigth, volumePerKg);
                break;

        }
        ProcessingData processingData = this.garbageProcessor.processWaste(waste);
        balanceManager.processData(processingData);
        this.writer.writeLine(String.format(SUCCESSFULLY_PROCESSED, weigth, name));
    }
    private void addStrategies() {
        this.garbageProcessor.getStrategyHolder()
                .addStrategy(Burnable.class, new BurnableGarbageDisposalStrategy());
        this.garbageProcessor.getStrategyHolder()
                .addStrategy(Recyclable.class, new RecyclableGarbageDisposalStrategy());
        this.garbageProcessor.getStrategyHolder()
                .addStrategy(Storable.class, new StorableGarbageDisposalStrategy());
    }
}
