import java.util.*;

public class LinkedListDemo {
        public static void main(String[] args) {
                LinkedList<String> ll = new LinkedList<>();
                ll.add("Japan");
                ll.add("Korea");
                ll.add("USA");
                ll.add("UAE");
                ll.add("UK");
                ll.add("Russia");
                ll.add("France");
                ll.addFirst("India");
                ll.addLast("Pakistan");
                System.out.println("First Element is:" + ll.getFirst());
                System.out.println("Last Element is:" + ll.getLast());
                System.out.println("Remove the last Element:" + ll.pollLast());
                System.out.println("Remove Element is:" + ll.poll());
                System.out.println("\n See the elements of LinkedList Object\n");
                int k = ll.size();
                for (int i = 0; i < k; i++) {
                        String s = ll.get(i);
                        System.out.println(s);

                }
        }
}