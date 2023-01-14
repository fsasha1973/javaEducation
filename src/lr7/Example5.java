package lr7;

public class Example5 {
    public static void main(String[] args) {
        SuperClass5 SuperClassTest1 = new SuperClass5("проверить это");
        SuperClassTest1.PrintToString();

        SuperClass5 SubClassTest1 = new toSubClass5("Тест подкласс 4", 150);
        SubClassTest1.PrintToString();

        subClass5 SubClassTest2 = new subClass5("Еще раз протестируйте подкласс 4", 'A');
        SubClassTest2.PrintToString();

        SuperClass5 SuperClassTest2 = new SuperClass5(SubClassTest1.getStr1());
        SuperClassTest2.PrintToString();

        SuperClass5 SuperClassTest3 = new SuperClass5(SubClassTest2.str1);
        SuperClassTest3.PrintToString();
    }
}
