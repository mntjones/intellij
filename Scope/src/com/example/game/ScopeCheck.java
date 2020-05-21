package com.example.game;

public class ScopeCheck {
    // scope is ScopeCheck
    public int publicVar = 0;
    private int var1 = 1; //class scope

    public ScopeCheck() {
        System.out.println("ScopeCheck created - \n publicVar = " + publicVar +
                "\n var1 = " + var1);
    }

    public int getVar1() {
        return var1;
    }

    public int getPublicVar() {
        return  publicVar;
    }

    public void timesTwo() {
        // scope is timesTwo method
        int var2 = 2;

        for (int i=0; i<10; i++) {
            System.out.println(i + " times var2 is " + i * var2);
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("var3 from outer class: " + innerClass.var3);
    }

    public class  InnerClass {
        public int var3 = 3; //scope is Innerclass

        public InnerClass() {
            System.out.println("InnerClass created - \n var1 is " + var1 + "\n var 3 is " + var3);
        }

        public void timesTwo() {
            for (int i=0; i<10; i++) {
                System.out.println("var1 is still " + var1);
                // actually using 3
                System.out.println(i + " times var3 is " + i* var3);
            }
        }

    }
}

// Java checks immediate block first, then works backwards in enclosing blocks
