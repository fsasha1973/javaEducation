package lr11.zd8;

public class Example8 {
    public static void main(String[] args) {
        Node LinkedList = new Node();

        LinkedList.createHead(new int[]{0,1,2});
        System.out.println(LinkedList.toString());

        LinkedList.createTail(new int[]{3,2,1});
        System.out.println(LinkedList.toString());

        LinkedList.AddFirst(-1);
        System.out.println(LinkedList.toString());

        LinkedList.AddLast(17);
        System.out.println(LinkedList.toString());

        LinkedList.Insert(100,3);
        System.out.println(LinkedList.toString());

        LinkedList.RemoveFirst();
        System.out.println(LinkedList.toString());

        LinkedList.RemoveLast();
        System.out.println(LinkedList.toString());

        LinkedList.Remove(2);
        System.out.println(LinkedList.toString());

        LinkedList.createHeadRec(5);
        System.out.println(LinkedList.toStringRec(LinkedList.head));

        LinkedList.createTailRec(4);
        System.out.println(LinkedList.toStringRec(LinkedList.head));
    }
}

