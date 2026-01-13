package LearnOOps4.AbstractionandGeneralization;

public class Horse extends Mammal{

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedhair() {
        System.out.println(getExplicitType() +"shed in");
    }

    @Override
    public void makenoise() {

    }
}
