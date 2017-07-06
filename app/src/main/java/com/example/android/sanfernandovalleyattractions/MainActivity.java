package com.example.android.sanfernandovalleyattractions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View restaurants = findViewById(R.id.restaurants);

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantIntent);
            }
        });
    }
}
