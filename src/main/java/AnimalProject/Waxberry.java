package AnimalProject;

public final class Waxberry extends Fruist{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Waxberry(String shape, String taste, String color){
        super(shape,taste);
        this.setColor(color);
    }

    public final void face(){
        System.out.println("杨梅：**、**，果味酸甜适中。");
    }

    public void eat(){
        System.out.println("杨梅酸甜适中，非常好吃！");
    }

    public String toString(){
        String str = this.getShape()+ this.getColor()+this.getTaste();
        return str;
    }
}
