package lr10.zd7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.poi.util.Configurator;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;


public class WriteExcelFileExample {
    public static void main(String[] args) throws IOException{
        //Создаем новую книгу Excel
       XSSFWorkbook workbook = new XSSFWorkbook();
        //Создаем новый лист в книге
        XSSFSheet sheet = workbook.createSheet("Товары");
        //Записываем данные в ячейки
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("ЖанрЖ Фантастика, Автор: Иванов И.И.");
        dataRow1.createCell(2).setCellValue(500.0);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("Процессор: intel Core i5, Оперативная память: 8 Гб");
        dataRow2.createCell(2).setCellValue(25000.0);
        //Записываем книгу xcel в файл
        String filePach = "C:\\Users\\YaralovIS\\IdeaProjects\\javaEducation\\src\\lr10\\zd7\\example3.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePach);
        workbook.write(outputStream);
        workbook.close();
        System.out.println("Данные записаны в файл: " + filePach);
    }
}
//Как создать файл Excel