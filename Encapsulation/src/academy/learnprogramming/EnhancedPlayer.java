package academy.learnprogramming;

public class EnhancedPlayer {
    // by making the fields private, we're making sure that the fields in the class aren't accessible to any classes
    // that are outside - Encapsulation

    // can make changes in this clss, and doesn't affect code in other classes - by changing health to hitpoints, we don't need to also change code in Main

    private String name;
    private int hitpoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitpoints = health;
        }
        this.weapon = weapon;
    }

    public int getHealth() {
        return hitpoints;
    }

    public void loseHealth(int damage) {

        this.hitpoints -= damage;
        if (this.hitpoints <= 0) {
            System.out.println("Player is dead");
            // Reduce number of lives remaining
        }
    }
}
