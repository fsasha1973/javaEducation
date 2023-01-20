package lr5.zd2;

public class Task2 {
    // два символьных поля
    private char start;
    private char end;
    //Один из методов позволяет присвоить значение полю.
    public void setStart(char s) {
        this.start = s;
    }

    public void setEnd(char e) {
        this.end = e;
    }
    //Он возвращает результат, и у него нет аргументов.
    public void print(){
        /*При вызове метод выводит в консольное окно все символы из кодовой таблицы, которые находятся «между» символами,
          являющимися значениями полей объекта (из которого вызывается метод*/
        if (this.end >= this.start){
            char c = this.start;
            while (c <= this.end){
                System.out.println(c);
                c++;
            }
        }

    }
}
