import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DragonArmy {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Map<String, TreeMap<String, ArrayList<Long>>> army = new LinkedHashMap<>();

        while (n-- >0){

            String[] info = reader.readLine().split("\\s+");
            String type = info[0];
            String name = info[1];
            long damage = info[2].equals("null") ? 45 : Long.parseLong(info[2]);
            long health = info[3].equals("null") ? 250 : Long.parseLong(info[3]);
            long armor =  info[4].equals("null") ? 10 : Long.parseLong(info[4]);
            
            ArrayList<Long> list = new ArrayList<>();

            list.add(damage);
            list.add(health);
            list.add(armor);

            if(!army.containsKey(type)){
                army.put(type, new TreeMap<>());
            }

            army.get(type).put(name, list);

        }

        for (String type : army.keySet()) {

            double sumDmg = 0.0;
            double sumHealth = 0.0;
            double suumArmor = 0.0;

            TreeMap<String, ArrayList<Long>> stats = army.get(type);

            for (String s : stats.keySet()) {
                sumDmg += stats.get(s).get(0);
                sumHealth += stats.get(s).get(1);
                suumArmor += stats.get(s).get(2);
                
            }
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", type, sumDmg / stats.size(), sumHealth / stats.size(),
                    suumArmor / stats.size());

            stats.entrySet().stream().forEach(e -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                    e.getKey(),e.getValue().get(0), e.getValue().get(1), e.getValue().get(2)
                    ));
            
        }

    }

}