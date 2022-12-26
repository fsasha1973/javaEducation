package lr5;

public class Task5 {
    private int int1; //Закрытое численное поле

    public void Arg(int n){
        System.out.println("с аргументом");
        int1 = n;
        if (n >= 100){ //Если переданное аргументом число больше 100, то значение полю присваивается 100
            int1 = 100;
        }
        if (n <= 0){ //Если переданное аргументом число меньше 0, то значение полю присваивается 0
            int1 = 0;
        }
    }
    public void Arg(){ //Если метод вызывается без аргумента, значение полю присваивается 0
        System.out.println("без аргумента");
        int1 = 0;
    }
    public int PrintInt(){ //Проверка значения поля
        return int1;
    }
    Task5(int int1){ //Конструктор который присваивает значение полю
        System.out.println("конструктор");
        this.Arg(int1);
    }
}
