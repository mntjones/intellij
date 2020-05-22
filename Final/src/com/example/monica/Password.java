package com.example.monica;

public class Password {
    private static final int key = 93469205;
    private final int encrypted;

    // static equivalent of constructors = static initialization blocks
    // only used once when class is first loaded into program - used rarely


    public Password(int password) {
        this.encrypted = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password^key;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.encrypted);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.encrypted) {
            System.out.println("Welcome!");
            return true;
        }
        else {
            System.out.println("Rejected!");
            return false;
        }
    }
}
