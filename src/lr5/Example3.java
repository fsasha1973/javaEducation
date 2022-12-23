package lr5;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {


        Scanner id = new Scanner(System.in);
        System.out.println("Введите первое число");
        int int1 = id.nextInt();
        System.out.println("Введите второе число");
        int int2 = id.nextInt();
        Task3 task1 = new Task3();
        Task3 task2 = new Task3(int1);
        Task3 task3 = new Task3(int1, int2);

    }

}
//
// Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов.