package constructorsongenerics;

public class Test <T>{
    private T value;

    // Generic constructor
    <U> Test(U input) {
        System.out.println(input.getClass().getName());
    }
}
