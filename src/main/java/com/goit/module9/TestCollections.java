package com.goit.module9;

import java.util.ArrayList;
import java.util.List;

public class TestCollections {

    public static void main(String[] args) {


        List<Object> list = new ArrayList<>();
        MyArrayList<Integer> myArrayList = new MyArrayList();
        for (int i = 0; i < 12; i++) {
            list.add(i);
            myArrayList.add(i);
        }

        System.out.println(list.toString());
        System.out.println("size " + list.size());
        System.out.println("read index value " + list.get(4));
//        System.out.println(list.get(13));
        System.out.println("remove " + list.remove(4));
        System.out.println("after remove " + list);
        System.out.println("size after remove " + list.size());
        list.clear();
        System.out.println("size " + list.size());
        System.out.println(list);

        System.out.println("===========================");

//        myArrayList.add("re");
        System.out.println(myArrayList);
        System.out.println("size " + myArrayList.size());
        System.out.println("read index value " + myArrayList.get(4));
//        System.out.println(myArrayList.get(13));
        System.out.println("remove " + myArrayList.remove(4));
        System.out.println("after remove " + myArrayList);
        System.out.println("size after remove  " + myArrayList.size());
        myArrayList.clear();
        System.out.println("size " + myArrayList.size());
        System.out.println(myArrayList);
    }
}
