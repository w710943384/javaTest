package day_05;

/*
请使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
 */

public class MathPractice {
    public static void main(String[] args) {

        double min = -10.8;
        double max = 5.9;
        int count = 0;

        for (double i = Math.ceil(min); i <= max; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1){
                count++;
            }
        }

        System.out.println("个数有：" + count);
    }
}
