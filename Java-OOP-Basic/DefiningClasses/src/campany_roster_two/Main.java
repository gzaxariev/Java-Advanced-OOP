package campany_roster_two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Employee> employees = new ArrayList<>();

        int number = Integer.parseInt(reader.readLine());

        while (number-- > 0){

            String[] tokens = reader.readLine().split("\\s+");
            Employee employee = null;
            switch (tokens.length){

                case 4:
                    employee = new Employee(tokens[0], Double.parseDouble(tokens[1]),tokens[2],tokens[3]);
                    break;
                case 5:
                    if (tokens[4].matches("\\d+")){
                        employee = new Employee(tokens[0], Double.parseDouble(tokens[1]),tokens[2],tokens[3]
                                ,Integer.parseInt(tokens[4]));
                    }else{
                        employee = new Employee(tokens[0], Double.parseDouble(tokens[1]),tokens[2],tokens[3], tokens[4]);
                    }

                    break;
                case 6:
                    employee = new Employee(tokens[0], Double.parseDouble(tokens[1]),tokens[2],tokens[3], tokens[4],
                            Integer.parseInt(tokens[5]));
                    break;
            }
            employees.add(employee);


        }

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet()
                .stream()
                .sorted((e1, e2) ->
                        Double.compare(
                                e2.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble(),
                                e1.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble()))
                .limit(1)
                .forEach(d -> {
                    StringBuilder result = new StringBuilder();
                    result.append(String.format("Highest Average Salary: %s", d.getKey()))
                            .append(System.lineSeparator());
                    d.getValue()
                            .stream()
                            .sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                            .forEach(employee -> result.append(employee.toString()).append(System.lineSeparator()));
                    System.out.print(result.toString());
                        });

    }
}
