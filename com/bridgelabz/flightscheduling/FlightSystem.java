package com.bridgelabz.flightscheduling;

public class FlightSystem {
    public static void main(String[] args) {
        Flight<Integer> spicejet = new Flight<>(101, "BLR", "10:30AM");
        Flight<String> indigo = new Flight<>("IG601", "DEL", "2:30PM");

        Booking<Integer> p1 = new Booking<>(4222, "Sanjay", 33);
        Booking<String> p2 = new Booking<>("B22D", "Sanyam", 23);

        spicejet.printDetails();
        p1.displayBookingDetails();
        indigo.printDetails();
        p2.displayBookingDetails();

        FlightManager<Integer> integerFlightManager = new FlightManager<>();
        FlightManager<String> stringFlightManager = new FlightManager<>();
        integerFlightManager.addFlight(spicejet);
        stringFlightManager.addFlight(indigo);

        integerFlightManager.displayAllFlights();
        stringFlightManager.displayAllFlights();
    }
}
