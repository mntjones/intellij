package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Monica", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);
        calculateScore();


    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no score.");
        return 0;
    }
}

// Java can figure out which method to use based on the number/type of parameters being passed

// Improves code readability and re-usability
// Easier to remember one method name instead of multiple names
// Achieves consistency in naming
// Overloaded methods give programmers flexibility to call a similar method with different
//  types of data