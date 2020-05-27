package com.example.monica;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Challenge: Allow players to type full words or phrases, then move to the correct location
// based on their input. Phrases such as, "Go West", "run South", or just "East" should work.
// An attempt to move in an invalid location will print an error message and the player will remain
// in place. Single letter commands should still work

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

//        String example = "how does this work";
//        String[] exampleArray = example.split(" ");
//
//        for (String s : exampleArray) {
//            System.out.println(s.toUpperCase());
//        }


        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road by a building", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are on top of a hill", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a well house for a small spring", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley by a stream", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in a forest", tempExit));


        // Challenge: Instructor's solution:
//        Map<String, String> vocabulary = new HashMap<String, String>();
//        vocabulary.put("QUIT", "Q");
//        vocabulary.put("NORTH", "N");
//        vocabulary.put("SOUTH", "S");
//        vocabulary.put("EAST", "E");
//        vocabulary.put("WEST", "W");


        int loc = 1;

        while(true) {
            System.out.println(locations.get(loc).getDescription());
            // Won't work - updated the constructor - fully immutable, now
            tempExit.remove("S");

            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are: ");
            for (String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();


            String direction = scanner.nextLine().toUpperCase();
            // Instructor's solution:
//            if (direction.length() > 1) {
//                String[] words = direction.split(" ");
//                for (String word : words){
//                    if(vocabulary.containsKey(word)) {
//                        direction = vocabulary.get(word);
//                        break;
//                    }
//                }
//            }


            // Challenge

            String[] directionArray = direction.split(" ");

            for (String s : directionArray) {
                String word = s.toUpperCase();

                switch (word) {
                    case "W": case "WEST":
                        direction = "W";
                        break;
                    case "E": case "EAST":
                        direction = "E";
                        break;
                    case "N": case "NORTH":
                        direction = "N";
                        break;
                    case "S": case "SOUTH":
                        direction = "S";
                        break;
                    case "Q": case "QUIT":
                        direction = "Q";
                        break;
                }
            }



            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            }
            else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
