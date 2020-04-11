package com.agree.dubbo.consumer.util;

import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(2);
        t.add(4);
        t.add(1);
        t.add(7);
        t.add(3);
        for (Integer i:t ) {
            System.out.println(i);
        }
    }
}
