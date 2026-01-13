package AbstractionandGeneralization;

public class Fish extends Animal {
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
       System.out.println("speed is for fish "+speed);
    }

    @Override
    public void makenoise() {
        if(type=="Goldfish"){
            System.out.println("Swish");
        } else{
            System.out.println("Splash");
        }

    }
}
