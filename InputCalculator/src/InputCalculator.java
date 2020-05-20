import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long average = 0;

        while (true) {
           // System.out.println("Enter number:   -- q to quit");
            int userNumber;

            // if user enters a valid number
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
                sum += userNumber;
                count ++;
                average = Math.round((double)sum/(double)count);

            }
            // if non-numerical value entered
            else {
                break;
            }

            scanner.nextLine();
        }
        scanner.close();
        // if first value was non-numerical - do not want to print min/max values
//        if (count == 0) {
//            System.out.println("No user input was recorded. No sum nor average available");
//        }
//        else {
            System.out.println("SUM = " + sum + " AVG = " + average);
//        }


    }


}

