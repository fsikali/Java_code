package ArrayList_b;

import java.util.ArrayList;

// To modify an element, use the set() method and refer to the index number
public class Main{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Benz");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("BMW");
        cars.set(1, "Toyota");
        System.out.println(cars);
    }
}
