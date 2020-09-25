package main.test;

public class PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        two.call("马云");
        two.message();
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "三星";
        one.price = 6666;
        one.color = "黑色";
        return one;
    }
}
