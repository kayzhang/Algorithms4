public class Ex_1_1_3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && a == c) System.out.println(a + ", " + b + " and " + c + " are equal.");
        else                  System.out.println(a + ", " + b + " and " + c + " are not equal.");
    }
}
