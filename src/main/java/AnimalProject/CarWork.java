package AnimalProject;

public class CarWork {
    private String trademark;
    private String color;
    private int wheel;
    private int seat;

    public CarWork(){

    }

    public CarWork(String trademark, String color){
        this.setTrademark(trademark);
        this.setColor(color);
    }

    public CarWork(String trademark, String color, int wheel, int seat){
        this.setTrademark(trademark);
        this.setColor(color);
        this.setWheel(wheel);
        this.setSeat(seat);
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        if(wheel<=0){
            this.wheel=2;
        }
        this.wheel = wheel;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        if(seat<=0){
            this.seat=1;
        }
        this.seat = seat;
    }

    public String run(){
        String str = "这是一辆"+this.getColor()+"颜色的，"+this.getTrademark()+
                "牌的非机动车，有"+this.getWheel()+"个轮子，有"+this.getSeat()+"个座椅的非机动车";
        return str;
    }


}
