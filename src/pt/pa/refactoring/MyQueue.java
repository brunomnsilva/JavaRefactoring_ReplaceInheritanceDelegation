package pt.pa.refactoring;

import java.util.ArrayList;

public class MyQueue<T> extends ArrayList<T> implements Queue<T> {

    @Override
    public void enqueue(T elem) throws QueueFullException, NullPointerException {
        if(elem == null) throw new NullPointerException("Null not allowed.");

        add(elem);
    }

    @Override
    public T dequeue() throws QueueEmptyException {
        if(isEmpty()) throw new QueueEmptyException();

        return remove(0);
    }

    @Override
    public T front() throws QueueEmptyException {
        if(isEmpty()) throw new QueueEmptyException();

        return get(0);
    }
}
