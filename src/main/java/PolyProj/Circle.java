package PolyProj;

public class Circle extends Shape{
    private double r;


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(){

    }

    public Circle(double r){
        this.setR(r);
    }

    public void area(){
        this.setArea(Math.PI*r*r);
        System.out.println(this.getArea());
    }

}
