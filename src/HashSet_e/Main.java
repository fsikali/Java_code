package HashSet_e;

import java.util.HashSet;

// To find out how many items there are, use the size method
public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");
        System.out.println(cars.size());
    }
}