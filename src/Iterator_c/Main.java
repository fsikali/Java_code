package Iterator_c;

import java.util.ArrayList;
import java.util.Iterator;

// Removing items from a Collection
// Iterators are designed to easily change the collections that they
// loop through. The remove() method can remove items from a collection while looping
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(25);

        Iterator<Integer> it = numbers.iterator();

        while(it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}

// N/B - Tyring to remove items using a for loop or a for each loop would not work
//  correctly because the collection is changing size at the same time that the code
// is trying to loop
