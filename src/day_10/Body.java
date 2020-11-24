package day_10;

public class Body {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Heart{

        public void Beat(){

            System.out.println("心脏跳动");
            System.out.println("我叫：" + name);
        }
    }

    //外部类的成员变量
    private String name;

    //外部类方法
    public void methodBody(){
        System.out.println("外部类方法");
        new Heart().Beat();
    }
}
