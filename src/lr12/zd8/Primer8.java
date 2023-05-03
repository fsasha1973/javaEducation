package lr12.zd8;

import java.util.ArrayList;
import java.util.List;

public class Primer8 {
    public static void main(String[] args) {
        //создаем список целых чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        //фильтруем числа по значению
        List<Integer> filteredNumbers = filterByValue(numbers, 14);
        //выводим отфильтрованные числа
        System.out.println("Отфильтрованные числа:");
        for (Integer n : filteredNumbers) {
            System.out.println(n);
        }
    }
    public static List<Integer> filterByValue(List<Integer> numbers, int value){
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer n : numbers){
            if (n > value){
                filteredNumbers.add(n);
            }
        }
        return filteredNumbers;
    }
}
//Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
//содержащий только те числа, которые больше заданного значения