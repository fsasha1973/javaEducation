package lr9.zd12;

public class Primer13 {
    public static void main(String[] args) {
        try {
            int i = args.length;
            System.out.println("размер массива= "+i);
            int h = 10 / i;
            args[i + 1] = "10";
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс не существует");
        }
    }
}
