package AnimalProject;

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
//    方法重载：
//    1、同一个类中
//    2、方法名相同，参数列表不同（参数顺序、个数、类型）
//    3、方法返回值、访问修饰符任意
//    4、与方法的参数名无关
    public void sleep(){
        System.out.println(this.getName()+"在睡觉");
    }

    private String sleep(String name){
        return "";
    }
    public void sleep(String name, int mouth){

    }
    public void sleep(int mouth,String name){

    }
    /***
     * 方法重写：
     * 1、有继承关系的子类中
     * 2、方法名相同，参数列表相同（参数顺序、个数、类型）必须相同
     * 3、方法的访问修饰符是可以允许有变化的，但是是有条件的：
     * 4、与方法的参数名无关
     */
    //重新父类的eat方法
    //当子类重新父类方法后，子类对象调用的是重写后的方法
    public void eat(){
        System.out.println(this.getName()+"最近没有食欲");
    }
    public void eat(String mouth){
        System.out.println(mouth+"最近没有食欲");
    }
}
