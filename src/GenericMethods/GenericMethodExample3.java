package GenericMethods;
// Generic methods can also be defined in static context. Since static methods belong to the class,
// not to instances, the generic type parameter
// for a static method is defined at the method level, not at the class level.
public class GenericMethodExample3 {
    public static <T> void printElement(T element) {
        System.out.println("Element: " + element);
    }

    public static void main(String[] args) {
        GenericMethodExample3.printElement(42); // Output: Element: 42
        GenericMethodExample3.printElement("Generics in Java"); // Output: Element: Generics in Java
    }
}
