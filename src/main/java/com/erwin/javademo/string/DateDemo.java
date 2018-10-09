package com.erwin.javademo.string;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yanwen.liu on 2018/10/9.
 */
public class DateDemo {
    public static void main(String[] args) {
        {
            // 时间格式化
            Date date = new Date();
            String strDateFormat = "yyyy-MM-dd HH:mm:ss";
            SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
            System.out.println(sdf.format(date));
        }


    }
}
