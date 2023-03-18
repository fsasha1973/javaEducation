package lr8.zd10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\tmp\\MyFile4.txt");
        try {
            BufferedWriter wr=new BufferedWriter(new FileWriter(file, true));
            wr.write("Первая строка\n");
            wr.write("Second line\n");
            wr.write(3.145+"\n");
            wr.write(-2.718+"\n");
            wr.write(42.0+"\n");
            wr.write(1.618223667+"\n");
            wr.write(-0.56324+"\n");
            wr.close();
            System.out.println("Данные записаны");
        }catch (IOException e){
            System.out.println("Ошибка записи: "+e.getMessage());
        }
    }
}
