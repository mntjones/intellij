package academy.learnprogramming;

public class Floor {

    private double length;
    private double width;

    public Floor(int length, int width) {
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
