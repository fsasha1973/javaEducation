package Kp1;

public class SortingByInserts {
    public static void sortingByInserts(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Исходный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        sortingByInserts(array);

        System.out.println("\nОтсортированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

