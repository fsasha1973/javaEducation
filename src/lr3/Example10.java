package lr3;

import java.util.*;
import java.util.Random;

public class Example10 {
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

        for (int j = 0; j < arr.length; j++){
            if(arr[j] < minimal){
                minimal = arr[j];
            }
        }
        System.out.println();

        System.out.println("Минимальный элемент " + minimal);

        List<Integer> list = new ArrayList<Integer>();          //list of minimals' indexes

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == minimal){
                list.add(i);
            }
        }

        if(list.size() == 1){
            for (int kl = 0; kl < list.size(); kl++){
                System.out.print("Position is " + list.get(kl));
            }
        } else {
            System.out.print("Его позиция ");
            for (int kl = 0; kl < list.size(); kl++) {
                System.out.print(list.get(kl) + " || ");
            }
        }
    }
}

