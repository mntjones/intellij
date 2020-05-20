package academy.learnprogramming;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount() {
        this(000000000, 0.00, "Unknown name", "Unknown email",
                "Unknown phone");
        System.out.println("Empty constructor called. Default values applied.");
    }

    public BankAccount (long accountNumber, double balance, String name, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount (String name, String email, String phone) {
        this (0000000, 0.00, name, email, phone);
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return this.balance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
    }

    public void withdrawFunds(double withdrawal) {
        if (withdrawal <= this.balance) {
            this.balance -= withdrawal;
        }
        else {
            System.out.println("Insufficient funds.");
        }
    }
}
