package com.goit.module9;


import java.util.Arrays;

public class MyArrayList<T> {
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

    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(index);
        }
        return (T) elementData[index];
    }

    public void clear() {
        for (int i = 0; i < elementData.length; i++) {
            elementData[i] = null;
        }
        lastFilledIndex = 0;
    }

    public T remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + lastFilledIndex);
        }
        Object[] elementDataNew = new Object[elementData.length - 1];

        for (int i = 0; i < index; i++) {
            elementDataNew[i] = elementData[i];
        }
        for (int i = index + 1; i < elementData.length; i++) {
            elementDataNew[i - 1] = elementData[i];
        }
        T result = (T) elementData[index];
        elementData = Arrays.copyOf(elementDataNew, elementDataNew.length);
        lastFilledIndex--;
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, lastFilledIndex));
    }
}
