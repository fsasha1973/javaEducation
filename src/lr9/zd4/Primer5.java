package lr9.zd4;

public class Primer5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
            //}catch (NullPointerException e){
        }catch (Exception e){
            System.out.println("1");
        }
        System.out.println("2");
    }
}
