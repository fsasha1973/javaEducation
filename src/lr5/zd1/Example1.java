package lr5.zd1;

public class Example1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.setCh1('k');
        System.out.println("getCodeSymbol " + task1.getCodeSymbol());

        task1.snowCodeAndValue();

    }
}
// 1. Напишите программу с классом, в котором есть закрытое символьное поле
//и три открытых метода. Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа. Третий
//метод позволяет вывести в консольное окно символ (значение поля) и его код