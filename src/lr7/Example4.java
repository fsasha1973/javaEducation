package lr7;

public class Example4 {
    public static void main(String[] args) {
        //Супер класс тест
        SuperClass4 superClass = new SuperClass4('A');
        String className1 = superClass.toString();
        System.out.println(className1);
        //Супер класс копия тест
        SuperClass4 superClassCopy = new SuperClass4(superClass);
        String className1copy = superClassCopy.toString();
        System.out.println(className1copy);
        //1 Подкласс тест
        subClass4 FirstSubClass = new subClass4('A',"AAA");
        String className2 = FirstSubClass.toString();
        System.out.println(className2);
        //1 Подкласс копия тест
        subClass4 FirstSubClassTestCopy = new subClass4(FirstSubClass);
        String className2Copy = FirstSubClassTestCopy.toString();
        System.out.println(className2Copy);
        //2 Подкласс тест
        toSubClass4 SecondSubClassTest = new toSubClass4('A',"AAA",320);
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
        //2 Подкласс копия тест
        toSubClass4 SecondSubClassTestCopy = new toSubClass4(SecondSubClassTest);
        String className3Copy = SecondSubClassTestCopy.toString();
        System.out.println(className3Copy);
    }
}
//Напишите программу, в которой использована цепочка наследования из трех
//классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//значений полей, переданных аргументами конструктору, а также конструктор создания
//копии.