package StackAndQueue;


public class Queue<T>{

    private Node<T> front;
    private Node<T> back;
    private int amount;

    public Queue() {
        this.amount = 0;
        front = null;
        back = null;
    }

    public void enqueue(T t) {
        Node newNode = new Node();
        newNode.data = t;
        newNode.next = null;

        if (isEmpty()){
            front = newNode;
            back = newNode;
        }
        else{
            back.next = newNode;
            back = newNode;
        }
        amount++;
    }

    public T dequeue() throws QueueIsEmptyException {
        if (!isEmpty()){
            T data = front.data;
            if (front == back){
                front = null;
                back = null;
            }
            else{
                front = front.next;
            }
            amount--;
            return data;
        }
        else{
            throw new QueueIsEmptyException();
        }
    }

    public boolean isEmpty() {
        return amount == 0;
    }

    public int length() {
        return amount;
    }

    public int size() {
        return amount;
    }

    public void empty() {
        front = null;
        back = null;
        amount = 0;
    }

    private class Node<R> {
        R data;
        Node next;
    }
}
