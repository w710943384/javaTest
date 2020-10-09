package main.wz_demo;

public class Person {
    private String name;
    private int age;
    private boolean male;

    Person(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public void setMale(boolean b){
        male = b;
    }

    public boolean isMale(){
        return male;
    }

    public void setName(String str){
        name = str;
    }

    public String getName(){
        return name;
    }

    public void setAge(int num){
        age = num;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){

        return this.name + "的年龄是" + this.age + ",性别是否为男：" + this.male;
    }
}

