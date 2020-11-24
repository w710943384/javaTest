package day_06;

/*
接口当中也可以定义“成员变量”,但是必须使用 private static final
从效果上看就是常量
格式：
public static final 数据类型 常量名称 = 数据值;
 */
public interface MyInterfaceConst {

    //这就是个常量，一旦赋值不可修改
    public static final int NUM_OF_MY_CLASS = 10;// final 关键字一旦使用，说明不可改变


}
