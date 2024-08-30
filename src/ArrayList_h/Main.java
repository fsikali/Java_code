package ArrayList_h;

import java.util.ArrayList;
import java.util.Collections;

// Another useful class in java.util package is the Collections class, which include the sort()
// method for sorting lists alphabetically or numerically
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars); // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
    }
}