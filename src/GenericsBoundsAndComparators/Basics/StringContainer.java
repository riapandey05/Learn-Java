package GenericsBoundsAndComparators.Basics;

//public class StringContainer implements Container<String>{
//    private String item;
//    @Override
//    public void add(String item) {
//        this.item=item;
//    }
//
//    @Override
//    public String get() {
//        return item;
//    }
//}

// let's make this class also generic
public class StringContainer<T extends Number> implements Container<T> {
    private  T item;
    @Override
    public void add(T item) {
        this.item=item;
    }

    @Override
    public T get() {
        return item;
    }
}
