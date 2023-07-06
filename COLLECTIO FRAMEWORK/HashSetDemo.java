import java.util.*;

public class HashSetDemo {
    public HashSetDemo() {
        Collection<Integer> cc = new ArrayList<>();
        cc.add(3);
        cc.add(56);
        cc.add(12);
        cc.add(12);
        cc.add(26);
        cc.add(98);
        System.out.println("\n see the Elements of LIst\n");
        Iterator<Integer> ii = cc.iterator();
        while (ii.hasNext()) {
            Integer k = ii.next();
            System.out.println(k);

        }
        call(cc);
    }

    void call(Collection<Integer> aa) {
        HashSet<Integer> hh = new HashSet<>(aa);
        System.out.println("\n Retrive th element form thr set\n");
        Iterator<Integer> ss = hh.iterator();
        while (ss.hasNext()) {
            Integer n = ss.next();
            System.out.println(n);

        }
    }

    public static void main(String[] args) {
        new HashSetDemo();
    }
}
