package lr5;

public class Task4 {
    // Символьное и целочисленное поле.
    public char c;
    public int a;
    // Конструктор с двумя аргументами.
    public Task4(char c, int a) {
        this.c = c;
        this.a = a;
    }
    // Конструктор с одним аргументами типа double.
    public Task4(double x) {
        this.c = (char)x;
        this.a = (char)((x - (char)x) * 100);
    }
}
