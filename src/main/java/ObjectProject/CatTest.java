package ObjectProject;

public class CatTest {
    public static void main(String[] args){
        //对象实例化操作
        //one.name在没有赋值的时候，string 会有默认值null,int类型的默认值为0，double类型的默认值为0.0
        Cat  one = new Cat();
        one.name="花花";
        one.month=2;
        one.species="英国短毛猫";
        one.weigeht = 12.5;

        one.run(one.name);
        one.eat();

        System.out.println("名字"+one.name);
        System.out.println("年龄"+one.month);
        System.out.println("体重"+one.weigeht);
        System.out.println("品种"+one.species);


    }
}
