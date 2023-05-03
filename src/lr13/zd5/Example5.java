package lr13.zd5;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) throws InterruptedException {
        int numThread = Runtime.getRuntime().availableProcessors(); //количество ядер процессора
        int [] array = createRandomArray(8); // создаем массив из 8 случайных чисел
        int max = findMax(array, numThread); //находим максимальное значение
        System.out.println("Max value: " + max);
    }
    private static int[] createRandomArray(int size){
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt();
        }
        return array;
    }
    private static int findMax(int[] array, int numThreads) throws  InterruptedException{
        MaxFinderWorker[] workers = new MaxFinderWorker[numThreads];
        for (int i = 0; i < numThreads; i++){
            workers[i] = new MaxFinderWorker(array, i * (array.length / numThreads),
                    (i + 1) * (array.length / numThreads));
            workers[i].start();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numThreads; i++){
            workers[i].join();
            if (workers[i].getMax() > max){
                max = workers[i].getMax();
            }
        }
        return max;
    }
}
// Напишите функцию, которая находит максимальный элемент в массиве целых чисел при помощи многопоточности.
// Количество потоков должно быть равно количеству ядер процессора