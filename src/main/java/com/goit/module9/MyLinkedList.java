package com.goit.module9;

public class MyLinkedList<T> {
    private int size = 0;
    private Node<T> first;
    private Node<T> last;

    public void add(T value) {
        final Node<T> l = last;
        Node<T> newNode = new Node<>(l, value, null);
        last = newNode;
        if (size == 0) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(index);
        }
        Node<T> node = first;
        int counter = 0;
        while (counter != index) {
            node = node.next;
            counter++;
        }
        return node.item;
    }

    public void clear() {
        Node<T> node = first;
        while (node != null) {
            Node<T> x = node;
            x.item = null;
            x.next = null;
            x.prev = null;
            node = node.next;
        }
        first = null;
        last = null;
        size = 0;
    }

    public T remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(index);
        }
        Node<T> node = first;
        int counter = 0;
        while (counter != index) {
            node = node.next;
            counter++;
        }
        Node<T> prev = node.prev;
        Node<T> next = node.next;

        prev.next = next;
        next.prev = prev;

        size--;

        return node.item;
    }

    @Override
    public String toString() {
        if (first == null) {
            return "[]";
        }
        Node<T> node = first.next;
        StringBuilder collection = new StringBuilder(node.prev.item.toString());
        while (node != null) {
            collection.append(", ").append(node.item);
            node = node.next;
        }
        return collection.toString();
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    '}';
        }
    }
}
