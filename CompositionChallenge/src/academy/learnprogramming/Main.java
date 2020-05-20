package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Wall wall1 = new Wall(96, 120);
        Wall wall2 = new Wall(96, 108);
        Wall wall3 = new Wall(96, 120);
        Wall wall4 = new Wall(96, 108);

        Lamp lamp = new Lamp ("blue", 60);

        Window window = new Window(36, 48, "grey");

        Floor floor = new Floor(108, 120);
        Ceiling ceiling = new Ceiling(108, 120);

        Doorway doorway = new Doorway(72, 24);

        Room room = new Room(wall1, wall2, wall3, wall4, ceiling, floor, window, doorway, lamp);
        System.out.println(room.getLamp());

        room.openWindow();


    }
}
