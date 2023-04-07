package lr10.zd9;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Zadanie2_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        JSONArray jsonArray;
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("C:\\tmp\\example-json.json"));
            System.out.println("Введите имя авора: ");
            String author = scanner.nextLine();
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            jsonArray = (JSONArray) jsonObject.get("books");
            boolean founded = false;
            for (Object objc : jsonArray) {
                JSONObject bookObj = (JSONObject) objc;
                if (bookObj.get("author").equals(author)) {
                    founded = true;
                    System.out.println("\nТекущий элемент: book");
                    System.out.println("Название книги: "+bookObj.get("title"));
                    System.out.println("Имя автора: "+bookObj.get("author"));
                    System.out.println("Год издания: "+bookObj.get("year"));

                }
            }
            if (!founded){
                System.out.println("Книг с таким автором  не найндено");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
//Добавьте функционал для поиска книг по автору.