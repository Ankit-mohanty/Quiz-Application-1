import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("First", "Ankit");
        map.put("Secoend", "Rahul");
        map.put("Third", "Rahul");
        map.put("Fourth", "Phakunu");
        map.put("Fiveth", "Rupa");
        System.out.println("\n See the elements of map object\n");
        Set<String> ss = map.keySet(); // Set contain key of HashMap Object
        Iterator<String> ii = ss.iterator(); // Iterator retrives keys
        while (ii.hasNext()) {
            String key = ii.next();
            String value = map.get(key);
            System.out.println("key is:" + key + "value is:" + value);
        }
    }
}
