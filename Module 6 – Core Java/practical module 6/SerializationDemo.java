package core;
import java.io.*;

//The class to be serialized must implement the Serializable interface.
class Student implements Serializable {
 private static final long serialVersionUID = 1L; // Recommended for versioning

 private int id;
 private String name;
 private transient String password; // 'transient' fields are not serialized

 public Student(int id, String name, String password) {
     this.id = id;
     this.name = name;
     this.password = password;
 }

 @Override
 public String toString() {
     return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", password='" + password + '\'' +
            '}';
 }
}
public class SerializationDemo {
	public static void main(String[] args) {
        String filename = "student.ser";
        Student student = new Student(101, "Alice", "secret_pass");

        // === 1. Serialization ===
        System.out.println("Original Object: " + student);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(student);
            System.out.println("Object has been serialized to '" + filename + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // === 2. Deserialization ===
        Student deserializedStudent = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            deserializedStudent = (Student) in.readObject();
            System.out.println("Object has been deserialized from '" + filename + "'");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // The deserialized object is a new instance with the same state.
        if (deserializedStudent != null) {
            System.out.println("Deserialized Object: " + deserializedStudent);
            // Notice the 'password' field is null because it was marked 'transient'
            System.out.println("Is original object same as deserialized? " + (student == deserializedStudent));
        }
    }
}

