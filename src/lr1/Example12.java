package lr1;

import java.util.Scanner;
import java.time.Year;
public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ваш возраст?");
        int yearNow = in.nextInt();
        int year = Year.now().getValue();
        int number = year - yearNow;

        System.out.println("Год рождения " + number);
        in.close();
    }
}