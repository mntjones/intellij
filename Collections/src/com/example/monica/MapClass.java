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

        //languages.remove("Lisp");

        if (languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        }
        else {
            System.out.println("Algol not removed - key/pair not found");
        }

        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features"));
        System.out.println(languages.replace("Scala", "this will not be added"));
        System.out.println("==========");
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
        System.out.println();
        languages.replace("Lisp", "a functional programming language with imperative features", "therein lies madness");
        System.out.println(languages.get("Lisp"));

    }

}
