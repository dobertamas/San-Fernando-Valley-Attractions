package com.example.android.sanfernandovalleyattractions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    public static final String TAG = RestaurantsActivity.class.getSimpleName();

    int restaurants_one_imageResourceId = R.drawable.jasmine;
    int restaurants_two_imageResourceId = R.drawable.pronpiya;
    int restaurants_three_imageResourceId = R.drawable.atlas;
    int restaurants_four_imageResourceId = R.drawable.pitapockets;
    int restaurants_five_imageResourceId = R.drawable.oi;
    int restaurants_six_imageResourceId = R.drawable.greek_house;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> restaurantsList = new ArrayList<>();

        restaurantsList.add(new Attraction(getString(R.string.restaurants_one_name),
                new Location(getString(R.string.restaurants_one_location_primaryAddressNumber),
                        getString(R.string.restaurants_one_location_streetNameWithSuffix), getString(R.string.restaurants_one_location_cityName),
                        getString(R.string.restaurants_one_location_UsState), getString(R.string.restaurants_one_location_UsZipCode)),
                getString(R.string.restaurants_one_description), getString(R.string.restaurants_one_description), restaurants_one_imageResourceId));

        restaurantsList.add(new Attraction(getString(R.string.restaurants_two_name),
                new Location(getString(R.string.restaurants_two_location_primaryAddressNumber),
                        getString(R.string.restaurants_two_location_streetNameWithSuffix), getString(R.string.restaurants_two_location_cityName),
                        getString(R.string.restaurants_two_location_UsState), getString(R.string.restaurants_two_location_UsZipCode)),
                getString(R.string.restaurants_two_description), getString(R.string.restaurants_two_description), restaurants_two_imageResourceId));

        restaurantsList.add(new Attraction(getString(R.string.restaurants_three_name),
                new Location(getString(R.string.restaurants_three_location_primaryAddressNumber),
                        getString(R.string.restaurants_three_location_streetNameWithSuffix), getString(R.string.restaurants_three_location_cityName),
                        getString(R.string.restaurants_three_location_UsState), getString(R.string.restaurants_three_location_UsZipCode)),
                getString(R.string.restaurants_three_description), getString(R.string.restaurants_three_description), restaurants_three_imageResourceId));

        restaurantsList.add(new Attraction(getString(R.string.restaurants_four_name),
                new Location(getString(R.string.restaurants_four_location_primaryAddressNumber),
                        getString(R.string.restaurants_four_location_streetNameWithSuffix), getString(R.string.restaurants_four_location_cityName),
                        getString(R.string.restaurants_four_location_UsState), getString(R.string.restaurants_four_location_UsZipCode)),
                getString(R.string.restaurants_four_description), getString(R.string.restaurants_four_description), restaurants_four_imageResourceId));

        restaurantsList.add(new Attraction(getString(R.string.restaurants_five_name),
                new Location(getString(R.string.restaurants_five_location_primaryAddressNumber),
                        getString(R.string.restaurants_five_location_streetNameWithSuffix), getString(R.string.restaurants_five_location_cityName),
                        getString(R.string.restaurants_five_location_UsState), getString(R.string.restaurants_five_location_UsZipCode)),
                getString(R.string.restaurants_five_description), getString(R.string.restaurants_five_description), restaurants_five_imageResourceId));

        restaurantsList.add(new Attraction(getString(R.string.restaurants_six_name),
                new Location(getString(R.string.restaurants_six_location_primaryAddressNumber),
                        getString(R.string.restaurants_six_location_streetNameWithSuffix), getString(R.string.restaurants_six_location_cityName),
                        getString(R.string.restaurants_six_location_UsState), getString(R.string.restaurants_six_location_UsZipCode)),
                getString(R.string.restaurants_six_description), getString(R.string.restaurants_six_description), restaurants_six_imageResourceId));

        if (restaurantsList.get(0) != null) {
            for (Attraction restaurant : restaurantsList) {
                Log.d(TAG, " toString: " + restaurant.toString());
            }
        }

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        // The adapter knows how to create list items for each item in the list.
        AttractionAdapter attractionAdapter = new AttractionAdapter(this, restaurantsList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that
        // the {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(attractionAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_restaurants, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(TAG, " inside onOptionsItemSelected " + item.toString());
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the " " menu option
            case R.id.action_visit_hiking_list:
                Intent myHikingActivityIntent = new Intent(this, HikingActivity.class);
                startActivity(myHikingActivityIntent);
                return true;
            // Respond to a click on the " " menu option
            case R.id.action_visit_shopping_list:
                Intent myShoppingActivityIntent = new Intent(this, ShoppingActivity.class);
                startActivity(myShoppingActivityIntent);
                return true;
            case R.id.action_visit_drinks_list:
                Intent myDrinksActivityIntent = new Intent(this, DrinksActivity.class);
                startActivity(myDrinksActivityIntent);
                return true;
            case R.id.action_visit_main_page:
                Intent myMainPageActivityIntent = new Intent(this, MainActivity.class);
                startActivity(myMainPageActivityIntent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
