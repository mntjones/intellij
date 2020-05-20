package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Lab");
        dog.breathe();
        dog.eat();

        // can't directly instantiate a class that is abstract
        // Bird bird = new Bird("Parrot");
//        bird.breathe();
//        bird.eat();

        Parrot parrot = new Parrot("Red");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Stripe");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
