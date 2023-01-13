package com.example.invoiceapplication;

public class User {
   // String pin,phonenumber;

    public User(String pin, String phonenumber) {
        this.pin = pin;
        this.phonenumber = phonenumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
