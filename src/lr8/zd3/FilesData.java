package lr8.zd3;

import java.io.*;
import java.util.Scanner;

public class FilesData {
    public static void main(String[] args) {
        try {
            //Создание исходного файла и запись в него чисел типа float
            File f1=new File("C:\\tmp\\numIsh.txt");
            Scanner sc=new Scanner(System.in, "cp1251");

            DataOutputStream wr=new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count=sc.nextInt();

            System.out.println("Введите числа:");
            for (int i=0; i<count; i++)
                wr.writeFloat(sc.nextFloat());

            wr.flush();
            wr.close();
            //Создание второго файла и переписывание в него чисел из первого файла
            File f2=new File("C:\\tmp\\numRez.txt");
            f2.createNewFile();
            //Поток для чтения из первого файла
            DataInputStream rd=new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            //поток для записи во второй файл
            wr=new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println(" Число "+ (float)number);
                }
            }catch (IOException e){}

            wr.flush();
            wr.close();
            rd.close();
            }catch (IOException e){
            System.out.println("End of file");
        }
    }
}
//Создать первый файл на диске и записать в него заданное
//количество вещественных чисел. Далее создать второй файл и переписать в него
//все числа из первого файла