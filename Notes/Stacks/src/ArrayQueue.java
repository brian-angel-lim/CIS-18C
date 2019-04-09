import java.util.ArrayList;

public class ArrayQueue<T> implements IQueue<T>{
    ArrayList<T> myData;
    Integer indexToRemove = 0;

    public ArrayQueue() {
        myData = new ArrayList();
    }

    @Override
    public void enqueue(T itemToEnqueue) {
        myData.add(itemToEnqueue);
    }

    @Override
    public T dequeue() {
        if (indexToRemove < myData.size()) {
            T itemRemoved = myData.get(indexToRemove);
            myData.remove(indexToRemove);
            indexToRemove++;
            return itemRemoved;
        }
        return null;
    }


}
