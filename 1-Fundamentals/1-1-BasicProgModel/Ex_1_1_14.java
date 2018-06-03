public class Ex_1_1_14 {
    public static int lg(int i) {
        int num = i;
        int rst = 0;
        if (i <= 0) return -1;  // -1 means error
        if (i == 1) return 0;

        while (i >= 2) {
            rst++;
            i /= 2;
        }
        return rst;
    }

    public static void main(String[] args) {
        int a = lg(0);
        int b = lg(1);
        int c = lg(2);
        int d = lg(3);
        int e = lg(16);
        int f = lg(17);
        int g = lg(31);
        int h = lg(32);
        int i = lg(33);
        System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g + ", " + h + ", " + i + ".");
    }
}
