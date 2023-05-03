package lr13.zd6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Example6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int sum = 0;
        for (int i = 0; i < numThreads; i++){
            int startIndex = i * arr.length / numThreads;
            int endIndex = (i + 1) * arr.length / numThreads;
            executor.submit(new ArraySumTask(arr, startIndex, endIndex));
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Количество элементов массива: " + ArraySumTask.sum);
    }
    static class ArraySumTask implements Runnable{
        private final  int[] arr;
        private final int startIndex;
        private final int endIndex;
        private static int sum = 0;
        public ArraySumTask(int[] arr, int startIndex, int endIndex){
            this.arr = arr;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            int LocalSum = 0;
            for (int i = startIndex; i < endIndex; i++){
                LocalSum += arr[i];
            }
            synchronized (ArraySumTask.class){
                sum += LocalSum;
            }
        }
    }
}
// Напишите функцию, которая суммирует элементы в массиве целых чисел при помощи многопоточности.
// Количество потоков должно быть равно количеству ядер процессора