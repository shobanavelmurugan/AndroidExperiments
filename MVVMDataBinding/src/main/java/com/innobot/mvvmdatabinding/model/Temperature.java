package com.innobot.mvvmdatabinding.model;

/**
 * Created by innobot-linux-7 on 26/7/19,26,AndroidExperiments.
 */
public class Temperature {
    private String location;
    private String celsius;
    private String url;

    public Temperature(String location, String celsius, String url) {
        this.location=location;
        this.celsius=celsius;
        this.url=url;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location=location;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius=celsius;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url=url;
    }

//    public class TemperatureData extends BaseObservable {
//
//        private Temperature temperature;
//
//        public TemperatureData() {
//            temperature=new Temperature("", "", "");
//        }
//
//        @Bindable
//        public String getCelsius() {
//            return temperature.getCelsius();
//        }
//
//        public void setCelsius(String celsius) {
//            temperature.setCelsius(celsius);
//            notifyPropertyChanged(BR.celsius);
//        }
//
//        @Bindable
//        public String getLocation() {
//            return temperature.getLocation();
//        }
//
//        public void setLocation(String location) {
//            temperature.setLocation(location);
//            notifyPropertyChanged(BR.location);
//        }
//
//        @Bindable
//        public String getUrl() {
//            return temperature.getUrl();
//        }
//
//        public void setUrl(String url) {
//            temperature.setUrl(url);
//            notifyPropertyChanged(BR.url);
//        }
//    }
}
