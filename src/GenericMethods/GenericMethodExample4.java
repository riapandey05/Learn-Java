package GenericMethods;

public class GenericMethodExample4 {
    public <T> void display(T element) {
        System.out.println("Generic display: " + element);
    }

    public void display(Integer element) {
        System.out.println("Integer display: " + element);
    }

    public static void main(String[] args) {
        GenericMethodExample4 example = new GenericMethodExample4();

        example.display(42);         // Calls the Integer display method
        example.display("Generics"); // Calls the generic display method
    }
}
//In the above example, even though we have a generic method display, the non-generic display method that accepts an
// Integer gets called when we pass an integer value.