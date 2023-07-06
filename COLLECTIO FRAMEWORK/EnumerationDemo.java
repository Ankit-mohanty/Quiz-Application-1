import java.util.*;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vv = new Vector<>();
        vv.add(16);
        vv.add(15);
        vv.add(86);
        vv.add(98);
        vv.add(65);
        Enumeration<Integer> ee = vv.elements();
        System.out.println("\n The element form vector \n");
        while (ee.hasMoreElements()) {
            Integer i = ee.nextElement();
            System.out.println(i);
        }
    }
}
