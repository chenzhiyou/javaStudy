package AnimalProject;

public class Trunk extends Car{
    double weight;
//    public Trunk(){

//    }
    public Trunk(String color, String motor, double weight){
        super(color, motor);
        this.weight = weight;
    }

    public void display(){
        System.out.println("颜色：" + color);
    }

    public static void main(String[] args){
        Trunk trunk = new Trunk("红色", "玉材",1.5);
        trunk.display();
    }
}
