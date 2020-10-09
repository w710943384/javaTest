package main.wz_demo;

public class DemoPerson {
    public static void main(String[] args) {
        Person one = new Person("李锐",20,true);
        Person two = new Person("王哲",20,true);

        System.out.println(one.toString());
        two.toString();
    }
}
