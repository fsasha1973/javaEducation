package lr4;

public class Example5 {
    public static void main(String[] args) {
        int height = 7;
        int i;

        int [][] graph = new int [height][];
        for (i =0; i < graph.length; i++){
            int j = i + 1;
            graph[i] = new int[j];
            }
        int z = 0;
        int j;
        for (i = 0; i < height; i++){
            for (j = 0; j < i + 1; j++){
                graph[i][j] = 7;
            }
        }
        for (i = 0; i < height; i++){
            int count = i + 1;

            for (j = 0; j < graph[i].length; j++){

                System.out.print(graph[i][j]);
                z++;
            }
            System.out.println(" ");
            z = 0;
        }




    }
}
//Напишите программу, в которой создается двумерный массив, который
//выводит прямоугольный треугольник;