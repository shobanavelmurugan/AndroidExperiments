package com.innobot.androidarchitecture.model;


import android.util.Patterns;

public class User {

    private String mEmail;
    private String mPassword;


    public User(String email, String password) {
        mEmail=email;
        mPassword=password;
    }

    public String getEmail() {
        if (mEmail == null) {
            return "";
        }
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail=email;
    }

    public String getPassword() {

        if (mPassword == null) {
            return "";
        }
        return mPassword;
    }

    public void setPassword(String password) {
        this.mPassword=password;
    }

    public boolean isEmailValid() {
        return Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches();
    }

    public boolean isPasswordLengthGreaterThan5() {
        return getPassword().length() > 5;
    }
}


