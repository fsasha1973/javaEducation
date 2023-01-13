package OPD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Введите время прошедшее с начала проекта (мес.):");
        float checkPoint = in.nextFloat();
        System.out.println("Введите бюджет проекта (у.е.):");
        float budget = in.nextFloat();
        System.out.println("Введите текущие затраты (у.е.):");
        float currentExpenses = in.nextFloat();
        System.out.println("Введите запланированые сроки (мес):");
        float plannedTerm = in.nextFloat();
        System.out.println("Введите процент выполненных работ:");
        float readyNow = in.nextFloat();
        test.calculate(checkPoint, budget, currentExpenses,
                plannedTerm, readyNow);

    }
}
