package lr3;


public class Example8 {
    public static void main(String[] args) {
        int size = 10;
        char[] chars = new char[size];
        char i = 'A';
        char[] ExChars = {'A','E','I','O','U','Y'};
        for (int x = 0; x < chars.length; i++) {
            for (char exChar : ExChars) {
                if (i == exChar) {
                    i++;
                }
            }
            chars[x] = i;
            System.out.println("Элемент массива ["+x+"} = " + chars[x]);
            x++;
        }
    }

}

//Напишите программу, в которой создается массив и заполняется случайными числами.
// Массив отображается в консольном окне.
// В этом массиве необходимо определить элемент с минимальным значением.
// В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
// Если элементов с минимальным значе-нием несколько, должны быть выведены индексы всех этих элементов.