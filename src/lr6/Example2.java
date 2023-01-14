package lr6;

public class Example2 {
    public static void main(String[] args) {
        Task task = new Task();
        Task.strim();
        Task.strim();
        Task.strim();
        Task.strim();

        }

    public static class Task {
        private static int in1;
        public static void strim() {
            System.out.println(in1);
            in1++;
        }
    }

}
//Напишите программу с классом, в котором есть закрытое статическое
//целочисленное поле с начальным нулевым значением. В классе должен быть описан
//статический метод, при вызове которого отображается текущее значение статического
//поля, после чего значение поля увеличивается на единицу.