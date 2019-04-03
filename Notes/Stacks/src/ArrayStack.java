import java.util.ArrayList;

public class ArrayStack implements IStack{

    ArrayList<Integer> myData;

    public ArrayStack() {
        myData = new ArrayList<Integer>();
    }
    @Override
    public void push(Integer itemToPush) {
        myData.add(itemToPush);
    }

    @Override
    public Integer pop() {
        return myData.remove(myData.size() - 1);
    }

    @Override
    public Integer size() {
        return myData.size();
    }
}
