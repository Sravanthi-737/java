// Abstract class with abstract and non-abstract methods
abstract class Animal {
    // Abstract method (must be implemented by subclasses)
    abstract void makeSound();

    // Non-abstract method (already implemented)
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass extending abstract class
class Dog extends Animal {
    // Implementing the abstract method
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Main class
public class AbstractClassDemo {
    public static void main(String[] args) {
        // Creating an object of Dog
        Dog myDog = new Dog();
        
        // Calling implemented abstract method
        myDog.makeSound();
        
        // Calling non-abstract method
        myDog.sleep();
    }
}