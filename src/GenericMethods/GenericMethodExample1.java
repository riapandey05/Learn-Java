package GenericMethods;

public class GenericMethodExample1 {
    // Generic method
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GenericMethodExample1 example = new GenericMethodExample1();

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C", "D"};

        // Using the generic method
        example.printArray(intArray);   // Output: 1 2 3 4 5
        example.printArray(stringArray); // Output: A B C D
    }
}
