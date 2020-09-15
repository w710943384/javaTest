package main.test;

public class HundredSum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("for=====================");
        for (int i = 1; i <= 100; i ++){
            if (i % 2 == 0){ //i 如果是偶数
                sum += i;
            }
        }
        System.out.println("100以内的偶数和为：" + sum);

        System.out.println("do while=====================");

        int j = 1;
        int sum2 = 0;
        do {
            if (j % 2 == 1){
                sum2 += j;
            }
            j++;
        }while (j <= 100);
        System.out.println("100以内的奇数和为：" + sum2);

        System.out.println("while=====================");

        int a = 1;
        int sum3 = 0;
        while (a <= 100){
            if (a % 3 == 0){
                sum3 += a;
            }
            a ++;
        }
        System.out.println("100以内3的倍数和为：" + sum3);

    }
}
