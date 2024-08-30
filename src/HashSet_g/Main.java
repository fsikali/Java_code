package HashSet_g;

import java.util.HashSet;

// Other Types, Items in a HashSet are objects
// Example - Create a HashSet that stores integers objects

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> score = new HashSet<>();
        score.add(15);
        score.add(2);
        score.add(5);
        score.add(10);
        score.add(20);

        for ( int i = 10; i <= 30; i++) {
            if ( score.contains(i)) {
                System.out.println(i + " was found in the set");
            } else {
                System.out.println(i + " was not found in the set");
            }
        }
    }
}
