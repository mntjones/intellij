package academy.learnprogramming;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}

// forcing classes that inherit from this class to build out eat() and breathe()
// Abstract class has member variables that can be inherited - can't be done in interface
// Interface variables are all public static final variables
// Abstract can have a constructor
