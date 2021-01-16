package SingleProjectTest;

import SingleProject.SingletonOne;

public class SingletonOneTest {
    public static void main(String[] args){
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();
        System.out.println(one==two);
        System.out.println(one);
        System.out.println(two);
    }
}
