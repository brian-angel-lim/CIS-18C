public class StacksAndQueues{
public static void main(String[] args) {
    ArrayStack as = new ArrayStack();
    as.push(1);
    as.push(10);
    as.push(100);
    System.out.println(as.size());
    System.out.println(as.pop());
    System.out.println(as.pop());
    System.out.println(as.pop());
    System.out.println(as.size());

    ArrayQueue<Integer> hiIq = new ArrayQueue();
    hiIq.enqueue(5);
    hiIq.enqueue(10);
    hiIq.enqueue(Integer.MAX_VALUE);
    System.out.println(hiIq.dequeue());
    System.out.println(hiIq.dequeue());
    System.out.println(hiIq.dequeue());

}
}
