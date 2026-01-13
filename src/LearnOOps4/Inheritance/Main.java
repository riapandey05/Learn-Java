package LearnOOps4.Inheritance;

public class Main {
    public static void main() {
        Animal animal = new Animal("Generic Animal","Huge",400);
        doanimalstuff(animal,"slow");

        Dog dog = new Dog();
        doanimalstuff(dog,"fast");
    }
    public static void doanimalstuff(Animal animal, String speed){
        animal.makenoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }
}
