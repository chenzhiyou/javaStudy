package ObjectProject;

public class Cat {
    //成员属性: 昵称、年龄、体重、品种
    public String name;
    public int month;
    public double weigeht;
    public String species;
    //方法跑动、吃东西
    public Cat(){
        System.out.println("我是无参构造方法");
    }
    public Cat(String name){
        System.out.println("我是带参构造方法");
    }
    public Cat(String name,int month,double weigeht, String species){
        this.name = name;
        this.month=month;
        this.weigeht = weigeht;
        this.species =species;
    }
    public void run(String name){
        System.out.println(name + "小猫会跑");
    }

    public void eat(){
        System.out.println("小猫吃鱼");
    }
}
