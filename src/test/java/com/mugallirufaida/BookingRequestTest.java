package com.mugallirufaida;

import org.junit.Assert;
import org.junit.Test;

public class BookingRequestTest {



    @Test
    public void requestOutsideOurPlanningPeriodAreDeclined_1(){
        BookingRequest bookingRequest = new BookingRequest(1);
        Assert.assertTrue(bookingRequest.hotelReservation(-4,2)=="Declined");
        Assert.assertTrue(bookingRequest.hotelReservation(200,400)=="Declined");
    }

    @Test
    public void hotelReservationTest() {
        BookingRequest bookingRequest = new BookingRequest(3);


        Assert.assertTrue(bookingRequest.hotelReservation(0, 5) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(7, 13) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(3, 9) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(6, 7) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(6, 6) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(0, 4) == "Accepted");
    }

    @Test
    public void RequestAreDeclined_3() {
        BookingRequest bookingRequest = new BookingRequest(3);

        Assert.assertTrue(bookingRequest.hotelReservation(1, 3) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(2, 5) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(1, 9) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(0, 15) == "Declined");


    }

    @Test
    public void ReuestCanBeAcceptedAfter_a_decline_4() {
        BookingRequest bookingRequest = new BookingRequest(3);

        Assert.assertTrue(bookingRequest.hotelReservation(1, 3) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(0, 15) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(1, 9) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(2, 5) == "Declined");
        Assert.assertTrue(bookingRequest.hotelReservation(4, 9) == "Accepted");


    }

    @Test
    public void complexRequest_5() {
        BookingRequest bookingRequest = new BookingRequest(2);

        Assert.assertTrue(bookingRequest.hotelReservation(1, 3) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(0, 4) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(2, 3) == "Declined");
        Assert.assertTrue(bookingRequest.hotelReservation(5, 5) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(4, 10) == "Declined");
        Assert.assertTrue(bookingRequest.hotelReservation(10, 10) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(6, 7) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(8, 10) == "Accepted");
        Assert.assertTrue(bookingRequest.hotelReservation(8, 9) == "Accepted");

    }

}
