package academy.learnprogramming;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions;
    private String name;
    private double initialTransaction;


    // a new customer will start with a name and initial transaction, which should be added to their ArrayList
    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

}
