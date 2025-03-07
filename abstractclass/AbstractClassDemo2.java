// Abstract class with an abstract and a non-abstract method
abstract class Shape {
    // Abstract method (must be implemented in subclasses)
    abstract void draw();

    // Non-abstract method
    void show() {
        System.out.println("This is a shape.");
    }
}

// Subclass extending the abstract class
class Circle extends Shape {
    // Implementing the abstract method
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }

    // Creating an instance of the child class inside itself and calling abstract methods
    void createInstanceAndCall() {
        Circle myCircle = new Circle();  // Creating an instance of the child class
        myCircle.draw();                 // Calling the abstract method
    }
}

// Main class
public class AbstractClassDemo2 {
    public static void main(String[] args) {
        // Creating an object of the child class
        Circle obj = new Circle();

        // Calling method that creates another instance inside the class
        obj.createInstanceAndCall();
    }
}