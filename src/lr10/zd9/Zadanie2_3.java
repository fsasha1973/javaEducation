package lr10.zd9;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie2_3 {
    public static void main(String[] args) {
        // Запросите у пользователя информацию о новой книге
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();
        System.out.print("Введите год выпуска книги: ");
        int year = scanner.nextInt();
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("C:\\tmp\\example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());

            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);
            jsonArray.add(newBook);



            FileWriter fileWriter = new FileWriter("C:\\tmp\\example-json.json");
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.flush();
            fileWriter.close();
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }

        }catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }
}
//Добавьте функционал для добавления новой книги в массив.