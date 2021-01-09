package ObjectProject;

public class PersonTest {
    public static void main(String[] args) {
        //使用new关键字实例化对象
        Person person = new Person();
        //传入name、age、grade的参数值
        person.name="小明";
        person.age=10;
        person.grade="五年";

        //分别调用student、sex、mySelf方法
        person.student();
        person.sex("男孩");
        person.mySelf();

    }
}
