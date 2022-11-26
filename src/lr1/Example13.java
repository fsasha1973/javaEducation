package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        int a, b, result;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a number:");
        a = scan.nextInt();
        b = scan.nextInt();
        result = a + b;
        System.out.println("result = " + result);

    }
}