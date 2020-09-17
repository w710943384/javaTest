package main.test;


public class ForTest {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + x * y + " ");
                if (x * y < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
