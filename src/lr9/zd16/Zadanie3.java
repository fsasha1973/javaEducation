package lr9.zd16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Вводим размер массива
        System.out.print("Введите количество элиментов массива: ");
        int n=0;
        try {
            n = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Ошибка: введена строка вместо числа");
            return;
        }
        //Создаем массив для хранения элементов
        byte[] array=new byte[n];
        //Вводим элемент массива
        for (int i=0; i<n; i++){
            System.out.print("Введите элемент массива: ");
            try {
                array[i] = scanner.nextByte();
            }catch (InputMismatchException e){
                System.out.println("Ошибка: введено значение за границами диапазона типа");
                return;
            }
        }
        //Вычисляем сумму элементов
        int sum=0;
        for (int i=0; i<n; i++) {
           sum+=array[i];
        }
        //Выводим результат
        System.out.println("Сумма элементов массива: "+sum);
    }
}
