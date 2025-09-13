package core;
class Person {
    String name;
    int age;

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class (Child of Person)
class Student extends Person {
    String studentId;

    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
    }
}

// Further Derived class (Child of Student → Grandchild of Person)
class GraduateStudent extends Student {
    String specialization;

    public void displayGraduateStudent() {
        System.out.println("Specialization: " + specialization);
    }
}
public class multilevel {
    public static void main(String[] args) {
        // Create object of GraduateStudent
        GraduateStudent gs = new GraduateStudent();

        // Assign values
        gs.name = "Khushi";
        gs.age = 22;
        gs.studentId = "S123";
        gs.specialization = "Computer Science";

        // Call methods from all levels
        gs.displayPerson();          // From Person
        gs.displayStudent();         // From Student
        gs.displayGraduateStudent(); // From GraduateStudent
    }
}