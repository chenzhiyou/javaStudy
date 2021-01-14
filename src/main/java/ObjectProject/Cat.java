package ObjectProject;

public class Cat {
    //成员属性: 昵称、年龄、体重、品种
    //修改为private 限定只能在当前类内进行访问
    private String name;
    private int month;
    private double weigeht;
    private String species;

    public static int prices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month<=0){
            System.out.println("年龄输入不正确");
        }else{
            this.month = month;
        }

    }

    public double getWeigeht() {
        return weigeht;
    }

    public void setWeigeht(double weigeht) {
        this.weigeht = weigeht;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


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

    //虽然是没有语法错误，但是不建议这么写
    public void Cat(){
        System.out.println("我是一个无参无返回值的普通方法");
    }

    public void run(String name){
        System.out.println(name + "小猫会跑");
    }

    public void eat(){
        System.out.println("小猫吃鱼");
    }
}
