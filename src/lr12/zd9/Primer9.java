package lr12.zd9;

import java.util.ArrayList;
import java.util.List;

public class Primer9 {
    public static void main(String[] args) {
        //создаем список строк
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("123abc");
        strings.add("goodbye321");
        strings.add("dog");
        //фильтруем строки
        List<String> filteredStrings = filterOnlyLetters(strings);
        //выводим отфильтрованные строки
        System.out.println("Отфильтрованные строки:");
        for (String s : filteredStrings){
            System.out.println(s);
        }
    }public static List<String> filterOnlyLetters(List<String> strings){
        List<String> filteredStrings = new ArrayList<>();
        for (String s : strings){
            if (s.matches("[a-zA-Z]+")){
                filteredStrings.add(s);
            }
        }
        return filteredStrings;
    }
}
//Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//содержащий только те строки, которые содержат только буквы (без цифр и символов)