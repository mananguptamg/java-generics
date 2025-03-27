package com.bridgelabz.flightscheduling;

public class Flight<T>{
    private T flightNumber;
    private String destination;
    private String deperatureTime;

    public Flight(T flightNumber, String destination, String deperatureTime){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.deperatureTime = deperatureTime;
    }
    public void printDetails(){
        System.out.println("Flight Number " +flightNumber+ " from Goa to " +destination+ " will take off at "+deperatureTime);
    }
}