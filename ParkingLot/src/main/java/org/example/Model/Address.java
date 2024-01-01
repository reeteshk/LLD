package org.example.Model;

public class Address {
    private int zipCode;
    private String address;
    private String city;
    private String state;
    private String country;

    public Address(int zipCode, String address, String city, String state, String country) {
        this.zipCode = zipCode;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
