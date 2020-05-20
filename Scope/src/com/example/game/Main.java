package com.example.game;

public class Main {

    public static void main(String[] args) {
        // scope is main
        String privateVar = "this is private to main";

        ScopeCheck scope = new ScopeCheck();
        System.out.println("scope privateVar = " + scope.getPrivateVar());
        System.out.println("main privateVar = " + privateVar);

        scope.timesTwo();
        ScopeCheck.InnerClass innerClass = scope.new InnerClass();
        System.out.println("==========");
        innerClass.timesTwo();

    }
}
