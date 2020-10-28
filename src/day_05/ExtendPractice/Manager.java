package day_05.ExtendPractice;

import java.util.ArrayList;

public class Manager extends User {

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        //需要一个集合存储红包
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看一下自己有多少钱
        int leftMoney = super.getMoney();//群主余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;
        }

        //扣钱,重新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//余数，甩下的零头

        //剩下的零头包在最后一个红包中
        //下面把红包一个一个放在集合中
        for (int i = 0; i < count; i++) {
            redList.add(avg);
        }

        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
