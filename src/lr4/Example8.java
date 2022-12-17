package lr4;

public class Example8 {
    public static void main(String[] args) {

            int a = 9;
            int b = 8;
            int[][] Array = new int[a][b];
            int hvost = 0;
            int telo = 0;
            int h = 0;
            for (int i = 0; h < Array.length ; h++) {
                for (int j = 0; j <(Array[i].length - hvost); j++) {
                    Array[i][j] = telo;
                    telo++;
                }
                if(i< Array.length-1) {
                    i++;}
                for (int o=a-1; o > hvost; o--) {
                    Array[o][Array[i].length-1-hvost] = telo;
                    telo++;
                }
                hvost++;
            }
            int z = 0;
            for (int i = 0; i < Array.length; i++){
                int count = i+1;
                System.out.print("номер строки " + count + " : ");
                for (int j = 0; j < Array[i].length; j++){
                    System.out.print(Array[i][j]+" ");
                    z++;
                }
                System.out.println(" Количество символов в строке " + z);
                z = 0;
            }

    }
}
// Напишите программу, в которой создается двумерный числовой массив
//и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
//затем последний столбец (снизу вверх), вторая строка (слева направо) и так
//далее.