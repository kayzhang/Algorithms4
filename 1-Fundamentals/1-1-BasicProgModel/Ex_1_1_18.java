public class Ex_1_1_18 {
    // mystery(a, b): a*b
    public static int mystery(int a, int b) {
        if (b == 0)     return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }

    // for-loop multiply
    public static int multiply(int a, int b) {
        int rst = 0;
        for (int i = b, weight = 1; i > 0; i /= 2) {
            rst += (i % 2) * weight * a;
            weight += weight;
        }
        return rst;
    }

    // mystery2(a, b): Math.pow(a, b)
    public static int mystery2(int a, int b) {
        if (b == 0)     return 1;
        if (b % 2 == 0) return mystery2(a*a, b/2);
        return mystery2(a*a, b/2) * a;
    }

    public static void main(String[] args) {
        System.out.println("mystery(2, 25): " + mystery(2, 25));
        System.out.println("mystery(3, 11): " + mystery(3, 11));
        System.out.println("multiply(2, 25): " + multiply(2, 25));
        System.out.println("multiply(3, 11): " + multiply(3, 11));
        System.out.println("mystery2(2, 25): " + mystery2(2, 25));
        System.out.println("mystery2(3, 11): " + mystery2(3, 11));
    }
}
