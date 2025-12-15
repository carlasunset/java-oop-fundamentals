package Section10_Memory_Behavior_Arrays_Lists.listas;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Carlos");
        list.add("Carolina");
        list.add("Amanda");
        list.add(2, "Marco");

        System.out.println("Tamanho da lista" + list.size());

        for (String elemento : list){
            System.out.println(elemento);
        }

        System.out.println("----------------------------------------------");

        list.remove("Anna");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String elemento : list){
            System.out.println(elemento);
        }
        System.out.println("----------------------------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("----------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').toList();
        for (String elemento : result){
            System.out.println(elemento);
        }
        System.out.println("----------------------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
        System.out.println(name);




    }
}
