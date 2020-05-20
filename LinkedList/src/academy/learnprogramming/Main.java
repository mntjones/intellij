package academy.learnprogramming;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Linked list stores 4 bytes for each integer, 8 bytes for double, etc.
        // Strings, Objects are variable size - so how does it work?
        // linked list still uses 8 bytes in memory for each address, but stores another memory address that points to the actual String.

        Customer customer = new Customer("Mia", 3030.50);

        Customer anotherCustomer;
        anotherCustomer = customer;

        anotherCustomer.setBalance(1005.48);

        System.out.println("Balance for customer " + customer.getName() + ": $" + customer.getBalance());



        ///
        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(4);

        for (int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        // inserts in the index indicated, moves other elements down.
        intList.add(1,8);

        for (int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        // Linked list examples



    }
}
