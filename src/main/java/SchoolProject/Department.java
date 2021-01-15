package SchoolProject;

public class Department {
    private String departmentNum;
    private String departmentName;
    private Person[] departmentPerson;
    private int personNum;

    public Department(){

    }

    public Department(String departmentNum, String departmentName){
        this.setDepartmentNum(departmentNum);
        this.setDepartmentName(departmentName);
    }

    public String getDepartmentNum() {

        return departmentNum;
    }

    public void setDepartmentNum(String departmentNum) {
        this.departmentNum = departmentNum;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Person[] getDepartmentPerson() {
        if(this.departmentPerson==null){
            this.departmentPerson = new Person[200];
        }
        return departmentPerson;
    }

    public void setDepartmentPerson(Person[] departmentPerson) {
        this.departmentPerson = departmentPerson;
    }

    public int getPersonNum() {
        return personNum;
    }

    public void setPersonNum(int personNum) {
        this.personNum = personNum;
    }

    public String addPerson(Person person){
        for(int i=0; i<this.getDepartmentPerson().length;i++){
            if(this.getDepartmentPerson()[i]==null){
                person.setPersonDepartment(this);
                this.getDepartmentPerson()[i]=person;
                this.personNum = i+1;
                return this.getDepartmentName()+"的人数为"+personNum;
            }
        }
        return this.getDepartmentName()+"的人数为"+personNum;
    }


}
