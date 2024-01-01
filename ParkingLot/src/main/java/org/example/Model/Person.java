package org.example.Model;

public class Person {
    private String name;
    private String email;
    private String phone;
    private String address;

    public Person(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address.");
        }
    }

    public void setPhone(String phone) {
        if (phone.length() == 10) {
            this.phone = phone;
        } else {
            System.out.println("Invalid phone number.");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
