package HashSet_b;

import java.util.HashSet;

// Check if an item exists in a HashSet using contains() method
public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");
        System.out.println(cars.contains("BMW"));
    }
}
