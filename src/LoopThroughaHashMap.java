import java.util.HashMap;

public class LoopThroughaHashMap {
    //Loop through the items of a HashMap with a for-each loop.
    //Note: Use the keySet() method if you only want the keys,
    // and use the values() method if you only want the values
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington Dc");
        for (String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + " value: " + capitalCities.get(i));
        }
    }

}
