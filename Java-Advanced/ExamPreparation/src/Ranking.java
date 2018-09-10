import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Ranking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> line = Arrays.stream(reader.readLine()
                .split(":")).collect(Collectors.toList());

        Map<String, String> contestAndPasswords = new LinkedHashMap<>();

        Map<String, LinkedHashMap<String, Integer>> ranking = new TreeMap<>();

        while (!"end of contests".equalsIgnoreCase(line.get(0))) {

            String contest1 = line.get(0);
            String password1 = line.get(1);


            contestAndPasswords.put(contest1, password1);



            line = Arrays.stream(reader.readLine().split(":")).collect(Collectors.toList());

        }
        String[] info = reader.readLine().split("=>");

        while (!"end of submissions".equalsIgnoreCase(info[0])) {

            String contest2 = info[0];
            String password2 = info[1];
            String username = info[2];
            int points = Integer.parseInt(info[3]);

            if (!contestAndPasswords.containsKey(contest2) || !contestAndPasswords.get(contest2).equals(password2)) {
                info = reader.readLine().split("=>");
                continue;

            }

            if (!ranking.containsKey(username)) {
                ranking.put(username, new LinkedHashMap<>());
            }
            if (!ranking.get(username).containsKey(contest2)) {
                ranking.get(username).put(contest2, points);
            }


            info = reader.readLine().split("=>");
        }

        String bestUser = ranking.entrySet()
                .stream()
                .sorted(Comparator.comparing(x -> x.getValue().values().stream().mapToInt(Integer::valueOf).sum(),
                        Comparator.reverseOrder()))
                .findFirst()
                .get()
                .getKey();
        System.out.printf("Best candidate is %s with total %d points.%n",
                bestUser, ranking.get(bestUser).values().stream().mapToInt(Integer::valueOf).sum());
        System.out.println("Ranking: ");


        for (String s : ranking.keySet()) {


            System.out.printf("%s%n", s);

            LinkedHashMap<String, Integer> value = ranking.get(s);

            value.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(e -> System.out.printf("#  %s -> %d%n", e.getKey(), e.getValue()));


        }

    }
}
