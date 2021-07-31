package com.company;

public class RegularTicket extends Ticket{


    private String specialServices;


    public RegularTicket(String specialServices, String pnr, String from, String to,  String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String flightNumber, String airline, int capacity, int bookedSeats, String street, String city, String state, String name, String phone, String email) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flightNumber, airline, capacity, bookedSeats, street, city, state, name, phone, email);
        this.specialServices = specialServices;
    }


    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}