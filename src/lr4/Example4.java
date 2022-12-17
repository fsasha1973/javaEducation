package lr4;

public class Example4 {
    public static void main(String[] args) {
        int height = 5;
        int width = 9;
        int i;
        int j;
        int [][] graph = new int [height][width];
        int z = 0;
        for (i =0; i < height; i++){
            for (j = 0; j <width; j++){
                graph[i][j] = 2;
            }
        }
        for (i =0; i < height; i++){
            int count = i+1;
            System.out.print(" ");
            for (j = 0; j <width; j++){
                System.out.print(graph[i][j]+" ");
                z++;
            }
            System.out.println(" ");
            z = 0;
        }

    }
}
// Напишите программу, в которой создается двумерный массив, который
//выводи прямоугольник из цифр 2