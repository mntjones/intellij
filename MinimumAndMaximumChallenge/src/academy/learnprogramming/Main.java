package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userMax = 0;
        int userMin = 0;
        // used as flag for first entry
        int count = 0;

        // while loop runs until user enters a non-numerical value
        while (true) {
            System.out.println("Enter number:   -- q to quit");
            int userNumber;

            // if user enters a valid number
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
                // checks if this is the first entry
                if (count == 0) {
                    userMax = userNumber;
                    userMin = userNumber;
                }
                // if not first entry
                else {
                    if (userNumber > userMax){
                        userMax = userNumber;
                    }
                    if (userNumber < userMin) {
                        userMin = userNumber;
                    }
                }
                // removes first time flag
                count ++;
            }
            // if non-numerical value entered
            else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        // if first value was non-numerical - do not want to print min/max values
        if (count == 0) {
            System.out.println("No user input was recorded. No min nor max results available.");
        }
        else {
            System.out.println("The maximum number is " + userMax);
            System.out.println("The minimum entered number is " + userMin);
        }
    }
}
