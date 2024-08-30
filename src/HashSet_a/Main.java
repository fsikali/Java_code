package HashSet_a;

import java.util.HashSet;

// A HashSet is a collection of items where every item is unique, and it is found
// in the java.util package:

// Create a HashSet object called cars that will store strings
// and add items to it, using the add() method
public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");
        System.out.println(cars);
    }
}

// N/B -  In the example above, even though BMW is added twice it only appears
//  once in the set because every item in a set has to be unique.
