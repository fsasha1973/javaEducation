package lr5;

public class Task5 {
    // Целочисленное поле.
    private int a;
    //Открытый метод.
    public Task5() {
        this.a = 0;
    }
    //конструктор, который работает по тому же принципу что и метод для присваивания значения полю.
    public Task5(int a) {
        if (a > 100) {
            a = 100;
        }
        this.a = a;
    }
    //Если методы вызывается без аргументов, то поле получает нулевое значение.
    public void setValue() {
        this.a = 0;
    }
    //Если переданное аргументом методу значение превышает 100, то значением полю присваивается число 100.
    public void setValue(int a) {
        if (a > 100) {
            a = 100;
        }
        this.a = a;
    }
    //Метод, позволяющий проверить значение поля.
    public int getValue() {
        return this.a;
    }
}
