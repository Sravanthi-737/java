// Parent class with private fields and method
class PrivateExample {
    // Private fields
    private String name = "John Doe";
    private int age = 25;

    // Private method
    private void showMessage() {
        System.out.println("This is a private method.");
    }

    // Public method to access private method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        showMessage(); // Calling private method within the same class
    }
}

// Subclass attempting to access private members
class SubClassExample extends PrivateExample {
    public void tryAccess() {
        // System.out.println("Name: " + name); // ERROR: Cannot access private field
        // showMessage(); // ERROR: Cannot access private method
        System.out.println("Cannot access private fields/methods directly in subclass.");
    }
}

// Main class
public class PrivateAccessDemo {
    public static void main(String[] args) {
        // Create an object of PrivateExample
        PrivateExample obj = new PrivateExample();
        obj.display(); // Accessing private fields through a public method

        // Create an object of SubClassExample
        SubClassExample subObj = new SubClassExample();
        subObj.tryAccess(); // Trying to access private members (Not allowed)
    }
}