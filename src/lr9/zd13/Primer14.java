package lr9.zd13;

public class Primer14 {
    public static void m(int x) throws ArithmeticException{
        int h = 10 / x;
    }

    public static void main(String[] args) {
        try {
            int i = args.length;
            System.out.println("размер массива= "+i);
            m(i);
        }catch (ArithmeticException e){
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
