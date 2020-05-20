package academy.learnprogramming;

public class Player {

    // main class has access to fields directly - not good
    // anytime class is changed, you also need to change main - problem in big programs

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {

        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player is dead");
            // Reduce number of lives remaining
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
