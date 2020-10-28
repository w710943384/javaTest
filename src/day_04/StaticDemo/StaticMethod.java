package day_04.StaticDemo;

public class StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.method();

        obj.methodStatic(); // 不推荐
        MyClass.methodStatic(); // 推荐
        myMethod();
    }

    public static void myMethod(){
        System.out.println("自己的方法");
    }
}
