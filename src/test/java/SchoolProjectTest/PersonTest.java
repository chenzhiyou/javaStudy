package SchoolProjectTest;

import SchoolProject.Department;
import SchoolProject.Person;
import SchoolProject.Post;

public class PersonTest {
    public static void main(String[] args){
        Department de1 = new Department("D001","人事部");
        Department de2 = new Department("D002","市场部");
        Post post1 = new Post("P001","经理");
        Post post2 = new Post("P002","助理");
        Post post3 = new Post("P003","职员");
        Person one = new Person("张铭","S001","男", 29,de1,post1);
        Person two = new Person("李艾爱","S002","女", 21,de1,post2);
        Person three = new Person("孙超","S003","男", 29,de1,post3);
        Person four = new Person("张美美","S004","女", 26,de2,post3);
        Person five = new Person("蓝迪","S005","男", 31,de2,post1);
        Person six = new Person("米莉","S006","女", 24,de2,post3);

        String str = one.introduce();
        de1.addPerson(one);
        de1.addPerson(two);
//        de1.addPerson(three);
        de2.addPerson(four);
        de2.addPerson(five);
//        de2.addPerson(six);
        System.out.println(str);
        System.out.println("=================");
        System.out.println(two.introduce());
        System.out.println("=================");
        System.out.println(three.introduce());
        System.out.println("=================");
        System.out.println(four.introduce());
        System.out.println("=================");
        System.out.println(five.introduce());
        System.out.println("=================");
        System.out.println(six.introduce());
        System.out.println(de1.addPerson(three));
        System.out.println(de2.addPerson(six));
    }
}
