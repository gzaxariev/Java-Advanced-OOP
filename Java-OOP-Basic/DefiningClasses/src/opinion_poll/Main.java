package opinion_poll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int line =Integer.parseInt(reader.readLine());

        List<Person> personList = new ArrayList<>();


        while (line-->0){

            String[] peoplesInfo = reader.readLine().split(" ");

            Person person = new Person();

            person.setName(peoplesInfo[0]);
            person.setAge(Integer.parseInt(peoplesInfo[1]));
            personList.add(person);

        }
        personList.stream().filter(p -> p.getAge()> 30)
                .sorted((a,b)->a.getName().compareTo(b.getName()))
                .forEach(p -> System.out.printf("%s - %d%n", p.getName(), p.getAge()));

    }
}
