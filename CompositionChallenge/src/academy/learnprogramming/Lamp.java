package academy.learnprogramming;

public class Lamp {

    private String color;
    private int wattage;

    public Lamp(String color, int wattage) {
        this.color = color;
        this.wattage = wattage;
    }

    public String getColor() {
        return color;
    }

    public int getWattage() {
        return wattage;
    }

    public void turnOn () {
        System.out.println("Turn lamp on");
    }

    public void turnOff() {
        System.out.println("Turn lamp off");
    }
}
