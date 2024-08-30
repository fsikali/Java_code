package ArrayList_i;

import java.util.ArrayList;
import java.util.Collections;

// Sort an ArrayList of integers
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(50);
        myNumbers.add(10);
        myNumbers.add(100);
        myNumbers.add(20);
        Collections.sort(myNumbers);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
