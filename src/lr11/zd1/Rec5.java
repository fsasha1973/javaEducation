package lr11.zd1;

public class Rec5 {
    private static int step = 0;
    public static int fact(int n) {
        space();
        System.out.println("" + n + "-> ");
        step++;
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fact(n - 2) + fact(n - 1);
        }
    }
    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }
}
