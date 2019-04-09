import java.util.ArrayList;

public interface IQueue<T> {
    public void enqueue (T itemToEnqueue);
    public T dequeue();
}
