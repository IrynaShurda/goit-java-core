package com.goit.module9;

import java.util.*;

public class TestCollections {

    public static void main(String[] args) {

        List<Object> list = new LinkedList<>();
        Queue<Object> queue = new ArrayDeque<>();
        Stack<Object> stack = new Stack<>();
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyQueue<Integer> myQueue = new MyQueue<>();
        MyQueueExtendsMyArrayList<Integer> myQueueExtendsMyArrayList = new MyQueueExtendsMyArrayList<>();
        MyStack<Integer> myStack = new MyStack<>();
        MyStackExtendsMyArrayList<Integer> myStackExtendsMyArrayList = new MyStackExtendsMyArrayList<>();

        for (int i = 0; i < 12; i++) {
            list.add(i);
            queue.add(i);
            stack.add(i);
            myQueueExtendsMyArrayList.add(i);
            myArrayList.add(i);
            myLinkedList.add(i);
            myQueue.add(i);
            myStack.add(i);
            myStackExtendsMyArrayList.add(i);
        }

//   ArrayList/LinkedList
        System.out.println("============================");
//        System.out.println("ArrayList");
        System.out.println("LinkedList");
        System.out.println(list);
        System.out.println("size " + list.size());
        System.out.println("get " + list.get(4));
//        System.out.println("get " +list.get(13));  // for test exception
        System.out.println("remove " + list.remove(4));
        System.out.println("arr after remove " + list);
        System.out.println("size after remove " + list.size());
        list.clear();
        System.out.println("size after clear " + list.size());
        System.out.println("arr  after clear " + list);

//   MyArrayList
        System.out.println("============================");
        System.out.println("MyArrayList");
        System.out.println(myArrayList);
        System.out.println("size " + myArrayList.size());
        System.out.println("get " + myArrayList.get(4));
//        System.out.println("get " +myArrayList.get(13)); // for test exception
        System.out.println("remove " + myArrayList.remove(4));
        System.out.println("arr after remove " + myArrayList);
        System.out.println("size after remove  " + myArrayList.size());
        myArrayList.clear();
        System.out.println("size after clear " + myArrayList.size());
        System.out.println("arr after clear " + myArrayList);


//   MyLinkedList
        System.out.println("============================");
        System.out.println("MyLinkedList");
        System.out.println("[" + myLinkedList + "]");
        System.out.println("size " + myLinkedList.size());
        System.out.println("get " + myLinkedList.get(4));
//        System.out.println(myLinkedList.get(13));  // for test exception
        System.out.println("remove " + myLinkedList.remove(4));
        System.out.println("size after remove  " + myLinkedList.size());
        System.out.println("arr after remove " + "[" + myLinkedList + "]");
        myLinkedList.clear();
        System.out.println("size after clear " + myLinkedList.size());
        System.out.println("arr after clear " + myLinkedList);

//   Queue
        System.out.println();
        System.out.println("============================");
        System.out.println("Queue");
        System.out.println(queue);
        System.out.println("size " + queue.size());
        System.out.println("peek " + queue.peek());
        System.out.println("arr after peek " + queue);
        System.out.println("size after peek " + queue.size());
        System.out.println("poll " + queue.poll());
        System.out.println("arr after poll " + queue);
        System.out.println("size after poll " + queue.size());
        queue.clear();
        System.out.println("arr after clear " + queue);
        System.out.println("size after clear " + queue.size());

//   MyQueue
        System.out.println();
        System.out.println("============================");
        System.out.println("MyQueue");
        System.out.println(myQueue);
        System.out.println("size " + myQueue.size());
        System.out.println("peek " + myQueue.peek());
        System.out.println("arr after peek " + myQueue);
        System.out.println("size after peek " + myQueue.size());
        System.out.println("poll " + myQueue.poll());
        System.out.println("arr after poll " + myQueue);
        System.out.println("size after poll " + myQueue.size());
        myQueue.clear();
        System.out.println("arr after clear " + myQueue);
        System.out.println("size after clear " + myQueue.size());

//   MyQueueExtendsMyArrayList
        System.out.println();
        System.out.println("============================");
        System.out.println("MyQueueExtendsMyArrayList");
        System.out.println(myQueueExtendsMyArrayList);
        System.out.println("size " + myQueueExtendsMyArrayList.size());
        System.out.println("peek " + myQueueExtendsMyArrayList.peek());
        System.out.println("arr after peek " + myQueueExtendsMyArrayList);
        System.out.println("size after peek " + myQueueExtendsMyArrayList.size());
        System.out.println("poll " + myQueueExtendsMyArrayList.poll());
        System.out.println("arr after poll " + myQueueExtendsMyArrayList);
        System.out.println("size after poll " + myQueueExtendsMyArrayList.size());
        myQueueExtendsMyArrayList.clear();
        System.out.println("arr after clear " + myQueueExtendsMyArrayList);
        System.out.println("size after clear " + myQueueExtendsMyArrayList.size());

//   Stack
        System.out.println();
        System.out.println("============================");
        System.out.println("Stack");
        System.out.println(stack);
        System.out.println("size " + stack.size());
        System.out.println("peek " + stack.peek());
        System.out.println("arr after peek " + stack);
        System.out.println("size after peek " + stack.size());
        System.out.println("pop " + stack.pop());
        System.out.println("arr after pop " + stack);
        System.out.println("size after pop " + stack.size());
        stack.clear();
        System.out.println("arr after clear " + stack);
        System.out.println("size after clear " + stack.size());


//   MyStack
        System.out.println();
        System.out.println("============================");
        System.out.println("MyStack");
        System.out.println(myStack);
        System.out.println("size " + myStack.size());
        System.out.println("peek " + myStack.peek());
        System.out.println("arr after peek " + myStack);
        System.out.println("size after peek " + myStack.size());
        System.out.println("pop " + myStack.pop());
        System.out.println("arr after pop " + myStack);
        System.out.println("size after pop " + myStack.size());
        myStack.clear();
        System.out.println("arr after clear " + myStack);
        System.out.println("size after clear " + myStack.size());

//   MyStackExtendsMyArrayList
        System.out.println();
        System.out.println("============================");
        System.out.println("MyStackExtendsMyArrayList");
        System.out.println(myStackExtendsMyArrayList);
        System.out.println("size " + myStackExtendsMyArrayList.size());
        System.out.println("peek " + myStackExtendsMyArrayList.peek());
        System.out.println("arr after peek " + myStackExtendsMyArrayList);
        System.out.println("size after peek " + myStackExtendsMyArrayList.size());
        System.out.println("pop " + myStackExtendsMyArrayList.pop());
        System.out.println("arr after pop " + myStackExtendsMyArrayList);
        System.out.println("size after pop " + myStackExtendsMyArrayList.size());
        myStackExtendsMyArrayList.clear();
        System.out.println("arr after clear " + myStackExtendsMyArrayList);
        System.out.println("size after clear " + myStackExtendsMyArrayList.size());
    }
}
