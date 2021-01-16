package AnimalProject;

public class ElectricVehicle extends CarWork{
    private String batteryModel;

    public String getBatteryModel() {
        return batteryModel;
    }

    public void setBatteryModel(String batteryModel) {
        this.batteryModel = batteryModel;
    }

    public String run(){
        String str = "这是一辆使用"+this.getBatteryModel()+"牌电池的电动车";
        return str;
    }
}
