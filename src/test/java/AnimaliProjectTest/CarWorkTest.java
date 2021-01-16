package AnimaliProjectTest;

import AnimalProject.Bicycle;
import AnimalProject.ElectricVehicle;
import AnimalProject.Tricycle;

public class CarWorkTest {
    public static void main(String[] args) {
        System.out.print("父类信息测试：");
        Tricycle nonMotor = new Tricycle();
        nonMotor.setTrademark("天宁");
        nonMotor.setColor("红色");
        nonMotor.setWheel(4);
        nonMotor.setSeat(2);
        System.out.println(nonMotor.run());
        System.out.print("自行车类信息测试：");
        Bicycle bicycle = new Bicycle();
        bicycle.setTrademark("捷安特");
        bicycle.setColor("黄色");
        System.out.println(bicycle.run());
        System.out.print("电动车类信息测试：");
        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.setBatteryModel("飞鸽");
        System.out.println(electricVehicle.run());
        System.out.print("三轮车类信息测试：");
        Tricycle tricycle = new Tricycle();
        System.out.println(tricycle.run());

    }
}
