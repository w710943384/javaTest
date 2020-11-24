package day_06;

public class Demo03Interface {

    public static void main(String[] args) {

        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

//        impl.methodStatic; 错误写法

        MyInterfaceStatic.methodStatic();//直接通过接口名称调用静态方法
    }
}
