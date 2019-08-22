package com.innobot.mvvmdatabinding.views;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.innobot.mvvmdatabinding.R;
import com.innobot.mvvmdatabinding.databinding.ActivityMainBinding;
import com.innobot.mvvmdatabinding.viewmodel.TemperatureData;
import com.innobot.mvvmdatabinding.views.myinterface.MainActivityContract;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ActivityMainBinding
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main);
        TemperatureData temperatureData=new TemperatureData("Hamburg", "10", "http://lorempixel.com/400/200/");
        binding.setTemp(temperatureData);
        MainActivityPresenter mainActivityPresenter=new MainActivityPresenter(this, getApplicationContext());
        binding.setPresenter(mainActivityPresenter);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        String celsius=temperatureData.getCelsius();
        Toast.makeText(this, celsius, Toast.LENGTH_SHORT).show();
    }
}
