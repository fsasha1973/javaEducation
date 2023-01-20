package lr1.zd8;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Input day: ");
        String day = in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input age: ");
        int age = in.nextInt();

        System.out.printf("Dey: %s Age: %d Month: %s \n", day, age, month);
//        in.close();
    }
}
