package com.example.game;

public class ScopeCheck {
    // scope is ScopeCheck
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created - \n publicVar = " + publicVar +
                "\n privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public int getPublicVar() {
        return  publicVar;
    }

    public void timesTwo() {
        // scope is timesTwo
        int privateVar = 2;

        for (int i=0; i<10; i++) {
            System.out.println(i + " times 2 is " + i*privateVar);
        }
    }

    public class  InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created - \n privateVar = " + privateVar);
        }

        public void timesTwo() {
            for (int i=0; i<10; i++) {
                // actually using 3
                System.out.println(i + " times 2 is " + i*privateVar);
            }
        }

    }
}

// Java checks immediate block first, then works backwards in enclosing blocks
