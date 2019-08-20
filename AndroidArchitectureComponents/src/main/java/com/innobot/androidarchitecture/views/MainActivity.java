package com.innobot.androidarchitecture.views;

import android.content.Intent;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.innobot.androidarchitecture.R;
import com.innobot.androidarchitecture.databinding.ActivityMainBinding;
import com.innobot.androidarchitecture.viewmodels.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null) {
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
            Intent in=new Intent(view.getContext(), RegisterActivity.class);
            view.getContext().startActivity(in);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding=DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setLoginViewModel(new LoginViewModel(this));
        activityMainBinding.executePendingBindings();

    }
}
