public class Ex_1_1_15 {
    public static int[] histogram(int[] a, int M) {
        int[] b = new int[M];

        for (int i : a) {
            if (i < M)
                b[i]++;
        }

        return b;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 3, 4, 5, 4, 8, 6, 10, 7};
        int[] b = histogram(a, 5);
        int[] c = histogram(a, 10);
        int[] d = histogram(a, 15);
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
        for (int i : b)
            System.out.print(i + " ");
        System.out.println();
        for (int i : c)
            System.out.print(i + " ");
        System.out.println();
        for (int i : d)
            System.out.print(i + " ");
        System.out.println();
    }
}
