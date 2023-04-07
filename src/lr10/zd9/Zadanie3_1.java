package lr10.zd9;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.List;

public class Zadanie3_1 {
    public static void main(String[] args) {
        try {
            //Получаем HTML-код страницы
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            //Извлекаем список новостей
            Elements newsParent = doc.select("html > body > table > tbody > tr > td > div > table > " +
                    "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " + "tr > td");

            //Выводим последние 10 новостей в консоль
            List<Node> nodes = newsParent.get(0).childNodes();
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    System.out.println("Тема: " + ((Element) nodes.get(i)).getElementsByClass
                            ("blocktitle").get(0).childNodes().get(0));
                    System.out.println("Дата: " + ((Element) nodes.get(i)).getElementsByClass
                            ("blockdate").get(0).childNodes().get(0) + "\n");
                    // Создаем объект File
                    File file = new File("C:\\tmp\\example.html");
                    // Создаем объект FileWriter
                    FileWriter writer = new FileWriter(file);
                    // Записываем данные в файл
                    writer.write(String.valueOf(newsParent));
                    // Закрываем объект FileWriter
                    writer.close();
                }
            }
            Connection connection = doc.connection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.execute().bodyStream()));

            // Читаем HTML-код страницы и выводим его на экран
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
            reader.close();
        } catch (IOException e) {
            // В случае ошибки выводим сообщение об ошибке и попытаемся переподключиться к сайту
            System.out.println("Ошибка загрузки страницы: " + e.getMessage());
            System.out.println("Попытаемся переподключиться через 10 секунд");
            try {
                Thread.sleep(10000);
                main(args);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }
}
//Добавьте обработку ошибок при получении HTML-кода страницы,
// например вывод сообщения об ошибке и попытка переподключения к сайту.