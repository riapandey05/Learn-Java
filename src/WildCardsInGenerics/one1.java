package WildCardsInGenerics;

import java.util.ArrayList;
import java.util.List;

public class one1 {



        public static void main(String[] args) {

            List<Integer> intList = new ArrayList<>();
            intList.add(10);
            intList.add(20);

            // ❌ This is NOT allowed
            // List<Number> numList = intList;
        }
    }


