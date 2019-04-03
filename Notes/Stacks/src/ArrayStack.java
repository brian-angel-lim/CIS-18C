import java.util.ArrayList;

public class ArrayStack<T> implements IStack<T>{

    ArrayList<T> myData;

    public ArrayStack() {
        myData = new ArrayList<T>();
    }

    @Override
    public void push(T itemToPush) {
        myData.add(itemToPush);
    }

    @Override
    public T pop() {
        return myData.remove(myData.size() - 1);
    }

    @Override
    public Integer size() {
        return myData.size();
    }
}
