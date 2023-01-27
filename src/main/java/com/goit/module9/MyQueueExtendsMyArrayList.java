package com.goit.module9;

public class MyQueueExtendsMyArrayList<T> extends MyArrayList<T> {

    public void add(T value) {
        super.add(value);
    }

    public int size() {
        return super.size();
    }

    public T peek() {
        return super.get(0);
    }

    public T poll() {
        return super.remove(0);
    }

    public void clear() {
        super.clear();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
