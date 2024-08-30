package Iterator_b;

import java.util.ArrayList;
import java.util.Iterator;

// Loop through a collection, use the hasNext() and next() methods of the Iterator
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ford");
        cars.add("Range");

        // Get the Iterator
        Iterator<String> it = cars.iterator();

        // Loop through the Iterator
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
