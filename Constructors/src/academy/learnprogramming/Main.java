package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount bankAccount = new BankAccount(123456789,1000.00, "Monica",
                "monica@gmail.com", "123-456-7890");
        BankAccount blankAccount = new BankAccount();
        BankAccount partialAccount = new BankAccount("Cassie", "cj@gmail.com", "908-908-9988");

        System.out.println("Acct #: " + bankAccount.getAccountNumber());
        System.out.println("Initial balance: " + bankAccount.getBalance());
        System.out.println("Name: " + bankAccount.getName());
        System.out.println("Email: " + bankAccount.getEmail());
        System.out.println("Phone: " + bankAccount.getPhone());

        bankAccount.depositFunds(1000.00);
        System.out.println("Balance after deposit: " + bankAccount.getBalance());
        bankAccount.withdrawFunds(500.00);
        System.out.println("Balance after withdrawal: " + bankAccount.getBalance());
        bankAccount.withdrawFunds(3000.00);
        System.out.println("Balance after attempted withdrawal: " + bankAccount.getBalance());

        System.out.println("Acct #: " + blankAccount.getAccountNumber());
        System.out.println("Initial balance: " + blankAccount.getBalance());
        System.out.println("Name: " + blankAccount.getName());
        System.out.println("Email: " + blankAccount.getEmail());
        System.out.println("Phone: " + blankAccount.getPhone());

        System.out.println("Acct #: " + partialAccount.getAccountNumber());
        System.out.println("Initial balance: " + partialAccount.getBalance());
        System.out.println("Name: " + partialAccount.getName());
        System.out.println("Email: " + partialAccount.getEmail());
        System.out.println("Phone: " + partialAccount.getPhone());

    }
}
