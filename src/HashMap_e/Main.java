package HashMap_e;

import java.util.HashMap;

// To remove all items use clear
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("Tanzania", "Dodoma");
        capitalCities.put("Ethiopia", "Addis Ababa");
        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
