package AnimaliProjectTest;

import AnimalProject.Animal;
import AnimalProject.Cat;
import AnimalProject.Dog;

public class AnimalTest {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.setName("花花");
        cat.setSpecies("中华田园猫");
        cat.eat();
        cat.run();
        System.out.println("=========");
        Dog dog = new Dog();
        dog.setName("妞妞");
        dog.setMonth(1);
        dog.eat();
        dog.sleep();
    }
}
