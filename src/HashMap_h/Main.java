package HashMap_h;

import java.util.HashMap;

// Loop through a HashMap with for-each loop
// N/B : Use the keySet() method if you only want the keys, and
// use the values() method if you only want the values
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("Tanzania", "Dodoma");
        capitalCities.put("Ethiopia", "Addis Ababa");

        for ( String i : capitalCities.values()) {
            System.out.println(i);
        }
    }
}
