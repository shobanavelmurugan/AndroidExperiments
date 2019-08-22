package com.innobot.androidarchitecture.model;

/**
 * Created by innobot-linux-7 on 13/7/19,13,AndroidArchitecture.
 */
public class Register {

    private String username;
    private String phone;
    private String address;

    public Register(String username, String phone, String address) {
        this.username=username;
        this.phone=phone;
        this.address=address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username=username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone=phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address=address;
    }

}
