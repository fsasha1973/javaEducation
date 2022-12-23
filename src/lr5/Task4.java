package lr5;

public class Task4 {
    private char ch1;
    private int int1;

    Task4 (int i, char b){
        this.ch1 = b;
        this.int1 = i;
        int lenght = (int) (Math.log(int1) + 1);
        double result = ch1 + int1 * 1 / Math.pow(10, lenght);
        System.out.println("result1 = " + result + "; ch = " + (double) ch1 + "; int = " + lenght + "\n");
    }
    Task4 (double d){
        char ch1 = (char) d;
        int1 = (int) ((d - (int) d) * 100);
        System.out.println("ch = " + ch1 + "; int = " + int1 + "\n");
    }


}
