package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        int[] Array = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            Array[i] = random.nextInt( 100);
            System.out.println(Array[i]);
        }
    }
}
//Напишите программу, в которой создается целочисленный
//массив, заполняется случайными числами и после этого значения элементов в
//массиве сортируются в порядке убывания значений