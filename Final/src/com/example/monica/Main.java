package com.example.monica;

public class Main {

    public static void main(String[] args) {

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNum());
        System.out.println(two.getInstanceNum());
        System.out.println(three.getInstanceNum());

        //one.instanceNum = 4; - doesn't work because variable set as final in SomeClass

        System.out.println(Math.PI);
        // Java's Math class:
        // Constructor set as private - does not allow instantiation
        // class is final - prevents from being subclassed as well
        // Math m = new Math();


        int pw = 2304052;
        // using ExtendedPassword doesn't get encrypted - needs to use final so we can't override method
        Password password = new ExtendedPassword(pw);

        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(22222);
        password.letMeIn(2304052);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }
}
