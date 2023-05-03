package lr12.zd10;

import java.util.ArrayList;
import java.util.List;

public class Primer10 {
    public static void main(String[] args) {
        //создаем список целых чисел
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(12);
        integers.add(17);
        integers.add(3);
        integers.add(20);
        //фильтруем числа
        List<Integer> filteredIntegers = filterLessThan(integers, 15);
        //выводим отфильтрованные числа
        System.out.println("Отфилтрованные числа:");
        for (Integer i : filteredIntegers){
            System.out.println(i);
        }
    }
    public static List<Integer> filterLessThan(List<Integer> integers, int value){
        List<Integer> filteredIntegers = new ArrayList<>();
        for (Integer i : integers){
            if (i < value){
                filteredIntegers.add(i);
            }
        }
        return filteredIntegers;
    }
}
//Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
//содержащий только те числа, которые меньше заданного значения