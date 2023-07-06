import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lap = new LinkedHashMap<>();
        lap.put("First", "Rahul");
        lap.put("Secoend", "Priti");
        lap.put("Third", "Parvu");
        lap.put("Fourth", "Hara");
        lap.put("Fiveth", "Ashish");
        lap.put("Sixth", "Muna");
        lap.put("Seventh", "Lucky");
        System.out.println("\nSee the elements in Linkedhashmap\n");
        Set set = lap.entrySet();
        Iterator kk = set.iterator();
        while (kk.hasNext()) {
            Map.Entry entry = (Map.Entry) kk.next();
            System.out.println("key:" + entry.getKey() + "   value:" + entry.getValue());
        }
    }
}
