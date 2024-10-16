package ArrayList_f;

import java.util.ArrayList;

// Looping through the elements of an ArrayList with for loop,
// and use the size() method to specify how many times the loop should run
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");
        for (int i = 0; i < cars.size(); i++) { // for loop can be replaced with enhanced loop i.e. for each loop
            System.out.println(cars.get(i));
        }
    }
}
