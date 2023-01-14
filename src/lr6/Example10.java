package lr6;

public class Example10 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task1 task2 = new Task1();
        Task1.calcMaxMin(1, 0, -9, 5, 25, -101);
        Task1.viewMaxMin();
        Task1.calcMaxMin(3, 0, 500, -2, 33, -5, 6, 17);
        Task1.viewMaxMin();
        Task1.calcMaxMin(3, 0, 50, -2, 33, -5, 6, 17);
        Task1.viewMaxMin();
    }

    protected static class Task1 {
        private static int[] MaxMin;

        //методу аргументом передается произвольное количество целочисленных аргументов
        private static void calcMaxMin(int... array) {
            int max = array[0];
            int min = array[0];
            for (int j : array) {
                max = Math.max(max, j);
                min = Math.min(min, j);
            }
            MaxMin = new int[]{max, min};
            //Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
        }

        private static void viewMaxMin() {
            System.out.println("\nMaxiMin[max] = " + MaxMin[0]);
            System.out.println("MaxiMin[min] = " + MaxMin[1]);
        }
    }
}
