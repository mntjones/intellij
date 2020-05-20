package academy.learnprogramming;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name,int size, int weight, int eyes, int legs,
               int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void walk() {
        System.out.println("Dog.walk");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog run");
        move(10); // calls in Dog
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs called");
    }

    private void chew() {
        System.out.println("Chew called in dog");
    }

    @Override
    public void eat() {
        System.out.println(" Dog.eat() called");
        chew();
        super.eat(); // called Animal.eat
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        moveLegs(speed);
        super.move(speed); //calls in Animal
    }
}
