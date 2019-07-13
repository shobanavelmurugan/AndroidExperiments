package com.innobot.androidarchitecture.viewmodels;

import android.app.Activity;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Patterns;

import com.android.databinding.library.baseAdapters.BR;
import com.innobot.androidarchitecture.model.User;

public class LoginViewModel extends BaseObservable {
    private User user;
    private String successMessage="Login was successful";
    private String errorMessage="Email or Password not valid";
    @Bindable
    private String toastMessage=null;

    private Activity activity;

    public LoginViewModel(@NonNull Activity activity) {
        this.activity=activity;
        user=new User("", "");
    }

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {

        this.toastMessage=toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    @Bindable
    public String getUserEmail() {
        return user.getEmail();
    }

    public void setUserEmail(String email) {
        user.setEmail(email);
        notifyPropertyChanged(BR.userEmail);
    }

    @Bindable
    public String getUserPassword() {
        return user.getPassword();
    }

    public void setUserPassword(String password) {
        user.setPassword(password);
        notifyPropertyChanged(BR.userPassword);
    }

    public void onLoginClicked() {
        if (isInputDataValid()) {
            setToastMessage(successMessage);
        } else {
            setToastMessage(errorMessage);
        }
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getUserEmail()) && Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() && getUserPassword().length() > 5;
    }
}
