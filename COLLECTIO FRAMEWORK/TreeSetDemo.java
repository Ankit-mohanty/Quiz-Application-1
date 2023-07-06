import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("Ankit");
        ts.add("Ajit");
        ts.add("Avi");
        ts.add("Asit");
        ts.add("Amit");
        ts.add("Ajay");
        System.out.println("\n See the Elemnts of treeset object\n");
        Iterator ii = ts.iterator();
        while (ii.hasNext()) {
            String name = (String) ii.next();
            System.out.println(name);
        }

    }
}
