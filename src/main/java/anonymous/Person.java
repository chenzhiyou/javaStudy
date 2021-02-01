package anonymous;

public abstract class Person {
    private String name;

    public Person(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void read(){
        System.out.println("人类喜欢读书");
    }


}
