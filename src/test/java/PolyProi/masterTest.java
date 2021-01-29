package PolyProi;

import PolyProj.Animal;
import PolyProj.Cat;
import PolyProj.Dog;
import PolyProj.Master;

public class masterTest {
    public static void main(String[] args){
        Master master = new Master();
        Cat one = new Cat();
        Dog two = new Dog();

        master.feed(one);
        master.feed(two);

//        Master master1 = new Master();
//        master1.feed(one);
//        master1.feed(two);

        System.out.println("==============");
        boolean isManyTime = true;
        Animal temp = master.raise(isManyTime);
//        if(isManyTime){
//            temp = master.hasManyTime();
//        }else {
//            temp = master.hasLessTime();
//        }
        System.out.println(temp);
    }
}
