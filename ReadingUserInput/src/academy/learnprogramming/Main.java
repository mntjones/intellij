package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your Year of Birth: ");
        int yearOfBirth;
        boolean hasNextInt = scanner.hasNextInt();

        if (!hasNextInt) {
            yearOfBirth = -100;
        }
        else {
            yearOfBirth = scanner.nextInt();
        }
        // to handle Enter key issue, need to call nextLine() without assigning a variable.
        scanner.nextLine();
        int age = 2020- yearOfBirth;

        while (age < 0 || age > 120) {
            System.out.println("You entered an invalid Year of Birth . Please reenter");
            hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                yearOfBirth = -100;
            }
            else {
                yearOfBirth = scanner.nextInt();
            }

            scanner.nextLine();
            age = 2020 - yearOfBirth;
        }


        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! You are " + (2020-yearOfBirth) + " this year!");

        scanner.close();


    }
}
