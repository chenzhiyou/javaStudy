package ObjectProjectTest;

import ObjectProject.Cat;

public class CatTest {
    public static void main(String[] args){
        //对象实例化操作
        //one.name在没有赋值的时候，string 会有默认值null,int类型的默认值为0，double类型的默认值为0.0
        // Cat one 声明对象，是在栈中完成操作
        // new Cat() 实例化对象，是在堆里面完成的操作
        Cat one = new Cat("花花",2,1000,"英国短毛猫");
//        one.name="花花";
//        one.month=2;
//        one.species="英国短毛猫";
//        one.weigeht = 12.5;

//        one.run(one.name);
        one.eat();

        one.Cat();
        one.prices=200;

        System.out.println("名字"+one.getName());
        System.out.println("年龄"+one.getMonth());
        System.out.println("体重"+one.getWeigeht());
        System.out.println("品种"+one.getSpecies());


    }
}
