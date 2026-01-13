package POJO3;

public class Student {
    private String id;
    private String name;
    private String dob;
    private String claslist;

//    generate a constructor using intellij


    public Student(String id, String name, String dob, String claslist) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.claslist = claslist;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getClaslist() {
        return claslist;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setClaslist(String claslist) {
        this.claslist = claslist;
    }
    //    generate a tostring using intellij

    @Override
//    override is an annotation
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", claslist='" + claslist + '\'' +
                '}';
    }
}
