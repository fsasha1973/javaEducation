package lr5;

public class Task6 {
    private int min;
    private int max;

    public void Arg(int n1, int n2){
        System.out.println("Метод с 2-мя аргументами");
        min = Math.min(n1, n2);
        max = Math.max(n1, n2);
    }
    public void Arg(int n){
        System.out.println("Метод с 1-м аргументом");
        min = Math.min(min, n);
        max = Math.max(max, n);
    }
    void PrintInt(){
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
    Task6(int n1, int n2){
        System.out.println("Конструктор с 2-мя аргументами");
        min = Math.min(n1, n2);
        max = Math.max(n1, n2);
    }
    Task6(int n){
        System.out.println("Конструктор с 1-м агрументом");
        min = Math.min(min, n);
        max = Math.max(max, n);
    }
}
