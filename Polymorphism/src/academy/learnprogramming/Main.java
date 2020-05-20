package academy.learnprogramming;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "Unknown";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "Shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    public String plot() {
        return "Aliens try to destroy Earth";
    }
}

class Tangled extends Movie {
    public Tangled() {
        super("Tangled");
    }

    public String plot() {
        return "Singing Rapunzel";
    }
}

class BadMovie extends Movie {
    public BadMovie() {
        super("Bad Movie");
    }
    // No plot method
}

public class Main {

    public static void main(String[] args) {

        // Polymorphism allows actions to act differently based on the actual Object that the action is being performed on

        for (int i=1; i < 10; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("The random number is: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Tangled();
            case 4:
                return new BadMovie();
        }
        return null;
    }
}
