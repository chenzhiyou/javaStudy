package PolyProj;

//抽象类：不允许实例化，可以用个向上转型，指向子类实例
public  class Animal {
    private String name;
    private int month;

    public Animal(){

    }

    public Animal(String name, int month){
        this.name = name;
        this.month = month;

    }

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
        this.month = month;
    }
    //抽象方法 不允许包含方法体，子类中需要重写父类方法，否则子类也是抽象类
    //static final private不能与abstract 并存
    public  void eat(){

    };

}
