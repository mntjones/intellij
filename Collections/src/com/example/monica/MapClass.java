package com.example.monica;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        }
        else{
            languages.put("Java", "this course is about Java");
            System.out.println("Java added successfully ");
        }
        //languages.put("Java", "a compiled high-level, OO, platform independent language");
        languages.put("Python" , "an interpreted, OO, high-level programming language with fynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners aLl Purposes Symbolic Instruction Code");
        languages.put("Lisp", "therein lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        }
        else{
            languages.put("Java", "this course is about Java");
            System.out.println("Java added successfully ");
        }

        System.out.println("==========");
        // objects sent back in random order
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }

}
