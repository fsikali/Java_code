package HashSet_d;

import java.util.HashSet;

// To remove all items, use the clear() method
public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");
        cars.clear();
        System.out.println(cars);
    }
}
