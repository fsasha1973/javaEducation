package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите количество чисел в сумме");
        int x = id.nextInt();

        CalcNumbs.ForCalcNumbs(x);
    }

    private static class CalcNumbs {

        private static void ForCalcNumbs(int x) {

            int sum = 0;
            for (int i = 0; x > 0; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.printf("%d, ", i);
                    sum = sum + i;
                    x--;
                }
            }
            System.out.printf("сумма чисел: %d", sum);
        }
    }
}

//5. Напишите программу, в которой вычисляется сумма чисел,
//удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2,
// или при делении на 3 в остатке получается 1. Количество чисел в сумме
//вводится пользователем. Программа отображает числа, которые
//суммируются, и значение суммы. Предложите версии программы,
//использующие разные операторы цикла.

