package com.innobot.mvvmdatabinding.views;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.innobot.mvvmdatabinding.R;
import com.innobot.mvvmdatabinding.databinding.ActivityRegisterBinding;
import com.innobot.mvvmdatabinding.viewmodel.RegisterViewModel;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRegisterBinding activityRegisterBinding=DataBindingUtil.setContentView(this, R.layout.activity_register);
        activityRegisterBinding.setRegisterModel(new RegisterViewModel());
        activityRegisterBinding.executePendingBindings();
    }
//    @BindingAdapter("toastMessage")
//    public static void runMe(View view, String message) {
//        if (message != null)
//            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
//    }
}
