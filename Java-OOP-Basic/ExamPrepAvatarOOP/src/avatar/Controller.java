package avatar;


import avatar.benders.Bender;
import avatar.monuments.Monument;

import java.util.ArrayList;

public class Controller {
    public static Nation airNation = new Nation(new ArrayList<>(), new ArrayList<>());
    public static Nation fireNation = new Nation(new ArrayList<>(), new ArrayList<>());
    public static Nation earthNation = new Nation(new ArrayList<>(), new ArrayList<>());
    public static Nation waterNation = new Nation(new ArrayList<>(), new ArrayList<>());

    public static Nation getAirNation() {
        return airNation;
    }

    public static Nation getFireNation() {
        return fireNation;
    }

    public static Nation getEarthNation() {
        return earthNation;
    }

    public static Nation getWaterNation() {
        return waterNation;
    }

    static void beginWar(){
        double airPower = airNation.calculateNationPower();
        double firePower = fireNation.calculateNationPower();
        double waterPower = waterNation.calculateNationPower();
        double earthPower = earthNation.calculateNationPower();
        if (airPower > firePower && airPower > waterPower && airPower > earthPower){
            clearNationBendersAndMonuments(fireNation, waterNation, earthNation);
        }else if(firePower > airPower && firePower > waterPower && firePower > earthPower){
            clearNationBendersAndMonuments(airNation, waterNation, earthNation);

        }else if(waterPower > airPower && waterPower > firePower && waterPower >earthPower){
            clearNationBendersAndMonuments(fireNation, airNation, earthNation);

        }else{
            clearNationBendersAndMonuments(fireNation, waterNation, airNation);

        }
    }

    private static void clearNationBendersAndMonuments(Nation n1, Nation n2, Nation n3) {
        n1.clearBenders();
        n1.clearMonuments();

        n2.clearBenders();
        n2.clearMonuments();

        n3.clearBenders();
        n3.clearMonuments();
    }


    public static String getStatus(String type){
        Nation currentNation = getNation(type);
        StringBuilder builder = new StringBuilder();
        builder.append(type).append(" Nation").append(System.lineSeparator());

        if (currentNation.getBenders().size() > 0){
            builder.append("Benders:").append(System.lineSeparator());
            for (Bender bender : currentNation.getBenders()) {
                builder.append(bender).append(System.lineSeparator());
                
            }
        }else{
            builder.append("Benders: None").append(System.lineSeparator());
        }
        if (currentNation.getMonuments().size() > 0){
            builder.append("Monuments:").append(System.lineSeparator());
            for (Monument monument : currentNation.getMonuments()) {
                builder.append(monument).append(System.lineSeparator());

            }
        }else{
            builder.append("Monuments: None").append(System.lineSeparator());
        }
       return builder.toString();
    }

    private static Nation getNation(String type) {
        switch (type) {
            case "Air":
                return airNation;
            case "Water":
                return waterNation;
            case "Fire":
                return fireNation;
            case "Earth":
                return earthNation;
            default:
                return null;
        }
    }
}
