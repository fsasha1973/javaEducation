package lr11.zd6;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Заполнение HashMap 10 объектами
        map.put(1, "horse");
        map.put(2, "hippopotamus");
        map.put(3, "cat");
        map.put(4, "cat");
        map.put(5, "mouse");
        map.put(6, "lynx");
        map.put(7, "crocodile");
        map.put(8, "cow");
        map.put(9, "deer");
        map.put(10, "hamster");

        // Нахождение строк у которых ключ > 5
        System.out.println("Ключ > 5:");
        for (int key : map.keySet()) {
            if (key > 5) {
                System.out.println(map.get(key));
            }
        }
        // Вывод строк через запятую если ключ = 0
        for (int key : map.keySet()) {
            if (key == 0) {
                System.out.print(map.get(key) + ", ");
            }
        }
        // Перемножение всех ключей, где длина строки > 5
        int result = 1;
        for (int key : map.keySet()) {
            if (map.get(key).length() > 5) {
                result *= key;
            }
        }
        if (result == 1) {
            System.out.println("нет строк с длиной более 5");
        } else {
            System.out.println("произведение ключей = " + result);
        }
    }
}
//Заполнить HashMap 10 объектами <Integer, String>. Найти строки у которых ключ> 5.
// Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки>5