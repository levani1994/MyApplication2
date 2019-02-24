package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user.myapplication.ui.main.MainFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

List<Cars> lstCars;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }

        lstCars = new ArrayList<>();
        lstCars.add(new Cars("Mercedes-Benz",R.drawable.mercedes_benz));
        lstCars.add(new Cars("BMW",R.drawable.bmw));
        lstCars.add(new Cars("Volkswagen",R.drawable.volkswagen));
        lstCars.add(new Cars("mercedes-benz",R.drawable.mercedes_benz));
        lstCars.add(new Cars("mercedes-benz",R.drawable.volkswagen));
        lstCars.add(new Cars("mercedes-benz",R.drawable.mercedes_benz));
        lstCars.add(new Cars("mercedes-benz",R.drawable.mercedes_benz));
        lstCars.add(new Cars("mercedes-benz",R.drawable.mercedes_benz));
        lstCars.add(new Cars("mercedes-benz",R.drawable.mercedes_benz));



        RecyclerView test = (RecyclerView) findViewById(R.id.recyleview_id);
        RecyclerViewAdapter myAdapter  = new RecyclerViewAdapter(this,lstCars);
        test.setLayoutManager(new GridLayoutManager(this,3));
        test.setAdapter(myAdapter);
    }
}
