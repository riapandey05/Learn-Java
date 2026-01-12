package POJO;

public class Main {
    public static void main() {
        for(int i=1;i<=5;i++){
            LPAStudent student = new LPAStudent("22BCE10"+i, switch (i){
                case 1 -> "Marry";
                case 2 -> "Harry";
                case 3 -> "Derry";
                case 4 -> "Serry";
                case 5 -> "Cherry";
                default -> "anonymous";
                    },"05/08/2004","Java masterclass");
            System.out.println(student);
//            we did not call the tostring method
//            every object when passed to sopln will implicitly access the tostring if u have created it in you class




            Student pojoStudent = new Student("S923006", "Ann",
                    "05/11/1985", "Java Masterclass");
            LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                    "05/11/1985", "Java Masterclass");

            System.out.println(pojoStudent);
            System.out.println(recordStudent);
//          with pojo u can use setters and getters
            pojoStudent.setClaslist("Master");
            pojoStudent.getClaslist();

//        with record , we cannot use getters and setters
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

            System.out.println(pojoStudent.getName() + " is taking " +
                    pojoStudent.getClaslist());
//            getter setter in records is without any prefix, set u cannot do because it is immutable
//            to access getter just write the field with parenthesis.
            System.out.println(recordStudent.name() + " is taking " +
                    recordStudent.claslist());

        }
    }
}
