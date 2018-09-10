import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int num1 = input[0];
        int num2 = input[1];

        HashSet<Integer> number1 = new LinkedHashSet<>();
        HashSet<Integer> number2 = new LinkedHashSet<>();

        while (num1-- >0){

            int count1 = Integer.parseInt(scanner.nextLine());
            number1.add(count1);

        }
        while (num2-- >0){

            int count2 = Integer.parseInt(scanner.nextLine());
            number2.add(count2);

        }

        Set<Integer> result = setElements(number1, number2);

        int occurences = 0;
        for (Integer integer : result) {
            if (occurences!= result.size() -1){
                System.out.print(integer + " ");
            }else{
                System.out.println(integer);
            }
            occurences++;
            
        }
    }

    private static Set<Integer> setElements(Set<Integer> number1, Set<Integer> number2) {

        Set<Integer> result = new LinkedHashSet<>();
        for (Integer element : number1) {
            if (number2.contains(element)){
                if (!result.contains(element)){
                    result.add(element);
                }
            }
            
        }
        return (LinkedHashSet<Integer>) result;
    }
}
