package com.goit.module9;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(1, "red");
        myHashMap.put(2, "green");
        myHashMap.put(3, "white");
        myHashMap.put(3, "black");
        myHashMap.put(17, "pink");
        myHashMap.put(17, "17");

        map.put(1, "red");
        map.put(2, "green");
        map.put(3, "white");
        map.put(3, "black");
        map.put(17, "pink");
        map.put(17, "17");

        System.out.println("HashMap");
        System.out.println(map);
        System.out.println("size " + map.size());
        System.out.println("get " + map.get(2));
        System.out.println("get " + map.get(17));
        System.out.println("remove " + map.remove(17));
        System.out.println("size after remove " + map.size());
        System.out.println("map after remove " + map);
        map.clear();
        System.out.println("map after clear " + map);
        System.out.println("size after clear " + map.size());

        System.out.println();
        System.out.println("====================");
        System.out.println("myHashMap");
        System.out.println(myHashMap);
        System.out.println("size " + myHashMap.size());
        System.out.println("get " + myHashMap.get(2));
        System.out.println("get " + myHashMap.get(17));
        System.out.println("remove " + myHashMap.remove(17));
        System.out.println("size after remove " + myHashMap.size());
        System.out.println("map after remove " + myHashMap);
        myHashMap.clear();
        System.out.println("map after clear " + myHashMap);
        System.out.println("size after clear " + myHashMap.size());

// test for fix
//        MyHashMap<Integer, String> hashMap = new MyHashMap<>();
//
//        for (int i = 0; i < 1000; i++) {
//            hashMap.put(i, " i - " + i);
//        }
//        System.out.println(hashMap);
//        System.out.println("size " + hashMap.size());
//        // i - 555
//        System.out.println("get 555 = " + hashMap.get(555));
    }
}
