package com.example.android.sanfernandovalleyattractions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    public static final String TAG = RestaurantsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        final ArrayList<Attraction> restaurants = new ArrayList<Attraction>();
        restaurants.add(new Attraction("address", "desc", 1, "webSiteUrl"));
        if (restaurants.get(0) != null) {
            Log.d(TAG, " toString" + restaurants.get(0).toString());
        }
    }
}
