package WildCardsInGenerics;

import java.util.Arrays;
import java.util.List;
//Unbounded wildcard
public class two2 {
    // This method can accept ANY type of list
    static void printList(List<?> list) {

        // We can READ elements
        for (Object obj : list) {
            System.out.println(obj);
        }

        // ❌ We cannot add elements (except null)
        // list.add(10);  // ERROR
    }

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<String> strs = Arrays.asList("A", "B");

        printList(ints);
        printList(strs);
    }
}
