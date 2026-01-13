package POJO3;
// you see it is similar to a class but has parenthesis in which we can pass parameters
public record LPAStudent(String id, String name, String dob, String claslist) {
//   calling the constructor and printing the records is implicitly part of this record.
//    part inside the parenthesis is called the record header
//    Java creates a private final field for each component and a public accessor method for each component
}
