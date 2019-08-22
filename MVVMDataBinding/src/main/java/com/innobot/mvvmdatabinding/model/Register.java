package com.innobot.mvvmdatabinding.model;

/**
 * Created by innobot-linux-7 on 24/7/19,24,AndroidExperiments.
 */
public class Register {

    private String name;
    private String phone;
    private String address;

    public Register(String name, String phone, String address) {
        this.name=name;
        this.phone=phone;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
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
