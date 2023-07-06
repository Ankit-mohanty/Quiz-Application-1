import java.util.*;

class Temp {
    @Override
    public String toString() {
        return "java Techenocart";
    }

    public void finalize() {
        System.out.println("Please do not kill me");
    }
}

public class HashmapDemo2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        Temp tt = new Temp();
        map.put(tt, "Rahul");
        System.out.println(map);
        tt = null;
        System.gc();
        try {
            Thread.sleep(2000);

        } catch (InterruptedException ie) {
        }
        System.out.println(map);
    }
}
