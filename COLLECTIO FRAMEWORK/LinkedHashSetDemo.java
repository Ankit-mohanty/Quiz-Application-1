import java.util.*;

public class LinkedHashSetDemo {
    public LinkedHashSetDemo() {
        Collection<String> cc = new ArrayList<>();
        cc.add("java");
        cc.add("phython");
        cc.add("Angular");
        cc.add("php");
        cc.add("React");
        cc.add("java");
        System.out.println("\n See the List Elements\n");
        Iterator<String> ii = cc.iterator();
        while (ii.hasNext()) {
            String s = ii.next();
            System.out.println(s);

        }
        call(cc);
    }

    void call(Collection<String> aa) {
        LinkedHashSet<String> hh = new LinkedHashSet<>(aa);
        System.out.println("\n Retrive the Elements\n");
        Iterator<String> kk = hh.iterator();
        while (kk.hasNext()) {
            String k = kk.next();
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        new LinkedHashSetDemo();
    }
}