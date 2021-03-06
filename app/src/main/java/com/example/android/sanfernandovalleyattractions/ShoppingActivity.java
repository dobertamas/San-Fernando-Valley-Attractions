package com.example.android.sanfernandovalleyattractions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    public static final String TAG = ShoppingActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> shoppingList = new ArrayList<>();

        shoppingList.add(new Attraction(getString(R.string.shopping_one_name),
                new Location(getString(R.string.shopping_one_location_primaryAddressNumber),
                        getString(R.string.shopping_one_location_streetNameWithSuffix), getString(R.string.shopping_one_location_cityName),
                        getString(R.string.shopping_one_location_UsState), getString(R.string.shopping_one_location_UsZipCode)),
                getString(R.string.shopping_one_description), getString(R.string.shopping_one_description), -1));

        shoppingList.add(new Attraction(getString(R.string.shopping_two_name),
                new Location(getString(R.string.shopping_two_location_primaryAddressNumber),
                        getString(R.string.shopping_two_location_streetNameWithSuffix), getString(R.string.shopping_two_location_cityName),
                        getString(R.string.shopping_two_location_UsState), getString(R.string.shopping_two_location_UsZipCode)),
                getString(R.string.shopping_two_description), getString(R.string.shopping_two_description), -1));

        shoppingList.add(new Attraction(getString(R.string.shopping_three_name),
                new Location(getString(R.string.shopping_three_location_primaryAddressNumber),
                        getString(R.string.shopping_three_location_streetNameWithSuffix), getString(R.string.shopping_three_location_cityName),
                        getString(R.string.shopping_three_location_UsState), getString(R.string.shopping_three_location_UsZipCode)),
                getString(R.string.shopping_three_description), getString(R.string.shopping_three_description), -1));

        shoppingList.add(new Attraction(getString(R.string.shopping_four_name),
                new Location(getString(R.string.shopping_four_location_primaryAddressNumber),
                        getString(R.string.shopping_four_location_streetNameWithSuffix), getString(R.string.shopping_four_location_cityName),
                        getString(R.string.shopping_four_location_UsState), getString(R.string.shopping_four_location_UsZipCode)),
                getString(R.string.shopping_four_description), getString(R.string.shopping_four_description), -1));

        shoppingList.add(new Attraction(getString(R.string.shopping_five_name),
                new Location(getString(R.string.shopping_five_location_primaryAddressNumber),
                        getString(R.string.shopping_five_location_streetNameWithSuffix), getString(R.string.shopping_five_location_cityName),
                        getString(R.string.shopping_five_location_UsState), getString(R.string.shopping_five_location_UsZipCode)),
                getString(R.string.shopping_five_description), getString(R.string.shopping_five_description), -1));

        shoppingList.add(new Attraction(getString(R.string.shopping_six_name),
                new Location(getString(R.string.shopping_six_location_primaryAddressNumber),
                        getString(R.string.shopping_six_location_streetNameWithSuffix), getString(R.string.shopping_six_location_cityName),
                        getString(R.string.shopping_six_location_UsState), getString(R.string.shopping_six_location_UsZipCode)),
                getString(R.string.shopping_six_description), getString(R.string.shopping_six_description), -1));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        // The adapter knows how to create list items for each item in the list.
        AttractionAdapter shoppingAdapter = new AttractionAdapter(this, shoppingList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that
        // the {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(shoppingAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_shopping, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(TAG, " inside onOptionsItemSelected " + item.toString());
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            case R.id.action_visit_restaurants_list:
                Intent myRestaurantsActivityIntent = new Intent(this, RestaurantsActivity.class);
                startActivity(myRestaurantsActivityIntent);
                return true;
            case R.id.action_visit_hiking_list:
                Intent myHikingActivityIntent = new Intent(this, HikingActivity.class);
                startActivity(myHikingActivityIntent);
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
