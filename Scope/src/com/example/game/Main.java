package com.example.game;

public class Main {

    public static void main(String[] args) {
        // scope is main
        String var4 = "var4 is private to main";

        ScopeCheck scope = new ScopeCheck();
        scope.useInner();

        ScopeCheck.InnerClass innerClass = scope.new InnerClass();

        // var 3 not available when variable is private - changed to public
//       System.out.println("var3 is not accessible here :"  + innerClass.var3);


//        System.out.println("scope var1 = " + scope.getVar1());
//        System.out.println("main var4 = " + var4);
//
//        scope.timesTwo();
//        ScopeCheck.InnerClass innerClass = scope.new InnerClass();
//        System.out.println("==========");
//        innerClass.timesTwo();

    }
}
