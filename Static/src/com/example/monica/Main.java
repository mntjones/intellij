package com.example.monica;

public class Main {

    // needs to be static to use
    public static int multiplier = 7;

    public static void main(String[] args) {

//        StaticTest first = new StaticTest("1st");
//        System.out.println(first.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest second = new StaticTest("2nd");
//        System.out.println(second.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest third = new StaticTest("3rd");
//        // even though grabbing secong.getInstance(), still shows 3 because they are sharing the same
//        //instance of numInstances
//        System.out.println(third.getName() + " is instance number " + StaticTest.getNumInstances());

        //terminal:
        // java com.example.monica.Main

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("The multiplier is " + multiplier);
    }
    // needs to be static to use
    public static int multiply(int number) {
        return number*multiplier;
    }
}
