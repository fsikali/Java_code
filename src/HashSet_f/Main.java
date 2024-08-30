package HashSet_f;

import java.util.HashSet;

// Loop through a HashSet with a for-each loop

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
