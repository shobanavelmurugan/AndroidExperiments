package com.innobot.androidarchitecture.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

import com.android.databinding.library.baseAdapters.BR;
import com.innobot.androidarchitecture.model.Register;

/**
 * Created by innobot-linux-7 on 13/7/19,13,AndroidArchitecture.
 */
public class RegisterViewModel extends BaseObservable {

    private Register register;

    public RegisterViewModel() {
        register=new Register("", "", "");
    }

    @Bindable
    public String getUsername() {
        return register.getUsername();
    }

    public void setUsername(String username) {
        register.setUsername(username);
        notifyPropertyChanged(BR.username);
    }

    @Bindable
    public String getPhonenumber() {
        return register.getPhone();
    }

    public void setPhonenumber(String phone) {
        register.setPhone(phone);
        notifyPropertyChanged(BR.phonenumber);
    }

    @Bindable
    public String getAddress() {
        return register.getAddress();
    }

    public void setAddress(String address) {
        register.setAddress(address);
        notifyPropertyChanged(BR.address);
    }

    public void onRegisterClicked() {

        if (isInputDataValid()) {

        } else {

        }

    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getUsername()) && !TextUtils.isEmpty(getPhonenumber()) && !TextUtils.isEmpty(getAddress());
    }
}
