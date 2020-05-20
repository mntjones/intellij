package academy.learnprogramming;

public class Ceiling {

    private double length;
    private double width;

    public Ceiling(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
