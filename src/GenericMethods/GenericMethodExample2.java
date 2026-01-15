package GenericMethods;
// A generic method can also accept multiple type parameters. You can specify more than
// one type parameter by
// separating them with commas within the angle brackets.
public class GenericMethodExample2 {
    public <T, U> void printTwoItems(T item1, U item2) {
        System.out.println(item1 + " and " + item2);
    }

    public static void main(String[] args) {
        GenericMethodExample2 example = new GenericMethodExample2();

        example.printTwoItems(10, "Apples"); // Output: 10 and Apples
        example.printTwoItems("Hello", 3.14); // Output: Hello and 3.14
    }
}
