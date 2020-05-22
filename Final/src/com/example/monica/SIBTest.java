package com.example.monica;

public class SIBTest {
    public static final String owner;

    // static blocks called in order
    // can have as many as you want
    static {
        owner = "Monica";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
