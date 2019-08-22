package com.innobot.databinding.views;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.innobot.databinding.R;
import com.innobot.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main);

//        binding.tvHeading.setText("Welcome to JournalDev.com");
//        binding.tvSubheading.setText("Welcome to this Android Tutorial on DataBinding");
    }
}
