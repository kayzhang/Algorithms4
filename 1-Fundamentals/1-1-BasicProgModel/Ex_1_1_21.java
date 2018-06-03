import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_21 {
    public static void printTable() {
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            StdOut.printf("%-14s%-14d%-14d%-14.3f\n", name, a, b, ((double) a) / b);
        }
    }

    public static void main(String[] args) {
        printTable();
    }
}
