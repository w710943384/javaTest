package main.test;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.print("[");
        for (int i = 0; i < array.length; i ++){
            if (i == array.length - 1){
                System.out.println(array[i] + "]");
            }else{
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("====================");

        //面向对象
        //找Arrays这个类，其中有toString方法，可以把数组变成自己想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
