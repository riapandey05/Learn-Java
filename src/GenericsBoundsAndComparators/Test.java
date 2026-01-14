package GenericsBoundsAndComparators;

public class Test{
    public static void main(String [] args){
        MyNumber mynumber = new MyNumber(12);
        Boxx<MyNumber>box = new Boxx<>(mynumber);
        box.display();
    }
}
