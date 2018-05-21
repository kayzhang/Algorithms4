import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_19 {
    // Recursion with overlapping subproblems.
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }

    // A better implementation of F(N) that saves computed values in an array.
    public static long Fib(int N) {
        long[] fib = new long[N + 1];
        return Fib(N, fib);
    }

    public static long Fib(int N, long[] fib) {
        // base cases
        if (N == 0) return 0;
        if (N == 1) return 1;
        if (fib[N] != 0) return fib[N];

        fib[N] = Fib(N-1, fib) + Fib(N-2, fib);
        return fib[N];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            // StdOut.println(N + " " + F(N));
            StdOut.println(N + " " + Fib(N));
        }
    }
}
