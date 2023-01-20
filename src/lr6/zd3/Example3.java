package lr6.zd3;

public class Example3 {
    public static void main(String[] args) {
        Task2.calcMax(1,0,-9,5,25,-101);
        Task2.calcMin(3,0,500,-2,33,-5,6,17);
        Task2.calcAvg(3,0,50,-2,33,-5,6,17);
    }
    private static class Task2{
        //наибольшее значение,
        private static void calcMax(int ... array){
            int max = array[0];
            for (int j : array) {
                max = Math.max(max, j);
            }
            System.out.println("Max array[] = "+max);
        }
        //наименьшее значение,
        private static void calcMin(int ... array){
            int min = array[0];
            for (int j : array) {
                min = Math.min(min, j);
            }
            System.out.println("Min array[] = "+min);
        }
        //среднее значение из набора чисел.
        private static void calcAvg(int ... array){
            int sum = 0;
            for (int j : array) {
                sum = j + sum;
            }
            double avg = (double)sum/array.length;
            System.out.println("Average array[] = "+avg);
        }
    }
}
// Напишите программу с классом, в котором есть статические методы, которым
//можно передавать произвольное количество целочисленных аргументов (или
//целочисленный массив). Методы, на основании переданных аргументов или массива,
//позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//значение из набора чисел.