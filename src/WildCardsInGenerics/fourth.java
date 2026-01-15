package WildCardsInGenerics;

import java.util.ArrayList;
import java.util.List;

public class fourth {
    // List CONSUMES data (we add values)
    static void addIntegers(List<? super Integer> list) {

        list.add(10);
        list.add(20);

        // Reading gives Object
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        List<Number> numList = new ArrayList<>();

        addIntegers(intList);
        addIntegers(numList);
    }
}
//? super Integer means:
//
//Integer
//
//Number
//
//Object
//
//✔ Safe to add Integer
//❌ Reading → only Object