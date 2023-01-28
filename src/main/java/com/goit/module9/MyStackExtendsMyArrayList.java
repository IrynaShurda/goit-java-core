package com.goit.module9;

public class MyStackExtendsMyArrayList<T> extends MyArrayList<T> {

    public void add(T value) {
        super.add(value);
    }

    public int size() {
        return super.size();
    }

    public T peek() {
        return super.get(size() - 1);
    }

    public T pop() {
        return super.remove(size() - 1);
    }

    public void clear() {
        super.clear();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
