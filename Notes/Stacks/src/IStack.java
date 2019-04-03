//we're creating T, which is a "generic"... Java's version of C++'s template

public interface IStack<T> {
    public void push(T itemToPush);
    public T pop();
    public Integer size();
}
