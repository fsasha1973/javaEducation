package lr2.zd2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое целое число");
        int x = in.nextInt();


        if(x / 5 == 2 && x / 7 == 1){
            System.out.println("Введеное число удовлетворяе " +
                    "требуемым критериям");;
        } else {
            System.out.println("Введеное число не удовлетворяе " +
                    "требуемым критериям");
        }

    }
}
//Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: при делении на 5 в остатке
//получается 2, а при делении на 7 в остатке получается 1