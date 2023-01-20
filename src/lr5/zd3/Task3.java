package lr5.zd3;

public class Task3 {
    // два целочисленных поля.
    public int a;
    public int b;
    // Конструктор без передачи аргумента.
    public Task3() {
        this.a = 0;
        this.b = 0;
    }
    // Конструктор с передачей одного аргумента.
    public Task3(int a) {
        this.a = a;
        this.b = 0;
    }
    // Конструктор с передачей двух аргумента.
    public Task3(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
