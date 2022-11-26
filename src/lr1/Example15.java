package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        int a, b, result, result1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a number:");
        a = scan.nextInt();
        b = scan.nextInt();
        result = a + b;
        result1 = a - b;
        System.out.println("result = " + result);
        System.out.println("result1 = " + result1);

    }
}