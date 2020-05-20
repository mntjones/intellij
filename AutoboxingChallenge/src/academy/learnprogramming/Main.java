package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Federal Reserve");
        bank.addBranch("San Francisco");

        bank.addCustomer("San Francisco", "Monica", 2010.40);
        bank.addCustomer("San Francisco", "Cassie", 30.20);
        bank.addCustomer("San Francisco", "Emi", 70.90);

        bank.addBranch("New York");
        bank.addCustomer("New York", "Les", 400.02);

        bank.addTransaction("San Francisco", "Monica", 30.22);
        bank.addTransaction("San Francisco", "Monica", 10.00);
        bank.addTransaction("New York", "Les", 300.22);

        bank.listCustomers("San Francisco", false);
        bank.listCustomers("San Francisco", true);
        bank.listCustomers("New York", true);

        bank.addCustomer("El Paso", "Jesse", 90.09);
        bank.listCustomers("El Paso", false);



    }
}
