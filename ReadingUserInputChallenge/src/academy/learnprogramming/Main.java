package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count < 11 ) {

            System.out.println("Enter number #" + count + ": ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid Entry. Enter a number.");

            }

            else {
                sum +=  scanner.nextInt();
                count ++;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The sum of the ten numbers is: " + sum);

    }
}
