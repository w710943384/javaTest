package day_07;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodCommon() {

    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }
}
