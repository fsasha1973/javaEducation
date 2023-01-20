package lr2.zd4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();


        if (x > 4 && x < 11) {
            System.out.println("число попадает в диапазон " +
                    "от 5 до 10 включительно");
        } else {
            System.out.println("число не попадает в диапазон " +
                    "от 5 до 10 включительно");
        }

    }
}
//Напишите программу, которая проверяет, попадает ли введение
//пользователем число в диапазон от 5 до 10 включительно