package com.example.monica;

public class SomeClass {
    private static int counter = 0;

    // good idea to make final when you don't want anyone changing the value once it's been set
    public final int instanceNum;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        counter++;
        instanceNum = counter;
        System.out.println(name + " created - instance is: " + instanceNum);
    }

    public int getInstanceNum() {
        return instanceNum;
    }
}
