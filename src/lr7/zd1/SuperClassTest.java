package lr7.zd1;

public class SuperClassTest {
    //Закрытое текстовое поле
    private String str1;

    //Конструктор с текстовым аргументом
    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }
    SuperClassTest() {
    }
    //@Override - Аннотыция указываемая для того,
    //чтобы показать что далее мы собираемся
    //переопредилять метод суперкласса
    @Override
    public String toString(){
        String superClassNameAndFildValue;
        superClassNameAndFildValue = "super" + "/n" +
                " Class name " + this.getClass().getSimpleName() + "/n" +
                " str 1 = " + this.getStr1();
        return superClassNameAndFildValue;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
