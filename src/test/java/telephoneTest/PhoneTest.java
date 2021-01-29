package telephoneTest;

import telephone.*;

public class PhoneTest implements IA, IB {
    public static void main(String[] args){
        Telephone telephone = new SmartPhone();
        INet net = new SmartPhone();
        net.connection();
        net.network();
        System.out.println(net.TEMP);
        //调用静态方法
        INet.stop();


        IA a = new PhoneTest();
        IB b = new PhoneTest();
        System.out.println(a.TEMP);
        System.out.println(b.TEMP);



    }
}
