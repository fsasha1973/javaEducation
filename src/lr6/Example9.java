package lr6;

public class Example9 {
    public static void main(String[] args) {
        char[] charArray = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с'};
        Task1.RCharArray(charArray);
        Task1.viewReverseChArray();

    }

    private static class Task1 {
        private static char[] reverseCharArray;

        //статический методом, аргументом которому передастся символьный массив
        private static void RCharArray(char[] ChArray) {
            char changeChar;
            int l = ChArray.length-1;
            reverseCharArray = new char[ChArray.length];
            for (int i = 0; i < ChArray.length; i++) {
                changeChar = ChArray[i];
                reverseCharArray[i] = ChArray[l-i];
                reverseCharArray[l-i] = changeChar;
            }
        }

        private static void viewReverseChArray() {
            for (int i = 0; i < reverseCharArray.length; i++) {
                System.out.println("reverseCharArray[" + i + "] = " + reverseCharArray[i]);
            }
        }
    }
}
