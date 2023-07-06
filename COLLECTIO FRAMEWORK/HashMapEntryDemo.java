import java.util.*;

public class HashMapEntryDemo {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("First", "Ankit");
        map1.put("Secoend", "Rahul");
        map1.put("Third", "Rahul");
        map1.put("Fourth", "Phakunu");
        map1.put("Fiveth", "Rupa");
        System.out.println("\n See the elements in Map Object\n");
        Set set = map1.entrySet();
        Iterator kk = set.iterator();
        while (kk.hasNext()) {
            Map.Entry entry = (Map.Entry) kk.next();
            System.out.println("key" + entry.getKey() + "value" + entry.getValue());
        }
    }
}
