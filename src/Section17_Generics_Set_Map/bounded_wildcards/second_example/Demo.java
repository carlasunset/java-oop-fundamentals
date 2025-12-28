package Section17_Generics_Set_Map.bounded_wildcards.second_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        List<Double> doubleList = Arrays.asList(3.14, 6.28);
        List<Object> objectsList = new ArrayList<Object>();

        // Integer list produces Number values
        copy(integerList, objectsList);
        printList(objectsList);

        // Double list also produces Number values
        copy(doubleList, objectsList);
        printList(objectsList);
    }

    // PECS example:
    // source  -> Producer (extends)
    // destination -> Consumer (super)
    public static void copy(List<? extends Number> source, List<? super Number> destination){
        for (Number number : source) {
            destination.add(number); // safe to add Number
        }
    }

    // Uses unbounded wildcard for read-only access
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
