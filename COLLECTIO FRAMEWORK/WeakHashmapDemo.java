import java.util.*;

class Temp {
    @Override
    public String toString() {
        return "JavaTechenocart";
    }

    public void finalize() {
        System.out.println("Please do not delete me");
    }

}

public class WeakHashmapDemo {
    public static void main(String[] args) {
        WeakHashMap wap = new WeakHashMap();
        Temp tt = new Temp();
        wap.put(tt, "Rahul");
        System.out.println(wap);
        tt = null;
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {

        }
        System.out.println(wap);
    }
}
