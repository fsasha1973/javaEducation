package lr10.zd9;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie1_3 {
    private static final String FileName = "C:\\tmp\\example1.xml";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(new File(FileName));
            doc.getDocumentElement().normalize();

            // Поиск книги
            System.out.print("Введите автора или год издания для поиска книги: ");
            String searchQuery = scanner.nextLine();
            Element matchingBook = searchBook(doc, searchQuery);
            if (matchingBook != null) {
                String title = matchingBook.getElementsByTagName("title").item(0).getTextContent();
                String author = matchingBook.getElementsByTagName("author").item(0).getTextContent();
                String year = matchingBook.getElementsByTagName("year").item(0).getTextContent();
                System.out.println("Найдена книга: " + title + " (" + author + ", " + year + ")");
            } else {
                System.out.println("Книга не найдена");
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    private static Element searchBook(Document doc, String query) {
        NodeList books = doc.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            String author = book.getElementsByTagName("author").item(0).getTextContent();
            String year = book.getElementsByTagName("year").item(0).getTextContent();
            if (author.equals(query) || year.equals(query)) {
                return book;
            }
        }
        return null;
    }

    private static void writeToFile(Document doc, String filename) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filename));
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
//Добавляем возможность поиска книг по автору или году издания.