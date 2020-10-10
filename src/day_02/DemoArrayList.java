package day_02;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("lirui");
        list.add("123");
        list.add("444444");
        list.add("1");
        System.out.println(list);

        list.addAll(list);
        System.out.println(list);

        String name = list.get(2);
        System.out.println("2号索引位置：" + name);

        String whoRemoved = list.remove(3);
        System.out.println("被删除的是：" + whoRemoved);

        int size = list.size();
        System.out.println("集合的长度是：" + size);

        for (int i = 0; i <= list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
