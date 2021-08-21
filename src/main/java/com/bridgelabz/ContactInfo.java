package com.bridgelabz;

/*
 * contact information has first name, last name, number,address
 * state,city,zipcode, age and email
 */
public class ContactInfo {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long number;
    String email;

    ContactInfo(String firstName, String lastName, String address, String city, String state, int zip, long number,
                String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.number = number;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {

        return this.firstName + " " + this.lastName + ":" + this.number + "," + this.email + ":"
                + " address:" + this.address + ", state:" + this.state + ", city:" + this.city + ", zip:"
                + this.zip;
    }
}