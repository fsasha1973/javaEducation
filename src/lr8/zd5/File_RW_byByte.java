package lr8.zd5;

import java.io.*;

public class File_RW_byByte {
    public static void main(String[] args) throws IOException{
        Reader in=null;
        Writer out=null;
        try {
            in=new FileReader("C:\\tmp\\File1.txt"); //файл для чтения
            out=new FileWriter("C:\\tmp\\File2.txt", true); //файл для записи
            //Данные записываются побайтно, как и для
            //InputStream/OutputStream
            int oneByte;    //переменная, в которую считываются данные
            while ((oneByte=in.read()) !=-1){
                // out.writer((char)oneByte);   //запись с удалением ранее существующих даннфх
                out.write((char)oneByte);       //запись с добавлением данных в конец
                System.out.print((char) oneByte);
            }
        }catch (IOException e){
            System.out.println("Ошибка!!!!! ");
        }
        finally {
            in.close();
            out.close();
        }
    }
}
