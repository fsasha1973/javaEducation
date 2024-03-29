package lr8.zd2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class File_ByteRead_SamBuff {
    //Считывание по 5 символов (буфер)
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff=new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count !=-1){
                System.out.println("количество="+count+", buff="+ Arrays.toString(buff)+", str="
                        +new String(buff, 0, count,"cp1251"));//"UTF8"
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        String fileName="C:\\tmp\\File5.txt";
        //переменная объявляется до секции try, чтобы не ограничивать область видимости
        InputStream inFile=null;
        try{
            inFile=new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e){
            System.out.println("Ошибка открытия-закрытия файла "+fileName+e);
        } finally { //Корректное закрытие потока
            if (inFile !=null){
                try {
                    inFile.close();
                }catch (IOException ignore){
                    /*NOP*/ //"No OPeration" - ничего не делать
                }
            }
        }
    }
}
//Прочитать и вывести на экран информацию из предварительно
//созданного файла с использованием буфера в 5 байт.