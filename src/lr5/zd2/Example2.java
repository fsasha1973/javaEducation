package lr5.zd2;

public class Example2 {
    public static void main(String[] args) {
        Task2 task = new Task2();
        task.setStart('A');
        task.setEnd('F');
        task.print();

    }
}

//Напишите программу с классом, у которого есть два символьных поля и
//метод. Он возвращает результат, и у него нет аргументов. При вызове метод
//выводит в консольное окно все символы из кодовой таблицы, которые
//находятся «между» символами, являющимися значениями полей объекта (из
//которого вызывается метод). Например, если полям объекта присвоены
//значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
//выводиться все символы от ‘A’ до ‘D’ включительно.