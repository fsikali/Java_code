package HashMap_f;

import java.util.HashMap;

// To find out how many items there are, use the size() method
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("Tanzania", "Dodoma");
        capitalCities.put("Ethiopia", "Addis Ababa");
        System.out.println(capitalCities.size());
    }
}
