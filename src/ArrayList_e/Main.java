package ArrayList_e;

import java.util.ArrayList;

// Use the ArrayList size method to find how many elements in the ArrayList
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mazda");
        cars.add("Benz");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Range");
        System.out.println(cars.size());
    }
}

