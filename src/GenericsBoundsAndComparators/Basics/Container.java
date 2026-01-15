package GenericsBoundsAndComparators.Basics;

public interface Container <T extends Number>{
//    In this example, the type parameter T is restricted to subclasses of Number, so only numeric types like Integer,
//    Double, etc., can be used.
    void add(T item);
    T get();

}
