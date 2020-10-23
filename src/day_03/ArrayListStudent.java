package day_03;

import java.util.ArrayList;

/*
题目
将四个自定义学生对象添加到集合并遍历
 */
public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("洪七公",20);
        Student two = new Student("sb",1);
        Student three = new Student("李锐",23);
        Student four = new Student("煞笔",6);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "  年龄：" + stu.getAge());
        }
    }
}
