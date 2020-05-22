package com.example.monica;

public class Main {

    public static void main(String[] args) {

        Account myAccount = new Account("Monica");
        myAccount.deposit(1000.00);
        myAccount.withdraw(500);
        myAccount.withdraw(-200);
        myAccount.deposit(-20);
        myAccount.calculateBalance();
        // should not be able to set this - set field in account to private
        //myAccount.balance = 5000;

        System.out.println("Balance on account is: $" + myAccount.getBalance());

    }
}
// Top Level:
// only classes, interfaces and enums can exist at the top level, everything else must be included
//  within one of these.
// public: the object is visible to all classes everywhere, whether they are in the same package or
//  have imported the package containing the public class
// Package-private: the object is only available within its own package (and is visible to every class
//  within the same package). Package-private is specified by not specifying (i.e. it is the default if
//  you do not specify public. There is not a "package-private" keyword

//Member Level:
//public: at the member level, public has the same meaning as the top level. A public class member (or
//  field) and public method can be accessed from any other class anywhere, even in a different package.
//package-private: this also has the same meaning as it does at the top level. An object with no modifier
//  is visible to every class within the same package (but not to classes in external packages).
//private: the object is only visible within the class it is declared. It is not visible anywhere else
// (including in subclasses of its class).
//protected: the object is visible anywhere in its own package (like package-private) but also in subclasses
//  even if they are in another package



