package Section17_Generics_Set_Map.wildcards;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(5, 2, 10);
        printList(integerList);
        // integerList.add(2); compile-time error: cannot add to List<?>

        List<String> stringList = Arrays.asList("Joe", "Maria", "Anna");
        printList(stringList);
    }

    // Uses a wildcard to accept lists of any type
    // Suitable for read-only operations
    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
