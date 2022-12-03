package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int n = in.nextInt();
        System.out.println("Количество тысяч в числе: " + (n/1000)%10);
    }
}
