package com.innobot.mvvmdatabinding.views;

import android.content.Context;
import android.content.Intent;

import com.innobot.mvvmdatabinding.viewmodel.TemperatureData;
import com.innobot.mvvmdatabinding.views.myinterface.MainActivityContract;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View view;
    private Context ctx;


    public MainActivityPresenter(MainActivityContract.View view, Context ctx) {
        this.view=view;
        this.ctx=ctx;
    }


    @Override
    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }

    @Override
    public void showList() {
        Intent i=new Intent(ctx, SecondActivity.class);
        ctx.startActivity(i);
    }
}
