package ArrayList_a;

import java.util.ArrayList;

// To access an element in the ArrayList, use the get() method and refer to the index number
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.get(1));
    }
}
