package lr4;

import java.util.Random;

public class Example7 {
    public static void main(String[] args) {
        Random random = new Random(100);
        int a = 5;
        int b = 7;
        int i, c;
        int j, d;
        int[][] Array = new int[a][b];
        for (i = 0; i < a; i++){
            for (j = 0; j < b; j ++){
                Array[i][j] = random.nextInt(100);
                System.out.println("i = "+i+"; j = "+j+"; value = "+Array[i][j]);
            }
        }
        System.out.println("=======================");

        int deleteC = random.nextInt(a-1);
        int deleteD = random.nextInt(b-1);
        System.out.println("deleteC = "+(deleteC)+";deleteD = "+(deleteD));
        System.out.println("=======================");

        int[][] tooArray = new int[a-1][b-1];
        for (i = 0, c = 0; i < a - 1; c++){
            if (c !=deleteC){
                for (j = 0, d = 0; j < b-1; d++){
                    if (d != deleteD) {
                        tooArray[i][j] = Array[c][d];
                        System.out.println("i = " + i + ";j = " + j + ";value = " + tooArray[i][j]);
                        j++;
                    }
                }
                i++;
            }

        }

    }

}
// Напишите программу, в которой создается и инициализируется
//двумерный числовой массив. Затем из этого массива удаляется строка и
//столбец (создается новый массив, в котором по сравнению с исходным
//удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//удаляемого столбца определяется с помощью генератора случайных чисел