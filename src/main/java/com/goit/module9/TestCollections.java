package com.goit.module9;

import java.util.*;

public class TestCollections {

    public static void main(String[] args) {

        List<Object> list = new LinkedList<>();
        Queue <Object> queue = new ArrayDeque<>();
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyQueue<Integer> myQueue = new  MyQueue<>();
        MyQueueExtendsMyArrayList<Integer> myQueueExtendsMyArrayList = new MyQueueExtendsMyArrayList<>();

        for (int i = 0; i < 12; i++) {
            list.add(i);
            queue.add(i);
            myQueueExtendsMyArrayList.add(i);
            myArrayList.add(i);
            myLinkedList.add(i);
            myQueue.add(i);
        }

        System.out.println("============================");
//        System.out.println("ArrayList");
        System.out.println("LinkedList");
        System.out.println();
        System.out.println("ADD:");
        System.out.println(list);
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

//   Queue
        System.out.println();
        System.out.println("============================");
        System.out.println("Queue");
        System.out.println(queue);
        System.out.println("size " +queue.size());
        System.out.println("peek "+ queue.peek());
        System.out.println("arr after peek " + queue);
        System.out.println("size after peek " + queue.size());
        System.out.println("poll "+ queue.poll());
        System.out.println("arr after poll "+ queue);
        System.out.println("size after poll "+ queue.size());
        queue.clear();
        System.out.println("arr after clear "+ queue);
        System.out.println("size after clear "+ queue.size());

//   MyQueue
        System.out.println();
        System.out.println("============================");
        System.out.println("MyQueue");
        System.out.println(myQueue);
        System.out.println("size "+ myQueue.size());
        System.out.println("peek "+myQueue.peek());
        System.out.println("arr after peek " +myQueue);
        System.out.println("size after peek "+myQueue.size());
        System.out.println("poll "+ myQueue.poll());
        System.out.println("arr after poll " + myQueue);
        System.out.println("size after poll "+ myQueue.size());
        myQueue.clear();
        System.out.println("arr after clear "+ myQueue);
        System.out.println("size after clear "+myQueue.size());

//   MyQueueExtendsMyArrayList
        System.out.println();
        System.out.println("============================");
        System.out.println("MyQueueExtendsMyArrayList");
        System.out.println(myQueueExtendsMyArrayList);
        System.out.println("size "+ myQueueExtendsMyArrayList.size());
        System.out.println("peek "+myQueueExtendsMyArrayList.peek());
        System.out.println("arr after peek " +myQueueExtendsMyArrayList);
        System.out.println("size after peek "+myQueueExtendsMyArrayList.size());
        System.out.println("poll "+ myQueueExtendsMyArrayList.poll());
        System.out.println("arr after poll " + myQueueExtendsMyArrayList);
        System.out.println("size after poll "+ myQueueExtendsMyArrayList.size());
        myQueueExtendsMyArrayList.clear();
        System.out.println("arr after clear "+ myQueueExtendsMyArrayList);
        System.out.println("size after clear "+myQueueExtendsMyArrayList.size());
    }
}
