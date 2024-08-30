package HashMap_c;

import java.util.HashMap;

// access a value in the HashMap, use the get() method and refer to its key:
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("Tanzania", "Dodoma");
        capitalCities.put("Ethiopia", "Addis Ababa");
        System.out.println(capitalCities.get("Kenya"));
    }
}
