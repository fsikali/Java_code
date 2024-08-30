package HashSet_c;

import java.util.HashSet;

// Remove an item, use remove() method
public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");
        cars.remove("BMW");
        System.out.println(cars);
    }
}
