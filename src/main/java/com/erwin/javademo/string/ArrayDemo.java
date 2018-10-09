package com.erwin.javademo.string;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by yanwen.liu on 2018/10/9.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        {
            // 数组排序和元素查找
            int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
            System.out.println("排序之前：" + JSON.toJSONString(array));
            int index = Arrays.binarySearch(array, 2);
            System.out.println("元素 2  在第 " + index + " 个位置");

            Arrays.sort(array);

            System.out.println("排序之后" + JSON.toJSONString(array));
            int indexS = Arrays.binarySearch(array, 2);
            System.out.println("元素 2  在第 " + indexS + " 个位置");
        }

        {
            // 查询最大值和最小值
            List<Integer> numbers = Lists.newArrayList(2, 2, 2, 3);
            List<Integer> numbers1 = Lists.newArrayList(2, 2, 2, 3);
            List<Integer> numbers2 = Lists.newArrayList(2, 2, 2, 3);
            int min = Collections.min(numbers);
            int max = Collections.max(numbers);
            System.out.println("" + min);
            System.out.println("" + max);

        }

    }
}
