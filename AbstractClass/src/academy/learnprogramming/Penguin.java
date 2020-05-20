package academy.learnprogramming;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Oops - I can't fly");
    }

    @Override
    public void eat() {
        System.out.println("Swallow fishes whole");
    }
}
