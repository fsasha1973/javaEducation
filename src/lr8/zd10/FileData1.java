package lr8.zd10;

import java.io.*;
import java.util.Scanner;

public class FileData1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Вводим имя исходного файла
        System.out.println("Введите имя исходного файла: ");
        String sourceFileName = scanner.nextLine();

        // Вводим имя результирующего файла
        System.out.println("Введите имя результирующего файла: ");
        String resultFileName = scanner.nextLine();

        File sourceFile = new File(sourceFileName);
        File resultFile = new File(resultFileName);

        // Создаем потоки для чтения и записи
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile))) {

            // Читаем вторую строку и записываем ее в результирующий файл
            String num = reader.readLine();
            num = reader.readLine();
            writer.write(num);
            writer.write("\n");
            String line;
            while ((line = reader.readLine()) != null) {
                double number = Double.parseDouble(line);
                if (number > 0) {
                    writer.write(line + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
//Создать проект, позволяющий из одного, предварительно
//созданного программными средствами файла, переписать данные,
//соответствующие условию - в исходном файле содержится две строки в
//формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
//вторую строку и положительные числа.