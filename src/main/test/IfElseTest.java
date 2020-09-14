package main.test;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int score = scanner.nextInt();
        System.out.println(adjust(score));
    }

    private static String adjust(int score){
        if (90 <= score && score <= 100){
            return "优秀";
        }else if (80 <= score){
            return "好";
        }else if (70 <= score){
            return "良";
        }else if (60 <= score){
            return "及格";
        }else {
            return "不及格";
        }
    }
}
