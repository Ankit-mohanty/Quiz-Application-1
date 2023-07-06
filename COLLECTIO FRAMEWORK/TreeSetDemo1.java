import java.util.*;

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        if (i1 < i2) {
            return +1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet ts1 = new TreeSet();
        ts1.add(12);
        ts1.add(13);
        ts1.add(52);
        ts1.add(56);
        ts1.add(45);
        ts1.add(85);
        System.out.println("\n See the element in Natural Shortint Order\n");
        Iterator ii = ts1.iterator();
        while (ii.hasNext()) {
            Integer xx = (Integer) ii.next();
            System.out.println(xx + "\t");
        }
        TreeSet ts2 = new TreeSet(new MyComparator());
        ts2.add(12);
        ts2.add(13);
        ts2.add(52);
        ts2.add(56);
        ts2.add(45);
        ts2.add(85);
        System.out.println("\n See the elements in Costmized order\n ");
        Iterator ll = ts2.iterator();
        while (ll.hasNext()) {
            Integer xx1 = (Integer) ii.next();
            System.out.println(xx1 + "\t");
        }
    }
}
