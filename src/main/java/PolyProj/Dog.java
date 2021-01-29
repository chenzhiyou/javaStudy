package PolyProj;

public class Dog extends Animal{
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog(){

    }

    public Dog(String name, int month, String sex){
        this.setName(name);
        this.setMonth(month);
        this.setSex(sex);
    }

    public void sleep(){
        System.out.println("小狗有午睡的习惯");
    }

    public void eat(){
        System.out.println("狗吃肉");
    }
}
