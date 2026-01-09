package Basics;

public class switchstatements {
    public static void main(String[] args) {
        int switchvalue = 5;
        switch (switchvalue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 or a 4 or 5");
            default:
                System.out.println("Wasn't 1 or 2 or 3 or 4 or 5");
        }
    }
}
