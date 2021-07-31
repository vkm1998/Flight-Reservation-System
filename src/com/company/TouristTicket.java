package com.company;

public class TouristTicket extends Ticket{


    private String hotelAddress;
    private String[] selectedTouristLocation = new String[5];


    public TouristTicket(String hotelAddress, String[] selectedTouristLocation, String pnr, String from, String to,  String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String flightNumber, String airline, int capacity, int bookedSeats, String street, String city, String state, String name, String phone, String email) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flightNumber, airline, capacity, bookedSeats, street, city, state, name, phone, email);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }


    String getHotelAddress(){
        return hotelAddress;
    }

    String getTouristLocations(){
        int i;
        String locations = "Locations: ";
        for(i = 0; i < 5; i++){
            if(selectedTouristLocation[i] != null) {
                locations = locations + selectedTouristLocation[i] + ", ";
            }
        }
        return locations;
    }

    void removeTouristLocations(String location){
        boolean found = false;
        for(int i = 0; i < 5; i++){
            if(selectedTouristLocation[i].equals(location)){
                selectedTouristLocation[i] = null;
                found = true;
                System.out.println("Location removed!");
                break;
            }
        }
        if(!found){
            System.out.println("Location not found!");
        }
    }

    void addTouristLocations(String location){
        int i;
        for(i = 0; i < 5; i++){
            if(selectedTouristLocation[i] == (null)){
                selectedTouristLocation[i] = location;
                System.out.println("Location added!");
                break;
            }
        }
        if(i == 5){
            System.out.println("Maximum locations entered!");
        }
    }

}


