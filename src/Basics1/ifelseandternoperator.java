package Basics1;

public class ifelseandternoperator {
    static void main() {
        int age = 19;
//        if(age<18){
//            System.out.println("You are a minor");
//        }
//        else if(age>18 && age<60){
//         System.out.println("You are adult");
//        }
//        else{
//            System.out.println("You are old");
//        }
        boolean isadult = age<60 && age>=18 ? true : false;
        if(isadult){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
