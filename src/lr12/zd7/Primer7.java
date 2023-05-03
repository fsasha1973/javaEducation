package lr12.zd7;

import java.util.ArrayList;
import java.util.List;

public class Primer7 {
    public static void main(String[] args) {
        //Создаем список строк
        List<String> strings = new ArrayList<>();
        strings.add("яблоко");
        strings.add("банан");
        strings.add("морковь");
        strings.add("дата");
        strings.add("баклажан");
        //фильтруем строки
        List<String> filteredStrings = filterByLength(strings, 6);
        //выводим отфильтрованные строки
        System.out.println("Отфильтрованные строки:");
        for (String s : filteredStrings){
            System.out.println(s);
        }
    }
    public static List<String> filterByLength(List<String> strings, int length){
        List<String> filteredStrings = new ArrayList<>();
        for (String s : strings){
            if (s.length() > length) {
                filteredStrings.add(s);
            }
        }
        return filteredStrings;
    }
}
//Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//содержащий только те строки, которые имеют длину больше заданного значения