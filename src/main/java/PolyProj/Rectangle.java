package PolyProj;

public class Rectangle extends Shape{
    private int length;
    private int wide;

    public Rectangle(){

    }

    public Rectangle(int length, int wide){
        this.setLength(length);
        this.setWide(wide);
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public void area(){
        this.setArea(length*wide);
        System.out.println(this.getArea());
    }

}
