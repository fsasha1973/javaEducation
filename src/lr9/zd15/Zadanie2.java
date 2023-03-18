package lr9.zd15;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим размерность матрицы
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        // Создаем двумерный массив для хранения матрицы
        int[][] matrix = new int[rows][cols];

        // Заполняем матрицу случайными числами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        // Выводим матрицу на экран
        System.out.println("Матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Вводим номер столбца, который нужно вывести
        int column = 0;
        while (true) {
            try {
                System.out.print("Введите номер столбца для вывода: ");
                column = scanner.nextInt();
                if (column <= 0 || column > cols) {
                    throw new IndexOutOfBoundsException();
                }
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка: введите число");
                scanner.nextLine(); // очистка буфера ввода
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ошибка: введите номер столбца от 1 до " + cols);
                scanner.nextLine(); // очистка буфера ввода
            }
        }

        // Выводим столбец на экран
        System.out.println("Столбец " + column + ":");
        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][column-1]);
        }
    }
}
