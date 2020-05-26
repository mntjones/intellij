package com.example.monica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("Strand", 8, 12);
        //theater.getSeats();

//        if (theater.reserveSeat("D44")) {
//            System.out.println("Please pay");
//        }
//        else {
//            System.out.println("Sorry, reservation not completed");
//        }

//        if (theater.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        }
//        else {
//            System.out.println("Sorry, seat taken");
//        }


        //shallow copy - contents are same objects/same references
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();

        if(theater.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        }
        else{
            System.out.println("Seat already reserved");
        }

//        Collections.reverse(seatCopy);
//        System.out.println("SeatCopy: ");
//        printList(seatCopy);
//        System.out.println("theater.seats: ");
//        printList(theater.seats);

        Theater.Seat min = Collections.min(seatCopy);
        Theater.Seat max = Collections.max(seatCopy);
        System.out.println("Min seat is: " + min.getSeatNumber());
        System.out.println("Max seat is: " + max.getSeatNumber());

        Collections.shuffle(seatCopy);
        System.out.println("Shuffled: ");
        printList(seatCopy);

        sortList(seatCopy);
        System.out.println("Sorted: ");
        printList(seatCopy);




    }

    public static void printList(List<Theater.Seat> list) {

        for(Theater.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber());
        }

        System.out.println();
        System.out.println("============");

    }

    public static void sortList(List<? extends Theater.Seat> list) {
        for(int i=0; i<list.size()-1; i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
