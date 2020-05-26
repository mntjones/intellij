package com.example.monica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theater {
    private final String name;
    public List<Seat> seats = new ArrayList<>();

    public Theater(String name, int numRows, int seatsPerRow) {
        this.name = name;

        int lastRow = 'A' + (numRows - 1);

        for (char row='A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum<= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean reserveSeat(String seatNum) {
        Seat requestSeat = new Seat(seatNum);
        // fastest way to find something in a list
        int foundSeat = Collections.binarySearch(seats, requestSeat, null);

        // from Java source code for Collections
//
//        int low = 0;
//        int high = seats.size() - 1;
//
//        while (low <= high) {
//            System.out.println(".");
//            int mid = (low + high) / 2;
//            Seat midVal = seats.get(mid);
//            int comp = midVal.getSeatNumber().compareTo(seatNum);
//
//            if (comp < 0) {
//                low = mid + 1;
//            }
//            else if (comp > 0) {
//                high = mid -1;
//            }
//            else {
//                return seats.get(mid).reserve();
//            }
//
//        // else there is no seat in the theater
//
//            System.out.println("There is no seat " + seatNum);
//            return false;
//        }

        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        }
        else {
            System.out.println("There is no seat " + seatNum + " available");
            return false;
        }

//        for(Seat seat : seats) {
//            if(seat.getSeatNumber().equals(seatNum)) {
//                requestSeat = seat;
//                break;
//            }
//        }
//
//        if (requestSeat == null) {
//            System.out.println("There is no seat " + seatNum);
//            return false;
//        }
//        return requestSeat.reserve();
    }

    // testing
    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }
            else {
                System.out.println("Cannot reserve seat " + seatNumber);
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            }
            else {
                System.out.println("Cannot cancel reservation of seat " + seatNumber);
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}