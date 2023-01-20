package lr4.zd5;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        int[][] data = new int[5][10];
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                data[i][j] = r.nextInt(100);
            }
        }

        System.out.println("==========");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposed = new int[10][5];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                transposed[i][j] = data[j][i];
            }
        }

        System.out.println("\r\n========");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// Напишите программу, в которой создается двумерный целочисленный
//массив. Он заполняется случайными числами. Затем в этом массиве строки и
//столбцы меняются местами: первая строка становится первым столбцом,
//вторая строка становиться вторым столбцом и так далее. Например, если
//исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//из 5 строк и 3 столбцов.