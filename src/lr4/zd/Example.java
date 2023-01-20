package lr4.zd;

public class Example {
    public static void main(String[] args) {
        int figure = 10; // число строк которое необходимо вывести
        int i ; // переменная задает число, необходимое для расчета количества строк
        int j ; // переменная задает число, необходимое длч расчета количества колонок (символов в строке)
        int z; // переменная необходима для вывода служебного сообщения о количества символов в строке;

        for (i = 1 ; i <= figure; i++) {
            System.out.print(i + " ");
            z = 0;
             for (j = -5; j < figure; j++) {
                 System.out.print("+");
                 z = z + 1;
             }
            System.out.println( + z);
        }
    }
}
