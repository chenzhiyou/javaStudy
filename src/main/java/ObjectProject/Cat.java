package ObjectProject;

public class Cat {
    //成员属性: 昵称、年龄、体重、品种
    public String name;
    public int month;
    public double weigeht;
    public String species;
    //方法跑动、吃东西
    public void run(String name){
        System.out.println(name + "小猫会跑");
    }

    public void eat(){
        System.out.println("小猫吃鱼");
    }
}
