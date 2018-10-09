package com.erwin.javademo.datastructure;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by yanwen.liu on 2018/9/27.
 */
public class EnumerationDemo {

    enum DataStructureEnum {
        enumeration("enum", "枚举"),
        bit_set("bitSet", "位集合"),
        vector("vector", "向量"),
        stack("stack", "栈"),
        hash_table("hashTable", "哈希表"),
        properties("properties", "属性"),;
        String key;
        String value;

        DataStructureEnum(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<String>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }

        for (DataStructureEnum dataStructureEnum : DataStructureEnum.values()) {
            System.out.println(dataStructureEnum.key + ":" + dataStructureEnum.value);
        }
    }


}
