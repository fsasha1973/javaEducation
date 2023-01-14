package lr7;

public class Example2 {
    public static void main(String[] args) {
        SuperClass2 myTest0 = new SuperClass2();
        String superClassTest0 = myTest0.toString();
        System.out.println(superClassTest0);

        SuperClass2 myTest1 = new SuperClass2("Проверить");
        String superClassTest1 = myTest1.toString();
        System.out.println(superClassTest1);

        SuperClass2 myTest2 = new subClass2();
        String subClassTest0 = myTest2.toString();
        System.out.println(subClassTest0);

        SuperClass2 myTest3 = new subClass2("проверьте и это тоже");
        String subClassTest1 = myTest3.toString();
        System.out.println(subClassTest1);

        SuperClass2 myTest4 = new subClass2(150);
        String subClassTest2 = myTest4.toString();
        System.out.println(subClassTest2);

        SuperClass2 myTest5 = new subClass2("проверьте и это", 150);
        String subClassTest3 = myTest5.toString();
        System.out.println(subClassTest3);
    }
}
