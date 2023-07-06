import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack ss = new Stack();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.push(8);
        System.out.println("Position of  8 is:" + ss.search(8));
        System.out.println("postion of 3 is :" + ss.search(3));
        System.out.println(ss);
        System.out.println("Remove the element:" + ss.pop());
        System.out.println(ss);
    }
}
