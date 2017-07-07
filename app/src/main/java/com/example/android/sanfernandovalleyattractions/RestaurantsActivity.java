package com.example.android.sanfernandovalleyattractions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    public static final String TAG = RestaurantsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> restaurantsList = new ArrayList<>();
        restaurantsList.add(new Attraction("Jasmine Thai Cuisine", "20156 Roscoe Blvd, Winnetka, CA", "Good Thai Food", "http://www.jasminethaicuisinegroup.com/locations.html", 1));
        restaurantsList.add(new Attraction("Pronpiya Thai BBQ", "345 W Los Angeles Ave Moorpark, CA", "Quite spicey", "https://www.facebook.com/Pronpiya-Thai-BBQ-148202158543286/", 2));
        restaurantsList.add(new Attraction("Atlas Kitchen", "1368 Madera Rd Simi Valley, CA", "Good Persian/Iranian", "http://atlasmediterranean.wix.com/kitchen", 3));
        restaurantsList.add(new Attraction("Pita Pockets", "9127 Reseda Blvd Northridge, CA", "Middle Eastern", "https://www.facebook.com/Pita-Pockets-128793943860371/", 4));
        restaurantsList.add(new Attraction("Oi Asian Fusion", "7242 Canoga Ave, Canoga Park, CA", "Filipino adobo bowls", "http://www.oiasianfusion.com/", 5));
        restaurantsList.add(new Attraction("Greek House Cafe", "2375 Sycamore Dr Simi Valley, CA", "Greek food", "https://greekhousecafe.com", 6));

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
}
