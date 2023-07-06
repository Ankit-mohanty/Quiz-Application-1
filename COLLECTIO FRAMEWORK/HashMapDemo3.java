import java.util.*;

public class HashMapDemo3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(new String("First"), new String("Rahul"));
        map.put(new String("First"), new String("Ankit"));
        map.put(new String("First"), new String("Mohanty"));
        Set<String> ss = map.keySet();
        Iterator<String> ii = ss.iterator();
        while (ii.hasNext()) {
            String key = ii.next();
            String value = map.get(key);
            System.out.println("Key is:" + key + "      value is:" + value);
        }
    }
}
