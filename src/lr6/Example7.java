package lr6;

public class Example7 {
    public static void main(String[] args) {
        char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с'};
        Task1.convertCharArray(alphabet);
        Task1.viewArray();

    }

    private static class Task1 {
        static int[] IntArray;

        //статический методом, аргументом которому передастся символьный массив
        private static void convertCharArray(char[] ChArray) {
            IntArray = new int[ChArray.length];
            for (int i = 0; i < ChArray.length; i++) {
                IntArray[i] = (int)ChArray[i];
            }
            //результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента
        }

        private static void viewArray() {
            for (int i = 0; i < IntArray.length; i++) {
                System.out.println("IntArray[" + i + "] = " + IntArray[i]);
            }
        }
    }
}
//Напишите программу со статическим методом, аргументом которому передастся
//символьный массив, а результатом возвращается ссылка на целочисленным массив,
//состоящий из кодов символов из массива- аргумента.