package WildCardsInGenerics;

import java.util.Arrays;
import java.util.List;

public class three {
    static void readNumbers(List<? extends Number> list) {

        for (Number n : list) {
            System.out.println(n);
        }

        // ❌ Cannot add
        // list.add(10); // ERROR
    }

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.5, 2.5);

        readNumbers(ints);
        readNumbers(doubles);
    }
}
//Meaning
//
//? extends Number means:
//
//Number
//
//Integer
//
//Double
//
//Float
//
//✔ Safe to read as Number
//❌ Not safe to add
