package com.example.monica;

import java.util.ArrayList;

public class Account {

    // if you expose fields of the classes, anyone can access them
    // should use private fields
    private String name;
    private double balance = 0;
    private ArrayList<Double> transactions;

    public Account(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " was deposited. Balance is now: $" + this.balance);
        }
        else {
            System.out.println("Deposit not completed. " +
                    "Please check you are depositing an amount greater than zero");
        }
    }

    public void withdraw(double amount) {
        double withdrawal = -amount;
        if(withdrawal < 0 && (this.balance + withdrawal) >= 0) {
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now: $" + this.balance);
        }
        else {
            System.out.println("Withdrawal not completed.");
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for(double i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Calculated balance is: $" + this.balance);
    }
}
