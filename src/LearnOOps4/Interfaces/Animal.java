package LearnOOps4.Interfaces;
class Satellite implements OrbitEarth{
    public void achieveOrbit(){
        System.out.println("Achieved orbit");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();
}
interface FlightEnabled {
// fields declared in an interface are public,static,final
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();
    void land();
    void fly();

}

interface Trackable {

    void track();
}


public abstract class Animal {

    public abstract void move();
}
