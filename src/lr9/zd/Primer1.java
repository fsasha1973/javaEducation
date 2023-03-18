package lr9.zd;

public class Primer1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        }catch (RuntimeException e){ //исключение перехвачено
            System.out.println("1 "+e); //исключение обработано
        }
        System.out.println("2");
    }
}
