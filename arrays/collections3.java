import java.util.HashMap;

public class collections3 {
    public static void main(String[] args) {
        // Create a HashMap with Student ID as the key and Student Name as the value
        HashMap<String, String> studentMap = new HashMap<>();

        // Insert at least 10 key-value mappings
        studentMap.put("5001", "Alice");
        studentMap.put("5002", "Bob");
        studentMap.put("5003", "Charlie");
        studentMap.put("5004", "David");
        studentMap.put("5005", "Eva");
        studentMap.put("5006", "Frank");
        studentMap.put("5007", "Grace");
        studentMap.put("5008", "Hannah");
        studentMap.put("5009", "Isaac");
        studentMap.put("5010", "Jack");

        // Print the HashMap
        System.out.println("Student Map: " + studentMap);
    }
}
