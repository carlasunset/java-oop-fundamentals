package Section17_Generics_Set_Map.resolved_exercise.services;

import java.util.ArrayList;
import java.util.List;

// This version uses Object to allow multiple types,
// but lacks type safety and requires casting.
// This limitation motivates the use of Generics.
public class PrintService {

    // Using Object allows storing any type, but removes compile-time type safety
    private List<Object> list = new ArrayList<>();

    // Accepts any type, which can lead to heterogeneous lists and potential runtime errors
    public void addValue(Object value){
        list.add(value);
    }

    // Returns Object, requiring explicit casting by the caller. This may cause ClassCastException at runtime
    public Object first(){
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
