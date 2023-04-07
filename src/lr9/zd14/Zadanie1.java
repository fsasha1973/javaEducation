package lr9.zd14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size =0;
        boolean validInput = false;
        while (!validInput){
            try {
                System.out.print("Введите размер массива: ");
                size= scanner.nextInt();
                validInput=true;
            }catch (InputMismatchException e){
                System.out.println("Ошибка: введено некорректное значение. " +
                        "Пожалуйста, введите целое число");
                scanner.next();
            }
        }
        int[] intArray=new int[size];
        for (int i=0; i<size; i++){
            validInput=false;
            while (!validInput){
                try {
                    System.out.print("Введите элемент "+i+": ");
                    intArray[i]=scanner.nextInt();
                    validInput=true;
                }catch (InputMismatchException e){
                    System.out.println("Ошибка: введено некорректное значение. " +
                            "Пожалуйста, введите целое число");
                    scanner.next();
                }
            }
        }
        int sum=0;
        int count=0;
        for (int element : intArray){
            if (element>0){
                sum += element;
                count++;
            }
        }
        if (count>0){
            double average=(double) sum / count;
            System.out.println("Среднее значение среди положительных элементов: "+ average);
        }else {
            System.out.println("Нет положительных элементов");
        }
    }
}
