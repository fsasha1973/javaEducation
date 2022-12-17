package test1;

public class Main {
    public static void main(String[] args) {

        int x;

        Integer y = 10;
        x = y;

        String str1 = "Привет";
        String str2 = "Привет";
        System.out.println(str1 == str2);

        char ch = 'c';

        Integer i1 = 150;
        Integer i2 = 150;

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));


    }
}
