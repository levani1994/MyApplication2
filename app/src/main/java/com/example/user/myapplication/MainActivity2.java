package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //monacemebis migeba
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("car_model");
        String Describtion = intent.getExtras().getString("Describtion");
        int image = intent.getExtras().getInt("Thumbnail");
    }
}
