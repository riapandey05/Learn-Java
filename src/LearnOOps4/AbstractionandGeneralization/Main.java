package AbstractionandGeneralization;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Wolf","big",100);
//        dog.makenoise();
//        doanimalstuff(dog);

        ArrayList<Animal>animals = new ArrayList<>();
        animals.add(new Dog("German Shepherd","big",150));
        animals.add(new Fish("Goldfish","small",1));
        animals.add(new Fish("Barracuda","big",75));
        animals.add(new Dog("Pug","small",20));
        animals.add(new Horse("Clydesdale","large",1000));
        for(Animal animal : animals){
            doanimalstuff(animal);
        }
    }
    private static void doanimalstuff(Animal animal){
        animal.makenoise();
        animal.move("slow");
    }
}
