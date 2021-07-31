package com.company;




public class Passenger {


    private int id;
    private Address address;
    private Contact contact;


    private static  int idCounter;


    private static class Address {

        private String street;
        private String city;
        private String state;


        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }


        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }



        String getAddressDetails(){
            return "Address: " + street + ", " + city +  ", " + state + " ";
        }

        void updateAddressDetails(String[] addressDetail){
            street = addressDetail[0];
            city = addressDetail[1];
            state = addressDetail[2];
        }
    }


    private static class Contact {


        private String name;
        private String phone;
        private String email;


        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getContactDetails(){
            return "Name: " + name +  ", Phone: " + phone +  ", Email: " + email + " ";
        }

        public void updateContactDetails(String[] contactDetails){
            name = contactDetails[0];
            phone = contactDetails[1];
            email = contactDetails[2];
        }
    }


    public Passenger(String street, String city, String state, String name, String phone, String email){
        Address address = new Address(street, city, state);
        this.address = address;
        Contact contact = new Contact(name, phone, email);
        this.contact = contact;

        id = ++idCounter;
    }


    public int getId() {
        return id;
    }

    public void setAddress(String[] addressDetails) {
        address.updateAddressDetails(addressDetails);
    }

    public void setContact(String[] contactDetails) {
        contact.updateContactDetails(contactDetails);
    }

    public String getPassenger(){
        return "ID: " + id + " " + getContact() + getAddress();
    }

    public void setPassenger(String[] contactDetails, String[] addressDetails){
        address.updateAddressDetails(addressDetails);
        contact.updateContactDetails(contactDetails);
    }

    public String getContact(){
        return contact.getContactDetails();
    }

    public String getAddress(){
        return address.getAddressDetails();
    }



    int getPassengerCount(){
        return idCounter;
    }
}