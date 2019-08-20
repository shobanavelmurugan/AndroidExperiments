package com.innobot.mvvmdatabinding.views.myinterface;

import com.innobot.mvvmdatabinding.viewmodel.TemperatureData;

public interface MainActivityContract {
    interface Presenter {
        void onShowData(TemperatureData temperatureData);

        void showList();
    }

    interface View {
        void showData(TemperatureData temperatureData);
    }

}