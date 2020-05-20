package academy.learnprogramming;

public class Window {

    private double height;
    private double width;
    private String drapeColer;


    public Window(double height, double width, String drapeColer) {
        this.height = height;
        this.width = width;
        this.drapeColer = drapeColer;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getDrapeColer() {
        return drapeColer;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public void open() {
        System.out.println("Window is open");
    }

    public void openDrapes() {
        System.out.println("Drapes are open");
        open();
    }
}
