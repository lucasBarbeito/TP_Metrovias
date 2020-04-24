package StackAndQueue;

public class Stack<T> {

    Node<T> top;
    int size;

    public Stack() {
        this.top = null;
        size = 0;
    }

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

    public void pop() throws StackIsEmptyException {
        if (isEmpty()){
            throw new StackIsEmptyException();
        } else {
            top = top.next;
            size--;
        }
    }

    public T peek() throws StackIsEmptyException{
        if (isEmpty()){
            throw new StackIsEmptyException();
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void empty() {
        top = null;
        size = 0;
    }

    private class Node<T> {
        T data;
        Node next;

    }
}
