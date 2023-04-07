package lr10.zd8;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        //Открываем файл Excel для чтения
        String filePath = "C:\\Users\\YaralovIS\\IdeaProjects\\javaEducation\\src\\lr10\\zd7\\example3.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);
        //Создаем экземпляр книги Excel из файла
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        //Получаем лист из книги по его имени
        XSSFSheet sheet = workbook.getSheet("Товары");
        //Перебираем строки и ячейки листа
        for (Row row : sheet){
            for (Cell cell : row){
                //Выводим значение ячейки на экран
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
        //Закрываем файл и освобождаем ресурс
        workbook.close();
        inputStream.close();
    }
}
//Как прочитать файл Excel