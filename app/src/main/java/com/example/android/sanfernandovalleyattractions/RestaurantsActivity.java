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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> restaurantsList = new ArrayList<>();
        restaurantsList.add(new Attraction("Jasmine Thai Cuisine", "20156 Roscoe Blvd, Winnetka, CA", new Location("20156", "Roscoe Blvd", "Winnetka", "CA", "91306"), "Good Thai Food", "http://www.jasminethaicuisinegroup.com/locations.html", R.drawable.jasmine));
        restaurantsList.add(new Attraction("Pronpiya Thai BBQ", "345 W Los Angeles Ave Moorpark, CA", new Location("345", "W Los Angeles Ave", "Moorpark", "CA", "93021"), "Quite spicey", "https://www.facebook.com/Pronpiya-Thai-BBQ-148202158543286/", R.drawable.pronpiya));
        restaurantsList.add(new Attraction("Atlas Kitchen", "1368 Madera Rd Simi Valley, CA", new Location("1368", "Madera Rd", "Simi Valley", "CA", "93065"), "Good Persian/Iranian", "http://atlasmediterranean.wix.com/kitchen",R.drawable.atlas));
        restaurantsList.add(new Attraction("Pita Pockets", "9127 Reseda Blvd Northridge, CA", new Location("9127", "Reseda Blvd", "Northridge", "CA", "91324"), "Middle Eastern", "https://www.facebook.com/Pita-Pockets-128793943860371/", R.drawable.pitapockets));
        restaurantsList.add(new Attraction("Oi Asian Fusion", "7242 Canoga Ave, Canoga Park, CA", new Location("7242", "Canoga Ave", "Canoga Park", "CA", "91303"), "Filipino adobo bowls", "http://www.oiasianfusion.com/", R.drawable.oi));
        restaurantsList.add(new Attraction("Greek House Cafe", "2375 Sycamore Dr Simi Valley, CA", new Location("2375", "Sycamore Dr", "Simi Valley", "CA", "93065"), "Greek food", "https://greekhousecafe.com", R.drawable.greek_house));

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
