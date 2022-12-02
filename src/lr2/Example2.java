package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        int result = x % 5;
        int result1 = x % 7;
        if (result == 2)
            System.out.println("Введеное число делится на 5 без остатка");
        else if (result1 == 1)
            System.out.println("Введеное число не делится на 7 без остатка");


    }
}
