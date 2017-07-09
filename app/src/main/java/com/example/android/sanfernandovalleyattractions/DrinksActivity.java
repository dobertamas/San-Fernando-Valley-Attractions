package com.example.android.sanfernandovalleyattractions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class DrinksActivity extends AppCompatActivity {

    public static final String TAG = DrinksActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> drinksList = new ArrayList<>();
    /*    drinksList.add(new Attraction("Total Wine & More store", "19336 Nordhoff St, Northridge, CA 91324", new Location("19336", "Nordhoff St", "Northridge", "CA", "91324"), "Shop wines, spirits and beers at the best prices", "http://www.totalwine.com",-1));
        drinksList.add(new Attraction("BevMo! store ", "405 Cochran St, Simi Valley, CA 93065", new Location("405", "Cochran St", "Simi Valley", "CA", "93065"), "Liquor store chain offering big selection", "http://www.bevmo.com",-1));
        drinksList.add(new Attraction("Enegren Brewing Company", " 444 Zachary St #120, Moorpark, CA 93021", new Location("444", "Zachary St", "Moorpark", "CA", "93021"), "Variety of beers in an unassuming tasting room", "http://www.enegrenbrewing.com",-1));
        drinksList.add(new Attraction("MacLeod Ale Brewing Co", "14741 Calvert St, Van Nuys, CA 91411", new Location("14741", "Calvert St", "Van Nuys", "CA", "91411"), "Microbrewery making traditional cask- conditioned British ale.", "http://www.macleodale.com",-1));
        drinksList.add(new Attraction("Stone Company Store", "220 S Raymond Ave #103, Pasadena, CA 91105", new Location("220", "S Raymond Ave", "Pasadena", "CA", "91105"), "Tasting room and retail store with patio space ", "http://www.stonebrewing.com",-1));
        drinksList.add(new Attraction("Golden Road Brewing", "5410 W San Fernando Rd, Los Angeles, CA 90039", new Location("5410", "W San Fernando Rd", "Los Angeles", "CA", "90039"), "Globally inspired pub food paired with house beers", "http://goldenroad.la",-1));
*/
        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        // The adapter knows how to create list items for each item in the list.
        AttractionAdapter drinksAdapter = new AttractionAdapter(this, drinksList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that
        // the {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(drinksAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_drinks, menu);
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
            case R.id.action_visit_shopping_list:
                Intent myShoppingActivityIntent = new Intent(this, ShoppingActivity.class);
                startActivity(myShoppingActivityIntent);
                return true;
            case R.id.action_visit_main_page:
                Intent myMainPageActivityIntent = new Intent(this, MainActivity.class);
                startActivity(myMainPageActivityIntent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
