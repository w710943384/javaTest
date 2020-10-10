/*
创建对象的标准格式：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象  没有左边的对象和赋值运算符
new 类名称();
 */

package day_01;

public class DemoAnonymous {
    public static void main(String[] args) {
        Person one = new Person("你猜",20, true);
        //匿名对象
        new Person("不知道", 30, false);
        System.out.println(one);
    }
}
