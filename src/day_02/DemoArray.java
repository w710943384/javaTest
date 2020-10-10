package day_02;

public class DemoArray {
    public static void main(String[] args) {

        Person[] array = new Person[3];
        Person one = new Person("李锐",20);
        Person two = new Person("zz",10);
        Person three = new Person("ww", 12);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        Person person = array[1];
        System.out.println(person.getName());
    }
}
