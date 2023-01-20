package lr5.zd3;

public class Example3 {
    public static void main(String[] args) {


        Task3 d1 = new Task3();
        System.out.println(d1.a + " " + d1.b);
        Task3 d2 = new Task3(1);
        System.out.println(d2.a + " " + d2.b);
        Task3 d3 = new Task3(1, 2);
        System.out.println(d3.a + " " + d3.b);

    }

}
//
// Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов.