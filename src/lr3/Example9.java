package lr3;

import java.util.*;
import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        Random r = new Random();

        int p = 10;

        int k = 10;
        int minimal = k;

        int[] arr = new int[p];

        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(k) + 1;
            if(arr[i] < minimal){
                minimal = arr[i];
            }
            System.out.print(arr[i] + "\t");
        }

        for (int value : arr) {
            if (value < minimal) {
                minimal = value;
            }
        }
        System.out.println();

        System.out.println("Минимальный элемент " + minimal);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == minimal){
                list.add(i);
            }
        }

        if(list.size() == 1){
            for (Integer integer : list) {
                System.out.print("Позиция " + integer);
            }
        } else {
            System.out.print("Его позиция ");
            for (Integer integer : list) {
                System.out.print(integer + " || ");
            }
        }
    }
}

