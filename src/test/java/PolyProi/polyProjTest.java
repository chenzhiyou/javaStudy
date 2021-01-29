package PolyProi;

import PolyProj.Animal;
import PolyProj.Cat;
import PolyProj.Dog;

public class polyProjTest {
    public static void main(String[] args){
        Animal one = new Animal();//1
        //向上转型 隐式转型 自动转型 将一个子类的对象，转换为父类对象
        // 父类引用指向子类实例 可以调用子类重写父类的方法以及父类派生的方法，无法调用子类独有方法
        //注意：父类中的静态方法无法被子类重新，所以向上转型之后，只能调用到父类原有的静态方法
        // 小类转型为大类
        Animal two = new Cat(); //2
        Animal three = new Dog(); //3
        one.eat();
        two.eat();
        three.eat();
        System.out.println("==================");
        /*
        向下转型、强制类型转换
        子类引用指向父类对象，此处必须进行强转，可以调用子类特有的方法
        必须满足转换条件 才可以进行转换
        instanceof 运算符：返回true/false
        */
        if(two instanceof Cat){
            Cat temp = (Cat)two;
            temp.eat();
            temp.run();
            temp.getMonth();
            System.out.println("two可以转换为Cat类型");
        }
        if (two instanceof Dog){
            Dog temp = (Dog) two;
            temp.eat();
            temp.sleep();
            temp.getSex();
            System.out.println("two可以转换为Dog类型");

        }

    }
}
