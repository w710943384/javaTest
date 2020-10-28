package day_05.ExtendPractice;
/*
群主发普通红包。某群有多名成员，群主给成员发普通红包。普通红包的规则：
 1. 群主的一笔金额，从群主余额中扣除，平均分成n等份，让成员领取。
 2. 成员领取红包后，保存到成员余额中。
  请根据描述，完成案例中所有类的定义以及指定类之间的继承关系，并完成发红包的操作
 */

import java.util.ArrayList;

public class RedPackage {
    public static void main(String[] args) {

        Manager manager = new Manager("群主",100);

        Member one = new Member("成员1",0);
        Member two = new Member("成员2",0);
        Member three = new Member("成员3",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==================");

        //群主总共发了20元，分了3个红包
        ArrayList<Integer> redList = manager.send(20,3);

        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==================");
    }
}
