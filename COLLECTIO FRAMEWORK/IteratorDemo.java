import java.util.ArrayList;
import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> aa = new ArrayList<>();
        aa.add("Rahul");
        aa.add("Ankit");
        aa.add("Mohanty");
        aa.add("Sarab");
        aa.add("Rupesh");
        aa.add("Muna");
        aa.add("Padhi");
        aa.add("Pal");
        aa.add("Malay");
        System.out.println("\n Retrive the Elelments For the Iterator object\n");
        Iterator<String> ii = aa.iterator();
        while (ii.hasNext()) {
            String name = ii.next();
            System.out.println(name);
            ii.remove();
        }
        System.out.println("\n Size of the elements");
    }

}
