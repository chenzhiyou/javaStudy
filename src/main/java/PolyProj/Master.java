package PolyProj;

public class Master {
//    public void feed(Cat cat){
//        cat.eat();
//        cat.playBall();
//    }
//
//    public void feed(Dog dog){
//        dog.eat();
//        dog.sleep();
//    }

    // 方案2：编写方法传入动物的父类，方法中通过类型转换，调用指定子类的方法
    public void feed(Animal obj){
        if(obj instanceof Cat){
            Cat temp= (Cat)obj;
            temp.eat();
            temp.playBall();
        }else if(obj instanceof Dog){
            Dog temp = (Dog)obj;
            temp.eat();
            temp.sleep();
        }
    }
//方案1
//    public Dog hasManyTime(){
//        System.out.println("多");
//        return new Dog();
//    }
//
//    public Cat hasLessTime(){
//        System.out.println("少");
//        return new Cat();
//    }
    //方法2
    public Animal raise(Boolean isManyTime){
        if (isManyTime){
            System.out.println("多");
            return new Dog();
        }else {
            System.out.println("少");
            return new Cat();
        }
    }
}
