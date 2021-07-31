package com.company;

public class Main {

    public static void main(String[] args) {
        Ticket ticket1 = new RegularTicket("Breakfast", "1234ERTY", "Dubai", "Kochi", "6", "12", "14D", 110.0f, false, "EMIR1234", "ETIHAD AIRLINES", 120, 90, "Street", "Abu Dahbi", "UAE", "Denin", "9037774217", "deninthomas@outlook.com");


        Ticket ticket2 = new TouristTicket("Spring Resort", new String[]{"Singapore", "Maliyasia", "Tailand", null, null}, "0987LKWU", "Tokyo", "Singapore", "5", "12", "19D", 250.0f, false, "XCVT0987", "SILKAIR", 110, 90, "Street2", "Tokyo", "Japan", "Amal", "9812638780", "iamalantony@gamil.com");

        printTicketDetails(ticket1);
        printTicketDetails(ticket2);
    }

    public static void printTicketDetails(Ticket ticket){
        ticket.printDetails(ticket);
    }
}