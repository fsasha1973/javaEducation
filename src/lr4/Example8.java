package lr4;


import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = id.nextLine();

        System.out.print("Введите ключ: ");
        int shift = id.nextInt();
        String encryptString = Encrypt.getEncryptString(text, shift);

        System.out.print("Текст после преобразования :" + "\"" + encryptString + "\"");

        System.out.print("\nВыполнить обратное преобразование? (y/n)");
        boolean cool = false;
        while (!cool) {
            String reply = id.next();

            if (reply.equalsIgnoreCase("y")) {
                String geEncryptString = Encrypt.geEncryptString(encryptString, shift);
                System.out.println(geEncryptString);
                cool = true;
            }

            else if (reply.equalsIgnoreCase("n")) {
                System.out.println("До свидания!");
                cool = true;
            }

            else {
                System.out.println("Введите корректный ответ: ");
            }
        }
    }
}
//Напишите программу «Шифр Цезаря», которая зашифровывает
//введенный текст. Используете кодовую таблицу символов. При запуске
//программы в консоль необходимо вывести сообщение: «Введите текст для
//шифрования», после ввода текста, появляется сообщение: «Введите ключ».
//После того как введены все данные, необходимо вывести преобразованную
//строку с сообщением «Текст после преобразования : ». Далее необходимо
//задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//если пользователь вводит «y», тогда выполнить обратное преобразование.
//Если пользователь вводит «n», того программа выводит сообщение «До
//свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
//то программа ему выводит сообщение: «Введите корректный ответ»