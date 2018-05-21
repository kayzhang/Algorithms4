import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_27 {

    // slow
    public static double binomial1(int N, int k, double p) {
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomial1(N-1, k, p) + p * binomial1(N-1, k-1, p);
    }

    // memorization
    public static double binomial2(int N, int k, double p) {
        double[][] b = new double[N+1][k+1];

        // base cases
        for (int i = 0; i <= N; i++) b[i][0] = Math.pow(1.0 - p, i);
        // b[0][0] = 1.0;

        // recursive formula
        for (int i = 1; i <= N; i++) {
            // for (int j = 1; j <= k; j++) {
            // i <= k && j <= i is better
            for (int j = 1; j <= k && j <= i; j++) {
                b[i][j] = p * b[i-1][j-1] + (1.0 - p) *b[i-1][j];
            }
        }
        return b[N][k];
    }

    // recursion with memorization
    public static double binomial3(int N, int k, double p) {
        double[][]  bino = new double[N+1][k+1];

        // 此处必须把矩阵中需要更新的元素 (i <= j) 初始化为 -1 作为需要递归更新的标志，因为当 N 足够大时，
        // 如 N = 2000 时，bino[2000][5] == 0，此时 0 不能再作为需要更新的标志位了，否则会继续递归造成
        // 重叠。另外，对于 (i > j) 的部分，不需要递归更新，只需直接返回 0.0，因此可以此处直接省略对其进行初始化。
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k && j <= i; j++) {
                bino[i][j] = -1;
            }
        }

        return binomial3(N, k, p, bino);
    }

    public static double binomial3(int N, int k, double p, double[][] bino) {
        // base cases
        if (N == 0 && k == 0) return 1.0;
        // 此处添加 N < k，虽然其值本身就是 0.0，可以通过下一条语句返回 bino[N][k]，
        // 但直接返回 0.0 可以避免进行数组访问，降低了复杂度。
        if ( (N < 0 || k < 0) || (N < k) ) return 0.0;
        if (bino[N][k] != -1) return bino[N][k];

        bino[N][k] = p * binomial3(N-1, k-1, p, bino) + (1 - p) * binomial3(N-1, k, p, bino);
        return bino[N][k];
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);
        // StdOut.println(binomial1(N, k, p));
        StdOut.println(binomial2(N, k, p));
        StdOut.println(binomial3(N, k, p));
    }

}
