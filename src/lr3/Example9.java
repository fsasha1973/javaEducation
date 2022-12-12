package lr3;

import java.util.Arrays;
public class Example9 {
    public static void main(String[] args) {
        int size = 10;
        char chars[] = new char[size];
        char i = 'A';
        char ExChars[] = {'A','E','I','O','U','Y'};
        for (int x = 0; x < chars.length; i++) {
            for (int y = 0; y < ExChars.length; y++){
                if(i == ExChars[y]){
                    i++;
                }
            }
            chars[x] = i;
            System.out.println("Элемент массива ["+x+"} = " + chars[x]);
            x++;
        }
    }

}

