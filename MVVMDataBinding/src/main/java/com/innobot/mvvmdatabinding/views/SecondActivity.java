package com.innobot.mvvmdatabinding.views;

import android.databinding.BindingAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.innobot.mvvmdatabinding.R;
import com.innobot.mvvmdatabinding.viewmodel.TemperatureData;
import com.innobot.mvvmdatabinding.views.adapter.MyAdapter;

import java.util.Arrays;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        Glide.with(view.getContext()).
                load(url).
                placeholder(R.mipmap.ic_launcher).
                into(view);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView=findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<TemperatureData> items=
                Arrays.asList(
                        new TemperatureData("Hamburg", "5", "http://lorempixel.com/400/200/sports/1/"),
                        new TemperatureData("Berlin", "6", "http://lorempixel.com/400/200/"));

        // define an adapter
        mAdapter=new MyAdapter(items);
        recyclerView.setAdapter(mAdapter);
    }
}