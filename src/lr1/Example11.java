package lr1;

import java.util.Scanner;
import java.time.Year;
public class Example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ваше имя");
        String name = in.nextLine();

        System.out.println("Ваш год рождения?");
        int year = in.nextInt();
        int yearNow = Year.now().getValue();
        int number = yearNow - year;

        System.out.println(name + " " + number);
        in.close();
    }
}