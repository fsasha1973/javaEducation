package lr4;

import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = id.nextLine();

        System.out.print("Введите ключ: ");
        int shift = id.nextInt();
        String encryptStr = TooEncript.encrypt(text, shift);

        System.out.print("Текст после преобразования :" + "\"" + encryptStr + "\"");

        System.out.print("\nВыполнить обратное преобразование? (д/н)");
        boolean cool = false;
        while (!cool) {
            String reply = id.next();

            if (reply.toLowerCase().equals("д")) {
                String decryptStr = TooEncript.decrypt(encryptStr, shift);
                System.out.println(decryptStr);
                cool = true;
            }

            else if (reply.toLowerCase().equals("н")) {
                System.out.println("До свидания!");
                cool = true;
            }

            else {
                System.out.println("Введите корректный ответ: ");
                cool = false;
            }
        }
    }
}
//Напишите программу «Шифр Цезаря», в которой
//необходимо реализовать собственный алфавит, остальные условия идентичны
//задаче 8