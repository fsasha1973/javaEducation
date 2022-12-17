package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random(100);
        int a = 5;
        int b = 3;
        int[][] Array = new int [a][b];
        int i;
        int j;
        for (i = 0; i < a; i++){
            for (j = 0; j < b; j++){
                Array[i][j] = random.nextInt(100);
                System.out.println("i = "+i+"; j= "+j+"; value= "+Array[i][j]);
            }
        }
        System.out.println("==================");

        int[][] tooArray = new int[b][a];
        for (i = 0; i < b; i++){
            for (j = 0; j < a; j++){
                tooArray[i][j] = Array[j][i];
                System.out.println("i = "+i+";j= "+j+";value= "+tooArray[i][j]);
            }
        }

    }
}
// Напишите программу, в которой создается двумерный целочисленный
//массив. Он заполняется случайными числами. Затем в этом массиве строки и
//столбцы меняются местами: первая строка становится первым столбцом,
//вторая строка становиться вторым столбцом и так далее. Например, если
//исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//из 5 строк и 3 столбцов.