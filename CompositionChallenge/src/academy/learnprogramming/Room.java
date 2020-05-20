package academy.learnprogramming;

import com.sun.org.apache.bcel.internal.generic.LADD;

public class Room {

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Floor floor;
    private Window window;
    private Doorway doorway;
    private Lamp lamp;

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Floor floor,
                Window window, Doorway doorway, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.floor = floor;
        this.window = window;
        this.doorway = doorway;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void openWindow() {
        System.out.println("Opening window...");
        window.open();
    }
}
