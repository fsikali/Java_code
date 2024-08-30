package ArrayList_b;

import java.util.ArrayList;

// To modify an element, use the set() method and refer to the index number
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mazda");
        cars.add("Benz");
        cars.add("Nissan");
        cars.add("Toyota");
        cars.set(2, "BMW");
        System.out.println(cars);
    }
}
