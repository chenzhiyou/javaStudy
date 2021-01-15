package SchoolProject;

public class Subject {
    private String subjectName;
    private String subjectNumber;
    private int subjectLife;
    //数组是引用类型
    private Student[] myStudents;
    //所报选修课学生的个数
    private int studentNum;

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }



    //获取选修专业的学生信息，如果保存学生信息的数组未被初始化，则先初始化长度为200
    public Student[] getMyStudents() {
        if (this.myStudents==null){
            this.myStudents = new Student[200];
        }
        return myStudents;
    }

    public void setMyStudents(Student[] myStudents) {
        this.myStudents = myStudents;
    }

    //无参构造
    public Subject(){

    }
    //带参构造，实现对属性的全部赋值
    public Subject(String subjectName, String subjectNumber, int subjectLife, Student[] myStudents){
        this.setSubjectName(subjectName);
        this.setSubjectNumber(subjectNumber);
        this.setSubjectLife(subjectLife);
        this.setMyStudents(myStudents);
    }

    public Subject(String subjectName, String subjectNumber, int subjectLife){
        this.setSubjectName(subjectName);
        this.setSubjectNumber(subjectNumber);
        this.setSubjectLife(subjectLife);
    }
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNumber() {
        return subjectNumber;
    }

    public void setSubjectNumber(String subjectNumber) {
        this.subjectNumber = subjectNumber;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    public void setSubjectLife(int subjectLife) {
        if(subjectLife<=0){
            return;
        }
        this.subjectLife = subjectLife;
    }

    public String info(){
        String str = "专业名称为："+subjectName+ " 专业编号为：" + subjectNumber
                +" 专业年限为：" +subjectLife;
        return str;
    }

    public int addStudent(Student student){
        /**
         * 1、将学生保存到数据组中
         * 2、将学生个数保存到studentNum中
         */

        for(int i=0; i<this.getMyStudents().length;i++){
            if(this.getMyStudents()[i]==null){
                student.setStudentSubject(this);
                this.getMyStudents()[i]=student;
                this.studentNum = i+1;
                return studentNum;
            }
        }
        return 0;
    }

}
