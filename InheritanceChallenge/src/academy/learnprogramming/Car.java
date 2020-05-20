package academy.learnprogramming;

public class Car extends Vehicle{

    private int wheels;
    private String bodyStyle;
    private int cylinders;
    private  int doors;

    public Car(String engine, int weight, double length, String maker, String model, int maxSpeed, int wheels, String bodyStyle,
               int cylinders, int doors) {
        super(engine, weight, length, maker, model, maxSpeed);
        this.wheels = wheels;
        this.bodyStyle = bodyStyle;
        this.cylinders = cylinders;
        this.doors = doors;
    }


}
