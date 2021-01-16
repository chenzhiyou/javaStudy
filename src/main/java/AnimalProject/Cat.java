package AnimalProject;

public class Cat extends Animal{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Cat(){

    }
    //子类可以直接访问父类的非私有的方法
    public void run(){
        System.out.println(this.getName()+ this.getSpecies()+"在奔跑");
    }
}
