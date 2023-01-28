package com.goit.module9;

import java.util.Arrays;

public class MyStack<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] elementData = new Object[DEFAULT_SIZE];
    private int lastFilledIndex;

    public void add(T value) {
        elementData[lastFilledIndex] = value;
        lastFilledIndex++;
        if (lastFilledIndex == elementData.length) {
            int newSize = (elementData.length / 2) + elementData.length;
            elementData = Arrays.copyOf(elementData, newSize);
        }
    }

    public int size() {
        return lastFilledIndex;
    }

    public T peek() {
        return (T) elementData[lastFilledIndex - 1];
    }

    public T pop() {
        Object[] elementDataNew = new Object[elementData.length - 1];

        System.arraycopy(elementData, 0, elementDataNew, 0, elementData.length - 1);
        elementData = Arrays.copyOf(elementDataNew, elementDataNew.length);
        lastFilledIndex--;

        return (T) elementData[lastFilledIndex];
    }

    public void clear() {
        for (int i = 0; i < size(); i++) {
            elementData[i] = null;
        }
        lastFilledIndex = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, lastFilledIndex));
    }
}
