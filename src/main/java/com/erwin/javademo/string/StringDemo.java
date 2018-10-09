package com.erwin.javademo.string;

/**
 * Created by yanwen.liu on 2018/10/9.
 */
public class StringDemo {
    public static void main(String[] args) {
        {
            // 查询字符出现的位置
            String strOrig = "Hello world ,Hello Runoob";
            int lastIndex = strOrig.lastIndexOf("Runoob");
            if(lastIndex == - 1){
                System.out.println("没有找到字符串 Runoob");
            }else{
                System.out.println("Runoob 字符串最后出现的位置： "+ lastIndex);
            }

            int intIndex = strOrig.indexOf("Runoob");
            if(intIndex == - 1){
                System.out.println("没有找到字符串 Runoob");
            }else{
                System.out.println("Runoob 字符串位置 " + intIndex);
            }
        }

        {
            // 字符串替换
            String str="Hello World";
            System.out.println( str.replace( 'H','W' ) );
            System.out.println( str.replaceFirst("He", "Wa") );
            System.out.println( str.replaceAll("He", "Ha") );
        }

        {
            // 字符串反转
            String string="runoob";
            String reverse = new StringBuffer(string).reverse().toString();
            System.out.println("字符串反转前:"+string);
            System.out.println("字符串反转后:"+reverse);
        }

        {
            // 字符串分割
            String str = "www-runoob-com";
            String[] temp;
            String delimeter = "-";  // 指定分割字符
            temp = str.split(delimeter); // 分割字符串
            // 普通 for 循环
            for(int i =0; i < temp.length ; i++){
                System.out.println(temp[i]);
                System.out.println("");
            }
        }

        {
            // 大小写转换
            String str = "string runoob";
            String strUpper = str.toUpperCase();
            System.out.println("原始字符串: " + str);
            System.out.println("转换为大写: " + strUpper);

            String strLower = strUpper.toLowerCase();
            System.out.println("原始字符串: " + str);
            System.out.println("转换为小写: " + strUpper);
        }

        System.nanoTime(); // 纳秒

        System.currentTimeMillis(); // 毫秒
    }
}
