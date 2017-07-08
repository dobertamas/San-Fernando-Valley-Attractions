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

        View hiking = findViewById(R.id.hiking);

        hiking.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent hikingIntent = new Intent(MainActivity.this, HikingActivity.class);
                startActivity(hikingIntent);
            }
        });

        View shopping = findViewById(R.id.shopping);

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
            }
        });

        View drinks = findViewById(R.id.drinks);

        drinks.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent drinksIntent = new Intent(MainActivity.this, DrinksActivity.class);
                startActivity(drinksIntent);
            }
        });

    }
}
