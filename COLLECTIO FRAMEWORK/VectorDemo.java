import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vv = new Vector<>();
        vv.add("Jagu");
        vv.add("Munu");
        vv.add("Rahul");
        vv.add("Muna");
        vv.add("Avi");
        vv.add("Tali");
        vv.add("Rupa");
        vv.add("Pal");
        System.out.println("Vector size is :" + vv.size() + "\t Capacity is :" + vv.capacity());
        ArrayList<String> aa = new ArrayList<>();
        aa.add("Adi");
        aa.add("Anu");
        aa.add("Ankit");
        vv.addAll(aa);
        System.out.println("\n See the elements of vector\n");
        for (int i = 1; i <= vv.size(); i++) {
            String s = vv.get(i);
            System.out.println(s);
        }
    }
}
