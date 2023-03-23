package lr8.zd1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Primer1 {
    //Метод чтения данных из потока по быйтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); //Читаем один байт
            if (oneByte != -1) {    //Признак отсутствия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("/n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            //С потоком связан файл
            InputStream inFile = new FileInputStream("c:/tmp/text.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();
            //С потоком связана интернет-старница
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            //С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }

    }
}
//Прочитать и вывести на экран информацию из трех источников:
//файла на диске, интернет-страницы и массива типа byte