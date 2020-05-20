package academy.learnprogramming;

public class Doorway {
    private double height;
    private double width;

    public Doorway(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return this.width * this.height;
    }
}
