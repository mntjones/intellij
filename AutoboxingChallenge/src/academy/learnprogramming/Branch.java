package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.customers = new ArrayList<Customer>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer (String name, double initialTransaction) {
        // check if customer already exists
        if (findCustomerExists(name) == null) {
            this.customers.add(new Customer(name, initialTransaction));
            System.out.println("Customer added to branch");
            return true;
        }
        else {
            System.out.println("Error. Not added");
        }
        return false;
    }

    public boolean addTransaction(String name, double transaction) {
        // check if customer already exists
        Customer currentCustomer = findCustomerExists(name);
        if (currentCustomer != null) {
            currentCustomer.addTransaction(transaction);
            System.out.println("Transaction added to customer " );
            return true;
        }
        else {
            System.out.println("Error. Transaction not added");
        }
        return false;
    }

    private Customer findCustomerExists(String name) {
        for (int i=0; i< this.customers.size(); i++) {
            Customer currentCustomer = this.customers.get(i);
            if (currentCustomer.getName().equals(name)) {
                return currentCustomer;
            }
        }
        return null;
    }


}
