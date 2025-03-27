package com.bridgelabz.flightscheduling;

public class Booking<T>{
    private T bookingId;
    private String passengerName;
    private int age;

    public Booking(T bookingId, String passengerName, int age){
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.age = age;
    }
    public void displayBookingDetails(){
        System.out.println("Passenger with name "+passengerName+ " and age "+age+ " is required at counter. Your booking id is " +bookingId);
    }
}
