package com.innobot.androidarchitecture.views;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.innobot.androidarchitecture.R;
import com.innobot.androidarchitecture.databinding.ActivityRegisterBinding;
import com.innobot.androidarchitecture.viewmodels.RegisterViewModel;

public class RegisterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRegisterBinding activityRegisterBinding=DataBindingUtil.setContentView(this, R.layout.activity_register);
        activityRegisterBinding.setViewModelRegister(new RegisterViewModel());
        activityRegisterBinding.executePendingBindings();
    }


}
