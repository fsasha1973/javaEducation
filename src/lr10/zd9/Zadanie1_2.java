package lr10.zd9;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie1_2 {
    public static void main(String[] args) throws TransformerException {
        Scanner scanner = new Scanner(System.in);
        //Добавление новой книги
        System.out.println("Введите название новой книги: ");
        String title = scanner.nextLine();
        System.out.println("Введите автора новой книги: ");
        String author = scanner.nextLine();
        System.out.println("Введите год издания новой книги: ");
        String year = scanner.nextLine();
        scanner.close();
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            //Загружаем существующий документ XML
            File xmlFile = new File("C:\\tmp\\example1.xml");
            Document doc = dBuilder.parse(xmlFile);
            //Создаем элементы книги в документе
            Element book = doc.createElement("book");
            Element title3 = doc.createElement("title");
            title3.appendChild(doc.createTextNode(title));
            Element author3 = doc.createElement("author");
            author3.appendChild(doc.createTextNode(author));
            Element year3 = doc.createElement("year");
            year3.appendChild(doc.createTextNode(year));
            //Добавляем элементы книги в документ
            book.appendChild(title3);
            book.appendChild(author3);
            book.appendChild(year3);
            //добавляем книгу в корневой элемент
            Element root = doc.getDocumentElement();
            root.appendChild(book);
            //Записываем документ в XML-файл
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(xmlFile);
            transformer.transform(source, result);
            System.out.println("Книга успешно записана!");
        }catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);

        }
    }
}
//Добавляем возможность записывать новые книги в XML-файл.