package lr12.zd6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //вводим список целых чисел
        List<Integer> integers = new ArrayList<>();
        System.out.print("Введите список целых чисел: ");
        String line = scanner.nextLine();
        while (!line.isEmpty()){
            int num = Integer.parseInt(line);
            integers.add(num);
            line = scanner.nextLine();
        }
        //вводим число для фильтрации
        System.out.print("Введите число для фильтрации: ");
        int divisor = scanner.nextInt();
        //фильтруем числа по заданному делителю
        List<Integer> filteredIntegers = new ArrayList<>();
        for (int i : integers){
            if (i % divisor == 0){
                filteredIntegers.add(i);
            }
        }
        //выводим отфильтрованные числа
        System.out.println("Отфильтрованные числа: ");
        for (int i : filteredIntegers){
            System.out.println(i);
        }
    }
}
// Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
// содержащий только те числа, которые делятся на заданное число без остатка

