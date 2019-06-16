package com.mugallirufaida;


public class Main {
    // this class is for testing the output
    public static void main(String[] args) {


        BookingRequest bookingRequest = new BookingRequest(3);
        BookingRequest bookingRequest2 = new BookingRequest(10);


        System.out.println(bookingRequest.hotelReservation(1, 3));
        System.out.println(bookingRequest.hotelReservation(2, 5));
        System.out.println(bookingRequest.hotelReservation(1, 9));
        System.out.println(bookingRequest.hotelReservation(0, 15));


    }
}


