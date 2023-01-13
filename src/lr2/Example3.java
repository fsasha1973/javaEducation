package lr2;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();
        int result = x % 4;

        if (result == 0 && x >= 10){
            System.out.println("число делится на 4 и не < 10");
        } else {
            System.out.println("число не делится на 4 или < 10");
        }

    }
}
//Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: число делится на 4, и при
//этом оно не меньше 10