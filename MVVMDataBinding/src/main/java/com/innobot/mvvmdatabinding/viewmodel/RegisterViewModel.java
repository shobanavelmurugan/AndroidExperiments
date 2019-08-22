package com.innobot.mvvmdatabinding.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

import com.innobot.mvvmdatabinding.BR;
import com.innobot.mvvmdatabinding.model.Register;

/**
 * Created by innobot-linux-7 on 24/7/19,24,AndroidExperiments.
 */
public class RegisterViewModel extends BaseObservable {

    Register register;
    private String successMessage="Register was successful";
    private String errorMessage="Name or Phone or Address not valid";
    @Bindable
    private String toastMessage=null;

    /*Step-1 Mandatory*/
    public RegisterViewModel() {
        register=new Register("", "", "");
        //this.register=register;
    }


    public String getToastMessage() {
        return toastMessage;
    }

    public void setToastMessage(String toastMessage) {
        this.toastMessage=toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    @Bindable
    public String getName() {
        return register.getName();
    }

    public void setName(String name) {
        register.setName(name);
        notifyPropertyChanged(BR.name);
    }

    //    @Bindable
//    public String getPhone() {
//        return register.getPhone();
//    }
    @Bindable
    public String getPhone() {
        return register.getPhone();
    }

    public void setPhone(String phone) {
        register.setPhone(phone);
        notifyPropertyChanged(BR.phone);
    }

    @Bindable
    public String getAddress() {
        return register.getAddress();
    }

    public void setAddress(String address) {
        register.setAddress(address);
        notifyPropertyChanged(BR.address);
    }

    public void onLoginClicked() {
        if (isInputDataValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getName()) && !TextUtils.isEmpty(getAddress()) && getPhone().length() == 10;
    }
}
