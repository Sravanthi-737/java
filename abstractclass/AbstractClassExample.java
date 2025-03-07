// Abstract class with an abstract and a non-abstract method
abstract class AbstractClass {
    // Abstract method (must be implemented in subclasses)
    abstract void start();

    // Non-abstract method
    void stop() {
        System.out.println("Vehicle has stopped.");
    }
}

// Subclass extending the abstract class
class Car extends AbstractClass {
    // Implementing the abstract method
    @Override
    void start() {
        System.out.println("Car is starting...");
    }

    // Method to create an object of the abstract class and access non-abstract methods
    void useAbstractClassMethods() {
        // Creating an object of Car (subclass)
        AbstractClass vehicle = new Car();  
        
        // Calling non-abstract method of abstract class
        vehicle.stop();
    }
}

// Main class
public class AbstractClassExample {
    public static void main(String[] args) {
        // Creating an object of Car
        Car myCar = new Car();
        
        // Calling abstract method (implemented in subclass)
        myCar.start();
        
        // Accessing the non-abstract method using the object of the subclass
        myCar.useAbstractClassMethods();
    }
}