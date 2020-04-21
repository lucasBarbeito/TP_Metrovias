package Stack;

public class MyDynamicStack<T> implements Stack<T>{

    Node<T> top;
    int size;

    public MyDynamicStack() {
        this.top = null;
        size = 0;
    }

    @Override
    public void push(T data) {
        if (top == null){
            top = new Node();

        } else {
            Node aux = new Node();
            aux.next = (top);
            top = aux;
        }
        top.data = data;
        size++;

    }

    @Override
    public void pop() throws StackIsEmptyException {
        if (isEmpty()){
            throw new StackIsEmptyException();
        } else {
            top = top.next;
            size--;
        }
    }

    @Override
    public T peek() throws StackIsEmptyException{
        if (isEmpty()){
            throw new StackIsEmptyException();
        } else {
            return top.data;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void empty() {
        top = null;
        size = 0;
    }

    private class Node<T> {
        T data;
        Node next;

    }
}
