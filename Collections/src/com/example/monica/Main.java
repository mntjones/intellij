package com.example.monica;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("Strand", 8, 12);
        //theater.getSeats();

        if (theater.reserveSeat("D44")) {
            System.out.println("Please pay");
        }
        else {
            System.out.println("Sorry, reservation not completed");
        }

//        if (theater.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        }
//        else {
//            System.out.println("Sorry, seat taken");
//        }


    }
}