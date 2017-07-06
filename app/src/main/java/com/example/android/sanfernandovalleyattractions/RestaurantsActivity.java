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

        final ArrayList<Attraction> restaurantsList = new ArrayList<Attraction>();
        restaurantsList.add(new Attraction("address", "desc", 1, "webSiteUrl"));
        if (restaurantsList.get(0) != null) {
            Log.d(TAG, " toString: " + restaurantsList.get(0).toString());
        }
    }
}
