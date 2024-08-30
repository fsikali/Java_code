package HashMap_j;

import java.util.HashMap;

// Keys and values in HashMap are actually objects
// Example - Create a HashMap object called people that will store String keys and Integer values

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("John", 10);
        people.put("Peter", 20);
        people.put("Kevin", 30);
        people.put("James", 40);
        for (String i : people.keySet()) {
            System.out.println("Name: " + i + "       Score: " + people.get(i));
        }
    }
}

