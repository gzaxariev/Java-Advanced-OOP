package custam_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        MyList<String> myList = new MyArrayList<>();

        String line;
        while (true){
            if ("END".equals(line = reader.readLine())){
                break;
            }

            String[] tokens = line.split("\\s+");

            dispatchCommand(tokens, myList);

        }
    }

    private static void dispatchCommand(String[] tokens, MyList<String> myList) {
        switch (tokens[0]){
            case "Add":
                myList.add(tokens[1]);
                break;
            case "Remove":
                myList.remove(Integer.parseInt(tokens[1]));
                break;
            case "Contains":
                System.out.println(myList.contains(tokens[1]));
                break;
            case "Swap":
                myList.swap(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
                break;
            case "Greater":
                System.out.println(myList.countGreaterThan(tokens[1]));
                break;
            case "Max":
                System.out.println(myList.getMax());
                break;
            case "Min":
                System.out.println(myList.getMin());
                break;
            case "Print":
                myList.getElements().forEach(System.out::println);
                break;
            case "Sort":
                myList.sort();
                    break;
        }
    }
}
