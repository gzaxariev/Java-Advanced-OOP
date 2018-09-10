package box_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countOfBoxes = (Integer.parseInt(reader.readLine()));

        //Problem 1.	Generic Box

//        List<Box<String>> boxes = new ArrayList<>();
//
//        while (countOfBoxes-->0){
//            String input = reader.readLine();
//
//            Box<String> box = new Box<>();
//            box.setValue(input);
//            boxes.add(box);
//
//        }
//        boxes.forEach(System.out::println);

        // Problem 2.	Generic Box of Integer

//        List<Box<Integer>> boxes = new ArrayList<>();
//
//       while (countOfBoxes-->0){
//           int input = Integer.parseInt(reader.readLine());
//
//           Box<Integer> box = new Box<>();
//           box.setValue(input);
//           boxes.add(box);
//
//       }
//       boxes.forEach(System.out::println);


        // Problem 3.	Generic Swap Method Strings

//        List<Box<String>> boxes = new ArrayList<>();
//        while (countOfBoxes-- > 0) {
//            String input = reader.readLine();
//            Box<String> box = new Box<>();
//            box.setValue(input);
//            boxes.add(box);
//        }
//
//        int[] indexes = Arrays.stream(reader.readLine().split("\\s+")).
//                mapToInt(Integer::parseInt).toArray();
//
//        swap(boxes, indexes[0], indexes[1]);
//        boxes.forEach(System.out::println);
//
//    }
//
//    private static <T> void swap(List<Box<T>> boxes, int firstIndex, int secondIndex){
//        Box<T> temp = boxes.get(firstIndex);
//        boxes.set(firstIndex, boxes.get(secondIndex));
//        boxes.set(secondIndex, temp);

        //Problem 4.	Generic Swap Method Integers

//        List<Box<Integer>> boxes = new ArrayList<>();
//        while (countOfBoxes-- > 0) {
//            int input = Integer.parseInt(reader.readLine());
//            Box<Integer> box = new Box<>();
//            box.setValue(input);
//            boxes.add(box);
//        }
//
//        int[] indexes = Arrays.stream(reader.readLine().split("\\s+")).
//                mapToInt(Integer::parseInt).toArray();
//
//        swap(boxes, indexes[0], indexes[1]);
//        boxes.forEach(System.out::println);

//        List<CamparableBox<String>> boxes = new ArrayList<>();
////       while (countOfBoxes-- > 0) {
////           String input = reader.readLine();
////           CamparableBox<String> box = new CamparableBox<>();
////           box.setValue(input);
////           boxes.add(box);
////       }
////       CamparableBox<String> box =  new CamparableBox<>();
////       box.setValue(reader.readLine());
////        System.out.println(getCountOfGreaterElements(boxes, box));

        List<CamparableBox<Double>> boxes = new ArrayList<>();
        while (countOfBoxes-- > 0) {
            Double input = Double.valueOf(reader.readLine());
            CamparableBox<Double> box = new CamparableBox<>();
            box.setValue(input);
            boxes.add(box);
        }
        CamparableBox<Double> box =  new CamparableBox<>();
        box.setValue(Double.valueOf(reader.readLine()));
        System.out.println(getCountOfGreaterElements(boxes, box));



    }

    private static <T> void swap(List<Box<T>> boxes, int firstIndex, int secondIndex){
        Box<T> temp = boxes.get(firstIndex);
        boxes.set(firstIndex, boxes.get(secondIndex));
        boxes.set(secondIndex, temp);
    }

    private static <T extends  Comparable<T>> int getCountOfGreaterElements(List<CamparableBox<T>> elements,
                                                                            CamparableBox<T> singleElement){
        return elements.stream().filter(element -> element.compareTo(singleElement) > 0).collect(Collectors.toList())
                .size();
    }
}
