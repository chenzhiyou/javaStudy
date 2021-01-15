package SchoolProjectTest;

import SchoolProject.Subject;

public class SubjectTest {
    public static void main(String[] args){
        Subject subject = new Subject("计算机科学与技术","J0001",4);
        String str = subject.info();
        System.out.println(str);
    }
}
