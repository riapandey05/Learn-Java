package LearnOOps4.Basic;

public class Car {
    private String carname;
    private String model;
    private int price;
    private String colour;
    private int noofseats;
    private boolean convertible;
//generated using intellij
//    these are getter methods
    public String getCarname() {
        return carname;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getNoofseats() {
        return noofseats;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setNoofseats(int noofseats) {
        this.noofseats = noofseats;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describecar(){
        System.out.println(carname + " " + model + " " +price+" " + colour+" " + noofseats);
    }
}
