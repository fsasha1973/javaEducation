package lr3;

public class Example8 {
    public static void main(String[] args) {
        int n = 10;
        char[] charArray = new char[n];
        char b = 'a';

        for (int i = 0; i < charArray.length; i++){
            charArray[i] = b;
            b+=2;
            System.out.print(charArray[i] + "\t");
        }

        System.out.println();
        for (int i = charArray.length - 1 ; i >= 0; i--){
            System.out.print(charArray[i] + "\t");
        }
    }
}
//Напишите программу, в которой создается одномерный
//символьный массив из 10 элементов. Массив заполняется буквами «через
//одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
//' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
//порядке. Размер массива задается переменной