package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here


        for(int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (double i = 2.0d; i < 9.0d; i++) {
            System.out.println("$10k at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0d, i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println("$10k at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0d, i)));
        }

        int counter = 0;
        for (int i = 3; i < 39; i ++) {

            if (isPrime(i)) {
                System.out.println("The number " + i + " is a prime number.");
                counter ++;
            }

            if (counter == 3) {
                System.out.println("Exiting the loop.");
                break;
            }

        }
    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime (int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
