package lr9.zd5;

public class Primer6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        }catch (ArithmeticException e) {
            System.out.println("1");
        //}catch (Exception e){
        }catch (NullPointerException e){
            System.out.println("2");
        }catch (RuntimeException e){
            System.out.println("3");
        }
        System.out.println("4");
    }
}
