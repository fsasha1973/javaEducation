package lr4.zd9;

public class TooEncript {
    static char alphabet[] = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
            'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
            'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
    static String encryptText;

    public static String encrypt(String enText, int key) {
        char[] ArrayText = enText.toCharArray();
        char[] CharCode = new char[ArrayText.length];
        for (int i = 0; i < ArrayText.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (ArrayText[i] == alphabet[j]) {
                    CharCode[i] = alphabet[(j + key) % 33];
                } else if (CharCode[i] == 0) {
                    CharCode[i] = '*';
                }
            }

        }
        for (int i = 0; i < ArrayText.length; i++) {
            ArrayText[i] = (char) CharCode[i];
        }
        encryptText = new String(ArrayText);
        return encryptText;
    }

    public static String decrypt(String enText, int key) {
        char[] ArrayText = enText.toCharArray();
        int[] CharCode = new int[ArrayText.length];
        for (int i = 0; i < ArrayText.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (ArrayText[i] == alphabet[j]) {
                    CharCode[i] = alphabet[(j - key) % 33];
                } else if (CharCode[i] == '*') {
                    CharCode[i] = '*';
                }
            }
        }
        for (int i = 0; i < ArrayText.length; i++) {
            ArrayText[i] = (char) CharCode[i];
        }
        encryptText = new String(ArrayText);
        return encryptText;
    }
}


