package constructorsongenerics;

public class Pair2 {
    <A, B> Pair2(A first, B second) {
        System.out.println("First: " + first + ", Second: " + second);
    }
}
