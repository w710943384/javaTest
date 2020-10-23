package day_03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
用一个大集合存入20个数字，筛选其中的偶数，放到小集合当中

需要创建一个大集合存入int数字
随机数字使用Random nextInt
循环20次，放入大集合：for循环 add
 */
public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigger = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigger.add(num);
        }

        List<Integer> smallList = getSmallList(bigger);
        System.out.println("偶数一共有多少个：" + smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }

    }

    public static List<Integer> getSmallList(ArrayList<Integer> bigger){
        List<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigger.size(); i++) {
            int num = bigger.get(i);
            if (num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
