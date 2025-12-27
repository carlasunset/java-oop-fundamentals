package Section17_Generics_Set_Map.resolved_exercise.services;

import java.util.ArrayList;
import java.util.List;

// This version of PrintService is limited to Integer values.
// If we want to reuse this logic for other types (String, Double, etc.),
// we would need to create a new class or change the implementation.

public class PrintService {

    private List<Integer> list = new ArrayList<>(); // The list is strongly coupled to Integer type

    // Accepts only Integer values due to the class design
    public void addValue(Integer value){
        list.add(value);
    }

    public Integer first(){
        if (list.isEmpty()){
            throw new IllegalStateException("List is empty!");
        }
        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        if (!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
