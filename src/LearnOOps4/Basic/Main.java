package LearnOOps;

public class Main {
   public static void main() {
        Car car = new Car();
      car.describecar();
//   since fields are assigned values automatically by java if u don't assign urself, u will get null and 0 here
        car.setCarname("Mercedes");
        car.getCarname();
        car.describecar();
    }
}
