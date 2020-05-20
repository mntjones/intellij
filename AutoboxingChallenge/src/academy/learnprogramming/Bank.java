package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.branches= new ArrayList<Branch>();
        this.name = name;
    }

    public boolean addBranch (String name) {

        // check if customer already exists
        if (findBranch(name) == null) {
            this.branches.add(new Branch(name));
            System.out.println("Branch added to bank");
            return true;
        }
        else {
            System.out.println("Branch already exists. Not added");
        }
        return false;
    }

    public boolean addCustomer (String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Added customer");
            return branch.addCustomer(customerName, initialTransaction);
        }
        else {
            System.out.println("Error. Customer not added");
            return false;
        }
    }

    public boolean addTransaction (String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            branch.addTransaction(customerName, transaction);
            System.out.println("Transaction added to customer" );
            return true;
        }
        else {
            System.out.println("Error. Transaction not added");
        }
        return false;
    }

    public Branch findBranch(String name) {
        for (int i=0; i< this.branches.size(); i++) {
            Branch currentBranch = this.branches.get(i);
            if (currentBranch.getName().equals(name)) {
                return currentBranch;
            }
        }
        return null;
    }

    public boolean listCustomers (String branch, boolean transactions) {
        Branch currentBranch = findBranch(branch);

        if (currentBranch != null) {
            System.out.println("Customer list for branch: " + currentBranch.getName());

            ArrayList<Customer> branchCustomers = currentBranch.getCustomers();
            for (int i=0; i<branchCustomers.size(); i++) {
                Customer currentCustomer = branchCustomers.get(i);
                System.out.println((i+1) + ". Customer Name: " + currentCustomer.getName());

                if (transactions) {
                    System.out.println("    Transactions: ");
                    ArrayList<Double> customerTransactions = currentCustomer.getTransactions();

                    for (int j=0; j < customerTransactions.size(); j++) {
                        System.out.println("    " + (j+1) + ". Amount: $" + String.format("%.2f",customerTransactions.get(j)));
                    }
                    System.out.println("");
                }
            }
            return true;
        }
        else {
            System.out.println("Branch does not exist.");
            return false;
        }
    }
}
