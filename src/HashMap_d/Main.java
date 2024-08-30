package HashMap_d;

import java.util.HashMap;

// Remove an item, use the remove() method and refer to the key:
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("Tanzania", "Dodoma");
        capitalCities.put("Ethiopia", "Addis Ababa");
        capitalCities.remove("Kenya");
        System.out.println(capitalCities);
    }
}
