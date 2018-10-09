package com.erwin.javademo.datastructure;

import java.util.BitSet;

/**
 * Created by yanwen.liu on 2018/9/27.
 */
public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bits1.set(i);
            if ((i % 5) != 0) bits2.set(i);
        }
        System.out.println(bits1.toString());
        System.out.println(bits2.toString());

        // bits1 在 bits2 中存在的元素
//        bits1.and(bits2);
//        System.out.println(bits1);

        // bits1 在 bits2 中不存在的元素
//        bits1.andNot(bits2);
//        System.out.println(bits1);

        // bits1 和 bits2 中所有的元素
//        bits1.or(bits2);
//        System.out.println(bits1);

        // 只在bits1 或 bits2 中存在的元素
//        bits1.xor(bits2);
//        System.out.println(bits1);



    }
}
