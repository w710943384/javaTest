package main.test;

public class ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 50, 10000, 200, 25};

        int max = array[0];
        for (int i : array) {
            // 如果当前元素比max更大，则换人
            if (i > max){
                max = i;
            }
        }

        System.out.println("最大值为：" + max);

        // 数组元素反转
        int[] arrayB = {1, 2, 3, 4, 5, 6};

        for (int i : arrayB) {
            System.out.print(i);
        }

        System.out.println(" ");

        for (int min = 0,maX = arrayB.length - 1;min < maX;min ++, maX --){
            int temp = arrayB[min];
            arrayB[min] = arrayB[maX];
            arrayB[maX] = temp;
        }
        for (int i : arrayB) {
            System.out.print(i);
        }
    }
}
