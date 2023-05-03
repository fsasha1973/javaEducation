package lr13.zd4;

public class Example4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            MyThread thread = new MyThread(i);
            thread.start();
        }
    }
}
//Напишите программу, которая создает 10 потоков и каждый поток выводит на экран свой номер