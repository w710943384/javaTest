package day_06;

/*
接口就是多个类的公共规范
接口是一种引用数据类型，最重要的内容就是其中的：抽象方法
接口定义：
public interface 接口名称{
    //接口内容
}

备注：换成interface之后 编译生成还是.java --> .class

 接口使用步骤：
 1.接口不能直接使用，必须有一个“实现类”来“实现”接口
 格式：
 public class 实现类名称 implements 接口名称｛
    //...
 ｝
 2.接口的实现类必须覆盖重写（实现）接口中的所有抽象方法
 实现：去掉abstract关键字，加上方法体大括号

 3.创建实现类的对象，进行使用
 */
public class DemoInterface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodDefault();
    }
}
