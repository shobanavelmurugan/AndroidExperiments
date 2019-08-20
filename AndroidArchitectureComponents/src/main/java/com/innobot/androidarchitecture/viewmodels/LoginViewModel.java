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
    public String getEmail() {
        return user.getEmail();
    }

    public void setEmail(String email) {
        user.setEmail(email);
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return user.getPassword();
    }

    public void setPassword(String password) {
        user.setPassword(password);
        notifyPropertyChanged(BR.password);
    }

    public void onLoginClicked() {
        if (isInputDataValid()) {
            setToastMessage(successMessage);
        } else {
            setToastMessage(errorMessage);
        }
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getEmail()) && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() && getPassword().length() > 5;
    }
}
