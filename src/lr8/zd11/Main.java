package lr8.zd11;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        String inputFileName = "C:\\tmp\\File6.txt";
        String outputFileName = "C:\\tmp\\File7.txt";

        try {
            // Открыть файл для чтения
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));

            // Открыть файл для записи
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            String line;
            int lineNumber = 0;

            // Считывать строки из файла MyFile1.txt
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+");

                int count = 0;

                // Перебрать слова из текущей строки
                for (String word : words) {
                    char firstChar = word.toLowerCase().charAt(0);

                    // Проверить, начинается ли слово на согласную букву
                    if (isConsonant(firstChar)) {
                        count++;
                        // Записать слово и номер строки в файл MyFile2.txt
                        writer.write(lineNumber + ": " + word + "\n");
                    }
                }

                // Записать количество выбранных слов для текущей строки
                writer.write("Количество выбранных слов: " + count + "\n\n");
            }

            // Закрыть файлы
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Проверить, является ли символ согласной буквой
    public static boolean isConsonant(char c) {
        return "бвгджзклмнпрстфхцчшщ".indexOf(c) != -1;
    }
}
//Создать проект, позволяющий из одного текстового файла,
//содержащего несколько строк (тип String) заранее подготовленного текста
//на русском языке (Пушкин, Лермонтов или другой российсмки классик на
//Ваш вкус), построчно переписать в другой текстовый файл слова
//начинающиеся с согласных букв..
//Требования:
//– слова из предложения выделять методом split();
//– в новом файле следует указать номер строки, в которой искомые
//слова находились в исходном файле;
//– для каждой строки указать количество выбранных слов