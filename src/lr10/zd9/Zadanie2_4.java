package lr10.zd9;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

public class Zadanie2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    try {
        JSONParser parser = new JSONParser();
        Object obj = parser
                .parse(new FileReader("C:\\tmp\\example-json.json"));
        JSONObject jsonObject = (JSONObject) obj;
        System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");

        System.out.println("Введите название книги для ее удаления: ");
        String title = scanner.nextLine();
        Iterator iterator = jsonArray.iterator();
        boolean founded = true;
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
                founded = false;
                System.out.println("Книга "+title+" Удалена");
            }
        }
        if (founded){
            System.out.println("Такой книги нет");
        }

        for (Object o : jsonArray){
            JSONObject book = (JSONObject) o;
            System.out.println("\nТекущий элемент: book");
            System.out.println("Название книги: "+ book.get("title"));
            System.out.println("Автор: "+ book.get("author"));
            System.out.println("Год издания: "+ book.get("year"));
         }
        }catch (Exception e){
        e.printStackTrace();
        }
    }

}
//Добавьте функционал для удаления книги из массива по названию.