package Kp1;

public class BubbleSorting {
    public static void bubbleSorting(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Исходный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        bubbleSorting(array);

        System.out.println("\nОтсортированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

