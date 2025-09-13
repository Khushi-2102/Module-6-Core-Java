package core;
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    
    public void sound() {  // Method overriding
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    
    public void sound() {  // Method overriding
        System.out.println("Cat meows");
    }
}

public class polymor {
	public static void main(String[] args) {
        Animal a;  // reference of type Animal

        a = new Dog();  // Dog object
        a.sound();      // Calls Dog's version of sound() → runtime polymorphism

        a = new Cat();  // Cat object
        a.sound();      // Calls Cat's version of sound()
        
        a = new Animal(); // Animal object
        a.sound();        // Calls Animal's version
    }
}

