package SchoolProject;

public class Person {
    private String name;
    private String personNum;
    private String sex;
    private int age;
    private Department personDepartment;
    private Post personPost;

    public Person(){

    }

    public Person(String name, String personNum, String sex, int age, Department personDepartment, Post personPost){
        this.setName(name);
        this.setPersonNum(personNum);
        this.setSex(sex);
        this.setAge(age);
        this.setPersonDepartment(personDepartment);
        this.setPersonPost(personPost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonNum() {
        return personNum;
    }

    public void setPersonNum(String personNum) {
        this.personNum = personNum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex=="男"||sex=="女"){
            this.sex = sex;
        }else{
            this.sex="男";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18&&age<=65){
            this.age = age;
        }else {
            this.age=18;
        }

    }

    public Department getPersonDepartment() {
        return personDepartment;
    }

    public void setPersonDepartment(Department personDepartment) {
        this.personDepartment = personDepartment;
    }

    public Post getPersonPost() {
        return personPost;
    }

    public void setPersonPost(Post personPost) {
        this.personPost = personPost;
    }

    public String introduce(){
        String str="姓名:"+this.getName()+"\n工号:"+this.getPersonNum()+"\n性别:"+this.getSex()
                +"\n年龄:"+this.getAge()+"\n职务:"+this.getPersonDepartment().getDepartmentName()
                +this.getPersonPost().getPostName();
        return str;
    }
}
