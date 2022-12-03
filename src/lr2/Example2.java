package lr2;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое целое число");
        int x = in.nextInt();


        if(x / 5 == 2 && x / 7 == 1){
            System.out.println("Введеное число удовлетворяе требуемым критериям");;
        } else {
            System.out.println("Введеное число не удовлетворяе требуемым критериям");
        }





    }
}
