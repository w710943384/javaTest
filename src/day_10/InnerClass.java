package day_10;

/*
如何使用内部类？
1.间接方式：在外部类的方法中使用内部类，然后main只是调用外部类的方法
2.直接方式，公式：
类名称 对象名 = new 类名称()；
外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
 */
public class InnerClass {

    public static void main(String[] args) {

        Body body = new Body();//外部类的对象
        body.methodBody();

        System.out.println("======================");
        Body.Heart heart = new Body().new Heart();
        heart.Beat();
    }

}
