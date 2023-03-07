package com.mathoperation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class NumberPlaylist {
    public static void main(String[] args) {
        //Create a List
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            list.add(i);
        }

        //Method 1: Traversing through iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println("Method 1: Iterator value :: " + integer);
        }

        //Method 2: Traversing with consumer interface implementation
        class MyConsumer implements Consumer<Integer> {
            public void accept(Integer secondInt){
                System.out.println("Method 2: consumer implementation value:: " + secondInt);
            }
        }
        MyConsumer myClass = new MyConsumer();
        list.forEach(myClass);

        //Method 3: Traversing with anonymous consumer interface implementation
        list.forEach(new Consumer<Integer>() {
            public void accept(Integer thirdInt){
                System.out.println("Method 3: forEach anonymous class value:: " + thirdInt);
            }
        });

        //Method 4: Explicit lambda function
        Consumer<Integer> consumerList = n ->{
            System.out.println("Method 4: forEach lambda implementation value using explicit lambda function:: " + n);
        };
        list.forEach(consumerList);

        //Method 5: Implicit lambda function
        list.forEach(n -> {
            System.out.println("Method 5: forEach lambda implementation value using implicit lambda function:: " + n);
        });
    }
}
