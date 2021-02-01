package anonymousTest;

//import anonymous.Man;
import anonymous.Person;
//import anonymous.Woman;

public class PersonTets {
    // 根据传入的不同的人的利息，调用对应的read方法
    /*
    //方案1
    public void getRead(Man man){
        man.read();
    }

    public void getRead(Woman woman){
        woman.read();
    }

     */
    //方案2：
    public void getRead(Person person){
        person.read();
    }
    public static void main(String[] args){
        PersonTets test = new PersonTets();
//        Man one = new Man();
//        Woman two = new Woman();
//        test.getRead(one);
//        test.getRead(two);
        //方案3：匿名内部类
        /*
         *  1、匿名内部类没有类型名称、实例对象名称
         *  2、编译后的文件命名：外部类$数字.class
         *  3、无法使用private、public、protected、abstract、static修饰
         *  4、无法编写构造方法，可以添加构造代码块
         *  5、不能出现静态成员
         *  6、匿名内部类可以实现接口也可以继承父类，但是不可兼得
         */
        test.getRead(new Person() {
            public void read(){
                System.out.println("男人喜欢科幻小说");
            }
        });

        test.getRead(new Person() {
            public void read(){
                System.out.println("女人喜欢言情小说");
            }
        });


    }
}
