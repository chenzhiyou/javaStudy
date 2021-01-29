package telephone;

public class Computer implements INet{

    public void network() {
        System.out.println("可以上网");
        System.out.println(INet.TEMP);
    }
    public void connection(){
        //调用接口中默认的方法
        INet.super.connection();
        //如果不加super，只能访问静态方法
        INet.stop();
    }
}
