package com.mugallirufaida;


public class BookingRequest {
    private int[][] reservation;
    private int size;
    private int day = 365;


    public BookingRequest(int size) {
        this.reservation = new int[size][day];
        this.size = size;
    }


    public String hotelReservation(int startDay, int endDay) {

        if (startDay < 0 || endDay < startDay || endDay > 365) {
            return "Declined";
        }

        boolean isBooked = true;

        for (int i = 0; i < size; i++) {
            isBooked = true;
            for (int j = startDay; j <= endDay; j++) {
                if (reservation[i][j] == 1) {
                    isBooked = false;

                }
            }

            if (isBooked == true) {
                for (int j = startDay; j <= endDay; j++) {
                    this.reservation[i][j] = 1;
                }
                return "Accepted";
            }
        }

        return "Declined";
    }

}


