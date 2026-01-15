package constructorsongenerics;

public class Main {
    public static void main(String[] args) {

        Test<Integer> test = new Test<>(12.34);  // Output: java.lang.Double

        new Pair2(10, "Ten");  // Integer and String
        new Pair2(3.14, 42);   // Double and Integer

        new NumberPrinter(100);  // Integer is a subclass of Number
        new NumberPrinter(3.14);  // Double is a subclass of Number

    }
}
