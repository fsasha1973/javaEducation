package lr4;

public class Example3 {
    public static void main(String[] args) {
        int figure = 8;
        int i;
        int j;
        int z = 0;
        for (i = 1; i <= figure; i++) {
            System.out.println(" ");
            for (j = 0; j <= z; j++){
                System.out.print("+");
            }

            z = z + 1;
        }
        System.out.println(" ");
    }
}
//Напишите программу, которая выводит в консольное окно
//прямоугольный треугольник