import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FootballStats {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> games = new HashMap<>();

        Pattern pattern = Pattern.compile("([A-Za-z]+) - ([A-Za-z]+) result ([\\d]+):([\\d]+)");

        String line = reader.readLine();

        while (!"Season End".equalsIgnoreCase(line)){


            Matcher matcher = pattern.matcher(line);

            while (matcher.find()){

                String firstTeam = matcher.group(1);
                String secondTeam = matcher.group(2);
                String firstTeamGoals = matcher.group(3);
                String secondTeamGoals = matcher.group(4);


                if (!games.containsKey(firstTeam)){
                    games.put(firstTeam, new ArrayList<>());
                }
                if (!games.containsKey(secondTeam)){
                    games.put(secondTeam,new ArrayList<>());
                }

                String homeTeam =" - " + secondTeam + " ->" + " " + firstTeamGoals + ":" + secondTeamGoals;
                String guestTeam = " - " + firstTeam + " ->" + " " + secondTeamGoals + ":" + firstTeamGoals;

                games.get(firstTeam).add(homeTeam);
                games.get(secondTeam).add(guestTeam);

            }

            line = reader.readLine();
        }
        printResult(games, reader);
    }

    private static void printResult(Map<String,List<String>> games, BufferedReader reader) throws IOException {

        String[] teams = reader.readLine().split(", ");

        for (String team : teams) {
            games.get(team)
                    .stream()
                    .sorted(Comparator.comparing(x -> x.split(" -> ")[0]))
                    .forEach(x -> System.out.println(String.format("%s%s",team, x)));
        }
    }
}
