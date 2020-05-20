package academy.learnprogramming;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> places = new LinkedList<String>();

        addInOrder(places, "SF");
        addInOrder(places, "LA");
        addInOrder(places, "SD");
        addInOrder(places, "Phoenix");
        addInOrder(places, "Austin");
        addInOrder(places, "NoLa");

//        printList(places);
//
//        addInOrder(places, "Albuquerque");
//        printList(places);
//
//        places.remove(3);
//        printList(places);

        visit(places);

    }
    //Iterator can only go forward through a Linked List and cannot modify the contents
    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }

        System.out.println("============");
    }

    // ListIterator can go forward and backward in a Linked List and modify the contents
    private static boolean addInOrder (LinkedList<String> linkedList, String newPlace) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            // need this to point to first entry in Linked List
            int comparison = stringListIterator.next().compareTo(newPlace);

            if (comparison == 0) {
                // equal, do not add
                System.out.println(newPlace + " is already included as a destination");
                return false;
            }
            else if (comparison > 0){
                // go back
                stringListIterator.previous();
                // add to list
                stringListIterator.add(newPlace);
                return true;
            }
            else if (comparison <  0) {
                // move on
                continue;
            }
        }
        stringListIterator.add(newPlace);
        return true;
    }

    private static void visit (LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in itinerary");
            return;
        }
        else {
            System.out.println("Now visiting: " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            System.out.println("Enter choice: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Trip over");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting: " + listIterator.next());
                    }
                    else {
                        System.out.println("Reached end of trip");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting: " + listIterator.previous());
                    }
                    else {
                        System.out.println("Beginning trip");
                        forward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available Options: ");
        System.out.println("   0 -  to quit");
        System.out.println("   1 -  to next city");
        System.out.println("   2 -  to previous city");
        System.out.println("   3 -  to print menu \n");
    }
}
