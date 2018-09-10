import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class LittleAlchemy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] stones = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stonesEndGold = new ArrayDeque<>();

        int gold = 0;
        for (int stone : stones) {

            stonesEndGold.add(stone);
        }

        String line = reader.readLine();

        while (!"Revision".equalsIgnoreCase(line)) {

            String[] info = line.split("\\s+");

            if (info[0].equalsIgnoreCase("Apply")) {

                int ascidCount = Integer.parseInt(info[2]);

                for (int i = 0; i < ascidCount; i++) {

                    int numb = stonesEndGold.pop();
                    if (--numb <= 0) {
                        gold++;
                    } else {
                        stonesEndGold.addLast(numb);
                    }

                }
            }else if (info[0].equalsIgnoreCase("Air")){

                if (gold <=0){
                    gold = 0;
                }else {
                    int ascidCount = Integer.parseInt(info[2]);

                    stonesEndGold.addLast(ascidCount);
                }
            }

            line = reader.readLine();

        }
        for (Integer integer : stonesEndGold) {
            System.out.print(integer + " ");

        }
        System.out.println();
        System.out.println(gold);
    }
}
