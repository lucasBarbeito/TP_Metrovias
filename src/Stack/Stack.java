package Stack;

public interface Stack<T> {
    void push(T t);
    void pop() throws StackIsEmptyException;
    T peek() throws StackIsEmptyException;
    boolean isEmpty();
    int size();
    void empty();
}