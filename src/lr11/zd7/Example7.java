package lr11.zd7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции добавления linkedList = " + getRunningTime(linkedList));
    }

    private static long getRunningTime(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 20000000; i++) {
            list.add(i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
}
