package com.goit.module9;

import java.util.Arrays;

public interface MyList<T> {
    void add(T value);

    int size();

    T get(int index);

    void clear();

    T remove(int index);
}
