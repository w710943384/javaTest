package day_05.ExtendPractice;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
        //根据索引，从集合删除红包，并且自己得到被删除的红包
        int delta = list.remove(index);
        //当前成员本来有多少钱
        int money = super.getMoney();
        super.setMoney(money + delta);
    }
}
