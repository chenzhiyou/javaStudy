package AnimalProject;

public class Fruist {
    private String shape;
    private String taste;

    public Fruist(){

    }

    public Fruist(String shape, String taste){
        this.setShape(shape);
        this.setTaste(taste);
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void eat(){
        System.out.println("水果可以供人们食用！");
    }

    public boolean equals(Object object){
        if(object==null){
            return false;
        }
        Fruist fruist = (Fruist)object;
        if (this.getShape()==fruist.getShape()&&this.getTaste()==fruist.getTaste()) {
            return true;
        }else {
            return false;
        }
    }



}
