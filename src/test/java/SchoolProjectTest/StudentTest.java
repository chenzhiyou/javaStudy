package SchoolProjectTest;


import SchoolProject.Student;
import SchoolProject.Subject;

public class StudentTest {
    public static void main(String[] args){
        Subject subject = new Subject("计算机科学与技术","J0001",4);
        Student student = new Student("J001","hahah","女",22,subject);
        String str = student.introduction();
        System.out.println(str);
        Student student2 = new Student("J001","hahah","女", 22, subject);
        String str2 = student2.introduction("计算机","4");
        System.out.println(str2);
        Student student3 = new Student("J001","hahah","女", 22,subject);
        String str3 = student3.introduction(subject);
        System.out.println(str3);
        int num = subject.addStudent(student);
        num =subject.addStudent(student2);
        num= subject.addStudent(student3);
        System.out.println(num);
    }

}
