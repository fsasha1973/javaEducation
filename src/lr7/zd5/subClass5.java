package lr7.zd5;

import lr7.zd5.SuperClass5;

public class subClass5 extends SuperClass5 {

    //защищенное символьное поле
    protected char char1;

    public void setChar1(char char1) {
        this.char1 = char1;
    }
    //конструктор с двумя параметрами
    subClass5(String str1, char char1) {
        super(str1);
        this.setChar1(char1);
    }

    //переопределен метод для отображения значений полей объекта и названия класса
    @Override
    public void PrintToString() {
        String SecondFieldValue =
                " char1 = \"" + this.getChar1()+"\"";
        super.PrintToString();
        System.out.println(SecondFieldValue);
    }
    public char getChar1() {
        return char1;
    }
}