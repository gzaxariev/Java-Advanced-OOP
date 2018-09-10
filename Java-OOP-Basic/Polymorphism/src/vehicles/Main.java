package vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static final String DRIVE = "Drive";
    public static final String REFUEL = "Refuel";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carTokens = reader.readLine().split("\\s+");
        String[] truckTokens = reader.readLine().split("\\s+");

        String carType = carTokens[0];
        String truckType = truckTokens[0];

        Vehicles car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]));
        Vehicles truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]));

        Map<String, Vehicles> vehicles = new LinkedHashMap<>();

        vehicles.put(carType, car);
        vehicles.put(truckType, truck);

        int countOfCommands = Integer.parseInt(reader.readLine());

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        while (countOfCommands--> 0){

            String[] commandTokens = reader.readLine().split("\\s+");

            String command = commandTokens[0];
            String vehiclesType = commandTokens[1];
            double parameter =Double.parseDouble(commandTokens[2]);

            switch (command){
                case DRIVE:
                    boolean isTravelled = vehicles.get(vehiclesType).drive(parameter);
                    if (isTravelled){
                        System.out.printf("%s travelled %s km%n", vehiclesType, decimalFormat.format(parameter));

                    }else {
                        System.out.println(String.format("%s needs refueling", vehiclesType));
                    }
                    break;
                case REFUEL:
                    vehicles.get(vehiclesType).refuel(parameter);
                    break;
            }
        }

        vehicles.values().forEach(vehicle -> System.out.println(vehicle));
    }
}
