package com.commerce.commercebankfundraiser.model;

public class Address {
    String streetName;
    String  city;
    String  state;
    int Zip;
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
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
        return Zip;
    }

    public void setZip(int zip) {
        Zip = zip;
    }

    @Override
    public String toString(){
        return "Address{" + "StreetName = " + streetName +
                ", City '" + city + '\'' +
                ", State '" + state + '\'' +
                ", Zip '" + Zip + '\'' +
                '}';

    }

}
