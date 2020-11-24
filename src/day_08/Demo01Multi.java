package day_08;

/*
代码中体现多态性，就是父类引用指向子类对象
格式：
父类名称 对象名 = new 子类名称（）；
或者：
接口名称 对象名 = new 实现类名称（）；
 */

public class Demo01Multi {

    public static void main(String[] args) {

        Fu obj = new Zi();

        obj.method();
        System.out.println(obj.num);
    }
}
