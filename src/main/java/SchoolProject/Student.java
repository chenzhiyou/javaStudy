package SchoolProject;

/**
 * 将学科类和学生类关联的方案：
 * 1、在方法中添加两个参数，分班表示专业名称和学制年限
 * 2、在方法中添加一个专业对象作为参数，通过其属性获取相关信息---获取擦参数方便
 * 3、在类中添加专业对象作为属性，通过其属性获得相关信息----关联性更强
 * 在方法中通过对象作为参数，传递的是它的引用，可以通过引用获取该对象所有信息
 */
public class Student {
    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;
    //在方法中通过对象作为参数，传递的是它的引用，可以通过引用获取该对象所有信息
    private Subject studentSubject;

    public Subject getStudentSubject() {
        return studentSubject;
    }

    public void setStudentSubject(Subject studentSubject) {
        this.studentSubject = studentSubject;
    }



    public Student(){

    }

    public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject){
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
        this.setStudentSubject(studentSubject);

    }
    //获取专业对象，如果没有实例化，先实例化后再返回
    public String getStudentNo() {
        if(this.studentSubject==null){
            this.studentSubject = new Subject();
        }
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        if(studentAge<=0){
            return;
        }
        this.studentAge = studentAge;
    }

    public String introduction(){
        String str = "名字为："+getStudentName()+"学号："+ getStudentNo()+"性别:"+getStudentSex()
                +"年龄："+getStudentAge()+"专业"+ this.getStudentSubject().getSubjectName()+"学制年限"+ this.getStudentSubject().getSubjectLife();
        return str;
    }

    public String introduction(String subjectName, String subjectLife){
        String str = "名字为："+getStudentName()+"学号："+ getStudentNo()+"性别:"+getStudentSex()
                +"年龄："+getStudentAge()+"专业"+ subjectName+"学制年限"+ subjectLife;
        return str;
    }
    public String introduction(Subject mySubject){
        String str = "名字为："+getStudentName()+"学号："+ getStudentNo()+"性别:"+getStudentSex()
                +"年龄："+getStudentAge()+"专业"+ mySubject.getSubjectName()+"学制年限"+ mySubject.getSubjectLife();
        return str;
    }


}
