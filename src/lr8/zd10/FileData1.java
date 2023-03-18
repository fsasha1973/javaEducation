package lr8.zd10;

import java.io.*;


public class FileData1 {
    public static void main(String[] args) throws IOException {
        File inputF = new File("C:\\tmp\\File5.txt");
        File outputF = new File("C:\\tmp\\File2.txt");


        // Создаем потоки для чтения и записи
        try (BufferedReader reader = new BufferedReader(new FileReader(inputF));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputF))) {

            // Читаем вторую строку и записываем ее в файл
            String line = reader.readLine();
            line = reader.readLine();
            writer.write(line);
            writer.write("\n");
            //Записываем положительные числа в файл
            while ((line = reader.readLine()) != null) {
                double number = Double.parseDouble(line);
                if (number > 0) {
                    writer.write(line + "\n");
                }
            }

        }
    }
}
//Создать проект, позволяющий из одного, предварительно
//созданного программными средствами файла, переписать данные,
//соответствующие условию - в исходном файле содержится две строки в
//формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
//вторую строку и положительные числа.