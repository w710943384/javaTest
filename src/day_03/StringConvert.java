package day_03;

/*
String当中与转换有关的方法：

public char[] toCharArray():将当前字符串拆分成字符数组作为返回值
public byte[] getBytes():获得当前字符串底层的字节数组
public String replace(CharSequence oldString, CharSequence newString):
将所有出现的老字符串替换成新字符串，返回替换之后的结果新字符串
 */
public class StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("========================");

        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=======================");

        String str1 = "How do you do";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);

        String str3 = "aaa.bbb.ccc";
        String[] array3 = str3.split("\\.");
        System.out.println(array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }


    }
}
