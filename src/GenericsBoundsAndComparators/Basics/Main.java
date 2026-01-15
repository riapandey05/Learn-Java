package GenericsBoundsAndComparators.Basics;



public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();  // Box is now type-safe
        box.setValue(1);  // No issue, it's an Integer
        Integer i = box.getValue();  // No casting needed
        System.out.println(i);



    Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println("Key: " + pair.getKey());   // Prints: Key: Age
        System.out.println("Value: " + pair.getValue());
}}
//In simpler terms, generics allow you to write code that can work with any object type while ensuring
// type safety at compile time.
//
//Generics help us write more flexible and reusable code. For example, without generics,
// we would have to write multiple versions of the same class to handle different data types,
// leading to code duplication.