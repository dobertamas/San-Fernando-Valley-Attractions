package com.example.android.sanfernandovalleyattractions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class HikingActivity extends AppCompatActivity {

    public static final String TAG = HikingActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> hikingList = new ArrayList<>();

        hikingList.add(new Attraction(getString(R.string.hiking_one_name),
                new Location(getString(R.string.hiking_one_location_primaryAddressNumber),
                        getString(R.string.hiking_one_location_streetNameWithSuffix), getString(R.string.hiking_one_location_cityName),
                        getString(R.string.hiking_one_location_UsState), getString(R.string.hiking_one_location_UsZipCode)),
                getString(R.string.hiking_one_description), getString(R.string.hiking_one_description), -1));

        hikingList.add(new Attraction(getString(R.string.hiking_two_name),
                new Location(getString(R.string.hiking_two_location_primaryAddressNumber),
                        getString(R.string.hiking_two_location_streetNameWithSuffix), getString(R.string.hiking_two_location_cityName),
                        getString(R.string.hiking_two_location_UsState), getString(R.string.hiking_two_location_UsZipCode)),
                getString(R.string.hiking_two_description), getString(R.string.hiking_two_description), -1));

        hikingList.add(new Attraction(getString(R.string.hiking_three_name),
                new Location(getString(R.string.hiking_three_location_primaryAddressNumber),
                        getString(R.string.hiking_three_location_streetNameWithSuffix), getString(R.string.hiking_three_location_cityName),
                        getString(R.string.hiking_three_location_UsState), getString(R.string.hiking_three_location_UsZipCode)),
                getString(R.string.hiking_three_description), getString(R.string.hiking_three_description), -1));

        hikingList.add(new Attraction(getString(R.string.hiking_four_name),
                new Location(getString(R.string.hiking_four_location_primaryAddressNumber),
                        getString(R.string.hiking_four_location_streetNameWithSuffix), getString(R.string.hiking_four_location_cityName),
                        getString(R.string.hiking_four_location_UsState), getString(R.string.hiking_four_location_UsZipCode)),
                getString(R.string.hiking_four_description), getString(R.string.hiking_four_description), -1));

        hikingList.add(new Attraction(getString(R.string.hiking_five_name),
                new Location(getString(R.string.hiking_five_location_primaryAddressNumber),
                        getString(R.string.hiking_five_location_streetNameWithSuffix), getString(R.string.hiking_five_location_cityName),
                        getString(R.string.hiking_five_location_UsState), getString(R.string.hiking_five_location_UsZipCode)),
                getString(R.string.hiking_five_description), getString(R.string.hiking_five_description), -1));

        hikingList.add(new Attraction(getString(R.string.hiking_six_name),
                new Location(getString(R.string.hiking_six_location_primaryAddressNumber),
                        getString(R.string.hiking_six_location_streetNameWithSuffix), getString(R.string.hiking_six_location_cityName),
                        getString(R.string.hiking_six_location_UsState), getString(R.string.hiking_six_location_UsZipCode)),
                getString(R.string.hiking_six_description), getString(R.string.hiking_six_description), -1));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        // The adapter knows how to create list items for each item in the list.
        AttractionAdapter hikingAdapter = new AttractionAdapter(this, hikingList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that
        // the {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(hikingAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_hiking, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(TAG, " inside onOptionsItemSelected " + item.toString());
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the " " menu option
            case R.id.action_visit_restaurants_list:
                Intent myRestaurantsActivityIntent = new Intent(this, RestaurantsActivity.class);
                startActivity(myRestaurantsActivityIntent);
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
