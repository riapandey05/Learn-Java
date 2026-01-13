package AbstractionandGeneralization;

public class Dog extends Animal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
       System.out.println("speed is "+speed);
    }

    @Override
    public void makenoise() {
        if(type=="Wolf"){
            System.out.println("Howling");
        } else{
            System.out.println("WOof");
        }

    }
}
