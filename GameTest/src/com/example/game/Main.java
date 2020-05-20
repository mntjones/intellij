package com.example.game;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Player monica = new Player("Monica", 10, 15);
        System.out.println(monica.toString());
        saveObject(monica);

        monica.setHitPoints(8);
        System.out.println(monica);
        monica.setWeapon("cross bow");
        saveObject(monica);
        //loadObject(monica);
        System.out.println(monica);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);

       // werewolf.getStrength() doesn't work - need to cast - use:
        System.out.println("Strength: " + ((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Enter: \n" + "  1 - enter a string\n" +
                "  0 - quit\n");

        while(!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String input = scanner.nextLine();
                    values.add(index, input);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject (ISaveable objectToSave) {
        for (int i=0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage object");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
