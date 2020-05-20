package academy.learnprogramming;

public class Mustang extends Car{

    private String color;

    public Mustang(String engine, int weight, double length, String maker, String model, int maxSpeed,
                   int wheels, String bodyStyle, int cylinders, int doors, String color) {
        super(engine, weight, length, "Ford", "Mustang", maxSpeed, 4, bodyStyle, cylinders, doors);
        this.color = color;
    }
}
