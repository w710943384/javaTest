package day_05;

import java.util.Arrays;

public class DemoArrays {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3};

        String str = Arrays.toString(intArray);
        System.out.println(str);

        int[] Array1 = {2, 5, 1, 7};
        Arrays.sort(Array1);
        System.out.println(Arrays.toString(Array1));

        String[] array2 = {"as", "we", "lsf"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
