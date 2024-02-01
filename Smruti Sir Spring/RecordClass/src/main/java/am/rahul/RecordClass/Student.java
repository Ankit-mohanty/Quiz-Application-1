package am.rahul.RecordClass;

 record Demo(String name, int roll, double fee) {
// JAVA -p Demo

}

public class Student { // We use record during DTO class..Only tansfer data time.
    public static void main(String[] args) {
        var s1= new Demo("Ankit", 01, 2500.12);
        System.out.println(s1);
    }
}
