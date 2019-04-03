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
}
}
