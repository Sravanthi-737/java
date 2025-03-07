public class AccessDefaultDemo {
    public static void main(String[] args) {
        // Creating an object of AccessDefault
        AccessDefault obj = new AccessDefault();

        // Accessing default field
        System.out.println("Message: " + obj.message);

        // Calling the default method to remove the warning
        obj.displayMessage();
    }
}
