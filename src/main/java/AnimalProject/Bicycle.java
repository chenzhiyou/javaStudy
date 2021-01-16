package AnimalProject;

public class Bicycle extends CarWork{
    public Bicycle(){

    }

    public Bicycle(String trademark, String color){
        super(trademark, color);
    }

    public String run(){
        String str = "这是一辆"+this.getColor()+"颜色的，"+this.getTrademark()+
                "牌的自行车";
        return str;
    }
}
