public class Ex_1_1_20 {
    public static long fac(int n) {
        if (n == 0) return 1;
        return n * fac(n - 1);
    }

    public static double lnFac(int n) {
        return Math.log(fac(n));
    }

    public static void main(String[] args) {
        System.out.println(fac(10));
        System.out.println(lnFac(10));
    }
}
