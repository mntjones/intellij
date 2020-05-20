package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// 4.47

        int highScore = calculateScore(true, 800, 5, 100);

        System.out.println("The high score is: " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);

        System.out.println("The high score is: " + highScore);

        displayHighScore("Monica", calculateHighScorePosition(1500));
        displayHighScore("Cassie", calculateHighScorePosition(900));
        displayHighScore("Les", calculateHighScorePosition(100));
        displayHighScore("Spot", calculateHighScorePosition(50));

    }
    // can't put a method inside another method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            return (score + (levelCompleted * bonus));
        }
        return -1;
    }

    public static void displayHighScore (String name, int position) {

        System.out.println(name + " is in position " + position + " on the high score table!");

    }

    public static int calculateHighScorePosition (int score) {

        int position = 4;

        if (score >= 1000) {
            position = 1;
        }
        else if (score >= 500) {
            position =  2;
        }
        else if (score >= 100) {
            position = 3;
        }

        return position;
    }


}
