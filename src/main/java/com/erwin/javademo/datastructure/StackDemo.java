package com.erwin.javademo.datastructure;

import java.util.Stack;

/**
 * Created by yanwen.liu on 2018/9/28.
 * 栈
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);
//        把项压入堆栈顶部。
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

//        移除堆栈顶部的对象，并作为此函数的值返回该对象。

        Integer pop = stack.pop();
        System.out.println(pop);

//        查看堆栈顶部的对象，但不从堆栈中移除它。
        Integer peek = stack.peek();
        System.out.println(peek);

        System.out.println(stack);

//        测试堆栈是否为空。
        System.out.println(stack.empty());
    }
}
