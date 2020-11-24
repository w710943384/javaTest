package day_06;

/*
任何版本中，接口都能定义抽象方法：
public abstract 返回值类型 方法名称（参数列表）;

 1.接口当中抽象方法，固定关键词：public abstract
 2.这两个关键词可以选择性省略
 */
public interface MyInterfaceAbstract {
    public abstract void methodAbs1();
    public void methodAbs3();
    abstract void methodAbs2();//这也是抽象方法
    void methodAbs4();

    public default void methodDefault(){
        System.out.println("这是默认方法");
    }
}
