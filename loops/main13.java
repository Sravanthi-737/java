public class main13 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;

        // Check for the largest number using multiple if-else statements
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }
    }
}