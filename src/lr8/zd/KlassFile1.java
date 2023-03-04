package lr8.zd;

import java.io.File;

public class KlassFile1 {
    public static void main(String[] args) {
        try {

            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Создан!!!");
                System.out.println("Полный путь 1:  " + f1.getAbsolutePath());
            }
            File f2 = new File("C:\\tmp\\File2.txt");
            f2.createNewFile();
            System.out.println("Полный путь 2:  " + f2.getAbsolutePath());

            File f3 = new File("C:\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Полный путь 3:  " + f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Ошибка!!! "+e);
        }
    }
}
