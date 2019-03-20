import java.util.LinkedList;

//Program that prints highscores
public class HighScoreList {

    public static void main(String[] args) {
        //Integer[] scoresList = new Integer[10];

        //int i= scoresList.length; i>= 0; i-- gives an ArrayIndexOutOfBoundsException since it goes out of bounds of the array size (which is 10)

        /*for (int i= scoresList.length - 1; i>= 0; i--) {
            //Breakpoints: Debugging made easy. Click on the line number, makes a red icon. Allows you to see the value of every single
            //variable live.
            scoresList[i] = i * 100;
            System.out.println(scoresList[i]);
        }*/

        //edge case - when you have only a single item... errors can happen. Gotta account for that**
        Node head = new Node(5);
        head.add(new Node(10));
        head.add(new Node(15));
        head.add(new Node(20));
        head.add(new Node(25));
        System.out.println(head.retrieve(2).data);
        System.out.println(head.search(20));
        head.remove();
        System.out.println(head.search(25));
        head.remove();

        LinkedList<Integer> l1 = new LinkedList();
        l1.add(5);
        l1.add(10);
        l1.add(15);
        System.out.println(l1.get(2));

        LinkedList<Integer> l2 = new LinkedList();
        l2.add(5);
        l2.add(10);
        l2.add(15);
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(l1 == l2); // false...  (inaccurate)
        System.out.println(l1.equals(l2)); //true (predictable results)
        //head.remove(); if this runs here then a null pointer exception occurs
        /*head.next = new Node(5);
        head.next.data = 10;
        head.next = new Node(5);
        head.next.next.data = 11;*/

    }
}
