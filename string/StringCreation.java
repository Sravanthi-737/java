public class StringCreation {
    public static void main(String[] args) {
        // 1. Using String Literals
        String str1 = "Hello, World!";
        System.out.println("String Literal: " + str1);

        // 2. Using the new Keyword
        String str2 = new String("Hello, World!");
        System.out.println("Using new Keyword: " + str2);

        // 3. Using Character Array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println("Using Character Array: " + str3);

        // 4. Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        String str4 = sb.toString();
        System.out.println("Using StringBuilder: " + str4);

        // 5. Using StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        String str5 = sbf.toString();
        System.out.println("Using StringBuffer: " + str5);

        // 6. Using join() Method (Java 8+)
        String str6 = String.join(" ", "Hello", "World");
        System.out.println("Using join() Method: " + str6);

        // 7. Using format() Method
        String str7 = String.format("Hello, %s!", "Java");
        System.out.println("Using format() Method: " + str7);

        // 8. Using Concatenation (+ Operator)
        String str8 = "Hello" + ", " + "World!";
        System.out.println("Using Concatenation: " + str8);

        // 9. Using valueOf() Method
        int number = 123;
        String str9 = String.valueOf(number);
        System.out.println("Using valueOf(): " + str9);
    }
}