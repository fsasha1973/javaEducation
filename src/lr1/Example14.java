package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

        int a, b, c, d, e;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a number:");
        a = scan.nextInt();
        b = a - 1;
        c = a + 1;
        d = (a + b + c) * (a + b + c);
        System.out.printf("a: %d b: %d c: %d d: %d ", a, b, c, d);
    }
}