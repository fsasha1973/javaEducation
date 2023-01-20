package lr7.zd3;

public class Example3 {
    public static void main(String[] args) {
        SuperClass3 myTest0 = new SuperClass3();
        String superClassTest0 = myTest0.toString();
        System.out.println(superClassTest0);

        SuperClass3 myTest1 = new SuperClass3("Проверить");
        String superClassTest1 = myTest1.toString();
        System.out.println(superClassTest1);

        SuperClass3 myTest2 = new subClass3();
        String subClassTest0 = myTest2.toString();
        System.out.println(subClassTest0);

        SuperClass3 myTest3 = new  subClass3("проверьте и это тоже");
        String subClassTest1 = myTest3.toString();
        System.out.println(subClassTest1);

        SuperClass3 myTest4 = new  subClass3(150);
        String subClassTest2 = myTest4.toString();
        System.out.println(subClassTest2);

        SuperClass3 myTest5 = new  subClass3("проверьте и это", 150);
        String subClassTest3 = myTest5.toString();
        System.out.println(subClassTest3);
    }

}
//Напишите программу, в которой на основе суперкласса создается подкласс, а на
//основе этого подкласса создается еще один подкласс (цепочка наследования из трех
//классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
//параметром для присваивания значения полю и конструктор с одним параметром. Во
//втором классе появляется открытое символьное поле, метод с двумя параметрами для
//присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
//параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
//аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
//конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
//чтобы он возвращал строку с названием класса и значениями всех полей объекта