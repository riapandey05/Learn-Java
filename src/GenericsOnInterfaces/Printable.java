package GenericsOnInterfaces;

public interface Printable {
    void print();
}
class MyNumber extends Number implements Printable{
    private final int value;

    MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("Value: " + value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
class Boxx<T extends Number & Printable>{
//    whenever applying multiple bounds,first shld be class the second shld be interface
//    and for interface or class both, use extend only not implement
private final T item;

    // constructor
    Boxx(T item) {
        this.item = item;
    }

    void display() {
        item.print();
        System.out.println("As int: " + item.intValue());
    }
}
