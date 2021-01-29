package PolyProi;

import PolyProj.Circle;
import PolyProj.Rectangle;
import PolyProj.Shape;

public class shapeTest {
    public static void main(String[] args) {
        // 创建类的实例，并分别对圆的半径和矩形的长宽进行赋值
        Shape circle = new Circle(4.0);
        Shape rectangle = new Rectangle(3, 4);
        // 调用area（）方法，输出结果
        circle = (Circle) circle;
        circle.area();
        rectangle = (Rectangle) rectangle;
        rectangle.area();

    }
}
