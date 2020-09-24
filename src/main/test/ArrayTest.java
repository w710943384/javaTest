package main.test;

/*
数组的特点：
1.数组是一种引用数据类型
2.数组当中的多个数据，类型必须统一
3.数组的长度在程序运行期间不可改变

数组的初始化：在内存中创建一个数组，并且向其中赋予一些默认值

两种常见的初始化方式：
1.动态初始化（指定长度）
2.静态初始化（指定内容）

动态初始化数组格式：
数据类型【】 数组名称 = new 数据类型【数组长度】；

静态初始化数组格式：
数据类型【】 数组名称 = new 数据类型[]{元素1，元素2，元素3，.....}；
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arrayA = new int[300];

        double[] arrayB = new double[10];

        String[] arrayC = new String[5];

        int[] arrayD = new int[]{1,2,3,4,5};

        String[] arrayE = new String[]{"hello","world","java"};

        for (int i = 0; i < 5; i++) {
            System.out.println(arrayD[i]);
        }

        for (int i : arrayD) {
            System.out.print(i);
        }

        for (double v : arrayB) {
            System.out.println(v);
        }
    }
}
