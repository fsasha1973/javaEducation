package lr3;


public class Example9 {
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

