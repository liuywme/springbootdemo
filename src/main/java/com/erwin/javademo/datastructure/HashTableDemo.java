package com.erwin.javademo.datastructure;

import com.google.common.collect.Maps;

import java.util.Hashtable;
import java.util.Optional;

/**
 * Created by yanwen.liu on 2018/9/28.
 */
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "test1");
        hashtable.put(2, "test2");

        Optional<Integer> a = Optional.empty();
        System.out.println(hashtable.toString());
    }
}
