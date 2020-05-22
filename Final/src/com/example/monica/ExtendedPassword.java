package com.example.monica;

public class ExtendedPassword extends Password{

    private int decrypt;

    public ExtendedPassword(int password) {
        super(password);
        this.decrypt = password;
    }

    // can't use now because method is final in Password
//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as: " + this.decrypt);
//    }
}
