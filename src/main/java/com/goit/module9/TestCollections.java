package com.goit.module9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestCollections {

    public static void main(String[] args) {

        List<Object> list = new LinkedList<>();
        MyArrayList<Integer> myArrayList = new MyArrayList();
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();
        for (int i = 0; i < 12; i++) {
            list.add(i);
            myArrayList.add(i);
            myLinkedList.add(i);
        }

        System.out.println("============================");
//        System.out.println("ArrayList");
        System.out.println("LinkedList");
        System.out.println();
        System.out.println("ADD:");
        System.out.println(list.toString());
        System.out.println();
        System.out.println("SIZE:");
        System.out.println("size " + list.size());
        System.out.println();
        System.out.println("GET:");
        System.out.println("read index value " + list.get(4));
//        System.out.println(list.get(13));  // for test exception
        System.out.println();
        System.out.println("REMOVE:");
        System.out.println("remove " + list.remove(4));
        System.out.println("after remove " + list);
        System.out.println("size after remove " + list.size());
        System.out.println();
        System.out.println("CLEAR:");
        list.clear();
        System.out.println("size " + list.size());
        System.out.println(list);

//   MyArrayList
/*
        System.out.println("============================");
        System.out.println("MyArrayList");
        System.out.println();
        System.out.println("ADD:");
        System.out.println(myArrayList);
        System.out.println();
        System.out.println("SIZE:");
        System.out.println("size " + myArrayList.size());
        System.out.println();
        System.out.println("GET:");
        System.out.println("read index value " + myArrayList.get(4));
//        System.out.println(myArrayList.get(13)); // for test exception
        System.out.println();
        System.out.println("REMOVE:");
        System.out.println("remove " + myArrayList.remove(4));
        System.out.println("after remove " + myArrayList);
        System.out.println("size after remove  " + myArrayList.size());
        System.out.println();
        System.out.println("CLEAR:");
        myArrayList.clear();
        System.out.println("size " + myArrayList.size());
        System.out.println(myArrayList);

 */
//   MyLinkedList
        System.out.println("============================");
        System.out.println("MyLinkedList");
        System.out.println();
        System.out.println("ADD:");
        System.out.println("[" + myLinkedList + "]");
        System.out.println();
        System.out.println("SIZE:");
        System.out.println("size " + myLinkedList.size());
        System.out.println();
        System.out.println("GET:");
        System.out.println("read index value " + myLinkedList.get(4));
//        System.out.println(myLinkedList.get(13));  // for test exception
        System.out.println();
        System.out.println("REMOVE:");
        System.out.println("remove " + myLinkedList.remove(4));
        System.out.println("after remove " + "[" + myLinkedList + "]");
        System.out.println("size after remove  " + myLinkedList.size());
        System.out.println();
        System.out.println("CLEAR:");
        myLinkedList.clear();
        System.out.println("size " + myLinkedList.size());
        System.out.println(myLinkedList);
    }
}
