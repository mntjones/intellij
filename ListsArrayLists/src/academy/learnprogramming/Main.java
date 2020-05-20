package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Grocery grocery = new Grocery();

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;

        int choice = 0;
        printChoices();

        while (!quit) {

            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printChoices();
                    break;
                case 1:
                    grocery.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    //modify item
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    break;
            }
        }

    }

    public static void printChoices() {

        System.out.println("\nPress: ");
        System.out.println("\t 0 - Print choice options");
        System.out.println("\t 1 - Print the grocery list");
        System.out.println("\t 2 - Add an item to the list");
        System.out.println("\t 3 - Modify an item on the list");
        System.out.println("\t 4 - Remove an item on the list");
        System.out.println("\t 5 - Search for an item on the list");
        System.out.println("\t 6 - Process Array List");
        System.out.println("\t 7 - Quit");
    }

    public static void addItem() {
        System.out.println("Please type in item to add: ");
        grocery.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item to be modified: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        grocery.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name: ");
        String itemNo = scanner.nextLine();
        grocery.removeItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Enter item to search: ");
        String search = scanner.nextLine();
        if (grocery.onFile(search)) {
            System.out.println("Found " + search + " in the grocery list");
        }
        else {
            System.out.println(search + " is not in the grocery list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>(grocery.getGroceryList());
    }
}
