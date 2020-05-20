package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone("510-123-4567");

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
                    phone.printContacts();
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
                    queryContact();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    break;
            }
        }
    }

    private static void addItem() {
        System.out.println("Please type in contact name to add: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(name,phoneNumber);

        if (phone.addNewContact(newContact)) {
            System.out.println("New contact added");
        }
        else {
            System.out.println("Cannot add");
        }

    }

    private static void modifyItem() {
        System.out.println("Enter contact name to be modified: ");
        String oldName = scanner.nextLine();
        Contact oldContact = phone.queryContact(oldName);

        if (oldContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter replacement name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter phone number:");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);

        if(phone.updateContact(oldContact, newContact)) {
            System.out.println("Updated contact");
        }
        else {
            System.out.println("Error in updating record");
        }
    }

    private static void removeItem() {
        System.out.println("Enter contact name to remove: ");
        String removeName = scanner.nextLine();
        Contact old = phone.queryContact(removeName);

        if (old == null) {
            System.out.println("Contact not found");
            return;
        }

        if (phone.removeContact(old)) {
            System.out.println("Deleted contact");
        }
        else {
            System.out.println("Error in deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = phone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhone());
    }

    public static void printChoices() {

        System.out.println("\nPress: ");
        System.out.println("\t 0 - Print choice options");
        System.out.println("\t 1 - Print the contact list");
        System.out.println("\t 2 - Add an item to contacts");
        System.out.println("\t 3 - Modify a contact");
        System.out.println("\t 4 - Remove a contact");
        System.out.println("\t 5 - Search for a contact");
        System.out.println("\t 6 - Quit");
    }








}
