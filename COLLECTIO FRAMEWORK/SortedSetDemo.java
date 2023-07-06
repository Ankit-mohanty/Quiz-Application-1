import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> tt = new TreeSet<>();
        tt.add(46);
        tt.add(96);
        tt.add(85);
        tt.add(65);
        tt.add(98);
        tt.add(52);
        tt.add(120);
        System.out.println(tt);
        System.out.println("First element is:" + tt.first());
        System.out.println("Last Element is :" + tt.last());
        System.out.println("Head Element is:" + tt.headSet(null));
        System.out.println("Tail Element is:" + tt.tailSet(null));
        System.out.println("Sub Element is:" + tt.subSet(46, 52));
    }
}
