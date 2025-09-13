package core;

//overloadingpara.java
public class overloadingpara {
 // Attributes
 String name;
 int age;
 double marks;

 // Constructor 1: No parameters
 public overloadingpara() {
     name = "Unknown";
     age = 0;
     marks = 0.0;
 }

 // Constructor 2: String parameter
 public overloadingpara(String name) {
     this.name = name;
     age = 0;
     marks = 0.0;
 }

 // Constructor 3: String and int parameters
 public overloadingpara(String name, int age) {
     this.name = name;
     this.age = age;
     marks = 0.0;
 }

 // Constructor 4: String, int, and double parameters
 public overloadingpara(String name, int age, double marks) {
     this.name = name;
     this.age = age;
     this.marks = marks;
 }

 // Method to display details
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Marks: " + marks);
     System.out.println("------------------");
 }

 // Main method
 public static void main(String[] args) {
     overloadingpara p1 = new overloadingpara();                     // Default constructor
     overloadingpara p2 = new overloadingpara("Khushi");            // Name only
     overloadingpara p3 = new overloadingpara("Amit", 22);          // Name and age
     overloadingpara p4 = new overloadingpara("Riya", 21, 88.5);    // Name, age, and marks

     // Display details
     p1.displayDetails();
     p2.displayDetails();
     p3.displayDetails();
     p4.displayDetails();
 }
}