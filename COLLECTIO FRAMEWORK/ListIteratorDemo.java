import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList<Integer> aa = new LinkedList<>();
        aa.add(12);
        aa.add(85);
        aa.add(25);
        aa.add(10);
        aa.add(16);
        ListIterator<Integer> ll = aa.listIterator();
        // When We construct a ListIterator object it poine=ts before the first element.
        System.out.println("\n Traverse the Element in forword dIrection\n");
        while (ll.hasNext()) {
            Integer kk = ll.next();
            System.out.println(kk);

        }
        ll.add(68);
        System.out.println("\n Traverse the element in backward direction\n");
        while (ll.hasPrevious()) {
            Integer tt = ll.previous();
            System.out.println(tt);
        }
        System.out.println("Size of the object is:" + aa.size());

    }
}
