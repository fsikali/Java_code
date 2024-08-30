package ArrayList_c;

import java.util.ArrayList;

// Remove an element, use the remove() method and refer to the index number
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mazda");
        cars.add("Benz");
        cars.add("Ford");
        cars.add("BMW");
        cars.remove(2);
        System.out.println(cars);
    }
}
