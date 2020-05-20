package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // write your code here
//        Player player = new Player();
//        player.name = "Mia";
//        player.health = 20;
//        player.weapon = "Bo staff";
//
//        int damage = 10;
//
//        player.loseHealth(damage);
//        System.out.println("Health remaining after damage: " + player.healthRemaining());
//
//        player.loseHealth(damage);
//        System.out.println("Health remaining after damage: " + player.healthRemaining());


        EnhancedPlayer player = new EnhancedPlayer("Mia", 50, "dagger");
        System.out.println("Initial health is: " + player.getHealth());



    }
}
