import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TheVLogger {
    private static final String END_PROGRAM = "Statistics";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<String>> statusFollowing = new TreeMap<>();
        Map<String, List<String>> statusFollowed = new TreeMap<>();
        List<String> vLogger = new ArrayList<>();
        String input;

        while (!END_PROGRAM.equals(input = reader.readLine())) {

            String[] elements = input.split("\\s+");
            String name = elements[0];
            String command = elements[1];
            String followedNames = elements[2];

            if (command.equals("joined")) {
                vLogger.add(name);
            } else if (command.equals("followed")) {
                if (name.equals(followedNames)) {
                    if (!statusFollowing.containsKey(name)) {
                        statusFollowing.put(name, new ArrayList<>());
                    }
                    continue;
                }
                if (followedNames.equals(name)) {
                    if (!statusFollowed.containsKey(followedNames)) {
                        statusFollowed.put(followedNames, new ArrayList<>());
                    }
                    continue;
                }
                if (!statusFollowed.containsKey(followedNames)){
                    statusFollowed.put(followedNames, new ArrayList<>());
                }
                if (!statusFollowed.get(followedNames).contains(name)){
                    statusFollowed.get(followedNames).add(name);
                }


                if (!statusFollowing.containsKey(name)) {
                    statusFollowing.put(name, new ArrayList<>());
                }
                if (!statusFollowing.get(name).contains(followedNames)) {
                    statusFollowing.get(name).add(followedNames);
                }
            }
        }
        System.out.println(String.format("The V-Logger has a total of %s vloggers in its logs.", vLogger.size()));

        for (Map.Entry<String, List<String>> entry : statusFollowing.entrySet()) {

        }
            
        }


    }


}
