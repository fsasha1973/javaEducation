package lr10.zd9;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        String filePath = "C:\\tmp\\example4.xlsx";
        FileInputStream inputStream = null;
        XSSFWorkbook workbook = null;
        try {
            inputStream = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Товары");
            if (sheet == null) {
                throw new IllegalArgumentException("Лист 'Товары' не найден в файле " + filePath);
            }
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла " + filePath + ": " + e.getMessage());
            System.out.println("Проверьте, что файл существует и доступен для чтения.");
            System.out.println("Введите 'y' для повторной попытки чтения файла, или любой другой символ для выхода:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                main(args);
            } else {
                System.out.println("Выход из программы.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка чтения файла " + filePath + ": " + e.getMessage());
            System.out.println("Введите 'y' для повторной попытки чтения файла, или любой другой символ для выхода:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                main(args);
            } else {
                System.out.println("Выход из программы.");
            }
        } finally {
            if (workbook != null) {
                try {
                    workbook.close();
                } catch (IOException e) {
                    System.err.println("Ошибка при закрытии книги: " + e.getMessage());
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.err.println("Ошибка при закрытии потока: " + e.getMessage());
                }
            }
        }
    }
}
