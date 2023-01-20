package lr1.zd9;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number month:");
        int month = in.nextInt();

        System.out.println("Input a number of days");
        int days = in.nextInt();
        if (month == 1 && days == 31) System.out.println("Январь содержит 31 дней");
        else if (month == 2 && days == 28) System.out.println("Февраль содержит 28 дней");
        else if (month == 3 && days == 31) System.out.println("Март содержит 31 дней");
        else if (month == 4 && days == 30) System.out.println("Апрель содержит 30 дней");
        else if (month == 5 && days == 31) System.out.println("Май содержит 31 дней");
        else if (month == 6 && days == 30) System.out.println("Июнь содержит 30 дней");
        else if (month == 7 && days == 31) System.out.println("Июль содержит 31 дней");
        else if (month == 8 && days == 31) System.out.println("Август содержит 31 дней");
        else if (month == 9 && days == 30) System.out.println("Сентябрь содержит 30 дней");
        else if (month == 10 && days == 31) System.out.println("Октябрь содержит 31 дней");
        else if (month == 11 && days == 30) System.out.println("Ноябрь содержит 30 дней");
        else if (month == 12 && days == 31) System.out.println("Декабрь содержит 31 дней");
        else System.out.println("Что-то не так");
    }
}

