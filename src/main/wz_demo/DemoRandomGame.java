package main.wz_demo;

import java.util.Random;
import java.util.Scanner;

public class DemoRandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        r.setSeed(r.nextInt(100));
        System.out.println(r.nextInt(60));

        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入猜测的数字：");
            int guessNum = sc.nextInt();

            if (guessNum > randomNum){
                System.out.println("太大了请重试");
            }else if (guessNum < randomNum){
                System.out.println("太小了请重试");
            }else {
                System.out.println("恭喜猜中了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
