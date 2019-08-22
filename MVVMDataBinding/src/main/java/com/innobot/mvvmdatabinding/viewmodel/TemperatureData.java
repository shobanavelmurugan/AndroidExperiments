package com.innobot.mvvmdatabinding.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.innobot.mvvmdatabinding.BR;


public class TemperatureData extends BaseObservable {

    private String location;

    private String celsius;

    private String url;

    public TemperatureData(String location, String celsius, String url) {
        this.location=location;
        this.celsius=celsius;
        this.url=url;
    }

    @Bindable
    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius=celsius;
        notifyPropertyChanged(BR.celsius);
    }

    @Bindable
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location=location;
        notifyPropertyChanged(BR.location);
    }

    @Bindable
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url=url;
        notifyPropertyChanged(BR.url);
    }
}