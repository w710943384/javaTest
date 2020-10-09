/*
构造方法注意事项：
1. 构造方法的名称必须和所在类名称一样，包括大小写
2. 构造方法不需要返回值，void也不需要写
3. 构造方法不能return一个具体返回值
4. 如果没有编写任何构造方法，编译器会送一个方法，没有参数、方法什么事都不做
public Student（）｛｝
5. 一旦编写了至少一个构造方法，不再赠送
6. 构造方法也可以重载
   重载：方法名称相同，参数列表不同
 */

package main.wz_demo;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }



    public Student(String name, int age){
        this.name = name;
        this.age = age;

    }
}
