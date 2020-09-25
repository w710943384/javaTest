package main.test;

/*
    手机属性：
    1.品牌
    2.价格
    3.颜色

    手机功能：
    1.打电话
    2.发短信

    Sting brand; // 品牌
    double price; // 价格
    String color; // 颜色
 */
public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who){
        System.out.println("给" + who + "打电话");
    }

    public  void message(){
        System.out.println("群发短信");
    }
}
