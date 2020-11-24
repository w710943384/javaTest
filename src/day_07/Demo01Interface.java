package day_07;

/*
一个类可以实现多个接口
格式：
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
    // 覆盖重写所有抽象方法
}

如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次
如果实现类没有覆盖重写所有接口当中的抽象方法，那么实现类就必须是一个抽象类
如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写
一个类如果直接父类当中的方法，和接口当中的默认方法冲突，会优先父类方法
 */
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodA();
        impl.methodB();
    }
}
