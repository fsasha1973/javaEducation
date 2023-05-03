package lr12.zd5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class Primer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вводим список строк
        List<String> strings = new ArrayList<>();
        System.out.print("Введите список строк: ");
        String line = scanner.nextLine();
        while (!line.isEmpty()){
            strings.add(line);
            line = scanner.nextLine();
        }
        //вводим подстроку для фильтрации
        System.out.print("Введите подстроку для фильтрации: ");
        String substring = scanner.nextLine();
        //фильтруем сторки по подстроке
        List<String> filteredStrings = new ArrayList<>();
        for (String s : strings){
            if (s.contains(substring)){
                filteredStrings.add(s);
            }
        }
       //выводим фильтрованные строки
        System.out.println("Отфильтрованные строки:");
        for (String s : filteredStrings){
            System.out.println(s);
        }
    }
}
//Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//содержащий только те строки, которые содержат заданную подстроку