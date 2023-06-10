package lr11.zd7;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        int N = 100000; // Количество людей в круге
        LinkedList<Integer> circle = new LinkedList<>();
        // Заполняем круг числами от 1 до N
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }
        int currentIndex = 0;
        // Играем до тех пор, пока не останется один человек
        while (circle.size() > 1) {
            currentIndex = (currentIndex + 1) % circle.size(); // Вычисляем индекс следующего человека для удаления
            circle.remove(currentIndex); // Удаляем второго человека в круге
        }
        // Остался последний человек
        int winner = circle.get(0);
        System.out.println("Победитель: " + winner);
    }
}

