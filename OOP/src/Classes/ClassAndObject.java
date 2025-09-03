package Classes;

class Student {
    String name;
    int rollNo;
    int age;
    String address;

    public Student(String name, int rollNo, int age, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.address = address;
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student student1 = new Student("Vedansh Sharma", 21, 21, "Surat, Gujarat, 394140");
        System.out.println(student1.name);
    }
}
