package com.goit.module9;

import java.util.*;

public class MyHashMap<K, V> {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int size;
    private Node<K, V>[] table = new Node[DEFAULT_INITIAL_CAPACITY];

    public V put(K key, V value) {
        int index = hash(key) % table.length;
        Node<K, V> firstNode = table[index];
        Node<K, V> node = new Node<>(hash(key), key, value, null);

        if (firstNode == null) {
            table[index] = node;
            size++;
        } else {
            Node<K, V> tmpNode = firstNode;
//            Node<K, V> prev = null;
            boolean isUniqueKey = true;

            while (tmpNode != null) {
                if (tmpNode.key.equals(key)) {
                    tmpNode.value = value;
                    isUniqueKey = false;
                }
//                prev = tmpNode;
                tmpNode = tmpNode.next;
            }
            if (isUniqueKey) {
//                prev.next = node;
                firstNode.next = node;
                size++;
            }
        }
        return value;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {

        int index = hash(key) % table.length;

        Node<K, V> firstNode = table[index];

        while (firstNode != null) {
            if (firstNode.key.equals(key)) {
                return firstNode.value;
            }
            firstNode = firstNode.next;
        }
        return null;
    }

    public void clear() {
        for (int i = 0; i < table.length; i++) {
            table[i] = null;
        }
        size = 0;
    }

    public V remove(Object key) {
        int index = hash(key) % table.length;

        Node<K, V> node = table[index];
        Node<K, V> prevNode = null;
        while (node != null) {
            if (node.key.equals(key)) {
                if (prevNode != null) {
                    prevNode.next = node.next;
                } else {
                    table[index] = node.next;
                }
                size--;
                return node.value;
            }
            prevNode = node;
            node = node.next;
        }
        return null;
    }


    private int hash(Object key) {
        return (key == null) ? 0 : key.hashCode();
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{", "}");
        for (Node<K, V> node : table) {
            while (node != null) {
                joiner.add(node.toString());
                node = node.next;
            }
        }

        return joiner.toString();
    }

    static class Node<K, V> {
        final int hash;
        K key;
        V value;
        Node<K, V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final String toString() {
            return key + "=" + value;
        }
    }
}
