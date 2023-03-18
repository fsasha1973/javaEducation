package lr9.zd1;

public class Primer2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
            //System.out.println("1");
        }catch (Exception e){
            System.out.println("2 "+e);
        }
        System.out.println("3");
    }
}