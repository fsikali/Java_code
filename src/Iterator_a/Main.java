// An Iterator is an object that can be used to loop through collections, like
// ArrayList and HashSet
// It is called an "Iterator" because "Iterating" is the technical term for looping
// To use an Iterator, you must import it from the java.util package

package Iterator_a;

// import the ArrayList class and the Iterator class

// Example - Getting an Iterator  using iterator() method

import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {

        // Make a Collection
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());
    }
}
