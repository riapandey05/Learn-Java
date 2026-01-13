package LearnOOps4.Inheritance;

public class Dog extends Animal{
    private String earshape;
    private String tailshape;
    public Dog(){
//        if u dont make a default constructor then java makes it for u but if u make a parameterized constructor then default constructor isn't made by java
//        super keyword is used to call the parent class's constructor from the sub class's constructor
//        this() and super() can never be called from the same constructor
//        super();
//        If you don't make a call to super then java makes it for you suing super's default constructor
//        if your super class doesn't have a default constructor then you must explicitly call super() in all of your
//        constructors, passing the right arguments to that constructor

       super("Mutt","Big",50);

    }

    public Dog(String type, double weight, String earshape, String tailshape) {
        super(type,weight<15?"small":(weight<35?"medium":"large"),weight);
        this.earshape = earshape;
        this.tailshape = tailshape;
    }
    public Dog(String type,double weight){
        this(type,weight,"Perky","Curled");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "earshape='" + earshape + '\'' +
                ", tailshape='" + tailshape + '\'' +
                "} " + super.toString();
    }
}
