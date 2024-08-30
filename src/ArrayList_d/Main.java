package ArrayList_d;

import java.util.ArrayList;

// To remove all elements in the ArrayList, use the clear() method
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");
        cars.clear();
        System.out.println(cars);
    }
}





