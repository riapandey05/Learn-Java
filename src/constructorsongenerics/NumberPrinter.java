package constructorsongenerics;

public class NumberPrinter {
    <T extends Number> NumberPrinter(T number) {
        System.out.println("Number: " + number);
    }
}
